# 🌟 Day 76 – Body Mass Index

## 📝 Problem Statement

You are given the height (H in metres) and mass (M in kilograms) of a person named Anusree.
The Body Mass Index (BMI) is calculated using the formula:

𝐵𝑀𝐼 = 𝑀𝐻2BI=H2M

Determine which category Anusree falls into based on her BMI:

Category	Condition	Output
1	Underweight if BMI ≤ 18	1
2	Normal weight if 19 ≤ BMI ≤ 24	2
3	Overweight if 25 ≤ BMI ≤ 29	3
4	Obesity if BMI ≥ 30	4

---

## 📖 Explanation

Take the number of test cases T as input.
For each test case, take two integers:
M → mass (in kg)
H → height (in meters)
Compute BMI using the formula M / (H * H).
Print the category number (1, 2, 3, or 4).

---

## 📝 Sample Input & Output

### ✅ Input: 3
#### 72 2
#### 80 2
#### 120 2

### ✅ Output:
#### 1
#### 2
#### 4

---

## 💻 How to Run Code
### Java ☕
```
javac day76.java
java day76
