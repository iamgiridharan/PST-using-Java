# # Task 2. Access and print the element at a given index in an array. 

# def find(arr,k):
#     if k in arr:
#         return arr[k]
#     else:
#         return "Index out of range"
# print(find([1,2,3,5,4,6],6))  


# Task 3. Search for a given element in a sorted array using Binary Search. 
def binarysearch(arr,target):
    
    left=0
    right=len(arr)-1
    while left<=right:
        mid=(left+right)//2

        if arr[mid]==target:
            return mid
        elif arr[mid]<target:
            left=mid+1
        else:
            right=mid-1
    return -1

print(binarysearch([1,2,3,4,5,6],4))

# Task 4. Find the maximum element in an array of n integers 

# def maxelement(arr):
#     return max(arr)
# print(maxelement([54,15,14,15,8,1]))

def maxelement(arr):
    if not arr:
        return None
    maxi=arr[0]
    for number in arr[1:]:
        if number>maxi:
            maxi=number
        return maxi
print(maxelement([54,15,14,15,8,1]))        
        

