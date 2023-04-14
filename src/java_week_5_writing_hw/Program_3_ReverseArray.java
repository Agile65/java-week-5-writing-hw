package java_week_5_writing_hw;

import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values
 */
public class Program_3_ReverseArray {
    public static void main(String[] args) {
        int [] array=new int[]{23,45,34,54,67,78}; //single dimention array
        System.out.println("Original array : " + Arrays.toString(array));
        Program_3_ReverseArray obj=new Program_3_ReverseArray();
        System.out.println("Reverse array : ");
        obj.reverseArray(array);
    }

    // method to reverse an array
    public void reverseArray(int[] list){
        for(int i=0;i<(list.length)/2;i++){
            int temp=list[i];
            list[i]=list[list.length-1-i];
            list[list.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
