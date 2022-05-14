public class BinarySearch {
    public int binarySearchArr(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return (1); // key found
        }
        return (-1);  // key not found.
    }
}
