import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int x : arr1) {
            int left = 0;
            int right = arr2.length - 1;
            boolean far = true;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int diff = Math.abs(x - arr2[mid]);

                if (diff <= d) {
                    far = false;
                    break;
                }

                if (arr2[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (far) {
                count++;
            }
        }

        return count;
    }
}

