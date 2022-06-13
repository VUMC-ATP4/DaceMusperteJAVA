package classroomFive.inheritance;

public class Animal {
    int legCount;
    String name;

    Animal(int legCount, String name){
        this.legCount = legCount;
        this.name = name;
    }

    public void printLegCount(){
        System.out.println("Kāju skaits ir: " + legCount);
    }

    public void printAnimal(){
        System.out.println("Dzīvnieka vārds ir " + name + ". Kāju skaits ir: " + legCount);
    }

    public void makeSound(){
    System.out.println("Es esmu dzīvnieks. Ahgrrrh...");
}






}
