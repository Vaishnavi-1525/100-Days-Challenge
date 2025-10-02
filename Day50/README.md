# 🌟 Day 50 – Remove Brackets from an Algebraic Expression  

## 🎯 Problem Statement  
Write a Java program to **remove all brackets** (`(`, `)`, `{`, `}`, `[`, `]`) from a given algebraic expression.  
- The program should preserve all other characters such as variables, operators, digits, etc.  
- Only brackets are removed.  

---

## 📖 Explanation  

- The program takes input from the user using `Scanner`.  
- It loops through each character of the expression.  
- If the character is a **bracket**, it is skipped.  
- Otherwise, it is appended to the result string.  
- The final expression (without brackets) is displayed.  

---

## 📝 Sample Input & Output  

### Input: Enter expression: (a+b) - {c/d} + [e*f]


### Output: Expression without brackets: a+b - c/d + e*f


---


## 💻 How to Run Code  

### ✅ Java Instructions  
```bash
javac day50.java
java day50
