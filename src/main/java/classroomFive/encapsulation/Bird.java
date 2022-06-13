package classroomFive.encapsulation;

public class Bird {
    private String colour;
    private String name = "Pollija";


    public void setColor(String colour) {
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void printText(){
        System.out.println("Šī ir publiska metode");
        System.out.println("Printēju putnu");
        printTextSpecial();
    }
    // public - varam piekļūt no citām klasēm

    private void printTextSpecial(){
        System.out.println("Šī ir privāta metode");
    }
// ja ir privāta metode, to nevar izsaukt no citas klases,
// tikai no šīs klases

    void defaultMethodExample(){
        System.out.println("Šī ir default metode");
    }
// varam piekļūt pakotnes ietvaros


}
