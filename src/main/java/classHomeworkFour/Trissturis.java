package classHomeworkFour;
import static java.lang.Math.sqrt;


public class Trissturis {
    public static void main(String[] args) {

        Trissturis trissturis1 = new Trissturis();

        System.out.println("=========================================");

        Trissturis trissturis2 = new Trissturis(10, 10, 10);
        System.out.println(trissturis2.laukums());

        System.out.println("=========================================");

        System.out.println(vaiIrVienadmalu());

        System.out.println("=========================================");

        System.out.println(vaiIrVienadsanu());

        System.out.println("=========================================");



    }

    int mala1;
    int mala2;
    int mala3;

    double laukums;

    Trissturis() {
        System.out.println("Veidoju trīsstūri");
        }

    Trissturis(int mala1, int mala2, int mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;

        System.out.println("Mala 1 ir: " + mala1 + " , mala 2 ir: " + mala2 + " , mala3 ir: " + mala3);
        }

    public double laukums(){
            double pusePerimetra = (mala1 + mala2 + mala3)/2;
            System.out.println("Trīsstūra laukums ir: ");
            return laukums = Math.sqrt(pusePerimetra *(pusePerimetra - mala1) * (pusePerimetra - mala2) * (pusePerimetra - mala3));
             }

 static boolean vaiIrVienadmalu(){
       int mala1 = 10;
       int mala2 = 10;
       int mala3 = 10;
       if (mala1 == mala2 && mala2 == mala3){
           return true;
           }
           else{
               return false;
           }

   }

    static boolean vaiIrVienadsanu(){
        int pirmaMala = 6;
        int otraMala = 7;
        int tresaMala = 8;
        if ((pirmaMala == otraMala && otraMala != tresaMala) ||
                (pirmaMala == tresaMala && otraMala != tresaMala) ||
                (otraMala == tresaMala && pirmaMala != tresaMala)){
            return true;
        }
        else{
            return false;
        }

    }



    }