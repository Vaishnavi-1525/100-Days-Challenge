# 🌟 Day 49 – Palindrome String Check  

## 🎯 Problem Statement  
Write a Java program to **check whether a given string is a Palindrome or not**.  
- A **Palindrome string** reads the same backward as forward.  
- The program should consider the exact input (case-sensitive check).  

---

## 📖 Explanation  

- The program uses the `Scanner` class to take input from the user.  
- It stores a copy of the original string.  
- It then **reverses the string** using a loop and `StringBuilder`.  
- Finally, it compares the reversed string with the original:  
  - If both are equal → the string is a **Palindrome**.  
  - Otherwise → it is **Not a Palindrome**.  

---

## 📝 Sample Input & Output  

### Input:  Enter a string: madam

### Output:  Palindrome string

---

### Input:  Enter a string: hello

### Output:  Not Palindrome string

---

---

## 💻 How to Run Code  

### ✅ Java Instructions  
```bash
javac day49.java
java day49
