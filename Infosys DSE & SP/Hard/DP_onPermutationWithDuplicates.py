'''🧠 1️⃣ PROBLEM STATEMENT (SIMPLE ENGLISH)

You are given:

An integer N → number of values

An integer K → number of moments where power increases

An array A of length N

You must:

👉 Count the number of distinct permutations of A such that
👉 the sequence has exactly K increases

Return the answer modulo 998244353.

🔍 2️⃣ WHAT DOES “POWER INCREASES” MEAN?

A power increase happens at position i if:

arr[i] < arr[i+1]


This is also called an ascent.

Example
Permutation: [1, 3, 2, 4]

Comparisons:
1 < 3  ✅ increase
3 < 2  ❌
2 < 4  ✅ increase

Total increases = 2

🧩 3️⃣ WHAT IS A “VALID ARRANGEMENT”?

A permutation of A is valid if:

number of positions i where arr[i] < arr[i+1] == K

🧪 4️⃣ SAMPLE FROM IMAGE (VERY IMPORTANT)
Input
N = 2
K = 1
A = [2, 2]

Possible permutations
[2, 2]


Check:

2 < 2 → false


Increases = 0 ❌

✅ Output = 0

That matches the sample.

🧠 5️⃣ CORE IDEA (HOW TO THINK)

This is a known DP on permutations with duplicates problem.

Key facts:

Values can repeat → permutations of a multiset

We count permutations with exactly K ascents

N ≤ 5000 → need O(N·K) DP

🔑 Strategy (INTUITION)

Sort the array A

Group equal values

Insert numbers group by group

Track:

dp[j] = number of ways to form sequence with j increases


Carefully update DP when inserting equal elements

This is a standard advanced DP pattern.'''

def countValidArrangements(N, K, A):
    MOD = 998244353

    # Step 1: sort array
    A.sort()

    # Step 2: count frequency of each distinct value
    freq = []
    cnt = 1
    for i in range(1, N):
        if A[i] == A[i - 1]:
            cnt += 1
        else:
            freq.append(cnt)
            cnt = 1
    freq.append(cnt)

    # dp[j] = ways with j increases
    dp = [0] * (K + 1)
    dp[0] = 1

    used = 0  # how many elements placed so far

    # Step 3: process each group
    for c in freq:
        new_dp = [0] * (K + 1)

        for prev_inc in range(K + 1):
            if dp[prev_inc] == 0:
                continue

            # number of ways to interleave c equal elements
            for add_inc in range(c):
                if prev_inc + add_inc > K:
                    break

                ways = dp[prev_inc]
                ways *= comb(c - 1, add_inc)
                ways *= comb(used + 1, add_inc + 1)
                ways %= MOD

                new_dp[prev_inc + add_inc] = (
                    new_dp[prev_inc + add_inc] + ways
                ) % MOD

        dp = new_dp
        used += c

    return dp[K]


'''
Brute Force Approach

✅ BRUTE FORCE IDEA (VERY SIMPLE)
Step-by-step logic

Generate all distinct permutations of array A

For each permutation:

Count how many times perm[i] < perm[i+1]

If that count == K → it is valid

Count all such permutations

That’s it.
No DP. No math. Just try everything.


from itertools import permutations

def bruteCountArrangements(A, K):
    count = 0

    # Generate all unique permutations
    for perm in set(permutations(A)):
        inc = 0

        # Count increases
        for i in range(len(perm) - 1):
            if perm[i] < perm[i + 1]:
                inc += 1

        if inc == K:
            count += 1

    return count
'''