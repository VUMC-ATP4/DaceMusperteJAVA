package clasroomFive.statika;

public class Main {
    public static void main(String[] args) {
        clasroomFive.statika.Car auto1 = new clasroomFive.statika.Car("BMW","melns");

        System.out.println("Auto skaits sistēmā:" + auto1.countOfCarsCreatedInSystem);
        System.out.println("Auto skaits sistēmā:" + clasroomFive.statika.Car.countOfCarsCreatedInSystem);

        clasroomFive.statika.Car auto2 = new clasroomFive.statika.Car("Mercedes", "balts");
        System.out.println("Auto skaits sistēmā:" + auto1.countOfCarsCreatedInSystem);
        clasroomFive.statika.Car auto3 = new clasroomFive.statika.Car("Mercedes", "balts");
        System.out.println("Auto skaits sistēmā:" + auto3.countOfCarsCreatedInSystem);
        auto1.klasesApraksts = "šī ir auto klase";
        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + clasroomFive.statika.Car.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName() + clasroomFive.statika.Car.klasesApraksts);
        auto2.klasesApraksts = "šī ir auto klaseXXXXXXXX";
        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + clasroomFive.statika.Car.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName() + auto2.klasesApraksts);
        clasroomFive.statika.Car.makeSound();
        auto1.makeSound();
        auto2.makeSound();
    }
}