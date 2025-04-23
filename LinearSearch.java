public class LinearSearch {
     static int linearsearch(int arr[],int target){
         for(int i=0;i<arr.length;i++){
             if(arr[i]==target){
                 return i;
             }
         }
         return -1;
     }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int target=30;
        int result=linearsearch(arr,target);
        if(result !=-1){
            System.out.println(result);
        }
        else
            System.out.println("not found");
    }
}
