package JavaBasiku;

public class A14TernaryOperator {
    public static void main(String[] args) {
        //tenary operator moss hanesan operator simples husi if statment
        //nee terdiri husi kondisaun ne'ebe mak iha evaluasaun karik nia true mak
        // foti valor pertama karik false mak foti seluk

        //kode tanpan tenary operator
        var valor = 75;
        String liaMenon;
        if (valor>=75){
            liaMenon = "Congratulation!";
        }else {
            liaMenon = "Ita bo'ot hela naran!";
        }
        System.out.println(liaMenon);

        //kode ho tenary operator
        String lMenon= valor>=75 ? "Congratulation!" : "Ita bo'ot hela naran!" ;
        System.out.println(lMenon);
    }
}
