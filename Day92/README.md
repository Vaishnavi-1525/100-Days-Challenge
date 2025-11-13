# 🌟 Day 92 – Maximum Value of Ordered Triplet
📝 Problem Statement

You are given an array A of N elements. For any ordered triplet (i, j, k) such that i, j, and k are pairwise distinct and 1 ≤ i, j, k ≤ N, the value of this triplet is
(𝐴𝑖−𝐴𝑗)∗𝐴𝑘(Ai−Aj)∗Ak
	​


You need to find the maximum value among all possible ordered triplets.

---

## 📖 Explanation

To maximize the expression (Aᵢ − Aⱼ) × Aₖ,

Choose Aᵢ = maximum element in the array.

Choose Aⱼ = minimum element in the array.

Choose Aₖ = maximum element in the array.

Hence, the formula simplifies to:
(𝑚𝑎𝑥(𝐴)−𝑚𝑖𝑛(𝐴))∗𝑚𝑎𝑥(𝐴)(max(A)−min(A))∗max(A)

If all elements are equal, the result will be 0.

🧠
---

## 📝 Sample Input & Output
### Input: 3
3
1 1 3
5
3 4 4 1 2
5
23 17 21 18 19

### Output:
2
12
126


## ▶️ How to Run Code
### Java ☕
```
javac day92.java
java day92
