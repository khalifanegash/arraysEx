package se.ecutbildning.khalifa;

import java.util.Arrays;

public class Exercise4
{
    public static void main(String[]args) {
        int[] Array1 = new int[]{11, 15, 20};
        int[] Array2 = new int[3];
        Array2 = Arrays.copyOf (Array1, 3);
        System.out.print("The first Array :" );

        for (int i = 0; i < Array1.length; i++) {

             System.out.print(Array1[i]+ " ");

                }
        System.out.print(" \nThe second Array :" );

                for (int i = 0; i < Array2.length; i++){

                System.out.print(Array2[i]+ " ");


            }
        }}