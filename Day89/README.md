# 🌟 Day 89 – Simple String Editor

## 📝 Problem Statement  
You need to implement a **simple text editor** that maintains the content of a string **S** and supports two operations:

1. **`+ i x`** → Insert the string `x` into the current string `S` **after the i-th character** (1-indexed).  
   - If `i = 0`, insert `x` at the **beginning** of the string.

2. **`? i len`** → Print the **substring** of length `len`, starting from the **i-th character** (1-indexed).

Initially, the string `S` is **empty**.  
You are given **Q queries**, and for each query of type `?`, you must print the resulting substring.

---

## 📥 Input Format  
- The first line contains an integer **Q** – the number of queries.  
- The next **Q** lines each contain a query in one of the following forms:
  - `+ i x`
  - `? i len`

---

## 📤 Output Format  
For each query of type **`?`**, print the resulting substring on a new line.

---

## 🧩 Sample Input  

### 5
#### 0 ab
#### 1 c
#### ? 1 3
#### 2 dd
#### ? 1 5


---

## ✅ Sample Output  
#### acb
#### acddb


---

## 🧠 Explanation  
1️⃣ `+ 0 ab` → Insert `"ab"` at the beginning → **S = "ab"**  
2️⃣ `+ 1 c` → Insert `"c"` after 1st character → **S = "acb"**  
3️⃣ `? 1 3` → Print substring from position 1, length 3 → **"acb"**  
4️⃣ `+ 2 dd` → Insert `"dd"` after 2nd character → **S = "acddb"**  
5️⃣ `? 1 5` → Print substring from position 1, length 5 → **"acddb"**

---


## ⚙️ How to Run Code
## Java ☕
```
javac day89.java
java day89
