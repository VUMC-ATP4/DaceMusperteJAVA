package classroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Animal dog2 = new Dog(4, "Lesija");
        Octopus octopus1 = new Octopus(8, "Astoņkājis");
        Chicken chicken1 = new Chicken(2, "Baltā vista");
        Chicken chickenWithOneLeg = new Chicken(1, "Melnā vista");

//  dog1.legCount = 4;
//  octopus1.legCount = 8;
//  nav nepieciešams, jo konstruktorā tiek padotas šīs vērtības

        dog1.printLegCount();
        octopus1.printLegCount();
        chicken1.printLegCount();
        chickenWithOneLeg.printLegCount();

        dog1.printAnimal();
        octopus1.printAnimal();
        chicken1.printAnimal();
        chickenWithOneLeg.printAnimal();

        System.out.println(octopus1.waterType);
        octopus1.printWaterType();


        Fox lapsa = new Fox("Kūmiņš", 4);


// Masīvs =  int[]ieluNumuri = {1,2,3,4,5,6,7}
        Animal [] dzivnieki = {dog1, octopus1, chicken1, chickenWithOneLeg};

        for (int i = 0; i < dzivnieki.length; i++) {
            dzivnieki[i].printAnimal();
        }

        dog1.makeSound();
        chicken1.makeSound();
        octopus1.makeSound();




    }

}
