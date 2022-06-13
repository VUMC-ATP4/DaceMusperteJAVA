package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Bird putns = new Bird();
//        putns.color = "Zila";

//        System.out.println(putns.name);
//        nevar izmantot, nevar izmainīt, nevar piekļūt no citas klases, jo private

        putns.printText();
//      putns.printTextSpecial(); nevar izsaukt, jo privāta metode
        putns.defaultMethodExample();

        Human cilveks = new Human();
        cilveks.setAge(20);
        System.out.println(cilveks.getAge());
        cilveks.setName("Dace");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Mušperte");
        System.out.println(cilveks.getSurname());
        cilveks.setHeight(1.70);
        System.out.println(cilveks.getHeight());

        Matematika matematika = new Matematika();
        System.out.println(matematika.add(30,20));
        System.out.println(matematika.add(1.3, 3.5));

        matematika.paraditTekstu("Juris",true);
        matematika.paraditTekstu("Anna",false);





    }
  }
