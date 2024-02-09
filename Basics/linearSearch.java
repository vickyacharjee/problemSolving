package Basics;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,4};
        int search=4;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                System.out.println("Found at position:"+i);
            }
            else{
                System.out.println("not Found");
            }
        }




    }
}