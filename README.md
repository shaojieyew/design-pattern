# Design Pattern

## 1. Creational
Creational patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.


### 1.1. Factory
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.


### 1.2. Abstract Factory

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.


The main difference between a “factory method” and an “abstract factory” is that the factory method is a single method, and an abstract factory is an object. The factory method is just a method, it can be overridden in a subclass, whereas the abstract factory is an object that has multiple factory methods on it.

### 1.3. Builder
A Builder class builds the final object step by step. This builder is independent of other objects

This example of the Builder pattern illustrates how you can reuse the same object construction code when building different types of products, such as cars, and create the corresponding manuals for them.



### 1.4. Prototype

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy

### 1.5. Singleton

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.


## 2. Structural

Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

### 2.1. Adapter

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

### 2.2. Bridge

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

### 2.3. Composition

Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.


### 2.4. Decorator

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.



### 2.5. Facade

Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.



### 2.6. Proxy

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

## 3. Behavioral

Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.


### 3.1. Chain of Responsibility

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

### 3.2. Command

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.


### 3.3. Iterator

Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

### 3.4. Mediator

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.


### 3.5. Memento

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.



### 3.6. Observer

Observer is a behavioral design 
pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

### 3.7. State

State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.



### 3.8. Strategy
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.


### 3.9. Template Method
Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.


### 3.10. Visit
Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate