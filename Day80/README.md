# 🌟 Day 80 – Balancing Weight

## 📝 Problem Statement

During the lockdown, Manish’s weight increased from w1 kg to w2 kg in M months.

It is scientifically known that a growing kid’s weight increases between x1 and x2 kilograms per month (inclusive), but not necessarily the same every month.

You need to check if the weight reported by his home scale (w2) could be possible or not.

---

## 📖 Explanation

Before lockdown weight → w1

After lockdown weight → w2

Number of months → M

Weight gain range per month → [x1, x2]

So, total possible weight gain range after M months is:

Minimum possible gain = M × x1  
Maximum possible gain = M × x2


Now check:

If (w2 - w1) lies between [M×x1, M×x2] → print 1  
Else → print 0

---

## 📝 Sample Input & Output

### ✅ Input: 5
#### 1 2 1 2 2
#### 2 4 1 2 2
#### 4 8 1 2 2
#### 5 8 1 2 2
#### 1 100 1 2 2

### ✅ Output:
#### 0
#### 1
#### 1
#### 1
#### 0

---

## 💻 How to Run Code
### ☕ Java Code
```
javac day80.java
java day80

