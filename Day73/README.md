# 🌟 Day 73 — Bucket Filling

## 💡 Problem Statement
- Nejiya has a bucket with a total capacity of K liters.
- It is already filled with X liters of water.
- You need to find the maximum amount of extra water (in liters) that can still be added without overflowing.

---

## 🧮 Concept

To find how much more water can be added:

#### Extra Water = 𝐾−𝑋
#### Extra Water=K−X

Because:
Total bucket capacity = K liters
Already filled = X liters
So remaining capacity = (K - X) liters

---

## 🧩 Sample Input & Output

### 🧠 Example 1

#### Input: 2
#### 5 4
#### 15 6


#### Process:
#### 1️⃣ For (K=5, X=4):
#### → Extra = 5 - 4 = 1

#### 2️⃣ For (K=15, X=6):
#### → Extra = 15 - 6 = 9

#### ✅ Output:
#### 1
#### 9

---

## ▶️ How to Run the Code
### Java ☕
```
javac Day73.java
java Day73
