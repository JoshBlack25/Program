Student Management System



ADP372S Mini Assignment – Builder Pattern, Inheritance and SOLID Principles



Student Name: Joshua Adams

Student Number: 230317693



📌 Project Overview



This project implements a Student Management System in Java.



The system supports three different student types:



UndergraduateStudent



GraduateStudent



PartTimeStudent



The design demonstrates:



Builder Design Pattern



Inheritance



Polymorphism



SOLID Principles (Single Responsibility and Open/Closed)



1️⃣ Builder Design Pattern Implementation



The Builder Pattern is used to construct student objects step-by-step instead of using complex constructors with many parameters.



Each subclass (e.g., UndergraduateStudent, GraduateStudent, PartTimeStudent) contains a static inner Builder class.



Example: UndergraduateStudent Builder

public static class Builder {

&nbsp;   private String studentId;

&nbsp;   private String name;

&nbsp;   private String email;

&nbsp;   private String department;

&nbsp;   private int creditHours;

&nbsp;   private double scholarshipAmount;



&nbsp;   public Builder setStudentId(String studentId) {

&nbsp;       this.studentId = studentId;

&nbsp;       return this;

&nbsp;   }



&nbsp;   public Builder setCreditHours(int creditHours) {

&nbsp;       this.creditHours = creditHours;

&nbsp;       return this;

&nbsp;   }



&nbsp;   public UndergraduateStudent build() {

&nbsp;       return new UndergraduateStudent(this);

&nbsp;   }

}



Why Builder Was Used



Students have multiple attributes.



It avoids large constructors with many parameters.



It improves readability.



It allows step-by-step object construction.



Example usage in Main:



UndergraduateStudent naruto = new UndergraduateStudent.Builder()

&nbsp;       .setStudentId("U001")

&nbsp;       .setName("Naruto Uzumaki")

&nbsp;       .setCreditHours(18)

&nbsp;       .setScholarshipAmount(3000)

&nbsp;       .build();





This clearly demonstrates the Builder Design Pattern.



2️⃣ Inheritance



Inheritance is implemented using an abstract base class:



public abstract class Student





This class defines common attributes:



studentId



name



email



department



It also defines abstract methods:



public abstract double calculateTuition();

public abstract String getStudentType();

public abstract void displayStudentDetails();





The subclasses:



UndergraduateStudent



GraduateStudent



PartTimeStudent



extend the Student class:



public class UndergraduateStudent extends Student





This allows all student types to share common structure while implementing their own specific behavior.



3️⃣ Polymorphism



Polymorphism is demonstrated through method overriding.



Each subclass provides its own implementation of:



calculateTuition()



getStudentType()



displayStudentDetails()



Example: Different Tuition Calculations



Undergraduate:



@Override

public double calculateTuition() {

&nbsp;   return (creditHours \* 500) - scholarshipAmount;

}





Graduate:



@Override

public double calculateTuition() {

&nbsp;   if (researchAssistant) {

&nbsp;       return 20000 - stipend;

&nbsp;   }

&nbsp;   return 20000;

}





Part-Time:



@Override

public double calculateTuition() {

&nbsp;   return numberOfModules \* feePerModule;

}





Even though all objects are of type Student, each behaves differently at runtime.

This demonstrates runtime polymorphism.



4️⃣ SOLID Principles Applied

✅ Single Responsibility Principle (SRP)



The Single Responsibility Principle states that a class should have only one reason to change.



This project follows SRP in the following ways:



Student class → Defines shared structure and abstract behavior.



UndergraduateStudent → Handles undergraduate-specific logic only.



GraduateStudent → Handles graduate-specific logic only.



PartTimeStudent → Handles part-time-specific logic only.



Builder classes → Responsible only for object construction.



For example, UndergraduateStudent is only responsible for:



Credit hours



Scholarship calculation



Undergraduate tuition logic



It does not manage other student types or unrelated functionality.



This keeps the system modular and maintainable.



✅ Open/Closed Principle (OCP)



The Open/Closed Principle states:



Software entities should be open for extension but closed for modification.



This project follows OCP because:



The Student class is not modified when new student types are added.



To introduce PartTimeStudent, no changes were made to UndergraduateStudent or GraduateStudent.



A new subclass was simply created.



Example:



public class PartTimeStudent extends Student





The system was extended without modifying existing classes.



This makes the system scalable and flexible for future expansion (e.g., adding InternationalStudent or OnlineStudent).



📌 Conclusion



This project successfully demonstrates:



Builder Design Pattern for flexible object creation.



Inheritance for shared structure.



Polymorphism through method overriding.



Single Responsibility Principle for modular design.



Open/Closed Principle for extensibility.



The system is clean, modular, and easily extendable for future student types.

