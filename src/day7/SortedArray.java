package day7;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {10, 332, 11, 3, 32, 465, 89, 33};

//       for(int i=0;i<arr.length;i++){
//           for(int j=0;j<arr.length;j++){
//               if(arr[i]<arr[j]){
//                   int temp=arr[i];
//                   arr[i]=arr[j];
//                   arr[j]=temp;
//               }
//           }
//       }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(" "+arr[i]);
        }

    }
}
