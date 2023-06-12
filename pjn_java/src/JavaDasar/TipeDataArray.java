package JavaDasar;

public class TipeDataArray {
    public static void main(String[] args) {
        //mak hanesan type data ne'ebe ninia laran kompostu husi tipe data ne'ebe hanesan
        //total iha array labele iha mudansa ba primeiru ne'ebe ita halo
        //ezemplu
        String[] stringArray; //array ho tipe data string ho nia variable stringArray
        stringArray = new String[3];
        stringArray[0]= "Ajito";
        stringArray[1]= "Nelson";
        stringArray[2]= "Lucio";
        //stringArray[4]= "Kharu"; //sei error tamba index hamutuk 3 deit

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //halo array no direitamente hatama nia valor
        //Array initializer
        int[] arrayInt = new    int[]{
                10,11,12,13,14,15
        };

        long[] arrayLong = new long[]{
                212313,313131,141434,1435241,34142543,67587454,353342,31314532
        };
        System.out.println(arrayLong[1]);

        String[] naranAjito = new String[]{
                "Ajito", "Nelson","Lucio", "daCosta"
        };

        //atu hatene array niania naruk bele uja hanesan
        System.out.println(naranAjito.length);
        System.out.println(naranAjito[0]);

        //laiha hamo'os data iha array tamba panjang array udah fix
        //ita so bele troka deit exempplu
        naranAjito[0]= null;
        System.out.println(naranAjito[0]);

        //
        arrayLong[1]= 0;
        System.out.println(arrayLong[1]);


        //array iha array ida nia laran
        //exemplu
        String [][] membruSira= {
                {"Ajito", "Nelson", "Lucio"},
                {"Kharu", "Malay"},
                {"Da", "Costa"}
        };
        System.out.println(membruSira[0][2]);

    }
}
