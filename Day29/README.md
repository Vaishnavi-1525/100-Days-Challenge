# 🌟 Day 29 – Hollow Square Star Pattern

## 🎯 Problem Statement  
Write a program to **print a hollow square star pattern using nested loops**.

---

## 📖 Explanation  
The program prints a square of stars, but only the border (first row, last row, first column, last column) contains stars (*).
- The outer loop controls the number of rows.
- The inner loop controls the number of columns.
- Condition used:
- Print * if we are at the border (i==1 || i==5 || j==1 || j==5).
- Else, print spaces " " to keep the hollow effect.

  
---

## 📝 Sample Input & Output  


### Input :  5  

### Output :  

###  *  *  *  *  * 

###  *           * 

###  *           * 

###  *           * 

###  *  *  *  *  * 


--- 


## 💻 How to Run Code
### Java ☕
```
javac day29.java
java day29


