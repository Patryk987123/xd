//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Dog dog = new Dog("Burek","bialy");
Cat cat = new Cat("Mruczek","brazowy");
E e = new E();
    System.out.println(dog.makeSound());
    System.out.println(cat.makeSound());
    e.present("Super");
zad3 x = new zad3("x","y","xx",1,2);
        System.out.println(x.toString());
String[] book={"x","y","z","c","v"};
String[] bread={"x","y","z","c","v"};
Bakery bakery = new Bakery("a",2,book);
Bookshop bookshop = new Bookshop("a",2,bread);
System.out.println(bakery.getInformation());
        System.out.println(bookshop.getInformation());
    }
}