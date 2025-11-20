# 🌟 Day 98 – Sort the Binary String Using Substring Reversal

## 📝 Problem Statement

You are given a binary string S of length N.

In one operation, you can:

Select any substring of S

Reverse that substring

### Example:
S = 11000, reversing substring [2,4] gives:

11000 → 10010

Your task is to find the minimum number of operations required to sort the string in non-decreasing order (i.e., all 0s first, then 1s).

It is guaranteed that the string can always be sorted using a finite number of operations.

## 📖 Explanation

Sorting a binary string means converting it into:

000...0111...1


Let:

A "01" pattern is fine

A "10" pattern means it is unsorted

Important Insight

The minimum number of operations required is:

👉 Count the number of groups of 1s that come after a 0

Or simply:

✔ Answer = Number of times the string changes from 1 → 0

Because each such boundary requires one reversal operation.

---

## 📝 Sample Input & Output

#### Input: 000

#### Output:0

#### Input: 1001

#### Output: 1

#### Input: 1010

#### Output: 2

#### Input: 010101

#### Output: 2

---


## 💻 How to Run Code
#### Java ☕
```
javac day98.java
java day98
