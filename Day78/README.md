# 🌟 Day 78 – Chess Format

## 📝 Problem Statement

In chess, a time control is given as a + b,
where

a → initial time (in minutes)

b → increment per move (in seconds).

Based on the value of a + b, determine which format of chess it belongs to:

Format	Condition	Output
Bullet	a + b < 3	1
Blitz	3 ≤ a + b ≤ 10	2
Rapid	11 ≤ a + b ≤ 60	3
Classical	a + b > 60	4

---

## 📖 Explanation

You will be given T test cases.

For each test case, you’ll receive two integers a and b.

Compute sum = a + b and check in which range it falls.

Print 1, 2, 3, or 4 depending on the category.

---

## 📝 Sample Input & Output
### ✅ Input:
#### 4
#### 1 0
#### 4 1
#### 100 0
#### 20 5

### ✅ Output:
#### 1
#### 2
#### 4
#### 3

---

## 💻 How to Run Code
#### ☕ Java Code
```
javac day78.java
java day78

