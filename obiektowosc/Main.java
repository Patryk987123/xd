import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       //zad1
            Kwadrat kwadrat = new Kwadrat(9);
            System.out.println("Obwod:" + kwadrat.obwod());
            System.out.println("Pole:" + kwadrat.pole());

       //zad2
       Punkt punkt1=new Punkt(3, 4);
       Punkt punkt2=new Punkt(5, 6);
       System.out.println(punkt1.odleglosc(2,5));
       System.out.println(punkt2.odleglosc(punkt1));

       //zad3
       Wiatrak wiatrak = new Wiatrak();
       System.out.println(wiatrak.informacje());

       //zad4
       Konto[] konta = new Konto[10];
       for (int i=0;i<10;i++) {
           konta[i] = new Konto(i+1,100);
       }
       Bankomat bankomat=new Bankomat(konta);
       bankomat.uruchom();
        }
    }
    