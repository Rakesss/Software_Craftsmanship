import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ElectionResultsProcessor {

    private static final Map<String, String> PARTY_NAMES = new HashMap<>();

    static {
        PARTY_NAMES.put("BJP", "Bhartiya Janta Party");
        PARTY_NAMES.put("INC", "Indian National Congress");
        PARTY_NAMES.put("BSP", "Bahujan Samaj Party");
        PARTY_NAMES.put("CPI", "Communist Party of India");
        PARTY_NAMES.put("NCP", "Nationalist Congress Party");
        PARTY_NAMES.put("IND", "Independant");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ElectionResultsProcessor <input_file>");
            return;
        }

        String inputFile = args[0];
        processElectionResults(inputFile);
    }

    public static void processElectionResults(String inputFile) {
        System.out.println("Constituency, Winning Party, Vote Share");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("-");
                String constituency = parts[0];
                String[] partyVotes = parts[1].split(",");

                Map<String, Integer> votesMap = new HashMap<>();
                int totalVotes = 0;

                for (String pv : partyVotes) {
                    String[] voteParts = pv.split("=");
                    String party = voteParts[0];
                    int votes = Integer.parseInt(voteParts[1]);
                    votesMap.put(party, votes);
                    totalVotes += votes;
                }

                String winningPartyCode = "";
                int maxVotes = -1;

                for (Map.Entry<String, Integer> entry : votesMap.entrySet()) {
                    if (entry.getValue() > maxVotes) {
                        maxVotes = entry.getValue();
                        winningPartyCode = entry.getKey();
                    }
                }

                String winningPartyName = PARTY_NAMES.getOrDefault(winningPartyCode, winningPartyCode);
                double voteShare = (maxVotes * 100.0) / totalVotes;
                String voteShareStr = String.format("%.1f", voteShare);

                // Remove .0 if it's a whole number
                if (voteShareStr.endsWith(".0")) {
                    voteShareStr = voteShareStr.substring(0, voteShareStr.length() - 2);
                }

                System.out.printf("%s, %s, %s%%\n", constituency, winningPartyName, voteShareStr);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}