package DaySix;

public class Teacher {
    String name;
    String subject;
    Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    void evaluate(String name){
        int mark;
        String Smark = "";
        do {mark = (int)(10*Math.random());
        } while ((mark > 5) || (mark < 2));
        switch (mark) {
            case 2 -> Smark = "Poor";
            case 3 -> Smark = "Satisfactory";
            case 4 -> Smark = "Good";
            case 5 -> Smark = "Very good";
        }
        System.out.printf("Teacher %s rated student %s in subject %s with a grade of %s.",
                this.name, name, this.subject, Smark);
    }
}
