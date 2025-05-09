
 The 4 Pillars of OOP

### 1. **Encapsulation**

**Definition**: Bundling data and methods that operate on that data within a single unit (class), and restricting access to some components.

* **Goal**: Hide internal state and require all interaction through methods.
* **Achieved via**: Access modifiers (`private`, `public`, `protected`).
* **Benefits**: Increased security, modularity, and maintainability.

📝 **Notes**:

* Use **getters** and **setters** to access private data.
* Prevents external modification of internal state directly.

---

### 2. **Abstraction**

**Definition**: Hiding complex implementation details and showing only the necessary features.

* **Goal**: Reduce complexity and allow focus on high-level operations.
* **Achieved via**: Abstract classes and interfaces.
* **Benefits**: Simplifies interaction with objects, improves code clarity.

📝 **Notes**:

* Abstract class can have both abstract (unimplemented) and concrete methods.
* Interface enforces method signatures that must be implemented.

---

### 3. **Inheritance**

**Definition**: Mechanism where one class acquires the properties and behaviors of another class.

* **Goal**: Promote code reuse.
* **Achieved via**: `extends` keyword (Java), `:` (C++), etc.
* **Benefits**: Reduces redundancy and improves scalability.

📝 **Notes**:

* **Parent class** (superclass) → **Child class** (subclass).
* Supports **method overriding** (child can redefine parent methods).

---

### 4. **Polymorphism**

**Definition**: Ability of an object to take many forms.

* **Goal**: Perform a single action in different ways.
* **Types**:

  * **Compile-time (Static)**: Method overloading.
  * **Runtime (Dynamic)**: Method overriding.
* **Benefits**: Flexibility and extensibility in code.

📝 **Notes**:

* Enables interface-based design.
* A base class reference can refer to derived class objects.

---

