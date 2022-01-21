package SortingAlgorithms;

public class MergeSort extends Sort {
public int[] MergeSort(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        int temp;
        for (int i = 1; i < merged.length; i++) {
            for (int j = i; j > 0; j--) {
                if (merged[j] < merged [j - 1]) {
                    temp = merged[j];
                    merged[j] = merged[j - 1];
                    merged[j - 1] = temp;
                }
            }
        }
        return merged;

    }

}
}
