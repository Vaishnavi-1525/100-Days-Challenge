# 🌟 Day 66 — Sum of Positive Square Elements in an Array

## 📝 Problem Statement

Given an integer array of size N, write a Java program to find the sum of the squares of all elements (considering the absolute value for negative numbers).

---

## 📖 Explanation
- The program takes an integer array as input.
- For each element, it calculates its square (element × element).
- Both positive and negative numbers contribute positively to the sum because squaring makes all results positive.
- Finally, the program outputs the total sum of all squared values.

---

## 💡 Formula

Sum = 𝑎12+𝑎22+𝑎32+⋯+𝑎𝑛2

Sum = a12+a22+a32+⋯+an2
	​
---

## 🧩 Sample Input & Output
#### 🧠 Sample Input 1: 4
#### 1 2 3 4

#### 🧮 Calculation: (1² + 2² + 3² + 4²) = (1 + 4 + 9 + 16) = 30

#### ✅ Sample Output 1: 30

---

#### 🧠 Sample Input 2: 4
#### -1 -2 -3 -4

#### 🧮 Calculation: ((-1)² + (-2)² + (-3)² + (-4)²) = (1 + 4 + 9 + 16) = 30

#### ✅ Sample Output 2: 30

---

## ▶️ How to Run the Code 
## Java ☕
```
javac day66.java
java day66
