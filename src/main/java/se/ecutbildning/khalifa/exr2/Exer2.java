package se.ecutbildning.khalifa.exr2;

public class Exer2 {
public static void main(String[] args){
    int [] numbers = new int[3];
    numbers[0]= 10;
    numbers [2] = 6;
    System.out.println(indexOf(numbers, 5));
}
public static int indexOf(int[] array,int element){
    for (int i = 0; i < array.length; i++){
        if ( array[i] == element) return i;
    }
    return -1;

}
}
