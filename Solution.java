class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
      long maxSum= arr[0];
         long sum=0,res=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            //maxSum= Math.max(maxSum, sum);
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<=0) sum=0;
        }
       
       
        return maxSum;
    }
    
}

