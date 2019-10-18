import java.util.Scanner;

class displayBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the width of your box?");

        System.out.println("");

        double w = sc.nextDouble();

        System.out.println("");

        System.out.println("What is the height of your box?");

        System.out.println("");

        double h = sc.nextDouble();

        System.out.println("");

        displayBox(w, h);
    }

    public static void displayBox(double width, double height) {
        for (double l = 0.0; l < height; l++) {
        for (double i = 0.0; i < (width - 1.0); i++) {
            System.out.print("$");
        }
        System.out.println("$");
    }
}
}