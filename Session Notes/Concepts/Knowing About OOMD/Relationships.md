

1. Inheritance (IS-A Relationship)

Definition:
Inheritance allows one class (child/subclass) to inherit the attributes and behaviors (methods) of another class (parent/superclass). This forms an "is-a" relationship.

Example:
<pre>'''java
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal { // Dog IS-A Animal
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();  // Output: Dog barks
    }
}'''</pre>

------------------------------------------------------------
2. Association (HAS-A Relationship)
-----------------------------------------------------------
Definition:
Association is a general relationship where one class uses or is connected to another. It can be one-to-one, one-to-many, etc.

Example:
<pre>'''java
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

class Car {
    Person owner;  // Car HAS-A Person

    Car(Person owner) {
        this.owner = owner;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        Car c = new Car(p);
        System.out.println(c.owner.name);  // Output: Alice
    }
}'''</pre>
---------------------------------------------------------------------
3. Aggregation (HAS-A with Ownership)
----------------------------------------------------------------------
Definition:
A special form of association where one class contains another class, but the contained class can exist independently. It implies a "whole-part" relationship.

Example:
<pre>'''java
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine;  // Aggregation

    Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car car = new Car(e);
        car.startCar();  // Output: Engine started
    }
}'''</pre>
------------------------------------------------------------------------
4. Composition (Strong HAS-A)
------------------------------------------------------------------------
Definition:
A stronger form of aggregation. When the container object is destroyed, the contained objects are also destroyed. It’s a part-of relationship where the lifetime of the part depends on the whole.

Example:
<pre>'''java
class Battery {
    Battery() {
        System.out.println("Battery created");
    }
}

class Mobile {
    private Battery battery;  // Composition

    Mobile() {
        battery = new Battery();  // Created within constructor
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile phone = new Mobile();
        // Output: Battery created
    }
}'''</pre>
--------------------------------------------------------------------------
5. Dependency (Uses Relationship)
--------------------------------------------------------------------------
Definition:
A class depends on another if it uses it temporarily, typically through method parameters.

Example:
<pre>'''java
class Printer {
    void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}

class Office {
    void doPrinting(Printer printer, String doc) {
        printer.print(doc);  // Uses Printer
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Office office = new Office();
        office.doPrinting(printer, "Report.pdf");  
        // Output: Printing: Report.pdf
    }
}'''</pre>


-------------------------------------------------------------
###Summary Table
-------------------------------------------------------------------

|Relationship  |	Type          |	Lifetime Tied? |	Example              |
|--------------|----------------------|----------------|-----------------------------|
|Inheritance   |	IS-A          |	Yes            |   Dog IS-A Animal           |
|Association   |	HAS-A         |	No             |	Car HAS-A Person     |
|Aggregation   |	HAS-A         |No              |	Car HAS-A Engine     |
|Composition   |	Strong HAS-A  |	Yes            |  	Mobile HAS-A Battery |
|Dependency    |	Uses          |	No             |	Office uses Printer  |




