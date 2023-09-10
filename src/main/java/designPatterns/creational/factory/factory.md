## Factory Design Pattern

It is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method.

the objects are still created via the new operator, but it’s being called from within the factory method.

The factory design pattern says that define an interface ( A java interface or an abstract class) for creating object and let the subclasses decide which class to instantiate.



### Examples
1. getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle uses factory method design pattern. 
2. All the wrapper classes like Integer, Boolean etc, in Java uses this pattern to evaluate the values using valueOf() method. 
