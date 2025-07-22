package DayFive;

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
}
