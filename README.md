# Recipe_Generator
 This is the term project of CAS703. This term project mainly focuses on building a domain-specific language (DSL) and editor using Epsilon and related languages learned from CAS703 course. Baking recipe generator is the main DSL created in this project, which is based on the flowchart DSL design but with more extended design and functions. It could be used to fetch users’ information and automate related recipes that meet their requirements. Five tasks were implemented in this project from metamodel design to model management. They were all implemented on Eclipse with Epsilon 2.3 and OpenJDK 11.  

- RecipeGenerator folder is the main package used to generate emf file and further diagram. 

- RecipeGenerator.diagram, RecipeGenerator.edit, RecipeGenerator.editor and RecipeGenerator.tests are package auto-created when generated GMF editor using Eugenia. 

- recipe folder contains the runtime files used in this project, such as recipe.evl used to validate DSL and test.recipe_diagram used to demonstrate GMF editor. 
