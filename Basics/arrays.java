package Basics;

public class arrays {
    public static void main(String[] args) {
        System.out.println("Demonstration of arrays");
        int[] arr={1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+ " "+arr[i]);
        }


        //add element via for loop
        int asize=5;
        int[] arr2=new int[asize];

        for (int j = 0; j < asize;j++) {
            arr2[j]=j*2;
        }


        for (int j = 0; j < asize;j++) {
          System.out.println(arr2[j]);
        }
    }
}
