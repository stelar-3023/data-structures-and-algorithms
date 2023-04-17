import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] reversedArray = reverseArray(new int[] {1, 2, 3, 4, 5});
    System.out.println(Arrays.toString(reversedArray));

  }

  public static int[] reverseArray(int[] array) {
    int[] newArray = new int[array.length];
    // i starts at the end of the array and goes to the beginning
    for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
      // assign the value of the array at index i to the new array at index j
      newArray[j] = array[i];
    }
    return newArray;
  }
}