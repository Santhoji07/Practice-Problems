# Function to count the number of lucky paths in a tree


def luckyPath(n, edges, values, k):  #n: number of nodes

    import sys                      #To handle deep recursion
    sys.recursionlimit(10**7)

    tree=[[] for _ in range(n)]     # Build adjacency list representation of the tree   
    for u,v in edges:               # edges is a list of tuples
        tree[u].append(v)
        tree[v].append(u)

    count=0                         # To store the count of valid paths
    remainderCountMap={}            # To store frequency of remainders

    def dfs(node,parent,current_sum):   # Depth First Search to explore paths
        nonlocal count                  # Use nonlocal to modify count variable from outer scope

        current_sum+=values[node]        # Update current sum with node value (At node 0: current_sum = 0 + 1 = 1)

        rem=current_sum % k          # Calculate remainder when current sum is divided by k 

        count+=remainderCountMap.get(rem,0)         # Increment count by the number of previously seen paths with the same remainder

        if rem ==0:                 # If current remainder is 0, it means the path from root to this node is valid
            count+=1
        
        remainderCountMap[rem]=remainderCountMap.get(rem,0)+1       # Update the frequency map for the current remainder

        for child in tree[node]:                # Explore all children of the current node
            if child!=parent:             # Avoid going back to the parent node 
                dfs(child, node, current_sum)       # Recursive DFS call for child node

        remainderCountMap[rem]-=1      # Backtrack: Decrement the count of the current remainder before returning to parent node

        dfs(0,-1,0)        # Start DFS from root node (0) with no parent (-1) and initial sum 0

    return count