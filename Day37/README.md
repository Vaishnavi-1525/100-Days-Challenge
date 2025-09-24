# 🌟 Day 30 – Number Triangle Pattern  

## 🎯 Problem Statement  
Write a program to **print a pyramid pattern of numbers where each row contains the row number repeated in pyramid shape**. 

---

## 📖 Explanation  
- The program uses nested loops:
- Outer loop (i) → Controls the rows (1 to 5).
- First inner loop (k) → Prints spaces before numbers to align the pyramid shape.
- Second inner loop (j) → Prints the row number (i) repeated in pyramid form.
- The formula 2 * i - 1 ensures odd counts of numbers in each row (1, 3, 5, …).

---


## 📝 Sample Input & Output  

### Input:  5

###         1   

###       2 2 2   

###     3 3 3 3 3   

###   4 4 4 4 4 4 4   

### 5 5 5 5 5 5 5 5 5   

---

## 💻 How to Run Code 
### Java ☕
```
javac day37.java
java day37
