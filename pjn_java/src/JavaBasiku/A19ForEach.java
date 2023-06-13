package JavaBasiku;

public class A19ForEach {
    public static void main(String[] args) {

        //Kadang kita biasa mengakses data array menggunakann perulangan
        //Mengakses data array menggunakan perulangan sangat bertele-tele,
        // kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat

        //Namun untungnya, di Java terdapat perulangan for each,
        // yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis
        String[] names={
                "Ajito", "Nelson", "Lucio",
                "Kharu", "da", "Costa"
        };

        //Kode : Tanpa For Each
        for (int i =0 ; i< names.length ; i++){
            System.out.println(names[i]);
        }

        System.out.println("---------");

        //Kode : With For Each
        for (var value : names){
            System.out.println(value);
        }
    }
}
