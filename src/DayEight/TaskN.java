package DayEight;

public class TaskN {
    public static void main(String[] args) {
        /*
        StringBuilder test2 = new StringBuilder();
        String test = "";
        long start1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for(int i = 0; i < 20001;i++){
            if (i < 20000) test += i + " ";
            else test += i;
        }
        System.out.println(test);
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 20001;i++){
            if (i < 20000) test2.append(i).append(" ");
            else test2.append(i);
        }
        System.out.println(test2);
        long end2 = System.currentTimeMillis();
        long time1 = end1-start1;
        long time2 = end2-start2;
        System.out.println("Time 1: " + time1 + "\nTime 2: " + time2);

         */

        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(airplane);
        System.out.println(airplane.toString());
        System.out.println();

        airplane.info();
    }
}
