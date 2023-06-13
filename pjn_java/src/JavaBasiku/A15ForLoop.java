package JavaBasiku;

public class A15ForLoop {
    public static void main(String[] args) {
        //For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        //Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi

        //for(init statement; kondisi; post statement){
        //   // block perulangan
        //}
        //Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        //Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
        //Post statement akan dieksekusi setiap kali diakhir perulangan
        //Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true

        //example perulangan tampa henti
        //for (;;){
        //    System.out.println("Perulan nunka mais para!");
        //}

        //perulangan dengan kondisaun
        var counte = 1;
        for (; counte <= 10 ;){
            System.out.println("Perulangan ke-"+ counte);
            counte++;
        }

        //Perulangan Dengan Init Statement
        for (var counter = 1; counter <= 10 ;){
            System.out.println("Per ke-"+ counter);
            counter++;
        }

        //Perulangan Dengan Post Statement
        for (var counter = 1; counter <= 10 ;counter++){
            System.out.println("Perulang ke-"+ counter);
            System.out.println(counter);
        }
        System.out.println("Counte"+ counte);


    }
}
