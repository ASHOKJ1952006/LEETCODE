class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet <Integer> set =new HashSet<>();
        int[] res=new int[friends.length];
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        int index=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                res[index++]=order[i];
            }
        }
        return res;
    }
}