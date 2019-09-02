package se.ecutbildning.khalifa;

public class Exercise7 {
    public static void main(String[] args) {
        int[] array = {1,2,4,7,9,12};
        System.out.println("odd numbers : ");
        for (int i =0; i<array.length; i++){
            if(array[i] % 2 != 0){
                System.out.print(array[i]+ "  ");
            }

        }
    }
}
