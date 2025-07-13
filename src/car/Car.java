package car;

public class Car {
    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.make + this.color + this.year+this.model;
    }
}
