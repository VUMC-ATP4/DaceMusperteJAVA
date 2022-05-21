package homework;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is homework\n");

        String valstsNosaukums = "Latvija";
        int iedzivotajuSkaits = 1893223;
        int valstsPlatiba = 64589;
        String galvaspilseta = "Rīga";
        String oficialaValoda = "latviešu";
        boolean dalibvalstsES = true;
        char valuta = '€';

        System.out.println(valstsNosaukums + "s platība ir " + valstsPlatiba + " kvadrātkilometri un tajā dzīvo " + iedzivotajuSkaits + " iedzīvotāji.");
        System.out.println(valstsNosaukums + "s galvaspilsēta ir " + galvaspilseta + ".");
        System.out.println("Valsts oficiālā valoda ir " + oficialaValoda + " valoda.");
        System.out.println("Latvijā norēķini notiek " + valuta + " valūtā.");
        System.out.println("Vai " + valstsNosaukums + " ir ES dalībvalsts? " + dalibvalstsES);


        System.out.println("\n\nAritmētiskās darbības:");

        int a = 2;
        int b = 5;
        int c = 6;
        int d = 7;
        int e = 12;

int summa1 = a + b;
int summa2 = b + c;
int summa3 = c + d;

        System.out.println("\nSumma:");
        System.out.println(a + " + " + b + " = " + summa1);
        System.out.println(b + " + " + c + " = " + summa2);
        System.out.println(c + " + " + d + " = " + summa3);

int starpiba1 = e - a;
int starpiba2 = d - a;
int starpiba3 = e - c;

        System.out.println("\nStarpība:");
        System.out.println(e + " - " + a + " = " + starpiba1);
        System.out.println(d + " - " + a + " = " + starpiba2);
        System.out.println(e + " - " + c + " = " + starpiba3);

int dalijums1 = e / c;
int dalijums2 = e / a;
int dalijums3 = c / a;

        System.out.println("\nDalījums:");
        System.out.println(e + " / " + c + " = " + dalijums1);
        System.out.println(e + " / " + a + " = " + dalijums2);
        System.out.println(c + " / " + a + " = " + dalijums3);

int reizinajums1 = a * b;
int reizinajums2 = b * d;
int reizinajums3 = c * e;

        System.out.println("\nReizinājums:");
        System.out.println(a + " * " + b + " = " + reizinajums1);
        System.out.println(b + " * " + d + " = " + reizinajums2);
        System.out.println(c + " * " + e + " = " + reizinajums3);

int atlikums1 = e % d;
int atlikums2 = d % c;
int atlikums3 = c % a;

        System.out.println("\nAtlikums:");
        System.out.println(e + " % " + d + " = " + atlikums1);
        System.out.println(d + " % " + c + " = " + atlikums2);
        System.out.println(c + " % " + a + " = " + atlikums3);

    }

}
