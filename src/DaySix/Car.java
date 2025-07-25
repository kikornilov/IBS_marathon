package DaySix;

public class Car {
    int year;
    String color;
    String model;
    void setYear(int i){
        year = i;
    }
    void setColor(String c){
        color = c;
    }
    void setModel(String m){
        model = m;
    }
    void getYear(){
        System.out.println(year);
    }
    void getColor(){
        System.out.println(color);
    }
    void getModel(){
        System.out.println(model);
    }
    void info(){
        System.out.println("This is a car");
    }
    int yearDifference(int i){
        return year - i;
    }
}
