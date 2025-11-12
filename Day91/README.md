# 🌟 Day 91 – Candy Eating Challenge

## 📝 Problem Statement  
You are a person who loves eating candies 🍭.  
Your friend gives you a candy of length **N**, but tells you to eat exactly **K** units of candy per bite.  

You will:
- Take bites of **K** units each time.  
- Stop only when the candy's length becomes **0** (completely eaten).  
- If at any time, the remaining candy is **less than K but greater than 0**, you cannot take another bite.

Your task is to determine:
- Whether you can eat the entire candy or not.  
- If yes, print the **number of bites**.  
- If not, print **-1**.

---

## 📥 Input Format  
- First line contains **T**, the number of test cases.  
- Each test case contains two integers **N** and **K** separated by a space.

---

## 📤 Output Format  
- For each test case, print:
  - The **minimum number of bites** required to finish the candy completely,  
  - or **-1** if it’s not possible.

---

## 🧩 Sample Input  
3
3 1
3 2
0 3



---

## ✅ Sample Output  
3
-1
0


---

## 🧠 Explanation  
1️⃣ For `N = 3, K = 1` → You can take 3 bites (1+1+1 = 3). ✅  
2️⃣ For `N = 3, K = 2` → You eat 2 first, 1 is left (less than K) ❌ → Output: -1.  
3️⃣ For `N = 0, K = 3` → Candy is already finished → 0 bites. ✅

---


## ⚙️ How to Run Code
## Java ☕
javac day91.java
java day91 
