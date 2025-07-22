package DayFive;

public class TaskN {
    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("Yellow");
        c.setModel("R8");
        c.setYear(2008);
        c.getColor();
        c.getModel();
        c.getYear();
        System.out.println();

        Motorbike m = new Motorbike(1988, "Black", "R1000");
        System.out.println("Motorbike with parameters: " + m.getColor() + " " + m.getYear() + " " + m.getModel());
    }
}
