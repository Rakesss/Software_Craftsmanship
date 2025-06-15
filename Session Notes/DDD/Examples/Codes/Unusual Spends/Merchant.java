public class Merchant {
    private final String id;
    private final String name;
    private final SpendingCategory category;

    public Merchant(String id, String name, SpendingCategory category) {
        if (id == null || id.isBlank()) {
            throw new InvalidMerchantIdException(id);
        }
        if (name == null || name.isBlank()){
            throw new InvalidMerchantNameException(name);
        }
        if (category == null ){
            throw new InvalidCategoryException(category);
        }
        this.id = id;
        this.name = name;
        this.category = category;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public SpendingCategory getCategory() {
        return category;
    }
}
