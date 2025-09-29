# 🌟 Day 46 – Find Length of String without using `length()`  

## 🎯 Problem Statement  
Write a Java program to **find the length of a string without using the `length()` method**.  

---

## 📖 Explanation  

- The program takes a string as input from the user using the `Scanner` class.  
- It initializes a counter `count = 0`.  
- Using an **infinite while loop**, it tries to access each character of the string using `str.charAt(count)`.  
- Once the index goes beyond the string length, a **`StringIndexOutOfBoundsException`** is thrown.  
- The exception is caught, and the loop breaks.  
- Finally, the counter value is displayed as the **length of the string**.  

---

## 📝 Sample Input & Output  

### Input : Enter a string: HelloWorld


### Output : Length of the string is: 10  


--- 

## 💻 How to Run Code
### Java ☕
```
javac day46.java
java day46
