#### 1. Problem Domain
- Write a program to implement Binary Search Algorithm for a given sorted array of integers and a target integer. The program should return the index of the target integer in the array if it exists, otherwise, return -1.

#### 2. Visual
- *Input:*
- A sorted array of integers arr = [1, 3, 4, 5, 7, 9, 10, 13, 15, 18]
- A target integer target = 7
- *Output:*
- The index of the target integer in the array is 4
- *Approach:*
- Compare the target integer with the middle element of the array.
- If the target is equal to the middle element, return the index of the middle element.
- If the target is greater than the middle element, search in the right half of the array.
- If the target is smaller than the middle element, search in the left half of the array.
- Repeat the above steps until the target is found or the search space is exhausted.

#### 3. Algorithm
- Initialize two pointers, start and end, to the first and last index of the array, respectively.
- *While start <= end:*
- Calculate the middle index mid = (start + end) / 2.
- If the target is equal to the middle element, return mid.
- If the target is greater than the middle element, set start = mid + 1.
- If the target is smaller than the middle element, set end = mid - 1.
- If the target is not found, return -1.

#### 4. BigO
- Time: O(log n) where n is the number of elements in the array. This is because we are dividing the search space in half in each iteration.
- Space: O(1) since we are not using any extra data structures.

#### 5. Pseudocode
```
function binarySearch(arr, target):
    start = 0
    end = arr.length - 1
    while start <= end:
        middle = floor((start + end) / 2)
        if arr[middle] == target:
            return middle
        else if arr[middle] < target:
            start = middle + 1
        else:
            end = middle - 1
    return -1
```

#### 6. Code
```agsl

public static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
        int middle = (start + end) / 2;
        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] < target) {
            start = middle + 1;
        } else {
            end = middle - 1;
        }
    }
    return -1;
}
```

#### 7. Test
- A valid input where the target element is found in the array.
- A valid input where the target element is not found in the array.
- An empty array as input.
- An input array with only one element.
- An input array where the target element appears multiple times.