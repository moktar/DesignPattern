# Design Patterns in Java

A design patterns are **well-proved** solution for solving the specific problem/task.

Now, a question will be arising in your mind what kind of specific problem? Let me explain by taking an example.

### Problem Given:

Suppose you want to create a class for which only a single instance (or object) should be created and that single object can be used by all other classes.

### Solution:

**Singleton design pattern** is the best solution of above specific problem. So, every design pattern has **some specification or set of rules** for solving the problems. What are those specifications, you will see later in the types of design patterns.

But remember one-thing, design patterns are programming language independent strategies for solving the common object-oriented design problems. That means, a design pattern represents an idea, not a particular implementation.

By using the design patterns you can make your code more flexible, reusable and maintainable. It is the most important part because java internally follows design patterns.

To become a professional software developer, you must know at least some popular solutions (i.e. design patterns) to the coding problems.

## Advantage of design pattern:

1. They are reusable in multiple projects.
2. They provide the solutions that help to define the system architecture.
3. They capture the software engineering experiences.
4. They provide transparency to the design of an application.
5. They are well-proved and testified solutions since they have been built upon the knowledge and experience of expert software developers.
6. Design patterns don?t guarantee an absolute solution to a problem. They provide clarity to the system architecture and the possibility of building a better system.

## When should we use the design patterns?

We must use the design patterns during the analysis and requirement phase of SDLC(Software Development Life Cycle).

Design patterns ease the analysis and requirement phase of SDLC by providing information based on prior hands-on experiences.

## Categorization of design patterns:

Basically, design patterns are categorized into two parts:

## Core Java (or JSE) Design Patterns.
1. Core Java (or JSE) Design Patterns.
1. JEE Design Patterns

In core java, there are mainly three types of design patterns, which are further divided into their sub-parts:
## 1. Creational Design Pattern
1. Factory Pattern
1. Abstract Factory Pattern
1. Singleton Pattern
1. Prototype Pattern
1. Builder Pattern.
      
## 2. Structural Design Pattern
1. Adapter Pattern
1. Bridge Pattern
1. Composite Pattern
1. Decorator Pattern
1. Facade Pattern
1. Flyweight Pattern
1. Proxy Pattern

## 3. Behavioral Design Pattern
1. Chain Of Responsibility Pattern
1. Command Pattern
1. Interpreter Pattern
1. Iterator Pattern
1. Mediator Pattern
1. Memento Pattern
1. Observer Pattern
1. State Pattern
1. Strategy Pattern
1. Template Pattern
1. Visitor Pattern
 
 
 # 1. Creational design patterns

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

## 2. Abstract Factory Pattern

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

## 3. Singleton Pattern

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

## 4. Prototype Pattern

Prototype Pattern says that **cloning of an existing object instead of creating new one and can also be customized as per the requirement.**

This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.

### Advantage of Prototype Pattern

The main advantages of prototype pattern are as follows:

* It reduces the need of sub-classing.
* It hides complexities of creating objects.
* The clients can get new objects without knowing which type of object it will be.
* It lets you add or remove objects at runtime.

### Usage of Prototype Pattern

* When the classes are instantiated at runtime.
* When the cost of creating an object is expensive or complicated.
* When you want to keep the number of classes in an application minimum.
* When the client application needs to be unaware of object creation and representation.

### UML for Prototype Pattern

