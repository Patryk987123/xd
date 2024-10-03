public class Main {
    public static void main(String[] args) {
        //zad1
Dog dog = new Dog("Burek","bialy");
Cat cat = new Cat("Mruczek","brazowy");
    System.out.println(dog.makeSound());
    System.out.println(cat.makeSound());
        //zad2
        E e = new E();
    e.present("Super");
        //zad3
zad3 x = new zad3("x","y","xx",1,2);
        System.out.println(x.toString());
        // zad4
String[] book={"x","y","z","c","v"};
String[] bread={"x","y","z","c","v"};
Bakery bakery = new Bakery("a",2,book);
Bookshop bookshop = new Bookshop("a",2,bread);
System.out.println(bakery.getInformation());
System.out.println(bookshop.getInformation());
        //zad5
    }
}
