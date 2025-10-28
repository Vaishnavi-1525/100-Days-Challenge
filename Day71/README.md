# 🌟 Day 71 — Check Whether the Numbers of an Array Can Be Made Equal

## 💡 Problem Statement

Write a program to determine whether the numbers in a given array can be made equal by multiplying each number with some integer values.

---

## 🧮 Concept

- To make all numbers equal by multiplying with integers, we can only adjust them by factors of 2 and 3.
- So, if after repeatedly dividing all elements by 2 and 3 (until they are no longer divisible), the remaining values are all the same, then they can be made equal.

---

## 🧩 Sample Input & Output

### 🧠 Example 1

#### Input: 3
#### 50 75 150

#### Process: Reduce by removing factors of 2 and 3
#### → 50 → 25
#### → 75 → 25
#### → 150 → 25

#### All reduced to the same value 25 ✅
#### Hence, they can be made equal (e.g., 50×6 = 75×4 = 150×2 = 300)

#### ✅ Output: Yes

---

### 🧠 Example 2

#### Input: 3
#### 10 14 22

#### Process: 10 → 5
#### 14 → 7
#### 22 → 11

#### Not all are same ❌

#### ✅ Output: No

---

## ▶️ How to Run the Code
### Java ☕
```
javac Day71.java
java Day71
