package classHomeworkFour;

import static classHomeworkFour.Trissturis.vaiIrVienadmalu;
import static classHomeworkFour.Trissturis.vaiIrVienadsanu;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturis1 = new Trissturis();
        trissturis1.mala1 = 6;
        trissturis1.mala2 = 7;
        trissturis1.mala3 = 8;
        System.out.println("Mala 1 ir: " + trissturis1.mala1 + " , mala 2 ir: " + trissturis1.mala2 + " , mala3 ir: " + trissturis1.mala3);
        System.out.println(trissturis1.laukums());

        System.out.println("=========================================");

        System.out.println(vaiIrVienadmalu());

        System.out.println("=========================================");

        Trissturis trissturis2 = new Trissturis(10, 10, 10);
        System.out.println(trissturis2.laukums());

        System.out.println("=========================================");

        System.out.println(vaiIrVienadmalu());

        System.out.println("=========================================");

        System.out.println(vaiIrVienadsanu());

        System.out.println("=========================================");

    }

}
