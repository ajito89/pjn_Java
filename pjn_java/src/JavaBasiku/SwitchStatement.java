package JavaBasiku;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //switch hanesan ho if maieb nia lebih sederhana
        //ne'e uza deit ba samadengan perbandingan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hatama Valor Exemplu:A, B, C, D or E favor ho letra bo'ot");
        var valor = "A";
        String liaMenon = null;
        //String valor = scanner.nextLine();
        switch (valor){
            case "A":
                System.out.println("MUITO BOM");
                break;
            case "B":
            case "C":
                System.out.println("BOM");
                break;
            case "D":
                System.out.println("Ezame Ulan");
                break;
            default:
                System.out.println("Ita bo'ot kreditu ezame fali iha tinan oin !");
        }

        //iha java versaun 14 ba leten ita bele uza switch lambda hodi labele hakerek tan break
        switch (valor) {
            case "A" -> System.out.println("MUITO BOM");
            case "B", "C" -> System.out.println("BOM");
            case "D" -> System.out.println("Ezame Ulan");
            default -> System.out.println("Ita bo'ot kreditu ezame fali iha tinan oin !");
        }

        //Switch tampa yeld hanesan iha leten ne'e ita print out tuir tui karik ita hakarak print ne'e rai iha buat ruma
        //ida ne'e manual
        switch (valor) {
            case "A" -> liaMenon = "MUITO BOM";
            case "B", "C" -> liaMenon = "BOM";
            case "D" -> liaMenon = "Ezame Ulan";
            default -> liaMenon = "Ita bo'ot kreditu ezame fali iha tinan oin !";
        }
        System.out.println(liaMenon);

        //iha jva foun 14 ke atas iha ona kata yeld ne'ebe ita bele uza hanesan tuir mai ne'e
       var v = "B";
        String lMenon =  switch (v) {
           case "A" :
               yield "MUITO BOM";
           case "B", "C" :
               yield "BOM";
           case "D" :
               yield "Ezame Ulan";
            default:
                //throw new IllegalStateException("Unexpected value: " + v);
                yield "Tian oin yeah";
        };
        System.out.println(lMenon);
    }
    
}
