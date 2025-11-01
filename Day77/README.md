# 🌟 Day 77 – Good Weather

## 📝 Problem Statement

In Magicland, the weather report is considered Good if the number of sunny days in a week is strictly greater than the number of rainy days.
You are given 7 integers —
A1, A2, A3, A4, A5, A6, A7
Ai = 1 → Sunny day ☀️
Ai = 0 → Rainy day 🌧️
Determine whether the weather is Good or Not.

---

## 📖 Explanation
- Each test case represents one week (7 days).
- Count the number of 1s (sunny days).
- If sunny days > rainy days → print "YES", else print "NO".

---

## 📝 Sample Input & Output

### ✅ Input: 4
#### 1 0 1 0 1 1 1
#### 0 1 0 0 0 0 1
#### 1 1 1 1 1 1 1
#### 0 0 0 1 0 0 0

### ✅ Output:
#### YES
#### NO
#### YES
#### NO

---

## 💻 How to Run Code
#### ☕ Java Code
```
javac day77.java
java day77

