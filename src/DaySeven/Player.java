package DaySeven;

public class Player {
    int stamina;
    final int max_stamina = 100;
    final int min_stamina = 0;
    static int countPlayers = 0;
    Player(){
        if (countPlayers < 6) countPlayers += 1;
        else System.out.println("Maximum number of players on the field is 6");
        do {stamina = (int)(100*Math.random());
        } while (stamina <= 90);
    }
    int getStamina(){
        return this.stamina;
    }
    void run(){
        if(this.stamina > min_stamina) this.stamina -= 1;
        else {
            System.out.println("The player is exhausted");
            countPlayers -= 1;
        }
    }
    static void info(){
        if (countPlayers < 6) System.out.printf("\nThe teams are not full. There are still %d free places on the field.\n", 6 - countPlayers);
        else System.out.println("There are no empty seats on the field");
        }
    }
