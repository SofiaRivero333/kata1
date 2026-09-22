package software.ulpgc.kata;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sofia", 20);

        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
        System.out.println("Adulto: " + person.adult());

    }

}
