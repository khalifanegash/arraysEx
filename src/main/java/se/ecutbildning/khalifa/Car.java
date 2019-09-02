package se.ecutbildning.khalifa;

public class Car {
    private String id;
    private String year;
   private String model;
    private String color;
    private String motorSize;
    private String motor;

public Car(String id, String year, String model, String color, String motor){
    this.id = id;
    this.year = year;
    this.model = model;
    this.color = color;
    this.motor = motor;

}
public  void drive(){
    System.out.println("model " + model + " with motor " + motor + " can drive now.");;

}
public String getmotor(String motor,String model){
    return motor;

}

    public static void main(String[] args) {

        System.out.println(" Car drive now");
        Car car = new Car("1", "2019", "V70", "Black", "115hp");
        car.drive();
    }

    }





