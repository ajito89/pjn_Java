package JavaBasiku;

import java.util.Scanner;

public class A23MethodVariableArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input auto
        //int[] valor = new int[]{scanner.nextInt()};
        int[] valor = new int[6]; // Create an array of size 6
        for (int i = 0; i < 6; i++) {
            valor[i] = scanner.nextInt(); // Read each input integer and assign it to the array element
        }
        //input manual
        //int[] valor = {70,80,90,60,100,58};
        sayCongrats("Ajito",valor);

        sayCongtas1("Kharu", 69,67,76,87,97,56,87);

    }


    //tampa variable argument array
    static void sayCongrats(String names, int[] valor){
        int total = 0;
        for(var value : valor){
            total +=value;
        }
        int finalValue= total / valor.length;
       // System.out.println(finalValue);

        if (finalValue>=75){
            System.out.println("Congratulation "+ names + " ita nia valor media "+ finalValue + " ita bo'ot Liu!");
        } else {
            System.out.println("Deskulpa "+ names + " ita nia valor media "+ finalValue + " ita bo'ot la Liu!");
        }
    }

    //with variable argument array
    //diferencia hare iha int...
    static void sayCongtas1(String nama, int... nilai){
        int total = 0;
        for (var value : nilai){
            total += value;
        }
        int valorFinal=total / nilai.length;


        if (valorFinal>=75){
            System.out.println("Congratulation "+ nama + " ita nia valor media "+ valorFinal + " ita bo'ot Liu!");
        }else{
            System.out.println("Deskulpa "+ nama + " ita nia valor media "+ valorFinal + " ita bo'ot la Liu!");
        }
    }
}
