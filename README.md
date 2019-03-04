# Design Pattern
Design Patterns in Java

A design patterns are well-proved solution for solving the specific problem/task.

Now, a question will be arising in your mind what kind of specific problem? Let me explain by taking an example.

Problem Given:

Suppose you want to create a class for which only a single instance (or object) should be created and that single object can be used by all other classes.

Solution:

Singleton design pattern is the best solution of above specific problem. So, every design pattern has some specification or set of rules for solving the problems. What are those specifications, you will see later in the types of design patterns.

But remember one-thing, design patterns are programming language independent strategies for solving the common object-oriented design problems. That means, a design pattern represents an idea, not a particular implementation.

By using the design patterns you can make your code more flexible, reusable and maintainable. It is the most important part because java internally follows design patterns.

To become a professional software developer, you must know at least some popular solutions (i.e. design patterns) to the coding problems.

Advantage of design pattern:

1. They are reusable in multiple projects.
2. They provide the solutions that help to define the system architecture.
3. They capture the software engineering experiences.
4. They provide transparency to the design of an application.
5. They are well-proved and testified solutions since they have been built upon the knowledge and experience of expert software developers.
6. Design patterns don?t guarantee an absolute solution to a problem. They provide clarity to the system architecture and the possibility of building a better system.

When should we use the design patterns?
We must use the design patterns during the analysis and requirement phase of SDLC(Software Development Life Cycle).

Design patterns ease the analysis and requirement phase of SDLC by providing information based on prior hands-on experiences.

Categorization of design patterns:
Basically, design patterns are categorized into two parts:

Core Java (or JSE) Design Patterns.
JEE Design Patterns.

Core Java Design Patterns
In core java, there are mainly three types of design patterns, which are further divided into their sub-parts:
1. Creational Design Pattern
      1. Factory Pattern
      2. Abstract Factory Pattern
      3. Singleton Pattern
      4. Prototype Pattern
      5. Builder Pattern.
      
2. Structural Design Pattern
      1. Adapter Pattern
      2. Bridge Pattern
      3. Composite Pattern
      4. Decorator Pattern
      5. Facade Pattern
      6. Flyweight Pattern
      7. Proxy Pattern
3. Behavioral Design Pattern
      1. Chain Of Responsibility Pattern
      2. Command Pattern
      3. Interpreter Pattern
      4. Iterator Pattern
      5. Mediator Pattern
      6. Memento Pattern
      7. Observer Pattern
      8. State Pattern
      9. Strategy Pattern
      10. Template Pattern
      11. Visitor Pattern
 
 To learn more details about design pattern, please view wiki of this reopository.
 
 # Creational design patterns

Creational design patterns are concerned with **the way of creating objects**. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).

But everyone knows an object is created by using new keyword in java. For example:

StudentRecord s1 = new StudentRecord();  

Hard-Coded code is not the good programming approach. Here, we are creating the instance by using the new keyword. Sometimes, the nature of the object must be changed according to the nature of the program. In such cases, we must get the help of creational design patterns to provide more general and flexible approach.

## Types of creational design patterns

There are following 6 types of creational design patterns.

1. Factory Method Pattern
1. Abstract Factory Pattern
1. Singleton Pattern
1. Prototype Pattern
1. Builder Pattern
1. Object Pool Pattern

## 1. Factory Method Pattern

A Factory Pattern or Factory Method Pattern says that just **define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate**. In other words, subclasses are responsible to create the instance of the class.

The Factory Method Pattern is also known as **Virtual Constructor**.

**Advantage of Factory Design Pattern**

* Factory Method Pattern allows the sub-classes to choose the type of objects to create.
* It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that implement that interface or that extends that abstract class.

**Usage of Factory Design Pattern**

* When a class doesn't know what sub-classes will be required to create
* When a class wants that its sub-classes specify the objects to be created.
* When the parent classes choose the creation of objects to its sub-classes.

**UML for Factory Method Pattern**

* We are going to create a Plan abstract class and concrete classes that extends the Plan abstract class. A factory class GetPlanFactory is defined as a next step.
* GenerateBill class will use GetPlanFactory to get a Plan object. It will pass information (DOMESTICPLAN / COMMERCIALPLAN / INSTITUTIONALPLAN) to GetPalnFactory to get the type of object it needs.

