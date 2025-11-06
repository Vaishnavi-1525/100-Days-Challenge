# 🌟 Day 87 – Rotate Array by One Position (Clockwise)

## 📝 Problem Statement

Given an array of integers, the task is to rotate the array by one position in a clockwise direction.

That means, the last element of the array moves to the first position, and all other elements shift one step forward.

## 📖 Example

### Example 1:

#### Input:
#### N = 5  
#### A[] = {1, 2, 3, 4, 5}


#### Output: 5 1 2 3 4

#### Example 2:

#### Input:

#### N = 8  
#### A[] = {9, 8, 7, 6, 4, 2, 1, 3}


#### Output: 3 9 8 7 6 4 2 1

---

## 💡 Explanation

When we rotate the array clockwise by one:

The last element (A[n-1]) becomes the first element.

The rest of the elements move one position ahead.


Example:

Before: [1, 2, 3, 4, 5]
After:  [5, 1, 2, 3, 4]

---

## 💻  How to Run Code
### Java ☕
```
javac Day87.java
java Day87
