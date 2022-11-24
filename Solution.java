class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        int n=nums.length;
        int[]in=new int[n];
        for(int i=0;i<n;i++){
            in[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i] && in[j]+1>in[i]){
                    in[i]=in[j]+1;
                }
            }
        }
        int[]dec=new int[n];
        for(int i=n-1;i>=0;i--){
            dec[i]=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i] && dec[j]+1>dec[i]){
                    dec[i]=dec[j]+1;
                }
            }
        }
        int a=0;
        for(int i=0;i<n;i++){
            a=Math.max(a,in[i]+dec[i]-1);
        }
        return a;
        // Code here
    }
}