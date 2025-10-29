# 🌟 Day 74 — Body Mass Index (BMI)

## 💡 Problem Statement

You are given the height (H) in meters and mass (M) in kilograms of Anusree.
The Body Mass Index (BMI) is calculated using the formula:

BMI = 𝑀𝐻2
BMI = H2M​

Based on the BMI value, report which category Anusree falls into:

Category	Condition	Description
1	BMI ≤ 18	Underweight
2	19 ≤ BMI ≤ 24	Normal weight
3	25 ≤ BMI ≤ 29	Overweight
4	BMI ≥ 30	Obesity

---

## 🧮 Concept

1️⃣ Compute BMI = M / (H × H)
2️⃣ Compare the BMI value with the given ranges to decide the category.
3️⃣ Output the category number (1, 2, 3, or 4).

---

## 🧩 Sample Input & Output

### 🧠 Example 1

#### Input: 3
#### 72 2
#### 80 2
#### 120 2


### Process:

#### M	H	BMI = M / H²	Category
#### 72	2	72 / 4 = 18	1 (Underweight)
#### 80	2	80 / 4 = 20	2 (Normal weight)
#### 120	2	120 / 4 = 30	4 (Obesity)

### ✅ Output:

#### 1
#### 2
#### 4

---

## ▶️ How to Run the Code
### Java ☕
```
javac Day74.java
java Day74
