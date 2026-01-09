'''Dish has initial complexity C

Each chef has:

e = expertise

m = messiness

A chef can cook only if e ≥ current_complexity

After cooking:

current_complexity = max(current_complexity, m)


Choose the best order to maximize number of chefs who cook'''

def maxChefs(n,C,A):

    A.sort(key=lambda x: x[0])  # Sort chefs by expertise

    current_complexity =C # Initial complexity
    count =0   # Count of chefs who can cook

    for e,m in A:           # Iterate through sorted chefs
        if e>=current_complexity:       # Check if chef can cook
            count+=1                    # Increment count
            current_complexity= max(current_complexity, m)  # Update complexity
    return count