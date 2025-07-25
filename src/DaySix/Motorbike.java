package DaySix;

public class Motorbike {
    int year;
    String color;
    String model;
    Motorbike(int year, String color, String model){
        this.year = year;
        this.model = model;
        this.color = color;
    }
    int getYear(){
        return year;
    }
    String getModel(){
        return model;
    }
    String getColor(){
        return color;
    }
    void info(){
        System.out.println("This is a motorbike");
    }
    int yearDifference(int i){
        return year - i;
    }
}
