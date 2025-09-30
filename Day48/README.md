# 🌟 Day 48 – Remove Vowels from a String

## 🎯 Problem Statement  
Write a Java program to **remove all vowels (a, e, i, o, u)** from a given string.  
- The program should remove both **uppercase and lowercase vowels**.  
- It should preserve all other characters (consonants, digits, symbols, spaces, etc).

---

## 📖 Explanation  

- The program uses the `Scanner` class to take input from the user.
- It loops through each character of the input string using a `for` loop.
- A check is performed to see if the current character is a vowel:
  - If it's a vowel (either lowercase or uppercase), it is skipped using `continue`.
  - Otherwise, the character is appended to the `StringBuilder`.
- Finally, the resulting string (with vowels removed) is printed.

---

## 📝 Sample Input & Output  

### Input:  Enter a string: Beautiful Day


### Output:  Toggled string: Btfl Dy

---



---

## 💻 How to Run Code  

### ✅ Java Instructions  

```bash
javac day48.java
java day48

