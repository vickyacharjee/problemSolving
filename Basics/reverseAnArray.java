package Basics;

public class reverseAnArray {
    public static void main(String[] args) {
        //array to be reversed in 3,2,1
        int[] arr={1,2,3};
 
        // System.out.println(arr.length);
        for (int i =arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
    
}
     