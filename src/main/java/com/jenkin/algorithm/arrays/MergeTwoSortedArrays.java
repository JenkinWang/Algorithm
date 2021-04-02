package com.jenkin.algorithm.arrays;

import java.util.Arrays;

/**
 * @Author: wangyb
 * @Date: 4/2/21 10:33 AM
 * @Description: 合并两个有序数组
 */
public class MergeTwoSortedArrays {

    /**
     * 双指针
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        for (; j < n; ) {
            nums[k++] = nums2[j++];
        }

        for (; i < m; ) {
            nums[k++] = nums1[i++];
        }

        System.arraycopy(nums, 0, nums1, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 7, 0, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 2, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
