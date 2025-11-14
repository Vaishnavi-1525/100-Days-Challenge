# 🌟 Day 94 – Minimum Operations to Convert Binary String to All Zeros

## 📝 Problem Statement

You are given a binary string S of length N.
You can perform the following operation:

Choose any set of indices such that no two chosen indices are adjacent.

Flip the values at these indices (0 → 1, 1 → 0).

Your goal is to convert all characters of S to 0 using the minimum number of operations.

---

## 🔍 Key Insight

In one operation, you can flip any number of non-adjacent 1 positions.

This means:

All isolated 1's can be flipped in a single operation.

Consecutive 1's form a blocked segment and must be flipped in separate operations.

#### ⭐ Final Rule

Minimum operations = number of groups of consecutive ‘1’s in the string

---

## 🧠 Explanation with Examples
### Example 1

#### Input: 101001
Groups of 1 → 1, 1, 1 → all are isolated
➡️ Only 1 operation needed
#### Output: 1

### Example 2

#### Input: 00000
No ‘1’ in the string → already all zeros
#### Output: 0

### Example 3

#### Input: 111
One group → 111
Since they are adjacent, they cannot be flipped together
111 → 010 → 000 → 2 operations
#### Output: 2

---

## 💻 How to Run the Code 
### Java ☕
```
javac day94.java
java day94
