# 🌟 Day 83 – Palindromic Substrings

## 📝 Problem Statement

Anoop loves palindromes. He has two strings A and B, each consisting of lowercase English letters.

He wants to know whether it is possible to select non-empty substrings s1 from A and s2 from B such that their concatenation (s1 + s2) forms a palindrome.

If such substrings exist, print "Yes", otherwise print "No".

---

## 📖 Explanation

You need to find if there exists any character that is common in both strings A and B.

If there is at least one same character, then s1 = that character from A and s2 = that same character from B will make a palindrome (e.g., "a" + "a" = "aa").

So the check is simple:
→ If A and B share any common character → print Yes
→ Else → print No

---

## 📝 Sample Input & Output
### Input: 3
#### abc
#### abc
#### a
#### b
#### abba
#### baab

### Output:
#### Yes
#### No
#### Yes

---

## ⚙️ How to Run Code
### ☕ Java 
```
javac Day83.java
java Day83
