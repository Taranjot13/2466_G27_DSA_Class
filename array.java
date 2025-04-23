public class array {
    public static void main(String[] args) {
//        int [] arr;
//        arr=new int[5];
//        int[] arr2={10,20};
//        arr[0]=5;
//        System.out.println(arr[0]);
//        System.out.println(arr2[0]);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//        for (int num : arr2) {
//            System.out.println(num);
//        }
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[1][2]);  // Output: 6
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }




    }
}
