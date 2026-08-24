class Solution {
    public boolean hasTripletSum(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < arr.length; j++) {

                int needed = target - arr[i] - arr[j];

                if (set.contains(needed)) {
                    return true;
                }

                set.add(arr[j]);
            }
        }

        return false;
    }
}