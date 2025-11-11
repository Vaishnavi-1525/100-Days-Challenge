# 🌟 Day 90 – Longest Repeated Boring Substring

## 📝 Problem Statement  
A string is called **boring** if all characters in the string are **the same**.  

You are given a string **S** of length **N**, consisting of lowercase English alphabets.  
Your task is to find the **length of the longest boring substring** of **S** that **occurs more than once**.

If there is **no boring substring** that occurs more than once, print **0**.

A **substring** is obtained by deleting some (possibly zero) elements from the beginning and end of the string.

---

## 📥 Input Format  
- The first line contains an integer **T** – the number of test cases.  
- Each test case contains:  
  - An integer **N** – the length of the string.  
  - A string **S** of length **N**.

---

## 📤 Output Format  
For each test case, print the **length** of the longest boring substring that appears more than once.

---

## 🧩 Sample Input  
4
3
aaa
3
abc
5
bcaca
6
caabaa


---

## ✅ Sample Output  
2
0
1
2


---

## 🧠 Explanation  
1️⃣ **S = "aaa"** → Substrings: "a", "aa", "aaa"  
   - "a" occurs 3 times, "aa" occurs 2 times → Longest = **2**

2️⃣ **S = "abc"** → No repeated boring substring → **0**

3️⃣ **S = "bcaca"** → "a" occurs 2 times → **1**

4️⃣ **S = "caabaa"** → "a" occurs multiple times → Longest = **2**

---


## ⚙️ How to Run Code
#### Java ☕
```
javac day90.java
java day90
