package DayNine;

public class Human {
    private String name;
    public Human(String name){
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void printInfo(){
        System.out.println("This is the Human with name: " + name);
    }
}
