package classroomFourClass;

public class Rinkis {

    final double PI = 3.14;
        double radiuss = 4;

        Rinkis(){
            System.out.println("Veidoju riņķi ....");
        }

        Rinkis(double radiuss){
            this.radiuss = radiuss;
        }


        public double rinkaLaukums(){
            return PI * (radiuss * radiuss);
        }

        public double diametrs(){
            return radiuss *2;
        }

    }
