public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dace JAVA 1 lekcija");

        // integer - vesels skaitlis

        int x=5;
        int y = 10;
        int q = -17;
        double lowestTemperature = -20.4;
        float highestTepmerature = 40.6585264F;
        System.out.println("Augstākā temperatūra =  "+highestTepmerature + " Zemākā temperatūra = "+lowestTemperature);

        System.out.println("x ir vienāds ar:");
        System.out.println(x);
        System.out.println("y ir vienāds ar:");
        System.out.println(y);
        System.out.println("x + y ir vienāds ar:");
        System.out.println(x+y);

        // [Mainīgā tips] [mainīgāNosaukums] = [vērtība];
        // Vārdi un teikumi Java valodā tiek saglabāti mainīgā tipā 'String'
        String dogName = "Reksis";

        // Veseli skaitļi tiek definēti ar mainīgā tipu "int"
        int dogAge = 10;

        // Daļskaitļi tiek definēti ar mainīgā tipu "daouble" vai "float"
        double dogWeight = 15.5;

        String dogBreed = "Vācu aitu suns";

        // Jā(true) nē(false) jautājums tiek definēts ar mainīgā tipu "boolean"
        boolean isHungry = true;

        //vienu simbolu definē ar mainīgā tipu 'char'
        char dogGender = 'M';
        char currency = '€';
        int puppyPrice = 100;

        System.out.println("Suņa vārds: " + dogName);
        System.out.println("Suņa vecums: " + dogAge);
        System.out.println("Suņa svars: " + dogWeight);
        System.out.println("Suņa šķirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis? " + isHungry);
        System.out.println("Suņa dzimums ir: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + puppyPrice +" "+ currency);

        System.out.println("\n\n\nSuņa vārds: " + dogName + "\nSuņa vecums: " + dogAge + "\n\nSuņa svars: " + dogWeight);

byte age = 10;
        short deepestSeaLevel = 11000;
        int highestIntNumber = 2147483647;
        long USACountryDebt = 2147483647123L;
        System.out.println(age);
        System.out.println(deepestSeaLevel);
        System.out.println(highestIntNumber);
        System.out.println(USACountryDebt);


        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

        summa = pirmaisSkaitlis + otraisSkaitlis;
        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = 10 % 3;

        int a = 1;
        int b = 4;
        int c = 7;

        int vienadojums = 5+5*2;
        int vienadojums = (5+5)*2;


        System.out.println("Ja atlikums ir 0, tad para skaitlis" + b % 2);


        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);
        System.out.println("starpiba" + starpiba);
        System.out.println("dalijums" + dalijums);
        System.out.println("reizinajums" + reizinajums);
        System.out.println("atlikums" + atlikums);

    }
}
