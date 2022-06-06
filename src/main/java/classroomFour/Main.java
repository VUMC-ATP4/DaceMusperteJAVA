package classroomFour;

public class Main {
    public static void main(String[] args) {
        // objekts viens
        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela";

        // objekts divi
        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Ģertrūdes iela";

        majaViens.printetAdresi();
        majaDivi.printetAdresi();

//        majaDivi.ielasNosaukums = "Izmainīts ielas nosaukums";
//        majaDivi.printetAdresi();

        majaViens.istabuSkaits = 4;
        majaViens.stavuSkaits = 1;
        majaViens.platiba = 100;
        majaViens.irStavvieta = true;
        majaViens.ieejuSkaits = 1;
        Cena cena1 = new Cena();
        cena1.cena=30000;
        cena1.valuta = '$';
        majaViens.cena = cena1;


        majaDivi.stavuSkaits = 3;
        majaDivi.istabuSkaits =4 ;
        majaDivi.irStavvieta = false;
        majaDivi.platiba=400;
//        majaDivi.cena = 10000;
//        majaDivi.valuta = '€';


        majaViens.printetAdresi();
        majaViens.printetParejoInfo();

        majaViens.printetAdresi();
        majaViens.printetVisu();

        majaDivi.printetAdresi();
//        majaDivi.printetVisu();


        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips = "Disku";
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.atrums);

        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        System.out.println("Priekšā ir gājējs!");
        velosipeds1.bremze();
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir = " + velosipeds2.atrums);

        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);
        System.out.println("Priekšā ir gājējs!");
        velosipeds2.bremze();
        velosipeds2.bremze();
        System.out.println("Velosipēda 2 ātrums ir = " + velosipeds2.atrums);

//        Car masina = new Car();
//        masina.marka = "Audi";
//        masina.gads = 2021;
//        masina.krasa = "sarkana";

        Car masina = new Car("Opel", 1990, 200000, 500);
        masina.printetAuto();


        System.out.println(masina.marka);
        System.out.println("Auto marka " + masina.marka +
                ", izlaiduma gads " + masina.gads + ", krāsa " + masina.krasa +
                ", ātrumkārba " + masina.atrumKarba + " un gadu veca: " + masina.cikGaduVeca());

        Velosipeds[] velo = {new Velosipeds(), new Velosipeds()};

        Rinkis rinkis1 = new Rinkis(5.34);

        Rinkis rinkis2 = new Rinkis();
        rinkis2.radiuss = 15.30;

        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());

        System.out.println(rinkis1.diametrs());
        System.out.println(rinkis2.diametrs());

    }
}
