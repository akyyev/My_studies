package day30_return_method;

import java.util.Arrays;
import java.util.Scanner;


public class Wrapper_Class {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    
    String[] arr = str.split(",");
    scan.close();
    int min = Integer.MAX_VALUE;

    
    //finding the shortest words length
    for(int i=0; i<arr.length; i++){
      if(arr[i].length()<=min){
        min = arr[i].trim().length();
      } 
    }
    
    //System.out.println("min lenzzz "+min);
    //to find how many words are there with same length as shortest word
    int count=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i].trim().length()==min) count++; 
    }
    
    //System.out.println(count);
    
    //shortest words array
    String[] shortest = new String[count];
    int s=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i].trim().length()==min){
        //trim for removing the spaces from letters.
        shortest[s]=arr[i].trim();
        s++;
      }
    }
    //Sorting the array using arrays class.
    Arrays.sort(shortest);
    
    System.out.println(Arrays.toString(shortest));
    
    
    
    
    
    
  }
}