package lab1;

import java.util.Optional;

public class Binsearch {
  public static void main(final String[] args) {
    final int[] array = new int[] { 2, 3, 5, 7, 11, 13, 17 };
    for (int i = 0; i < 20; i++) {
      System.out.println(search(array, i));
    }
  }
  
  public static Optional<Integer> search(final int[] array, int item) {
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
      final int mid = (low + high) / 2;
      if (item == array[mid]) {
        return Optional.of(mid);
      } else if (item < array[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return Optional.empty();
  }
}
