# 🌟 Day 72 — Pass or Fail

##  Problem Statement
- Anusree is struggling to pass a certain college course.
- The test has a total of N questions.
- Each correct answer gives +3 marks
- Each incorrect answer gives −1 mark
- Anusree attempted all the questions.
- He got X questions correct and the rest incorrect.
- To pass, he must score at least P marks.
- You need to determine whether Anusree passes or fails the exam.

---

## 🧮 Concept

The total score can be calculated using the formula:

Total Marks = (3×𝑋)+(−1×(𝑁−𝑋))
Total Marks = (3×X)+(−1×(N−X))

Simplify it:

Total Marks = 4𝑋−𝑁
Total Marks=4X−N

If Total Marks ≥ P, then print PASS, else print FAIL.

---

## 🧩 Sample Input & Output

### 🧠 Example 1

#### Input: 3
#### 5 2 3
#### 5 2 4
#### 4 0 0

#### Process:
#### 1️⃣ Test case 1: N=5, X=2, P=3
#### → Total = (4×2) − 5 = 8 − 5 = 3
#### ✅ 3 ≥ 3 → PASS

#### 2️⃣ Test case 2: N=5, X=2, P=4
#### → Total = 8 − 5 = 3
#### ❌ 3 < 4 → FAIL

#### 3️⃣ Test case 3: N=4, X=0, P=0
#### → Total = 0 − 4 = -4
#### ❌ -4 < 0 → FAIL

#### ✅ Output:
#### PASS
#### FAIL
#### FAIL

---

## ▶️ How to Run the Code
### Java ☕
```
javac Day72.java
java Day72
