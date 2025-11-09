# 🌟 Day 88 – Boasting Students

## 📝 Problem Statement  
There are **N students** in a class, where the *i-th student* has a score of **A[i]**.  
The *i-th student* will **boast** if and only if the number of students scoring **less than or equal** to A[i]  
is **greater** than the number of students scoring **greater** than A[i].

You need to find how many students will boast.

---

## 📖 Explanation
### 📥 Input Format  
- The first line contains an integer **T** – the number of test cases.  
- For each test case:  
  - The first line contains **N** – the number of students.  
  - The second line contains **N integers** – the scores of the students.

---

### 📤 Output Format  
For each test case, print a single integer — the **number of students who will boast**.

---

## 📝 Sample Input & Output

### Input:
#### 3
#### 3
#### 100 100 100
#### 3
#### 2 1 3
#### 4
#### 30 1 30 30


---


### Output  
#### 3
#### 2
#### 3


---

## 🧠 Explanation  

- In the **first case**, all have the same score, so each student has equal or fewer others → all boast.  
- In the **second case**, scores `2` and `3` have more students below or equal than above → 2 boast.  
- In the **third case**, scores `30, 1, 30, 30` → 3 students boast.

---


## 💻 How to Run Code 
### Java ☕
```
javac day88.java
java day88
