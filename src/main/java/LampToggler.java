import java.sql.SQLOutput;
import java.util.Scanner;

public class LampToggler {

    public static void main(String[] args){
        Lamp lamp1 = new Lamp("Lampe 1");
        Lamp lamp2 = new Lamp("Lampe 2");
        Lamp lamp3 = new Lamp("Lampe 3");
        Lamp lamp4 = new Lamp("Lampe 4");
        Lamp lamp5 = new Lamp("Lampe 5");

        Lamp selectedLamp = null;

        Scanner scan = new Scanner(System.in);

        int valg = 0;

        do{
            System.out.println(lamp1);
            System.out.println(lamp2);
            System.out.println(lamp3);
            System.out.println(lamp4);
            System.out.println(lamp5);

            System.out.println("Hvilken lampe skal ændres? (0 = afslut)");

            if(scan.hasNextInt()){
                valg=scan.nextInt();
            } if (valg >0 && valg<=5){
                if(valg ==1){
                    selectedLamp = lamp1;
                }else if (valg ==2){
                    selectedLamp = lamp2;
                }else if (valg ==3){
                    selectedLamp = lamp3;
                } else if (valg == 4) {
                    selectedLamp = lamp5;
                }
                selectedLamp.toggle();
            }

        }while (valg != 0);
    }
}

