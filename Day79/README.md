# 🌟 Day 79 – Gold Mining

## 📝 Problem Statement

Anusree and his N friends (so total N + 1 people) go to a gold mine that contains X kg of gold.
Each person can carry at most Y kg of gold.

Determine whether all the gold can be carried in one trip.

---

## 📖 Explanation

Total people = N + 1

Total carrying capacity = (N + 1) × Y

If the total capacity ≥ X, then they can carry all the gold → print “YES”

Otherwise, print “NO”

---

## 📝 Sample Input & Output

### ✅ Input: 3
#### 2 10 3
#### 2 10 4
#### 1 5 10

### ✅ Output:
#### NO
#### YES
#### YES

---

## 💻 How to Run Code
### ☕ Java Code
```
javac day79.java
java day79

