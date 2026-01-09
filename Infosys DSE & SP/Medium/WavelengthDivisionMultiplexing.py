'''PROBLEM: Wavelength Division Multiplexing (WDM)
1️⃣ WHAT IS GIVEN (SIMPLE)

You are given:

An array A of size N

Each A[i] is a positive integer (channel ID)

An integer MIN_LEN

An integer B

An integer X

2️⃣ WHAT IS A “VALID GROUP” (VERY IMPORTANT)

You must choose a contiguous subarray A[l … r] such that:

✅ Condition 1: Length
(r - l + 1) ≥ MIN_LEN

✅ Condition 2: Bitwise AND condition

Take bitwise AND of all elements in the subarray:

AND = A[l] & A[l+1] & ... & A[r]


Count how many set bits (1s) are in AND.

It must be exactly B.

✅ Condition 3: XOR of endpoints
A[l] XOR A[r] == X

🎯 GOAL

Among all valid subarrays:

Compute the sum of elements

Return the maximum sum

If no valid subarray exists → return -1'''

def maxWDMGroupSum(A, MIN_LEN, B, X):
    n = len(A)
    ans = -1

    for l in range(n):      # Starting index of subarray
        curr_and = A[l]     # Bitwise AND of current subarray
        curr_sum = 0        # Sum of current subarray

        for r in range(l, n):  # Ending index of subarray
            curr_and &= A[r]    # Update bitwise AND
            curr_sum += A[r]    # Update sum of subarray

            length = r - l + 1  # Length of current subarray
            if length < MIN_LEN:   #
                continue

            # Count set bits in AND
            if bin(curr_and).count('1') != B:
                continue

            # XOR of endpoints
            if (A[l] ^ A[r]) != X:
                continue

            ans = max(ans, curr_sum)

            # Optimization: AND becomes 0, no need to extend
            if curr_and == 0:
                break

    return ans

