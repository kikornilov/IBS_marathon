package DayNine;

public class TaskN {
    public static void main(String[] args) {
        /* Task1
        Student student = new Student("Pety", "BRT102");
        Teacher teacher = new Teacher("Valentina Pavlovna", "Math");
        System.out.printf("The student %s has a group %s\n", student.getName(), student.getGroupName());
        System.out.printf("The teacher %s has a class %s\n", teacher.getName(), teacher.getClassName());
        student.printInfo();
        teacher.printInfo();

         */

        //Task2
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println("The sum of the perimeters of all red figures is: " + calculateRedPerimeter(figures));
        System.out.println("The sum of the areas of all red figures is: " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.area();
            }
        }
        return sum;
    }
}
