# 🌟 Day 68 — Maximum Product Subarray

## 📝 Problem Statement
Given an integer array of size N, write a Java program to find the maximum product subarray — the contiguous subarray within the array that has the largest product of its elements.

---

## 📖 Explanation
- A subarray is a continuous part of an array.
- The product of a subarray is obtained by multiplying all its elements.
- The task is to find the subarray that gives the maximum possible product among all subarrays.
- This problem requires handling of negative numbers — since multiplying two negatives gives a positive number.

---

## 💡 Key Idea
- Keep track of both:
- Maximum product so far, and
- Minimum product so far (since a negative value can become maximum when multiplied by another negative).
- Update these values as you iterate through the array.

  ---

## 🧩 Sample Input & Output
#### 🧠 Sample Input 1: 4
#### 2 -4 -1 -3

#### 🧮 Process: Possible subarrays & their products:
#### {2} → 2
#### {2, -4} → -8
#### {2, -4, -1} → 8 ✅
#### {2, -4, -1, -3} → -24
#### Maximum product = 8 = {2, -4, -1}

#### ✅ Sample Output 1: 8 = {2, -4, -1}

#### 🧠 Sample Input 2: 5
#### 1 5 -7 5 3

#### 🧮 Process: Maximum product subarray = {5, 3}
#### Product = 15

#### ✅ Sample Output 2: 15 = {5, 3}


---

## ▶️ How to Run the Code 
## Java ☕
```
javac day68.java
java day68
