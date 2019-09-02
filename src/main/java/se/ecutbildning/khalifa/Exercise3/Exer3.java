package se.ecutbildning.khalifa.Exercise3;

import java.util.Arrays;

public class Exer3 {
    public static void main(String[] args){

        String[] strAraray = new String[]{"Paris","London","New York","Stockholm"};
        for (int i = 0; i < strAraray.length; i++)
        System.out.print(strAraray[i]+ "  ");

        System.out.println("\nsorted array:");

         Arrays.sort(strAraray);
         for (String name : strAraray){
           System.out.print(name + "  ");
         }

        }

    }