class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            String s = Integer.toString(i);
            int count = 0;   // reset for each number

            for (int j = 0; j < s.length(); j++) {   // fix loop variable
                int n = s.charAt(j) - '0';           // correct char → int

                if (n != 0 && i % n == 0) {
                    count++;
                }
            }

            if (count == s.length()) {
                arr.add(i);
            }
        }
        return arr;
    }
}
