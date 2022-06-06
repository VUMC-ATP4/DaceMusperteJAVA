package classroomFour;

import java.time.LocalDate;

public class Car {
    String marka;
    String krasa;
    int gads;
    String atrumKarba = "manuālā";
    int nobraukums;
    int cena;



    public void info(){
        System.out.println("Auto marka " + marka +
                ", izlaiduma gads " + gads + ", krāsa " + krasa +
                ", ātrumkārba" + atrumKarba);
    }

    public double cikGaduVeca(){
        LocalDate date = LocalDate.now();
        return (date.getYear() - gads);

    }

    public void printetAuto() {
        System.out.println("Automašīnas marka ir " + marka + ", tās izlaides gads ir " + gads + " ,nobraukums ir "
                + nobraukums + " un cena ir " + cena + "un gadu veca " + cikGaduVeca());
    }

    Car(String marka, int gads, int nobraukums, int cena){
        this.marka = marka;
        this.gads = gads;
        this.nobraukums = nobraukums;
        this.cena = cena;
    }



}
