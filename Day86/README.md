# 🌟 Day 86 – Multi-Level Inheritance

## 📝 Problem Statement

In this task, you need to demonstrate the concept of multi-level inheritance in Java.

Suppose we have three classes:

Class A (Base Class)

Class B (Derived from A)

Class C (Derived from B)

This allows Class C to access methods from both Class A and Class B, which is known as multi-level inheritance.

You need to create a class Equilateral that inherits from Isosceles, and Isosceles inherits from Triangle.
Each class should have a method that prints a message describing its type.

---

## 📖 Explanation

Triangle → Base class with method: "I am a triangle"

Isosceles → Derived from Triangle, adds method: "I am an isosceles triangle"

Equilateral → Derived from Isosceles, adds method: "I am an equilateral triangle"

When you create an object of Equilateral, it should be able to access methods from all three classes.

---

## 📝 Sample Output
I am an equilateral triangle
I am an isosceles triangle
I am a triangle

---

## 💻How to Run Code
### Java ☕
```
javac Day86.java
java Day86
