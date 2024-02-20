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
        System.out.println("count number of present arrays");
        //Count Number OF arrays

        int[] arrays={1,2,3,4,5};
        int count=0;

        //via function
        System.out.println(arrays.length);
        
        for (int i = 0; i <5; i++) {
            count++;
        }

        System.out.println(count);
    }

    

}
