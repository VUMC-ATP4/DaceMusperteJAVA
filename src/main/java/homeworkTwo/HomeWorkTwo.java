package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        int x = 7;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <=10);
        System.out.println(!(x <= 5) && x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);

        int menesis = 12;
        switch(menesis) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis " + menesis + " nav definēts");
        }


        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        int summa;
        System.out.println("Ievadi skaitli a:");
        a = scanner.nextInt();
        System.out.println("Ievadi skaitli b:");
        b = scanner.nextInt();
        System.out.println("Ievadi skaitli c:");
        c = scanner.nextInt();

        if (c>b && c>a){
            System.out.println("Skaitlis c: " + c + " ir lielākais!");
        }
        else if (b>a && b>c){
            System.out.println("Skaitlis b: " + b + " ir lielākais!");
        }
        else if (a>c && a>b) {
            System.out.println("Skaitlis a: " + a + " ir lielākais!");
        }

        String krasa = "Zaļa";

        if(krasa.equals("Zaļa")){
            System.out.println("Droši ej!");
        }else if (krasa.equals("Dzeltena")){
            System.out.println("Uzmanies, gaidi nākamo signālu!");
        }else if (krasa.equals("Sarkana")){
            System.out.println("Stāvi!");
        }else{
            System.out.println("Luksofors nedarbojas! Seko pārējām ceļazīmēm!");
        }



    }
}
