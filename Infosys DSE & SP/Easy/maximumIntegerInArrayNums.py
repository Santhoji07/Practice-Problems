'''
You are given an integer n. A 0-indexed integer array nums of length n+1 is generated following the rules:
1. nums[0]=0
2. nums[1]=1
3. nums[2*i] = nums[i], when 2<= 2*i <= n
4. nums[2*i] = nums[i] + nums[i+1], when 2<= 2*i +1 <= n Return the maximum integer in the array nums.'''


n=int(input())  #taking input from user
arr=[0]*(n+1)   #creating an array of size n+1 with all elements initialized to 0
arr[0]=0    #first element is 0
arr[1]=1     #second element is 1
for i in range(1,(n//2)+1):        #looping through half of the length of array
    arr[i*2]=arr[i]                #assigning value to even index
    arr[(i*2)+1]=arr[i]+arr[i+1]   #assigning value to odd index
print(arr)                         #printing the array
print(max(arr))                    #printing the maximum value in the array


