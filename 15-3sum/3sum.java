import java.util.AbstractList;
class Solution {
    private List<List<Integer>> results = null;

    public List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList<List<Integer>>() {
            public List<Integer> get(int index) {
                init();
                return results.get(index);
            }
            
            public List<Integer> set(int index, List<Integer> value) {
                init();
                return results.set(index, value);
            }

            public int size() {
                init();
                return results.size();
            }

            private void init() {
                if (results != null) {return;}

                Set<List<Integer>> tempRes = new HashSet<>();
                Arrays.sort(nums);
                int len = nums.length;
            
                for (int i = 0; i < len - 2; i++) {
                    while(i != 0 && i != len - 2 && nums[i] <= 0 && nums[i] == nums[i-1]) {
                        i++;
                    }
                    if (i == len - 2 || nums[i] > 0) {
                        break;
                    }
                    int left = i + 1;
                    int right = len - 1;
                    while (left < right) {
                        int sum = nums[left] + nums[right] + nums[i];
                        if (sum > 0) {
                            right--;
                        } else if (sum < 0) {
                            left++;
                        } else {
                            tempRes.add(Arrays.asList(nums[i], nums[left], nums[right]));
                            right--;
                            left++;
                        }
                        if (nums[right] < 0) { break; }
                    }
                }
                results = new ArrayList<List<Integer>>(tempRes);
            }
        };
    }
}