class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int index = 0;

        Set<Integer> set = new HashSet<>();

        // Add elements of arr2 in correct order
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    res[index] = arr1[j];
                    index++;
                }
            }
        }

        // FIX: Add only filled elements to the set (avoid extra zeros)
        for (int i = 0; i < index; i++) {
            set.add(res[i]);
        }

        // Collect remaining elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!set.contains(arr1[i])) {
                list.add(arr1[i]);
            }
        }

        // Sort remaining elements
        Collections.sort(list);

        // Add sorted remaining elements to res[]
        for (int value : list) {
            res[index] = value;
            index++;
        }

        return res;
    }
}
