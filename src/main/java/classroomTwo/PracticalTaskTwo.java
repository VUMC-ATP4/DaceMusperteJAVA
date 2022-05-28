package classroomTwo;


import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {
        // tips nosaukums = deklarācija
        Scanner scanner = new Scanner(System.in);
//        int vecums;
//        boolean drikstBalsot = false;
//
////        System.out.println("Paskaties cilvēka pasē");
////        vecums = scanner.nextInt();
////        if(vecums >= 18){
////            System.out.println("Drīkst balsot");
////            drikstBalsot = true;
////        }
////        System.out.println("Vai drīkst balsot? " + drikstBalsot);
////        System.out.println("Tālākās darbības");
//
//        System.out.println("Paskaties cilvēka pasē");
//        vecums = scanner.nextInt();
//        if(vecums >= 18){
//            System.out.println("Drīkst balsot");
//        }else{
//            System.out.println("Nedrīkst balsot!");
//        }
//
//
        int vecums;
        boolean canVote = false;
        System.out.println("Paskaties cilvēka pasē?");
        vecums = scanner.nextInt();
        if (vecums >= 18) {
            canVote = true;
        }

        if(canVote){
            System.out.println("Cilveks var balsot");
        } else{
            System.out.println("Cilveks nevar balsot");
        }

        int month = 8;
        switch(month){
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
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis " + month + " nav definēts");
        }



//        if(6>3){
//            System.out.println("6 ir lielāks par 3");
//        }

        int x = 10;
        int y = 20;
        if(y > x){
            System.out.println("Y ir lielāks par X");
        }
    if(y > x && x > 5){
        System.out.println("Y ir lielāks par X un lielāks par 5");
        }
    if (y > x || x > 25){
        // true or false
        System.out.println("Šis izpildās");
    }

//    int skaitlis = 5;
//
//    if(skaitlis>0){
//        System.out.println(skaitlis +" ir pozitīvs!");
//    }else{
//        System.out.println(skaitlis + " ir negatīvs!");
//    }

//        int skaitlis = 25;

//        if(skaitlis>0){
//            System.out.println(skaitlis +" ir pozitīvs!");
//        }else if (skaitlis <0){
//            System.out.println(skaitlis + " ir negatīvs!");
//        }else{
//            System.out.println(skaitlis + " ir NULLE!");
//        }

        int skaitlis = 15;

        if(skaitlis == 10){
            System.out.println("Skaitlis ir 10");
        }else if (skaitlis == 15){
            System.out.println("Skaitlis ir 15");
        }else if (skaitlis == 20){
            System.out.println("Skaitlis ir 20");
        }else{
            System.out.println("Skaitlis ir nezināms");
        }

        switch(skaitlis){
            case 10:
                System.out.println("Skaitlis ir 10");
                break;
            case 15:
                System.out.println("Skaitlis ir 15");
                break;
            case 20:
                System.out.println("Skaitlis ir 20");
                break;
            default:
                System.out.println("Skaitlis ir nezināms");
        }


//        System.out.println("Ievadi savu vārdu");
//
//        String tavsVards = scanner.nextLine();
//
//        System.out.println("Labdien, " + tavsVards + "!");
//        System.out.println("Esi sveicināts/a kalkulatora programmā!");

//        int c;
//        int d;
//        int summa;
//        System.out.println("Ievadi skaitli c");
//        c = scanner.nextInt();
//        System.out.println("Ievadi skaitli d");
//        d = scanner.nextInt();
//
//        System.out.println(c > d);
//        System.out.println("Šeit jābūt nepatiesam" + (5>10));
//        System.out.println(5<10);
//        System.out.println(6==5); // false
//        System.out.println(6==6); // true
//        System.out.println(6!=5); // true
//        System.out.println(5!=5); // false
//        int vecums = 18;
//        System.out.println(vecums >= 18);
//        int bernaVecums = 5;
//        System.out.println(bernaVecums <= 5);
//        System.out.println(vecums > bernaVecums);
//        boolean isEligibleToVote = vecums >= 18;
//        System.out.println("Vai cilvēks drīkst balsot? " + isEligibleToVote);
//
//String name = "Dace";
//String nameTwo = "Dace";
//        System.out.println(name.equals(nameTwo));
//        System.out.println(true!=false);
//
//        System.out.println("Ievadi x");
//        int x = scanner.nextInt();
//        boolean vaiIrPatiess = (x<5 && x<10);
//        System.out.println(vaiIrPatiess);
//        System.out.println(x<5 || x<10);
//
//        int a = 10;
//        int b = 20;
//        int c = 20;
//        int d =0;
//        System.out.println(a < b && b == c);
//        System.out.println(a > b || b == c);
//        System.out.println(!(a > b));
//
//

//        summa = c + d;
//        System.out.println(String.format("%s, %s + %s = %s", tavsVards, c,d,summa));


//        System.out.println("Šī ir otrā Javas lekcija");
//        String teksts;
//        String name = "Dace";
//        teksts = String.format("Mani sauc %s", name);
//
//        System.out.println(teksts);
//
//        double a = 100.25;
//        int b = 10;
//
//        //System.out.println("a-b = " + (b / a));
//        System.out.println(String.format("%.2f",(b / a)));
//
//String surname = "Mušperte";
//        String role = "Students";
//        double videjaAtzime = 7.3214;
//
//        String concatTeikums = "Mani sauc " + name + " Mans uzvārds ir " + surname + " Es esmu " + role;
//        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana vid atz ir %.1f",name,surname,role,videjaAtzime);
//
//        System.out.println(teikums);
//        System.out.println(concatTeikums);

        int q = 10;

        if (q > 0){
            System.out.println("Skaitlis ir lielāks par 0");
        }

        int cilvekaVecums=65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums=='V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if(dzimums=='S' && cilvekaVecums>=60){
            drikstDoties=true;
        }

        System.out.println("Cilveks drikst doties pensija " + drikstDoties);

int diena = 7;
switch (diena){
    case 1:
        System.out.println("Pirmdiena");
        break;
    case 2:

}


int skaitlisX = 20;
if(skaitlisX%2==0){
    System.out.println("Skaitlis ir pāra");
}else{
    System.out.println("Skaitlis ir nepāra");
}



    }
}
