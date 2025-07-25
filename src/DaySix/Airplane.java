package DaySix;

public class Airplane {
    String producer;
    int year;
    double length;
    double weight;
    double fuel;
    double getFuel(){
        return fuel;
    }
    Airplane(String producer, int year, double weight, double length){
        this.producer = producer;
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.fuel = 0;
    }
    void info(){
        System.out.printf("Producer: %s, Year: %d, Length: %f, Weight: %f, Fuel: %f",
                            producer, year, length, weight, fuel);
    }
    void fillUp(double f){
        fuel += f;
    }

    void setYear(int year){
        this.year = year;
    }

    void setLength(double length){
        this.length = length;
    }
}
