# Student Management System

**ADP372S Mini Assignment – Builder Pattern, Inheritance, and SOLID Principles**  

**Student Name:** Joshua Adams  
**Student Number:** 230317693

---

## 📌 Project Overview

This project implements a **Student Management System** in Java.  

It supports three types of students:

- `UndergraduateStudent`  
- `GraduateStudent`  
- `PartTimeStudent`  

Key design features:

- **Builder Pattern** for flexible object creation  
- **Inheritance** for shared structure  
- **Polymorphism** for runtime behavior differences  
- **SOLID Principles** for clean, maintainable design  

> For implementation details, please refer to the Java source files.

---

## Builder Pattern

The Builder Pattern is used to construct student objects **step-by-step**, avoiding large constructors and improving readability.  

> Each student subclass has a **Builder** class for creating instances.

---

## Inheritance & Polymorphism

- **Abstract Student class** defines common attributes and methods.  
- Subclasses (`UndergraduateStudent`, `GraduateStudent`, `PartTimeStudent`) extend the base class.  
- Each subclass overrides methods like `calculateTuition()` and `displayStudentDetails()`, demonstrating **runtime polymorphism**.

---

## SOLID Principles

- **Single Responsibility Principle (SRP):**  
  Each class has one responsibility (e.g., `UndergraduateStudent` only handles undergraduate logic).  
- **Open/Closed Principle (OCP):**  
  New student types can be added via subclasses **without modifying existing classes**.

---

## 📌 Conclusion

This system is **modular, extensible, and maintainable**, clearly demonstrating:

- Builder Pattern for object creation  
- Inheritance and polymorphism for shared structure and behavior  
- SRP and OCP for clean design  

> Check the Java files to see the full implementation in action.
