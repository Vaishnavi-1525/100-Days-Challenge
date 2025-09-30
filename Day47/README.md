# 🌟 Day 47 – Toggle Case of Each Character in a String

## 🎯 Problem Statement  
Write a Java program to **toggle the case** of each character in a string.  
- Uppercase letters become lowercase.  
- Lowercase letters become uppercase.  

---

## 📖 Explanation  

- The program takes a string input from the user using the `Scanner` class.  
- It uses a `StringBuilder` to construct the toggled version of the string.  
- A `for` loop iterates through each character:
  - If the character is uppercase (`Character.isUpperCase(ch)`), it's converted to lowercase using `Character.toLowerCase(ch)`.
  - If the character is lowercase, it's converted to uppercase using `Character.toUpperCase(ch)`.
- Each toggled character is appended to the result.
- Finally, the toggled string is printed.

---

## 📝 Sample Input & Output  

### Input: Enter a string: HelloWorld123
### Output: Toggled string: hELLOwORLD123


---



---

## 💻 How to Run Code  

### ✅ Java Instructions  

```bash
javac day47.java
java day47
