# Day 38 - Number Pyramid Pattern

## 📌 Problem Statement
Write a Java program to print a **pyramid pattern of numbers** where each row contains numbers in **increasing order** (1, 2, 3, …) up to `2*i - 1`.

---

## 📝 Program Explanation
- The program uses **nested loops**:
  - **Outer loop (`i`)** → Controls the number of rows.
  - **First inner loop (`k`)** → Prints spaces before numbers to align the pyramid.
  - **Second inner loop (`j`)** → Prints numbers from `1` to `2*i - 1` for each row.
- Each new row prints more numbers, forming a pyramid structure.

---


## 📝 Sample Input & Output  

### Input:  5

###         1   

###       1 2 3   

###     1 2 3 4 5   

###   1 2 3 4 5 6 7   

### 1 2 3 4 5 6 7 8 9   


## 💻 How to Run Code 
### Java ☕
javac day38.java
java day38