![](https://www.javatpoint.com/images/designpattern/prototype.jpg)

## 5. Builder Pattern

Builder Pattern says that **"construct a complex object from simple objects using step-by-step approach"**

It is mostly used when object can't be created in single step like in the de-serialization of a complex object.

### Advantage of Builder Pattern

The main advantages of Builder Pattern are as follows:

* It provides clear separation between the construction and representation of an object.
* It provides better control over construction process.
* It supports to change the internal representation of objects.

### UML for Builder Pattern Example

![](https://www.javatpoint.com/images/designpattern/builderuml1.jpg)

## 6. Object Pool Pattern

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


# 2. Structural design patterns

**Structural design patterns** are concerned with how classes and objects can be composed, to form larger structures.

The structural design patterns **simplifies the structure by identifying the relationships.**

These patterns focus on, how the classes inherit from each other and how they are composed from other classes.

## Types of structural design patterns

There are following 7 types of structural design patterns.

**1. Adapter Pattern**

Adapting an interface into another according to client expectation.

**2. Bridge Pattern**

Separating abstraction (interface) from implementation.

**3. Composite Pattern**

Allowing clients to operate on hierarchy of objects.

**4. Decorator Pattern**

Adding functionality to an object dynamically.

**5. Facade Pattern**

Providing an interface to a set of interfaces.

**6. Flyweight Pattern**

Reusing an object by sharing it.

**7. proxy Pattern**

Representing another object.

## 1. Adapter Pattern

An Adapter Pattern says that just **"converts the interface of a class into another interface that a client wants".**

In other words, to provide the interface according to client requirement while using the services of a class with a different interface.

The Adapter Pattern is also known as **Wrapper**.

### Advantage of Adapter Pattern

* It allows two or more previously incompatible objects to interact.
* It allows reusability of existing functionality.

### Usage of Adapter pattern:

It is used:

* When an object needs to utilize an existing class with an incompatible interface.
* When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
* When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.

**Example of Adapter Pattern**

Let's understand the example of adapter design pattern by the above UML diagram.

### UML for Adapter Pattern:

There are the following specifications for the adapter pattern:

**Target Interface:** This is the desired interface class which will be used by the clients.

**Adapter class:** This class is a wrapper class which implements the desired target interface and modifies the specific 
request available from the Adaptee class.

**Adaptee class:** This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.

**Client:** This class will interact with the Adapter class.

![](https://www.javatpoint.com/images/designpattern/adapteruml.jpg)

## 2. Bridge Pattern

A Bridge Pattern says that just **"decouple the functional abstraction from the implementation so that the two can vary independently".**

The Bridge Pattern is also known as **Handle or Body.**

Advantage of Bridge Pattern

* It enables the separation of implementation from the interface.
* It improves the extensibility.
* It allows the hiding of implementation details from the client.

Usage of Bridge Pattern

* When you don't want a permanent binding between the functional abstraction and its implementation.
* When both the functional abstraction and its implementation need to extended using sub-classes.
* It is mostly used in those places where changes are made in the implementation does not affect the clients.

Advantage of Bridge Pattern
It enables the separation of implementation from the interface.
It improves the extensibility.
It allows the hiding of implementation details from the client.
Usage of Bridge Pattern
When you don't want a permanent binding between the functional abstraction and its implementation.
When both the functional abstraction and its implementation need to extended using sub-classes.
It is mostly used in those places where changes are made in the implementation does not affect the clients.

 
### Example of Bridge Pattern

The UML given below describes the example of bridge pattern.

### UML for Bridge Pattern:

![](https://www.javatpoint.com/images/designpattern/bridgeuml.jpg)

## 3. Composite Pattern

A Composite Pattern says that just **"allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects".**

### Advantage of Composite Design Pattern

* It defines class hierarchies that contain primitive and complex objects.
* It makes easier to you to add new kinds of components.
* It provides flexibility of structure with manageable class or interface.

### Usage of Composite Pattern

It is used:

* When you want to represent a full or partial hierarchy of objects.
* When the responsibilities are needed to be added dynamically to the individual objects without affecting other objects. Where the responsibility of object may vary from time to time.

### UML for Composite Pattern

![](https://www.javatpoint.com/images/designpattern/compositeuml1.jpg)

### Elements used in Composite Pattern:

Let's see the 4 elements of composte pattern.

### 1) Component

* Declares interface for objects in composition.
* Implements default behavior for the interface common to all classes as appropriate.
* Declares an interface for accessing and managing its child components.

Elements used in Composite Pattern:

Let's see the 4 elements of composte pattern.

### 1) Component

Declares interface for objects in composition.
Implements default behavior for the interface common to all classes as appropriate.
Declares an interface for accessing and managing its child components.

 
### 2) Leaf

* Represents leaf objects in composition. A leaf has no children.
* Defines behavior for primitive objects in the composition.

### 3) Composite

* Defines behavior for components having children.
* Stores child component.
* Implements child related operations in the component interface.

### 4) Client

* Manipulates objects in the composition through the component interface.

Note:The work flow of above general UML is as follows.

Client uses the component class interface to interact with objects in the composition structure. If recipient is the leaf then request will be handled directly. If recipient is a composite, then it usually forwards the request to its child for performing the additional operations.

### Example of Composite Pattern

We can easily understand the example of composite design pattern by the UML diagram given below:

![](https://www.javatpoint.com/images/designpattern/compositeuml2.jpg)

## 4. Decorator Pattern

A Decorator Pattern says that just **"attach a flexible additional responsibilities to an object dynamically".**

In other words, The Decorator Pattern uses composition instead of inheritance to extend the functionality of an object at runtime.

The Decorator Pattern is also known as **Wrappe**

### Advantage of Decorator Pattern

* It provides greater flexibility than static inheritance.
* It enhances the extensibility of the object, because changes are made by coding new classes.
* It simplifies the coding by allowing you to develop a series of functionality from targeted classes instead of coding all of the behavior into the object.

### Usage of Decorator Pattern

It is used:

* When you want to transparently and dynamically add responsibilities to objects without affecting other objects.
* When you want to add responsibilities to an object that you may want to change in future.
* Extending functionality by sub-classing is no longer practical.

### UML for Decorator Pattern:

![](https://www.javatpoint.com/images/designpattern/decoratoruml.jpg)


## 5. Facade Pattern

A Facade Pattern says that just **"just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".**

In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.

Practically, **every Abstract Factory is a type of Facade.**

### Advantage of Facade Pattern

* It shields the clients from the complexities of the sub-system components.
* It promotes loose coupling between subsystems and its clients.

### Usage of Facade Pattern:

It is used:

* When you want to provide simple interface to a complex sub-system.
* When several dependencies exist between clients and the implementation classes of an abstraction.

### Example of Facade Pattern

Let's understand the example of facade design pattern by the above UML diagram.

### UML for Facade Pattern:

![](https://www.javatpoint.com/images/designpattern/facadeuml.jpg)

## 6. Flyweight Pattern

A Flyweight Pattern says that just **"to reuse already existing similar kind of objects by storing them and create new object when no matching object is found".**

### Advantage of Flyweight Pattern

* It reduces the number of objects.
* It reduces the amount of memory and storage devices required if the objects are persisted

### Usage of Flyweight Pattern

* When an application uses number of objects
* When the storage cost is high because of the quantity of objects.
* When the application does not depend on object identity.

### Example of Flyweight Pattern

Let's understand the example of flyweight design pattern by the above UML diagram.

### UML for Flyweight Pattern:

![](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/flyweight.jpg)

## 7. Proxy Pattern

Simply, proxy means an object representing another object.

According to GoF, a Proxy Pattern **"provides the control for accessing the original object".**

So, we can perform many operations like hiding the information of original object, on demand loading etc.

Proxy pattern is also known as **Surrogate or Placeholder.**

### Advantage of Proxy Pattern

* It provides the protection to the original object from the outside world.

### Usage of Proxy Pattern:

It is used:

* It can be used in Virtual Proxy scenario---Consider a situation where there is multiple database call to extract huge size image. Since this is an expensive operation so here we can use the proxy pattern which would create multiple proxies and point to the huge size memory consuming object for further processing. The real object gets created only when a client first requests/accesses the object and after that we can just refer to the proxy to reuse the object. This avoids duplication of the object and hence saving memory.
* It can be used in Protective Proxy scenario---It acts as an authorization layer to verify that whether the actual user has access the appropriate content or not. For example, a proxy server which provides restriction on internet access in office. Only the websites and contents which are valid will be allowed and the remaining ones will be blocked.
* It can be used in Remote Proxy scenario---A remote proxy can be thought about the stub in the RPC call. The remote proxy provides a local representation of the object which is present in the different address location. Another example can be providing interface for remote resources such as web service or REST resources.
* It can be used in Smart Proxy scenario---A smart proxy provides additional layer of security by interposing specific actions when the object is accessed. For example, to check whether the real object is locked or not before accessing it so that no other objects can change it.

### Example of Proxy Pattern

Let's understand the example of proxy design pattern by the above UML diagram.

### UML for Proxy Pattern:

![](https://www.javatpoint.com/images/designpattern/proxyuml.jpg)

# 3. Behavioral Design Patterns

Behavioral design patterns are concerned with **the interaction and responsibility of objects.**

In these design patterns,**the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.**

That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.

### There are 12 types of structural design patterns:

* Chain of Responsibility Pattern
* Command Pattern
* Interpreter Pattern
* Iterator Pattern
* Mediator Pattern
* Memento Pattern
* Observer Pattern
* State Pattern
* Strategy Pattern
* Template Pattern
* Visitor Pattern
* Null Object

## 1. Chain Of Responsibility Pattern

In chain of responsibility, sender sends a request to a chain of objects. The request can be handled by any object in the chain.

A Chain of Responsibility Pattern says that just **"avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request".** For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

In other words, we can say that normally each receiver contains reference of another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

### Advantage of Chain of Responsibility Pattern

* It reduces the coupling.
* It adds flexibility while assigning the responsibilities to objects.
* It allows a set of classes to act as one; events produced in one class can be sent to other handler classes with the help of composition.

### Usage of Chain of Responsibility Pattern:

It is used:

* When more than one object can handle a request and the handler is unknown.
* When the group of objects that can handle the request must be specified in dynamic way.

### Example of Chain of Responsibility Pattern

Let's understand the example of Chain of Responsibility Pattern by the above UML diagram.

### UML for Chain of Responsibility Pattern:

![](https://www.javatpoint.com/images/designpattern/chainofresponsibilityuml.jpg)

## 2. Command Pattern

A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

It is also known as **Action or Transaction.**

### Advantage of command pattern

* It separates the object that invokes the operation from the object that actually performs the operation.
* It makes easy to add new commands, because existing classes remain unchanged.

### Usage of command pattern:

It is used:

* When you need parameterize objects according to an action perform.
* When you need to create and execute requests at different times.
* When you need to support rollback, logging or transaction functionality.

### Example of command pattern

Let's understand the example of adapter design pattern by the above UML diagram.

### UML for command pattern:

### These are the following participants of the Command Design pattern:

* **Command**This is an interface for executing an operation.
* **ConcreteCommand** This class extends the Command interface and implements the execute method. This class creates a binding between the action and the receiver.
* **Client** This class creates the ConcreteCommand class and associates it with the receiver.
* **Invoker** This class asks the command to carry out the request.
* **Receiver** This class knows to perform the operation.

![](https://www.javatpoint.com/images/designpattern/commanduml.jpg)

## 3. Interpreter Pattern

An Interpreter Pattern says that **"to define a representation of grammar of a given language, along with an interpreter that uses this representation to interpret sentences in the language".**

Basically the Interpreter pattern has limited area where it can be applied. We can discuss the Interpreter pattern only in terms of formal grammars but in this area there are better solutions that is why it is not frequently used.

This pattern can applied for parsing the expressions defined in simple grammars and sometimes in simple rule engines.

### Advantage of Interpreter Pattern

* It is easier to change and extend the grammar.
* Implementing the grammar is straightforward.

### Usage of Interpreter pattern:

It is used:

* When the grammar of the language is not complicated.
* When the efficiency is not a priority.

### Example of Interpreter Pattern

Let's understand the example of Interpreter Pattern by the above UML diagram.

### UML for Interpreter Pattern

![](https://www.javatpoint.com/images/designpattern/interpreteruml.jpg)

## 4. Iterator Pattern

According to GoF, Iterator Pattern is used **"to access the elements of an aggregate object sequentially without exposing its underlying implementation".**

The Iterator pattern is also known as **Cursor**.

In collection framework, we are now using Iterator that is preferred over Enumeration.

### Advantage of Iterator Pattern

* It supports variations in the traversal of a collection.
* It simplifies the interface to the collection.

Usage of Iterator Pattern:

It is used:

* When you want to access a collection of objects without exposing its internal representation.
* When there are multiple traversals of objects need to be supported in the collection.

### Example of Iterator Pattern

Let's understand the example of iterator pattern pattern by the above UML diagram.

### UML for Iterator Pattern:

![](https://www.javatpoint.com/images/designpattern/iteratoruml.jpg)
