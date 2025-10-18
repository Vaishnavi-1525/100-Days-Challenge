# 🌟 Day 64 — Minimum Scalar Product of Two Vectors

## 📝 Problem Statement

Write a Java program to find the minimum scalar product (dot product) of two integer arrays (vectors) of the same size.

---

## 📖 Explanation
- The user enters two arrays of equal length.
- To get the minimum scalar product:
- Sort one array in ascending order.
- Sort the other in descending order.
- Multiply corresponding elements and add them up.
- The final sum is the minimum scalar product.

---

## 💡 Formula
Min Scalar Product = ∑(𝑋[𝑖]∗𝑌[𝑖])
Min Scalar Product=∑(X[i]∗Y[i])

where
X = sorted ascending
Y = sorted descending

---

## 🧩 Sample Input & Output

#### Input: 4
####  1 2 3 4
####  5 6 7 8

#### Output: Minimum Scalar Product: 60


#### 🧮 Explanation: (1×8 + 2×7 + 3×6 + 4×5) = 60



#### Input: 4
#### -1 -2 -3 -4
#### 5 6 -7 -8

#### Output: Minimum Scalar Product: -17


#### 🧮 Explanation: (-4×5) + (-3×6) + (-2×-7) + (-1×-8) = -17

---


## ▶️ How to Run the Code
## Java ☕
javac day64.java
java day64
