package classroomFive.inheritance;

public class Fox {
    String name;
    int legCount;

    public Fox(String name, int legCount) {
        this.name = name;
        this.legCount = legCount;
    }

    public void printAnimal(){
        System.out.println("Dzīvnieka vārds ir " + name + ". Kāju skaits ir: " + legCount);
    }

}
