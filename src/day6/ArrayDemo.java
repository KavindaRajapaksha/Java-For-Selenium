package day6;

public class ArrayDemo {

    public static void main(String[] args){
        System.out.println("fwf");
//        int arr[]=new int[5];
//         int  arr[]={10,20,30,40,50};
//
//         System.out.println("length of an array : "+arr.length);

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //enhance forloop is create for collections like array arraylists and collections
//        for(int i : arr){
//            System.out.println(i);
//        }
        //multiple arrray
//        int arr[][]=new int[3][2];
//        arr[0][0]=100;
        int a[][] = {{10, 20}, {30, 40}, {50, 60}};
          int n=a[0].length;
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<n;j++) {
                System.out.println(a[i][j]);
            }
        }

        System.out.println("number of columns: "+a[0].length);

    }
}
