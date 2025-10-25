class Solution {
    public int totalMoney(int n) {
        int count=1;
        int sum=0;
        int days=1;
        int c=2;
        for(int i=1;i<=n;i++){
            if(days==8){
                days=1;
                count=c++;
            }
            days++;
            
            sum+=count;
            count++;
        }
        return sum;
    }
}