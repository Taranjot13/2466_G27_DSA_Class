import java.util.Arrays;
public class InsertArray {
    public static int[] insertElement(int[] arr, int pos, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) newArr[i] = value;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        arr = insertElement(arr, 2, 3);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }
}
