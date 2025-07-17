
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int high=0;
        for(int i=0; i<gain.length;i++){
            ans=ans+gain[i];
            if(ans>high){
                high=ans;
            }else{
                high=high;
            }
        }
        return high;
    }
}