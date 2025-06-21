class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[(nums1.length + nums2.length)/2+1];
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < merged.length; i++) {
            if (p1 == nums1.length) {
                merged[i] = nums2[p2++];
            } else if (p2 == nums2.length) {
                merged[i] = nums1[p1++];
            } else {
                if (nums1[p1] > nums2[p2]) {
                    merged[i] = nums2[p2++];
                } else {
                    merged[i] = nums1[p1++];
                }
            }
        }
        if ((nums1.length + nums2.length) % 2 == 1) {
            return (double) merged[merged.length-1];
        } else {
            return (double) (merged[merged.length-1] + merged[merged.length-2]) / 2.0;
        }
    }
}