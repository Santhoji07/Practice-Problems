# Function to perform traffic signal synchronization operations
# n: number of traffic signals
# D: minimum distance between selected signals
# initial_flow: list of initial traffic flow values
# operations: list of operations to perform
#

def trafficSignalSynchronization(n, D, initial_flow, operations):
    total_score = 0

    # Process each operation
    for op in operations:

        # -------- TYPE 1: UPDATE --------
        if op[0] == 1:
            _, pos, val = op
            initial_flow[pos - 1] = val   # 1-based to 0-based

        # -------- TYPE 2: QUERY --------
        else:
            _, L, R, K, sync_threshold = op

            candidates = []

            # Step 1: Build effective flow list
            for i in range(L - 1, R):
                flow = initial_flow[i]
                if flow >= sync_threshold:
                    flow = flow * 5
                candidates.append((flow, i))

            # Step 2: Sort by effective flow (descending)
            candidates.sort(reverse=True)

            used = [False] * n
            picked = 0
            score = 0

            # Step 3: Greedily pick signals
            for flow, idx in candidates:
                if picked == K:
                    break

                # Check distance constraint
                valid = True
                for j in range(max(0, idx - D + 1), min(n, idx + D)):
                    if used[j]:
                        valid = False
                        break

                if valid:
                    used[idx] = True
                    score += flow
                    picked += 1

            total_score += score

    return total_score
