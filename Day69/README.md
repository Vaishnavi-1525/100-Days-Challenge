# 🌟 Day 69 — Check Whether Two Arrays Are Disjoint or Not

## 📝 Problem Statement

- Given two integer arrays of sizes N and M, write a Java program to determine whether the arrays are disjoint or not.
- Two arrays are said to be disjoint if they have no elements in common.

---

## 📖 Explanation

- The program reads two arrays from the user.
- It checks if there is any common element between them.
- If there is no common element, the arrays are Disjoint.
- Otherwise, they are Not Disjoint, and the common element(s) are displayed.

---

## 💡 Hint

Use a HashSet to store elements of one array and then check for common elements efficiently (in O(n) time).

---

## 🧩 Sample Input & Output

#### 🧠 Sample Input 1: 4
#### 2 -4 -1 -3
#### 3
#### 1 3 5

#### 🧮 Process: No elements are common between the two arrays.

#### ✅ Sample Output 1: Disjoint

#### 🧠 Sample Input 2: 5
#### 1 5 -7 6 3
#### 4
#### 2 4 6 8

#### 🧮 Process: Element 6 is common in both arrays.

#### ✅ Sample Output 2: Not disjoint. (6 is common)

## ▶️ How to Run the Code 
## Java ☕
```
javac day69.java
java day69
