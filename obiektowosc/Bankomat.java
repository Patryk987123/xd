import java.util.Scanner;

public class Bankomat {
    private Konto[] konta;
    public Bankomat(Konto[] konta) {
        this.konta = konta;
    }

    public void uruchom() {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.print("Podaj id konta: ");
            int id=scanner.nextInt();
            Konto konto=konta[id-1]; 

            while(true){
                System.out.println("Menu główne");
                System.out.println("1: Sprawdź saldo");
                System.out.println("2: Wypłać");
                System.out.println("3: Wpłać");
                System.out.println("4: Wyjdź");
                System.out.print("Wybierz opcję: ");
                int wybor = scanner.nextInt();

                switch (wybor) {
                    case 1:
                        System.out.println("Saldo wynosi: "+konto.Check());
                        break;
                    case 2:
                        System.out.print("Podaj kwotę do wypłaty: ");
                        int wyplata=scanner.nextInt();
                        konto.wyplac(wyplata);
                        break;
                    case 3:
                        System.out.print("Podaj kwotę do wpłaty: ");
                        int wplata=scanner.nextInt();
                        konto.wplac(wplata);
                        break;
                    case 4:
                        System.out.println("Zmiana konta");
                        break;
                        
                }
                if (wybor==4) {
                    break;
                }
            }
        }
        }
    }
