# 🌟 Day 95 – Alice & Bob Same Multiset

## 📝 Problem Statement

Alice and Bob visit a pet store with N animals.
Each animal has a type represented by an integer.

Alice buys some animals.

Bob buys all remaining animals.

We need to check whether it is possible that both end up with exactly the same multiset of animals.

A multiset means:
Only the count of each type matters, not the order.

---

## 🎯 Key Insight

For Alice and Bob to have identical multisets:

👉 Each animal type must appear an even number of times.

Because:

Only then can the type be split equally between Alice and Bob.

If any type appears an odd number of times, equal distribution is impossible.

---

## 📝 Sample
### 📥 Input
4
3
4 4 4
4
2 3 3 2
4
1 2 2 3
6
5 5 1 5 1 5

### 📤 Output
NO
YES
NO
YES

---

## 💡 Explanation
Animal Types	Frequency	Can Split?	Output
4 4 4	{4: 3} → odd	❌ No	NO
2 3 3 2	{2:2, 3:2} → all even	✔️ Yes	YES
1 2 2 3	{1:1, 2:2, 3:1} → odd exist	❌ No	NO
5 5 1 5 1 5	{5:4, 1:2} → all even	✔️ Yes	YES

---

## 💻 How to Run the Code 
### Java ☕
```
javac day95.java
java day95
