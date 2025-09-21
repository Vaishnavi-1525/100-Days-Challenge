# 🌟 Day 32 – Square Border with Diagonal Pattern


## 🎯 Problem Statement  

**Write a program to print a 10×10 square pattern where:
- All borders (top, bottom, left, right) are.
- The main diagonal (top-left to bottom-right) is also **.

  
---

## 📖 Explanation  
The program uses nested loops:
- Outer loop (i) → Controls the rows (1 to 10).
- Inner loop (j) → Controls the columns (1 to 10).
- Conditions:
- Print * if it is on the border (first row, last row, first column, last column).
- Print * if it is on the main diagonal (i == j).
- Else print spaces " ".

---

## 📝 Sample Input & Output  

### Input :  10

### Output :  

### * * * * * * * * * * 
### * *               *
### *   *             *
### *     *           *
### *       *         * 
### *         *       * 
### *           *     * 
### *             *   * 
### *               * * 
### * * * * * * * * * * 


--- 

## 💻 How to Run Code
### Java ☕
```
javac day32.java
java day32

