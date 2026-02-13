class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> lst=new HashSet<>();
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String s1=words[i];
                String s2=words[j];
                boolean n=s1.contains(s2);
                boolean n1=s2.contains(s1);
                if(n){
                    lst.add(s2);
                    continue;
                }
                if(n1){
                    lst.add(s1);
                    continue;
                }
            }
        }List<String> list = new ArrayList<>(lst);
        return list;
        
    }
}