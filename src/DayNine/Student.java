package DayNine;

public class Student extends Human {
    private String groupName;
    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }
    void setGroupName(String groupName){
        this.groupName = groupName;
    }
    String getGroupName(){
        return groupName;
    }
    void printInfo(){
        super.printInfo();
        System.out.println("This is the student with name: " + super.getName());
    }
}
