# Software Architecture and Design Class

## Support App Development
### Brief Project Statement   
Our project for this semester is to design and develop a software app to provide
support to incoming freshmen for CSE 3421 and incoming graduate students for
SWE 5450.   

Many incoming freshmen encounter an array of problems stemming from being
on their own for the first time in their lives. A student can run into problems in all
aspects of his/her life: academic, emotional, social, health and hygiene.
Many incoming graduate students also face a wide range of problems, academic,
emotional, social, cultural, and health problems.   

In the absence of support from a family unit, such people would benefit greatly
from a system that would act as a daily counselor observing and recording
activities and then providing guidance based on an analysis of these
observations.The data collection should require minimal input from the student.     

Functional Requirements:      
• The user interface allows the student options to search for support within
different categories:    
o academic    
o health   
o social   
o cultural  
o emotional/mental issues   
o hygiene   

Make sure to include security aspects, to design a secure software.   

### Design
https://github.com/MichaelHeinzman/Software-Architecture-and-Design/blob/main/Arch_And_Design_Final_Report_Team2.pdf

### Pseudo Code of Design in Java
https://github.com/MichaelHeinzman/Software-Architecture-and-Design/tree/main/Team2SupportApp


## Programming Assignments
### Singleton Pattern Java     
Programming Assignment: Develop a singleton class called
ServiceProvider. Include in the class a static method called getInstance()
modeled after the lazy initialization technique found in section 26.5 of Larman.
Have ServiceProvider print “Constructing ServiceProvider” on its first
construction and print “ServiceProvider already exists” on subsequent attempts
at construction. Have your main() construct ServiceProvider three times
sequentially using ServiceProvider.getInstance().    

### Factory Pattern Java   
Programming Assignment:    
Design 4 classes:     

• MyController to control the execution of the example,      
• ExampleFactory (a singleton) to create a Service object,      
• a Service class interface named IAService,    
• a Service class named AService the implements IAService.    
  
Have MyController construct the ExampleFactory as a singleton as in program 1.    
Have MyController use the ExampleFactory method getService() to create an
instance of AService.      
Have MyController use the method ProvideService() in
AService to print “I’m now providing the service for MyController”.

### Decorator Pattern Java     
The purpose of this assignment is to familiarize you with the rationale for the use
of the Decorator pattern and to provide you additional practice with the Factory
Pattern.     
First read the Decorator Pattern material that is posted on Canvas. This material
was taken from the O’Reilly Head First Design Patterns book by Freeman &
Freeman.    
Then, implement the code found on pages 95 through 98 of the example posting.
The printed output should be similar to that on page 98.    

1. After convincing yourself that the code executes properly, replace the
main program where the test cases were hard coded. Instead, have the
main program create a Store object. Then have the Store object create a
(singleton) condimentFactory and a Register object, passing the address
of the condimentFactory to the Register.   
The Register then takes the orders from the keyboard. For example:    
New sale   
Darkroast   
Mocha   
Mocha   
Whip   
End sale   

The Register then produces and prints the full description of the coffee
and condiments ordered plus the price of the coffee with its condiments.   
   
2. Add a new condiment to the system...”sprinkles”. Run some tests using
the new condiment to verify your addition. Pay very close attention to
what is involved in adding a new condiment to the system. What needs to
be modified and what does not?   

### Iterator Pattern Java
The purpose of this assignment is to familiarize you with the implementation of
the Iterator Pattern. This pattern is considered to be so important that the Java
designers furnished it as part of the language, i.e., java.util.Iterator. I’m sure you
have already used the Iterator in previous classes.    

For this assignment,
implement the Iterator Pattern yourself. Do not use the built-in Java
capability. Once you understand the implementation you will then use the Java
supplied Iterator for the remainder of your career.    
 
First, read the Iterator Pattern pdf that is posted on Canvas.     
The example concerns the merging of two restaurants:    
the Objectville Diner and the Objectville Pancake House. One of the menus had been implemented using an
Array structure and the other using an ArrayList. The Iterator allows one to print
the merged menus without directly referencing their actual data structures. The
code for the solution can be found in the pdf and in dinermerger.zip folder.
Your task is to merge the Diner and Pancake House menus with the menu from
Starbuzz Coffee Shop described in the Decorator Head First.pdf found in the
module on Canvas. Include the beverages and the condiments. Note: THIS IS
NOT A DECORATOR EXERCISE.     

• Develop the code for the Starbuzz Coffee menu using a HashTable as the
data structure.    
• Develop the code for the StarbuzzMenuIterator. Do not use the Java
utility.   
• Modify the Waitress class to produce the merged menu from the three
restaurants.   
• Modify the MenuTestDrive to accommodate the addition of a third menu.   
• Execute the MenuTestDrive code to test your modification.   
