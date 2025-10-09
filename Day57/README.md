# 🌟 Day 57 – String Match with Wildcards
## 🎯 Problem Statement

Write a Java program to check if two strings match, where one string may contain wildcard characters:
- ? → Matches any single character.
- * → Matches zero or more characters.

---

## 📖 Explanation
- Take two strings as input:
- Text – the original string
- Pattern – may contain ? or *
- Traverse both strings:
- ? matches any single character.
- * can match a sequence of characters.
- Return true if the entire text matches the pattern, otherwise false.

---

## 📝 Sample Input & Output

### Input :Enter text: hello
### Enter pattern: he*o

### Output : Strings Match

### Input : Enter text: code
### Enter pattern: c?d

### Output :Strings Do Not Match

---

## 💻 How to Run Code
### Java ☕
```
javac day57.java
java day57
