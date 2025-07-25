package DaySix;

public class TaskN {
    public static void main(String[] args) {
        DaySix.Airplane ap = new Airplane("Airbus", 2007, 120, 230);
        ap.setYear(2009);
        ap.setLength(344);
        ap.fillUp(34);
        ap.fillUp(99);
        ap.info();
        System.out.println();
        System.out.println();
    }
}
