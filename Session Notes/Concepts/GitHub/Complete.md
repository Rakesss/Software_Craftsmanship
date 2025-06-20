

------------------------------------------------------------Differences----------------------------------------------

Git Merging:
1) main(1,2,3,4) , feature(2-->1,2,3) 
   after Merging --> main[5-->(mixture of branch main(3,4) + mixture of feature branch(1,2,3)]
2) in large nodes it gets messier to understand which nodes are merged with which one


Git Rebase:
1) main(1,2,3,4) , feature(2-->1,2,3) 
   after Rebasing --> main[the feature nodes are automatically pointed after the last node in the main branch (i.e node:4)]
Structure Looks Like  main[1,2,3,4--->1',2',3']
2) it looks significiently easier as each nodes are been redirected towards the last of the main node then the least newest featured node



--------------------------------------------------------------GIT STASH--------------------------------------------------------

used  to switch between branches ,suppose you are in main branch created one new like feature branch and want to redirect to the older one without commiting any chanages in the featured branch,in these type of situations Git stash is very useful.



-------------------------------------------------------GIT IN COLLABORATION------------------------------------------------------
suppose I created one program and its in stage one I will upload the same in GitHub too,
I have my friend rohan whome I collaborated to work with the same one 
rohan will take the staging code and then make a clone of it and will make changes in it and will upload the stage 2 code in GitHub
the logic of collaborative will now play its role rohan needs to tell me that he has updated the stage 2 code then and then only I can have it on my pc and will be able to make changes


-----------------------------------------------------------TRUNK BAED DEVELOPMENT--------------------------------------
Used for short term feature branch and instantly forwarded to the main/trunk branch





----------------------------------------------------------Differences-------------------------------------------


  Feature           ||	Trunk-Based Development (TBD)	               ||  Branch-Based Development (BBD)

   Frequency        ||	Multiple small merges per day	               ||  Fewer, larger merges (riskier)

 Conflict Handling  ||     Frequent small conflicts (easy to resolve)  ||	Big merge conflicts (harder to resolve)

 CI/CD Suitability  ||	Best for continuous deployment	               ||   Needs extra steps for CI/CD




---------------------------------------Benefits------------------------------------------------------

Trunk-Based Development (TBD) 
Faster Releases – Small, frequent changes mean quicker deployments.

Fewer Merge Conflicts – Since everyone works on the same branch, conflicts are smaller and easier to fix.

Better CI/CD – Works great with automated testing and deployment.

Branch-Based Development (BBD) 
Isolated Work – Developers can work without disturbing others.

Better for Large Features – Good for big changes that take weeks/months.

Clear History – Each feature has its own branch, making tracking easier.

-------------------------------------------------Challenges---------------------------------------------------
Trunk-Based Development (TBD) 
Requires Discipline – Developers must commit small, working changes frequently.

Broken Builds Risk – Bad code in main can block everyone.

Not Ideal for Big Features – Hard to work on large changes without breaking things.

Branch-Based Development (BBD) 
Merge Hell – Long-lived branches cause big, painful conflicts.


----------------------------------------------------Differences---------------------------------------------------

Feature             ||	Git Flow	               ||          GitHub Flow

Merge Frequency	    ||  Infrequent (big merges)        ||         Frequent (small PRs)
Release Process     ||	Formal (via release branches)  ||        Direct from main (after PR review)	
Conflict Risk       ||	High (long-lived branches)     ||	 Medium (short-lived branches)	Low (small, frequent merges)
CI/CD Compatibility ||	Needs extra steps	       ||        Works well


-----------------------------------------------------Maven----------------------------------------------------

Maven is a tool that helps manage:

Project builds (compile, test, package, deploy)

Dependencies (external JARs)

Project structure and documentation

Plugins for extended tasks like code analysis, testing, etc.

2. Key Concepts:
POM (Project Object Model):
An XML file named pom.xml that holds project configuration like dependencies, plugins, versioning, etc.



Dependencies:


External libraries your project needs (e.g., JUnit, Spring). Maven downloads them from a central repository.

Repositories:

Local Repository: .m2 folder on your system

Central Repository: Online repository hosted by Maven

Remote Repository: Your organization's or a third-party repository



Plugins:


Add functionality like compiling Java code, running tests, packaging JARs/WARs, etc.














