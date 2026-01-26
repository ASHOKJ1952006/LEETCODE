class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int tmin=0;
        int rmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            tmin=arr[i+1]-arr[i];
            if(tmin<0) tmin=-tmin;
            rmin=Math.min(rmin,tmin);
        }
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==rmin){
                lst.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return lst;
    }
}