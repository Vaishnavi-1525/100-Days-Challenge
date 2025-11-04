# 🌟 Day 82 – New Tablet

## 📝 Problem Statement

Ajinkya wants to buy a new tablet. His budget is B, and he cannot buy any tablet whose price exceeds B.
Among all tablets within his budget, he wants the one with the largest screen area.

Each tablet is defined by its:

Width (W)

Height (H)

Price (P)

You need to help Ajinkya find the maximum screen area he can get within his budget or determine that he cannot buy any tablet.

---

## 📖 Explanation

For each tablet:

Compute its area → area = W × H

If its price P ≤ B, it is affordable.

Track the maximum area among all affordable tablets.

If no tablet is affordable, print "no tablet".

---

## 📝 Sample Input & Output

### Input: 3
#### 3 6
#### 3 4 4
#### 5 5 7
#### 5 2 5
#### 2 6
#### 3 6 8
#### 5 4 9
#### 1 10
#### 5 5 10

### Output: 12
#### no tablet
#### 25
---

## ⚙️ How to Run Code
## ☕Java 
```
javac Day82.java
java Day82
