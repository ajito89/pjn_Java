package JavaBasiku;

public class A25RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(recursiveMethod(5));
        loop(10000);


    }
    //Kode : Factorial Loop
    static  int factorial(int value){
        var result =1;
        for (int i = 1; i<= value; i++){
            result *= i;
        }
        return result;
    }

    //RECURSIVE METHOD
    //Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow,
    // yaitu error dimana stack method terlalu banyak di Java
    static int recursiveMethod(int value){
        if (value == 1){
            return 1;
        }else {
            return value * recursiveMethod(value -1);
        }
    }

    //Kode : Error StackOverflow
    static void loop (int valor){
        if (valor==0){
            System.out.println("Hotu");
        }else {
            System.out.println("Loop - "+valor);
            loop(valor -1);
        }
    }
}
