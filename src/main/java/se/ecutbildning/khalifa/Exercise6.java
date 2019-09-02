package se.ecutbildning.khalifa;

import org.w3c.dom.ls.LSOutput;

public class Exercise6 {
    public static void main(String[] args) {
int[] array = {43,5,23,17,2,14};
 int sum =0;
 double count=0;
 for (int i=0; i<array.length; i++){
     sum = sum + array[i];
     count++;
 }
        System.out.println("the average: " + sum/count);
    }

}
