# 🌟 Day 97 – Binary String Different from All Given Strings

## 📝 Problem Statement
You are given N binary strings, each of length N.
Your task is to generate a binary string of length N that is different from
every given string.

A string is considered different if:
- It has a different length, OR
- It differs in at least one character position.

---

## 💡 Key Idea (Diagonalization Trick)
Construct a new string by flipping the i-th character of the i-th input string.

Example:
Input strings:
101
110
100

Take the diagonal characters: 1,1,0  
Flip each → 0,0,1  
Output → **001**

This guarantees the final string differs from string i at position i.

---

## 📥 Input Format
- T test cases
- For each test case:
  - Integer N
  - N binary strings, each of length N

## 📤 Output Format
- For each test case, print any binary string of length N that differs from all given strings.

---

## 🧪 Sample Input
2
3
101
110
100
4
1100
1010
0100
0010

## 🧾 Sample Output
111
1101


---

## 💻 How to Run Code
## Java ☕ 
```
javac day97.java
java day97
