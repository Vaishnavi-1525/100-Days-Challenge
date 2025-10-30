# 🌟 Day 75 — Good Weather

## 💡 Problem Statement

In Magicland, the weather report is considered Good if the number of sunny days in a week is strictly greater than the number of rainy days.

You are given 7 integers: 𝐴1, 𝐴2, 𝐴3, 𝐴4, 𝐴5, 𝐴6, 𝐴7  A1, A2, A3, A4, A5, A6, A7

where:
Aᵢ = 1 → the i-th day is Sunny 🌞
Aᵢ = 0 → the i-th day is Rainy 🌧️
Your task is to determine if the weather report of Magicland is Good or Not.

---

## 🧮 Concept

- A week has 7 days.
- To be considered Good Weather, the number of sunny days must be more than rainy days.
- So, Count of 1’s (Sunny Days) > Count of 0’s (Rainy Days)
- Count of 1’s (Sunny Days)c> Count of 0’s (Rainy Days)
- If true → Print "YES", else "NO".

---

## 🧩 Sample Input & Output

### 🧠 Example 1

### Input: 4
#### 1 0 1 0 1 1 1
#### 0 1 0 0 0 0 1
#### 1 1 1 1 1 1 1
#### 0 0 0 1 0 0 0

### Process:

#### Test Case	Sunny (1’s)	Rainy (0’s)	Result
#### 1	5	2	YES ✅
#### 2	2	5	NO ❌
#### 3	7	0	YES ✅
#### 4	1	6	NO ❌

### ✅ Output:
#### YES
#### NO
#### YES
#### NO

---

## ▶️ How to Run the Code
### Java ☕
```
javac day75.java
java day75
