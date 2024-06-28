
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2) {
        int a1len = arr1.length;
        int a2len = arr2.length;
        int len = a1len+a2len;
        int arr[] = new int[len];
        System.arraycopy(arr1, 0, arr, 0, a1len);
        System.arraycopy(arr2, 0, arr, a1len, a2len);
        return arr;
    }
}
