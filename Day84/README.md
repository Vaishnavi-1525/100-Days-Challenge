# 🌟 Day 84 – Bricks Breaking

## 📝 Problem Statement

Arunima is practicing karate and has three bricks stacked vertically.
The widths of the bricks (from top to bottom) are W1, W2, W3, and Arunima’s strength is S.

Whenever Arunima hits the stack:

She can break the topmost k bricks such that the sum of their widths ≤ S.

She can also reverse the stack before hitting (no cost).

Your task is to determine the minimum number of hits required to break all bricks, assuming she reverses optimally.

---

## 📖 Explanation

We need to find the minimum number of hits required.
Possible scenarios:

All 3 bricks together

If W1 + W2 + W3 ≤ S, → 1 hit.

Two bricks together + one separate

If W1 + W2 ≤ S or W2 + W3 ≤ S, → 2 hits.

Each brick separately

Otherwise, → 3 hits.

---

## 📝 Sample Input & Output

### Input: 3
#### 3 1 2 2
#### 2 1 1 1
#### 3 2 2 1

### Output:
#### 2
#### 2
#### 2

---

## ⚙️ How to Run Code
### ☕ Java 
```
javac Day84.java
java Day84
