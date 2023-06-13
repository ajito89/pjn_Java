package JavaBasiku;

public class A12IfStatement {
    public static void main(String[] args) {
        var valor = 10;
        var absensia = 75;

        //if Statement
        if (valor>=75 && absensia >= 75){
            System.out.println(" Ita bo'ot liu!");
        }

        //else Statement
        if (valor>=80 && absensia >= 75){
            System.out.println(" Ita bo'ot liu!");
        } else {
            System.out.println("Bele koko iha Tinan oin!");
        }

        //else if statement
        if (valor>=80 && absensia >= 75){
            System.out.println(" Ita bo'ot liu!");
        } else if (valor>=70 && absensia >= 70) {
            System.out.println("Ita bo'ot badinas uituan");
        }else if (valor>=50 && absensia >= 50)
        {
            System.out.println("Ita bo'ot baruk te'en");
        }else {
            System.out.println("Hare'e toba tiha");
        }
    }
}
