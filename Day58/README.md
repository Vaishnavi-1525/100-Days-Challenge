# 🌟 Day 58 – Check if Two Arrays Are the Same

## 📝 Problem Statement

Write a Java program to check if two arrays are the same or not.
- Two arrays are considered the same if:
- They have the same length
- All their corresponding elements are equal and in the same order

---


## 📖 Explanation
- First, compare the lengths of both arrays.
- If lengths are different → Arrays are not the same.
- If lengths are the same → Traverse both arrays element by element and compare.
- If any element differs → Arrays are not the same.
- If all elements match → Arrays are the same.

---

## 📝 Sample Input & Output

### Input: Array1: [1, 2, 3, 4]  
### Array2: [1, 2, 3, 4]

### Output:  Both arrays are the SAME.

### Input: Array1: [5, 6, 7]  
### Array2: [5, 7, 6]

### Output: Arrays are NOT the same.

---

## 💻 How to Run Code
### Java ☕
```
javac day58.java
java day58
