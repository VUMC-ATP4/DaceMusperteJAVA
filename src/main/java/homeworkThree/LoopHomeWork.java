package homeworkThree;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

// 1.uzdevums
// Uzrakstiet programmu, kas no lietotāja nolasa veselus skaitļus un apstājas,
//  izvadot uz ekrānu tekstu:  “Gatavs”, kad šo vērtību summa pārsniedz 100

        System.out.println("Ieraksti skaitli");
        int summa=0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while(number >= 0 && summa <= 99){
            System.out.println("Ieraksti skaitli");
            number = scanner.nextInt();
            summa = summa + number;
            System.out.println("Skaitļu summa ir " + summa);
        }
        System.out.println("Gatavs");

        System.out.println("===============================");

// 2.udevums
// Tajā pašā klasē un main metodē zemāk uzrakstīt programmu, kas nolasa veselu skaitli
// un izvada uz ekrāna, vai šis skaitlis ir pirmskaitlis vai nē.

        int i;
        int m=0;
        int flag=0;
        int n=2;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" nav pirmskaitlis");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" nav pirmskaitlis");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" ir pirmskaitlis"); }
        }

        System.out.println("===============================");

// 3.uzdevums
// Definēt trīs masīvus ar datu tipiem: int, String, char
// un jāizvada uz ekrāna visas vērtības izmantojot:
// a.	while;
// b.	do while;
// c.	for loop;
// d.	for each.

        int[] skaits = {0,1,2,3,4,5};
        String[] apgerbs = {"bikses", "kleita", "krekls", "svārki"};
        char[] izmers = {'S', 'M', 'L'};

        int skaitlis = 0;
        while(skaitlis < skaits.length){
            System.out.println(skaits[skaitlis]);
            skaitlis++;
        }

        int nosaukums = 0;
        while(nosaukums < apgerbs.length){
            System.out.println(apgerbs[nosaukums]);
            nosaukums++;
        }

        int size = 0;
        while(size < izmers.length){
            System.out.println(izmers[size]);
            size++;
        }

        System.out.println("+++++++++++++++++++++++++++++++");

        int a = 0;
        do{
            System.out.println(skaits[a]);
            a++;
        } while(a < skaits.length);

        int b = 0;
        do{
            System.out.println(apgerbs[b]);
            b++;
        } while(b < apgerbs.length);

        int c = 0;
        do{
            System.out.println(izmers[c]);
            c++;
        } while(c < izmers.length);

        System.out.println("+++++++++++++++++++++++++++++++");

        for (int d = 0; d < skaits.length; d++) {
            System.out.println(skaits[d]);
        }

        for (int e = 0; e < apgerbs.length; e++) {
            System.out.println(apgerbs[e]);
        }

        for (int f = 0; f < izmers.length; f++) {
            System.out.println(izmers[f]);
        }

        System.out.println("+++++++++++++++++++++++++++++++");

        for (int g: skaits) {
            System.out.println(g);
        }

        for (String strTemp: apgerbs) {
            System.out.println(strTemp);
        }

        for (char h : izmers){
            System.out.println(h);
        }

        System.out.println("===============================");

// 4.uzdevums
// Definēt veselu skaitļu masīvu ar izmēru 100,
// un ar ciklu aizpildīt šo masīvu ar pāra skaitļiem.
// Visas vērtības, kas ir iekšā masīvā, ir nepieciešams izvest uz ekrāna vienā līnijā.


        for(int array=2; array<=200; array++)
        {
            if(array%2 == 0)
                System.out.print(array);
               }
        System.out.println(" ");
        System.out.println("===============================");

// 5.uzdevums
// Uzrakstiet Java programmu, lai aprēķinātu dotā skaitļa faktoriālo vērtību.
//a. Tā ir metode, kura kā parametru pieņem veselu skaitli.
//b. Piemērs: Faktoriāls 4 = 4 * 3 * 2 * 1 = 24.

        int k;
        int faktorials=1;
        int cipars=4;
        for(k=1;k<=cipars;k++){
            faktorials=faktorials*k;
        }
        System.out.println("Factorial of "+cipars+" is: "+faktorials);

        System.out.println("===============================");

// 6.uzdevums
// Izstrādāt kodu tā, lai lietotājam būtu tikai trīs mēģinājumi uzminēt pareizo konta PIN kodu.
// Jāizveido int konstanti, kur tiks saglabāts PIN (public final int  VARIABLE_NAME).
// Ja parole ir ievadīta pareizi, jāizvada uz ekrāna: “PIN ir pieņemts, laipni lūdzam atpakaļ”.
// Ja parole nav pareiza, jāizvada uz ekrāna:  “Nepareizs PIN, mēģiniet vēlreiz.”.
// Kad mēģinājumi beigušies, uz ekrāna jāizvada:  “Atvainojiet, bet jūs esat bloķēts”.


        final int PIN = 3891;
        int lietotajaPin;
        int meginajumuSkaits = 0;

        while (meginajumuSkaits <= 3) {

            if (meginajumuSkaits ==3) {
                System.out.println("Atvainojiet, bet jūs esat bloķēts!");
                break;
            }
            System.out.println("Ievadi PIN:");
            lietotajaPin = scanner.nextInt();
            if (PIN == lietotajaPin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            }
            else {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            }
            meginajumuSkaits++;
        }

//        do{
//            System.out.println("Ievadi PIN:");
//            lietotajaPin = scanner.nextInt();
//            System.out.println("Pārbaudām paroli");
//        } while(lietotajaPin!=PIN && meginajumuSkaits>3);
//        System.out.println("Pareiza parole");


//        if (lietotajaPin == PIN){
//            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
//        }
//        else if (lietotajaPin != PIN && meginajumuSkaits < 3){
//            System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
//            System.out.println("Ievadi PIN:");
//            lietotajaPin = scanner.nextInt();
//        }
//        else{
//        System.out.println("Atvainojiet, bet jūs esat bloķēts!");
//    }




    }
}