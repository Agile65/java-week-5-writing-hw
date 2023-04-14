package java_week_5_writing_hw;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList <String>vegetableList=new ArrayList<>();
        vegetableList.add("Cucumber");
        vegetableList.add("Potato");
        vegetableList.add("Cauliflower");
        vegetableList.add("Bringle");
        vegetableList.add("Onion");
        vegetableList.add("Beetroot");
        vegetableList.add("Mushroom");
        vegetableList.add("Bitter_Gourd");
        System.out.println(vegetableList);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index= scanner.nextInt();
        if(index<vegetableList.size()){
            System.out.println(vegetableList.get(index));
        }else{
            System.out.println("Invalid Index!");
        }
        scanner.close();
    }
}
