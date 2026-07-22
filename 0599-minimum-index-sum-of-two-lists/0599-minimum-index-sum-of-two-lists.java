class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        ArrayList<String> lst = new ArrayList<>();
        int res = Integer.MAX_VALUE;

        // First pass - Find minimum index sum
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    res = Math.min(res, i + j);
                }
            }
        }

        // Second pass - Collect all strings having minimum index sum
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j]) && (i + j == res)) {
                    lst.add(list1[i]);
                }
            }
        }

        return lst.toArray(new String[0]);
    }
}