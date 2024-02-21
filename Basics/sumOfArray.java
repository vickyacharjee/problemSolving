package Basics;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,12};

        int add=0;
        for (int i = 0; i < arr.length; i++) {
            add=add+arr[i];
        }
        System.out.println(add);
    }
    
}
