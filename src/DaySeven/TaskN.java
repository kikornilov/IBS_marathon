package DaySeven;


public class TaskN {
    public static void main(String[] args) {
        /*
        Airplane a = new Airplane("AirBus", 2007, 345, 209);
        Airplane b = new Airplane("Boeing", 2010, 320, 256);
        Airplane.compareAirplanes(a,b);

         */

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();

        Player.info();
        Player p7 = new Player();
        Player p8 = new Player();
        Player p9 = new Player();
        Player p10 = new Player();
        Player.info();

        System.out.println("p10: " + p10.getStamina());
        System.out.println("p2: " + p2.getStamina());
        do p2.run();
        while (p2.stamina > 1);
        System.out.println("p2: " + p2.getStamina());
        Player.info();
        p2.run();
        System.out.println("p2: " + p2.getStamina());
        Player.info();
        p2.run();


        System.out.println("countPlayers: " + Player.countPlayers);
    }
}
