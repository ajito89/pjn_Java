package JavaBasiku;

public class Break {
    public static void main(String[] args) {
        //break sei hapara hotu
        //continue sei hapara iha parte nee deit pois continua fali parte seluk

        //Kode : Break
        var counter =1;

        while (true){
            System.out.println("Perulangan ke-"+counter);
            counter++;

            if (counter>10){
                break;
            }
        }
    }
}
