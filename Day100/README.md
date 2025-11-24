# 🌟 Day 100 – Maximum Valid Delete Steps

## 📝 Problem Statement
You are given **N integers**.  
In each step, you can choose **K remaining numbers** and delete them **only if**:

After sorting the selected numbers as:  
`a1, a2, a3, ... , aK`

They satisfy:

👉 `ai+1 ≥ ai × C`  for all `i ≤ K - 1`

Your task is to determine the **maximum number of such valid steps** possible.

---

## 📖 Explanation

- Sort the array first.
- Try forming groups of size **K**.
- If a group follows the rule `ai+1 ≥ ai * C`, count it as a **valid delete step**.
- Continue until no more valid groups can be formed.

---

## 📝 Sample Input & Output

### Input:
2
6 3 2
4 1 2 2 3 1
6 3 2
1 2 2 1 4 4


### Output:
1
2


---

## 💡 Example Breakdown

### For test case `6 3 2 | 4 1 2 2 3 1`
Sorted → `[1, 1, 2, 2, 3, 4]`

Pick `1, 2, 4` → (valid because `2 ≥ 1×2` and `4 ≥ 2×2`) → ✔ 1 step

No more valid groups → Result: **1**

---

## 💻 How to Run Code

### Java ☕
```
javac day100.java
java day100
