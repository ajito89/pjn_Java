package JavaBasiku;

public class WhileLoop {
    public static void main(String[] args) {
        //While loop adalah versi perulangan yang lebih sederhana dibanding for loop
        //Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement
        var valor =1;

        while (valor<=10){
            System.out.println("while"+valor);
            valor++;
        }

        //Do While Loop
        do {
            System.out.println("do While" +valor);
            valor++;
        }while (valor<=20);

    }
}
