# 🌟 Day 96 – Minimum Operations to Sort a Binary String

## 📝 Problem Statement
You are given a binary string S of length N.  
In one operation, you can reverse any substring of S.

Your task: **Find the minimum number of operations needed to sort the string**  
(sorted means all 0's first and all 1's afterwards).

---

## 🎯 Key Observation
A binary string can always be sorted in **0, 1, or 2 operations**:

### ✔ 0 operations  
The string is already sorted (`000111`).

### ✔ 1 operation  
All 1’s appear before all 0’s in a single block  
Examples: `1001`, `11000`, `111000`, `10`

### ✔ 2 operations  
The string has multiple scattered inversions  
Examples: `1010`, `010101`, `101010`

---

## 📥 Sample Input
4
3
000
4
1001
4
1010
6
010101


## 📤 Sample Output
0
1
2
2

---

## 💻 How to Run the Code 
## Java ☕
```
javac day96.java
java day96
