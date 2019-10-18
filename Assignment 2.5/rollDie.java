import java.util.Scanner;

class rollDie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        
        while (run == true) {
            double t = 0;

            System.out.println("How many dice do you want to roll?");
            System.out.println("");

            double d = sc.nextDouble();
            System.out.println("");

            System.out.println("How many sides do these dice have?");
            System.out.println("");

            double s = sc.nextDouble();
            System.out.println("");

            System.out.print("You rolled: ");
            for (int i = 0; i < d; i++) {
                double dieRoll = rollDie(s);

                System.out.print(dieRoll + " ");

                t = t + dieRoll;
            }
            System.out.println("");
            System.out.println("");

            System.out.println("Your total is: " + t);
            System.out.println("");

            System.out.println("Again? [y, n]");
            System.out.println("");

            String a = sc.next();
            System.out.println("");

            boolean exitLoop = false;
            while (exitLoop == false) {
                if (a.equals("y")) {
                    exitLoop = true;
                } else if (a.equals("n")) {
                    System.out.println("Good-bye!");

                    run = false;
                    exitLoop = true;
                } else {
                    System.out.println("Try again, type y or n.");
                    System.out.println("");

                    a = sc.next();
                    System.out.println("");
                }
            }
        }
    }

    public static double rollDie(double sides) {
        double randN = Math.floor((Math.random() * sides) + 1);

        return randN;
    }
}