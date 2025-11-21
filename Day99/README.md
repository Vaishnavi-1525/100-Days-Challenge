# 🌟 Day 99 – Rebuild the Array from Subset Sums

## 📝 Problem Statement

You are given all subset sums of a hidden array.
Your job is to reconstruct the original array.

---

## 📖 Explanation

You are given 2^N integers, which represent the sums of all possible subsets.

One of the values will always be 0 → because of the empty subset.

The smallest non-zero number is always part of the original array.

After extracting one element, remove every subset sum that includes that element, and continue until all N numbers are recovered.
---

## 📝 Sample Input & Output
### Input:
1

0 10

### Output:
10

### Input:
2

0 1 1 2

### Output:
1 1

 


## 💻 How to Run Code
### ☕ Java Code
```
javac day99.java
java day99
