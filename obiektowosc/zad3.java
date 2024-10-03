public class zad3 {
    public String name;
    public String surname;
    public String occupation;
    public int age;
    public int number;

    public zad3(String name, String surname, String occupation, int age, int number) {
        this.name = name;
        this.surname = surname;
        this.occupation = occupation;
        this.age = age;
        this.number = number;
    }
@Override
    public String toString(){
        return "Name: "+name+" Surname: "+surname+" Occupation: "+occupation+" Age: "+age+" number: "+number;

    }
}
