Facebuk Project:
Facebuk is structured in a hierarchical fashion that allows ease of use 
in terms of developing methods and interactions between different data structures.
Structure is as follows: FacebookObject (super class) ->(FacebukUser -> (Person, Pet), Possession, Moment) 

FacebookObject: 
We decided to create a top-level class that relates the required class as it allows the common functionallity of 
name and the equals method to be refactored out of their respected classes
We use this class to allow the aforementioned equals method to easily access the name 
of each sub-object as it is stored top-level.

FacebukUser:
We decided to create a higher class for Person's and Pet's as they share alot of commonality only amongst themselves. 
This allows our program to require less code as it is inherited from a super class.
This also allows the two sublcasses Person and Pet to interact more fluidly 

