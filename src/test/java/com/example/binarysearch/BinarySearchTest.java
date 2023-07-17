package com.example.binarysearch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
  private final BinarySearch binarySearch = new BinarySearch();

  @Test
  public void itShouldReturnNegativeOneWhenSearchInEmptyArray() {
    assertEquals(-1, binarySearch.searchTarget(new int[] {}, 5));
  }

  @Test
  public void itShouldFindTargetInOneItemArray() {
    assertEquals(0, binarySearch.searchTarget(new int[] {5}, 5));
  }

  @Test
  public void itShouldFindTargetInThreeItemArray() {
    assertEquals(1, binarySearch.searchTarget(new int[] {1, 3, 5}, 3));
    assertEquals(0, binarySearch.searchTarget(new int[] {1, 3, 5}, 1));
    assertEquals(2, binarySearch.searchTarget(new int[] {1, 3, 5}, 5));
  }

  @Test
  public void itShouldReturnNegativeOneWhenNotFound() {
    assertEquals(2, binarySearch.searchTarget(new int[] {1, 3, 5}, 4));
  }

  @Test
  public void itShouldFindTargetInNonUniqueArrayAndReturnIndexOfArbitraryMatchingValue() {
    assertEquals(1, binarySearch.searchTarget(new int[] {1, 3, 5}, 3));
    assertEquals(1, binarySearch.searchTarget(new int[] {1, 3, 3, 5}, 3));
    assertEquals(2, binarySearch.searchTarget(new int[] {1, 3, 5, 5, 5}, 5));
    assertEquals(3, binarySearch.searchTarget(new int[] {1, 3, 5, 5, 5, 5, 5}, 5));
  }
  
  @Test
  public void itShouldFindTargetInLargeArray() {
    int[] largeArray = new int[1000];
    for (int i = 0; i < 1000; i++) {
      largeArray[i] = i * 2;
    }
    assertEquals(266, binarySearch.searchTarget(largeArray, 532));
  }
}
