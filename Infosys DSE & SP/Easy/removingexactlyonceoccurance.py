'''
You are given a string "number" representing a positive
integer and a character digit. Return the resulting string after removing exactly one occurrence of digit from number such that the value of the resulting string in decimal form is maximized. The test cases are generated such that digit occurs at least once in the number.
I/P : number = "1321"
digit = 1
O/P: 321'''

n= str(input()) 
d= str(input())
ans=[]

for i in range(len(n)): #looping through the length of string
    if n[i]==d:          #checking for the digit in the string
        t=n[0:i]+n[i+1:]#removing the digit from the string
        ans.append(t)    #appending the new string to the list
print(max(ans))          #printing the maximum value from the list