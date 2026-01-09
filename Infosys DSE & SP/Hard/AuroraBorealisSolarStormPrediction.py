'''🧠 1️⃣ PROBLEM STATEMENT — SIMPLE ENGLISH

You are given:

N magnetometer readings (numbers) → intensities[]

These readings are in order (latitudes)

You must divide them into exactly A contiguous zones

Each zone is a continuous subarray.

💰 TOTAL COST = SUM OF MANY COSTS

For every zone, and between zones, you pay costs.

🔹 COST 1: Zone Variance Cost

For a zone containing values:

[intensities[l], ..., intensities[r]]


Find the median

Compute MAD (Median Absolute Deviation)

MAD = median(|x − median|)


Cost:

MAD × exp(length / 10) × V


👉 Bigger zones → higher uncertainty → higher cost

🔹 COST 2: Observation Network Cost

For the k-th zone (1-indexed):

Bell(k) × N_COST


Bell numbers grow like:

Bell(1)=1, Bell(2)=2, Bell(3)=5, Bell(4)=15...


This penalizes using many zones.

🔹 COST 3: Latitude Coverage Bonus

If a zone length is exactly L:

− L_BONUS   (negative cost = bonus)

🔹 COST 4: Discontinuity Penalty

Between consecutive zones:

If

| median(zone_i) − median(zone_{i+1}) | > D_THRESH


Then add:

+ D_PEN

🎯 GOAL

Partition readings into exactly A zones
such that total cost is minimized.'''


def minAuroraPredictionCost(
    N, intensities, A, V, N_COST, L, L_BONUS, D_THRESH, D_PEN
):
    import math
    INF = 10**18

    # Precompute median & zone cost
    zone_cost = [[0]*N for _ in range(N)]
    zone_median = [[0]*N for _ in range(N)]

    for l in range(N):
        arr = []
        for r in range(l, N):
            arr.append(intensities[r])
            arr_sorted = sorted(arr)
            m = arr_sorted[len(arr)//2]
            zone_median[l][r] = m

            mad = sorted(abs(x - m) for x in arr_sorted)[len(arr)//2]
            cost = mad * math.exp((r-l+1)/10) * V

            if (r - l + 1) == L:
                cost -= L_BONUS

            zone_cost[l][r] = cost

    # Bell numbers (small A only)
    Bell = [1]*(A+1)
    for i in range(1, A+1):
        Bell[i] = Bell[i-1]*i + 1

    dp = [[INF]*(A+1) for _ in range(N+1)]
    dp[0][0] = 0

    for i in range(1, N+1):
        for k in range(1, A+1):
            for j in range(i):
                val = dp[j][k-1] + zone_cost[j][i-1] + Bell[k]*N_COST
                dp[i][k] = min(dp[i][k], val)

    return int(dp[N][A])
