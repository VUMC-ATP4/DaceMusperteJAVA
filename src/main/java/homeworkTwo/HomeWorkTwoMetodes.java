package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwoMetodes {
    public static void main(String[] args) {
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);

        int a = 4;
        int b = 12;
        int summa = sum(a, b);
        System.out.println(summa);

        System.out.println(average(16, 4, 9));


    }


    private static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +371 12345678");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("##########");
    }

    private static void printBusinessCardTwo(String name, String surname, String phoneNumber, int dateOfBirth)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds:" + name);
        System.out.println("Uzvārds:" + surname);
        System.out.println("Telefona numurs:" + phoneNumber);
        System.out.println("Dzimšanas gads:" + dateOfBirth);
        System.out.println("##########");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double average(double c, double d, double e){
        return (c + d + e)/3;
    }


}
