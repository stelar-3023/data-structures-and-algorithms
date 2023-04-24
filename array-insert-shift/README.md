#### 1. Problem Domain

- Write a function that takes in an array and a value, and inserts the value into the middle of the array, shifting all the elements after it to the right.

#### 2. Visual
- Before insertion: [1, 2, 3, 4, 5]
- After insertion of value 10: [1, 2, 10, 3, 4, 5]

#### 3. Algorithm
- To insert a value into the middle of an array, we need to determine the middle index of the array first. If the length of the array is even, then there are two middle elements, and we need to choose the one on the left. Once we have the middle index, we can shift all the elements after it to the right by one position. Then, we can insert the value at the middle index.

#### 4. BigO
-  The time complexity of array-insert-shift in Java is O(n) because we need to shift all the elements after the middle index by one position.

#### 5. PseudoCode
```agsl

function insertShiftArray(arr, val)
    // Determine the middle index
    middleIndex = length of arr divided by 2, rounded down

    // Shift all the elements after the middle index to the right
    for i from length of arr - 1 down to middleIndex + 1
        arr[i] = arr[i - 1]

    // Insert the value at the middle index
    arr[middleIndex] = val

    return arr
```

#### 6. Code
```agsl
public static int[] insertShiftArray(int[] arr, int val) {
    // Determine the middle index
    int middleIndex = arr.length / 2;

    // Shift all the elements after the middle index to the right
    for (int i = arr.length - 1; i > middleIndex; i--) {
        arr[i] = arr[i - 1];
    }

    // Insert the value at the middle index
    arr[middleIndex] = val;

    return arr;
}
```

#### 7. Test
- To test this function, we can use the following test cases:
- int[] arr1 = {1, 2, 3, 4, 5};
- int[] expected1 = {1, 2, 10, 3, 4, 5};
- assertArrayEquals(expected1, insertShiftArray(arr1, 10));

- int[] arr2 = {1, 2, 3, 4};
- int[] expected2 = {1, 2, 10, 3, 4};
- assertArrayEquals(expected2, insertShiftArray(arr2, 10));

- int[] arr3 = {1};
- int[] expected3 = {10, 1};
- assertArrayEquals(expected3, insertShiftArray(arr3, 10));