![](https://www.javatpoint.com/images/designpattern/factorymethod.jpg)

# 2. Abstract Factory Pattern

Abstract Factory Pattern says that just **define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes**.That means Abstract Factory lets a class returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

An Abstract Factory Pattern is also known as **Kit**.

**Advantage of Abstract Factory Pattern**

* Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
* It eases the exchanging of object families.
* It promotes consistency among objects.

**Usage of Abstract Factory Pattern**

* When the system needs to be independent of how its object are created, composed, and represented.
* When the family of related objects has to be used together, then this constraint needs to be enforced.
* When you want to provide a library of objects that does not show implementations and only reveals interfaces.
* When the system needs to be configured with one of a multiple family of objects.

**UML for Abstract Factory Pattern**

We are going to create a **Bank interface** and a **Loan abstract** class as well as their sub-classes.
Then we will create **AbstractFactory** class as next step.
Then after we will create concrete classes, **BankFactory**, and **LoanFactory** that will extends **AbstractFactory** class
After that, **AbstractFactoryPatternExample** class uses the **FactoryCreator** to get an object of **AbstractFactory** class.
See the diagram carefully which is given below:

![](https://www.javatpoint.com/images/designpattern/abstractfactory.jpg)

# 3. Singleton Pattern

Singleton Pattern says that just **"define a class that has only one instance and provides a global point of access to it"**.

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern

* **Early Instantiation:** creation of instance at load time.
* **Lazy Instantiation:**  creation of instance when required.

### Advantage of Singleton design pattern
* Saves memory because object is not created at each request. Only single instance is reused again and again.

### Usage of Singleton design pattern
* Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

### Uml of Singleton design pattern

![](https://www.javatpoint.com/images/designpattern/singleton.jpg)

### How to create Singleton design pattern?

To create the singleton class, we need to have static member of class, private constructor and static factory method.

* **Static member:** It gets memory only once because of static, itcontains the instance of the Singleton class.
* **Private constructor:** It will prevent to instantiate the Singleton class from outside the class.
* **Static factory method:** This provides the global point of access to the Singleton object and returns the instance to the caller.

### Understanding early Instantiation of Singleton Pattern

In such case, we create the instance of the class at the time of declaring the static data member, so instance of the class is created at the time of classloading.

Let's see the example of singleton design pattern using early instantiation.

class A{  
 private static A obj=new A();//Early, instance will be created at load time  
 private A(){}  
   
 public static A getA(){  
  return obj;  
 }  
  
 public void doSomething(){  
 //write your code  
 }  
}  

### Understanding lazy Instantiation of Singleton Pattern

In such case, we create the instance of the class in synchronized method or synchronized block, so instance of the class is created when required.

Let's see the simple example of singleton design pattern using lazy instantiation.

class A{  
 private static A obj;  
 private A(){}  
   
 public static A getA(){  
   if (obj == null){  
      synchronized(Singleton.class){  
        if (obj == null){  
            obj = new Singleton();//instance will be created at request time  
        }  
    }              
    }  
  return obj;  
 }  
  
 public void doSomething(){  
 //write your code  
 }  
}  

### Significance of Classloader in Singleton Pattern

If singleton class is loaded by two classloaders, two instance of singleton class will be created, one for each classloader.

### Significance of Serialization in Singleton Pattern

If singleton class is Serializable, you can serialize the singleton instance. Once it is serialized, you can deserialize it but it will not return the singleton object.

To resolve this issue, you need to override the readResolve() method that enforces the singleton. It is called just after the object is deserialized. It returns the singleton object.

public class A implements Serializable {  
        //your code of singleton  
        protected Object readResolve() {  
            return getA();  
        }  
  
}  

# 4. Prototype Pattern

Prototype Pattern says that **cloning of an existing object instead of creating new one and can also be customized as per the requirement.**

This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.

## Advantage of Prototype Pattern

The main advantages of prototype pattern are as follows:

* It reduces the need of sub-classing.
* It hides complexities of creating objects.
* The clients can get new objects without knowing which type of object it will be.
* It lets you add or remove objects at runtime.

## Usage of Prototype Pattern

* When the classes are instantiated at runtime.
* When the cost of creating an object is expensive or complicated.
* When you want to keep the number of classes in an application minimum.
* When the client application needs to be unaware of object creation and representation.

## UML for Prototype Pattern

![](https://www.javatpoint.com/images/designpattern/prototype.jpg)

# 5. Builder Pattern

Builder Pattern says that **"construct a complex object from simple objects using step-by-step approach"**

It is mostly used when object can't be created in single step like in the de-serialization of a complex object.

### Advantage of Builder Pattern

The main advantages of Builder Pattern are as follows:

* It provides clear separation between the construction and representation of an object.
* It provides better control over construction process.
* It supports to change the internal representation of objects.

### UML for Builder Pattern Example

![](https://www.javatpoint.com/images/designpattern/builderuml1.jpg)

# 6. Object Pool Pattern

Mostly, performance is the key issue during the software development and the object creation, which may be a costly step.

Object Pool Pattern says that **" to reuse the object that are expensive to create".**

Basically, an Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. **Objects in the pool have a lifecycle: creation, validation and destroy.**

A pool helps to manage available resources in a better way. There are many using examples: especially in application servers there are data source pools, thread pools etc.

### Advantage of Object Pool design pattern

* It boosts the performance of the application significantly.
* It is most effective in a situation where the rate of initializing a class instance is high.
* It manages the connections and provides a way to reuse and share them.
* It can also provide the limit for the maximum number of objects that can be created.

Usage:

* When an application requires objects which are expensive to create. Eg: there is a need of opening too many connections for the database then it takes too longer to create a new one and the database server will be overloaded.
* When there are several clients who need the same resource at different times.

NOTE: Object pool design pattern is essentially used in Web Container of the server for creating thread pools and data source pools to process the requests.


Object Pool Pattern
Advantage of Object Pool DP
Usage of Object Pool DP
UML of Object Pool DP
Example of Object Pool DP
Mostly, performance is the key issue during the software development and the object creation, which may be a costly step.

Object Pool Pattern says that " to reuse the object that are expensive to create".

Basically, an Object pool is a container which contains a specified amount of objects. When an object is taken from the pool, it is not available in the pool until it is put back. Objects in the pool have a lifecycle: creation, validation and destroy.

A pool helps to manage available resources in a better way. There are many using examples: especially in application servers there are data source pools, thread pools etc.

Advantage of Object Pool design pattern
It boosts the performance of the application significantly.
It is most effective in a situation where the rate of initializing a class instance is high.
It manages the connections and provides a way to reuse and share them.
It can also provide the limit for the maximum number of objects that can be created.
Usage:
When an application requires objects which are expensive to create. Eg: there is a need of opening too many connections for the database then it takes too longer to create a new one and the database server will be overloaded.
When there are several clients who need the same resource at different times.
NOTE: Object pool design pattern is essentially used in Web Container of the server for creating thread pools and data source pools to process the requests.

 
### Example of Object Pool Pattern:

Let's understand the example by the given UML diagram.

### UML for Object Pool Pattern

![](https://www.javatpoint.com/images/designpattern/objectpooluml.jpg)


