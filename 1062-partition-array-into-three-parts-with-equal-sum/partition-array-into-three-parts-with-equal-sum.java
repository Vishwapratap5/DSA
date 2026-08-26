class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int total = prefix[n - 1];

        if (total % 3 != 0) {
            return false;
        }

        int target = total / 3;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prefix[i] == target * (count + 1)) {
                count++;

                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}