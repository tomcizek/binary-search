package com.example.binarysearch;

public class BinarySearch {
  public int searchTarget(int[] nums, int target) {
    int left = 0;
    if(nums.length == 0) {
      return -1;
    }
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return left;
  }
}