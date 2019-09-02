package se.ecutbildning.khalifa;

public class Rectangle {
    //fields , data
    private double height;
    private double width;

    public Rectangle(double height, double width)
    // Default Constractur
    {
        this.height = height;
        this.width = width;
    }
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        System.out.println();
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("The area of rectangle have height :"+ rectangle.getHeight()+" and width "+ rectangle.getWidth()+" is " + rectangle.getArea());
        rectangle.setHeight(2);
        rectangle.setWidth(6);
        System.out.println("The area of rectangle is :" + rectangle.getArea());
    }
}
