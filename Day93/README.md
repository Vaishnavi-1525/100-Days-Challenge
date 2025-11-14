# 🌟 Day 93 – Sum of Weights of All Subarrays (Length ≥ 3)


## 📝 Problem Statement

You are given a sorted array A1, A2, …, AN (non-decreasing order).

For any array B of length ≥ 3, define its weight as:

weight(𝐵)=max⁡(𝐵𝑖−𝐵𝑗)⋅(𝐵𝑗−𝐵𝑘)
weight(B)=max(Bi−Bj)⋅(Bj−Bk)

for all valid triples (i, j, k)
where

i != j,

j != k,

k != i.

You must compute the sum of weights of all contiguous subarrays of A having length ≥ 3.

---

### 📌 Key Insight

Since the array is sorted, the maximum value of(𝐵𝑖−𝐵𝑗)⋅(𝐵𝑗−𝐵𝑘)(Bi−Bj)⋅(Bj−Bk)

in any subarray will always be achieved at:

i = first element

j = middle element

k = last element

Thus for a subarray [L…R], the weight becomes:

max⁡𝐿<𝑗<𝑅(𝐴[𝑗]−𝐴[𝐿])⋅(𝐴[𝑅]−𝐴[𝑗])L<j<Rmax(A[j]−A[L])⋅(A[R]−A[j])

---

## 📝 Input Format

First line: T — number of test cases

For each test case:

N — size of array

N space-separated integers (sorted array)

## 📝 Output Format

For each test case, print the sum of weights for all subarrays of size ≥ 3.

---

## 🧪 Sample Input
2

4

1 2 3 4

5

1 42 69 228 2021

## ✅ Sample Output
4

1041808

---

## 💻 How to Run the Code 
### Java ☕
```
javac day93.java
java day93
