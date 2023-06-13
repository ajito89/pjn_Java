package JavaBasiku;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Ajito");
        sayHello("Kharu", "Dacosta");

    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String fistName){
        System.out.println(fistName);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println(firstName +" "+ lastName);
    }
}
