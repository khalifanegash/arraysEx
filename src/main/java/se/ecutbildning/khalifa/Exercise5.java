package se.ecutbildning.khalifa;

import java.util.jar.JarOutputStream;

public class Exercise5 {


    public static void main(String[] args) {
        String array [][] = new String[2][2];
        array[0][0]= "France";
        array[0][1]= "Paris";
        array[1][0]= "Sweden";
        array[1][1]= "Stockholm";
        System.out.println(array);
        for (int i = 0; i < array.length; i++){
            for (int j=0; j<array[i].length; j++ ) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

    }
}