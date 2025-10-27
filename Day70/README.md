# 🌟 Day 70 — Check Whether Two Arrays Are Disjoint or Not

## 💡 Problem Statement

Given two integer arrays X and Y of the same size, treat them as vectors and find the maximum scalar (dot) product.

---

## 🧮 Concept
- The scalar product (dot product) of two vectors is:
- Dot Product = 𝑋1 × 𝑌1 + 𝑋2 × 𝑌2 + ... + 𝑋𝑛 × 𝑌𝑛
- Dot Product = X1 × Y1 + X2 × Y2 +...+ Xn × Yn
- To get the maximum scalar product, we:
- Sort both arrays:
- Sort X in ascending order.
- Sort Y in ascending order.
- Multiply corresponding elements and add them up.
- (Because pairing largest with largest gives the maximum sum.)

---

## 🧩 Sample Input & Output

### 🧠 Example 1

#### Input: 4
#### 1 2 3 4
#### 5 6 7 8

#### Process: (1×5) + (2×6) + (3×7) + (4×8)
####          = 5 + 12 + 21 + 32 = 70

#### ✅ Output: 70

----

### 🧠 Example 2
#### Input: 4
#### -1 -2 -3 -4
#### 5 6 -7 -8

#### Process: Sort X → [-4, -3, -2, -1]
#### Sort Y → [-8, -7, 5, 6]

#### Dot product = (-4×-8) + (-3×-7) + (-2×5) + (-1×6)
####              = 32 + 21 -10 -6 = 37

#### ✅ Output: 37

----

### ✅ Output
#### For input: 4
#### 1 2 3 4
#### 5 6 7 8

#### Output: 70

---

## ▶️ How to Run the Code 
### Java ☕
```
javac day70.java
java day70
