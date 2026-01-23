class Solution:
    def maxsum(self,arr,n,k):
        if n<=k:
            return -1
        max_sum=sum(arr[:k])
        window_sum=max_sum
        for i in range(k,n):
            window_sum=window_sum+arr[i]-arr[i-k]
            max_sum=max(max_sum,window_sum)
        return max_sum
obj=Solution()
array=list(map(int,input("Enter the numbers").split()))  
n=len(array)
k=int(input("No. of subarray:"))  

result=obj.maxsum(array,n,k)
print(result)

if result!=-1:
    print("Maximum sum of subarray of size", k, "is:", result)

