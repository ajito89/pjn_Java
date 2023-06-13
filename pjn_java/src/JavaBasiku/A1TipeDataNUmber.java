package JavaBasiku;

public class A1TipeDataNUmber {
    public static void main(String[] args) {
        //integer Number
        // byte, short, int, long
        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 1000000000;
        long iniLong =1000000000L;
        //iha java sira foun ne'e ita bele aumenya underscore hodi hafae exemplu
        long underscore =1_000_000;

        // floating point number
        //float and double
        float inifloat=10.10F;
        double iniDOuble=12.2424;

        //literals number
        //decimal, hexadecimal and binary
        int decimal=184040;
        int hexaDecimal=0xA132B; //aumenta 0x iha oin
        int binary=0b0101010101; //aumenta 0b iha oin

        //Konversi tipe data number
        //wedening custing (automatic): byte>short>int>long>float>double
        byte innibyte = 100;
        short inniShort=innibyte;
        int inniInt=inniShort;
        long inni=inniInt;
        float innifloat=inni;
        double innidou= innifloat;
        //Nurowimg casting (manual): double>float>long>int>short>byte
        //labele hnsan metode nee
        //float  inFLoat = innidou;
        float inFloat = (float) innidou;
        long inLong =(long) inFloat;
        int inInt=(int) inLong;
        short inShort=(short) inInt;
        byte inByte=(byte) inShort ;

        System.out.println(inByte);











    }
}
