/*
* @author Austin Driggs
* CS 111 Section 002
* 2/1/23
* 
* Purpose: SEE INHERITANCE DOC IN CS111 FILE FOLDER
* 
* 
* 
* 
* 
* Class Design & Implementation Continued
* Inheritance, & Abstract Classes 
* 
* Frequently in the design of an application we encounter classes that while closely related, are subtly different.  Let’s consider as 
* an example a payroll system that we might design for a factory that produces and sells pastries: 
* 
* Some of the employees such as managers would be paid as Salaried Employees (they might have a yearly salary paid over a fixed # 
* of pay periods), others might be paid by the hour as Hourly Employees, and salesmen might Commission-based Employees (who have a 
* salary but might also earn commission on their sales).  There some basic features that all types of employees share in common:  
* first name, last name, title, hire date, address, phone #  etc. , and features specific to each subtype of employee:  
* Such as only Hourly employees will have an hourly rate, and hours worked
* 
* Our application program will need to create instances of each of our employee types to represent the employees our factory 
* employees, and to calculate their pay.  
* 
* -
* 
* Then we can use inheritance to define subclasses of class Employee that automatically obtain the shared features from employee, 
* but then implement type specific features that represent only the individual subclass.
* 
* A subclass  is a class defined based on an existing class.  It retains or inherits ALL of the data members and methods of the 
* parent class, but allows the designer to implement additional data members and methods that are specific to the subclass.
* 
* -
* 
* An inheritance hierarchy diagram can be used to show the relationship between child (subclasses) and their parent 
* (superclass).  ALL classes in Java are descendants of the superclass Object.
* 
* -
* 
* When we create a subclass, via the “extends” keyword, it automatically inherits or gets a copy of all of the public and 
* private members of the parent class.  So when class Salaried employee is defined, it will inherit the data members 
* firstName, and lastName etc, however it will only be able to directly access the public members inherited from class Employee.  
* 
* -
* 
* JAVA IMPLIMENTS SINGLE INHERITANCE. A CLASS CAN HAVE AT MOST ONE DIRECT PARENT
* ISA INHERITACNE: SUB TYPE INHERITANCE. An instance of a child class IS A instance of the parent class. 
* 
* 
* 
* -
* 
* 
* 
* Abstract Classes: See Inheritance doc
* 
* There really is no reason to have an employee class. We would never have an employee that we don't pay.
* We would always have either a Salaried, Hourly, or Commision sub class of an employee.
* 
* 
* 
* 
* 
* 
* 
*/