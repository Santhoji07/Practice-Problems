'''You are given:

A tree with N nodes

The tree is rooted at node 1

Each node i has a value A[i]

Two players play a game: Alice and Bob

🎮 GAME RULES
Step 1 — Alice’s move

Alice chooses ONE node i

She sets its value to 0

A[i] = 0

Step 2 — Bob’s move

Bob starts at the root (node 1)

Bob repeatedly:

Moves to one of the children of the current node

OR decides to stop

The game ends when:

Bob stops, OR

Bob reaches a leaf node

Step 3 — Score

The score of the game is:

value of A[node where Bob stops]

🎯 GOAL OF PLAYERS

Alice wants to MINIMIZE the score

Bob wants to MAXIMIZE the score

Both play optimally

👉 You must return the final score when both play optimally.'''


def optimalGameScore(n, A, edges):
    from collections import defaultdict

    # Build tree
    tree = defaultdict(list)
    for u, v in edges:
        tree[u].append(v)

    # Store all values Bob can reach
    reachable_values = []

    def dfs(node):
        # Bob can stop here
        reachable_values.append(A[node - 1])

        # Or go deeper
        for child in tree[node]:
            dfs(child)

    # Bob starts from root (1)
    dfs(1)

    # Sort reachable values descending
    reachable_values.sort(reverse=True)

    # Alice removes the maximum, Bob takes the next best
    if len(reachable_values) == 1:
        return 0  # Alice removes the only node

    return reachable_values[1]
