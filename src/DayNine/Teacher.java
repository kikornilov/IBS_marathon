package DayNine;

public class Teacher extends Human {
    private String className;
    public Teacher(String name, String className){
        super(name);
        this.className = className;
    }
    void setClassName(String className){
        this.className = className;
    }
    String getClassName(){
        return className;
    }
    void printInfo(){
        super.printInfo();
        System.out.println("This is the teacher with name: " + super.getName());
    }
}
