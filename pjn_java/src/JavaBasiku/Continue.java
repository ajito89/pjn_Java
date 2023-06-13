package JavaBasiku;

public class Continue {
    public static void main(String[] args) {
        for (var counter = 1 ; counter<=30 ; counter++){
            if (counter % 2 ==0){
                continue;
            }
            System.out.println("Perulan Ganjil= "+counter);
        }
    }
}
