#### 1. Problem Domain
- Write a function reverseArray that takes an array as input and returns a new array with the elements in reverse order.

#### 2. Visual
- Input: [1, 2, 3, 4, 5]
- Output: [5, 4, 3, 2, 1]

#### 3. Algorithm
- Create a new array to store the reversed elements
- Loop through the original array from the end to the beginning
- For each element in the original array, add it to the new array
- Return the new array with the reversed elements

#### 4. BigO
O(1) - Constant - (ex. int x = 7);
O(n) - Linear - (ex. Loops);
O(n<sup>2</sup>) - Exponential - (ex. Nested loops)

The time complexity of this algorithm is O(n) since we only iterate through the array once. The space complexity is also O(n) since we create a new array to store the reversed elements.


#### 5. Pseudocode
function reverseArray(arr):
  newArr = []
  for i = arr.length - 1 to 0:
    newArr.push(arr[i])
  return newArr

#### 6. Code
public static int[] reverseArray(int[] arr) {
    int[] new_arr = new int[arr.length];
    for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
        new_arr[j] = arr[i];
    }
    return new_arr;
}

#### 7. Test
- To test this function, we can use the following test cases:

- Standard input and output: reverseArray([1, 2, 3, 4, 5]) should return [5, 4, 3, 2, 1]
- Different input and output: reverseArray([3, 7, 2, 1]) should return [1, 2, 7, 3]
- Edge case: reverseArray([]) should return []
- Null input: reverseArray(null) should return null