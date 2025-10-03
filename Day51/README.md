# 🌟 Day 51 – Count the Sum of Numbers in a String  

## 🎯 Problem Statement  
Write a Java program to **count the sum of all numbers in a string**.  
- The numbers may contain multiple digits.  
- All non-numeric characters are ignored.  
- Example: `"abc123def45"` → **168** (123 + 45).  

---

## 📖 Explanation  

- The program scans each character of the string.  
- If it is a **digit**, it is added to a temporary number.  
- When a **non-digit** is found, the temporary number is added to the total sum.  
- At the end, the total sum of all numbers is displayed.  

---

## 📝 Sample Input & Output  

### Input:  abc123def45ghi7

### Output:  Sum of numbers in string: 175


### Input:  1a2b3c

### Output:  Sum of numbers in string: 6

---

## 💻 How to Run Code  

### ✅ Java Instructions  
```bash
javac day51.java
java day51
