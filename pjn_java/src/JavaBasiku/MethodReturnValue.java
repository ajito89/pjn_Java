package JavaBasiku;

public class MethodReturnValue {
    public static void main(String[] args) {

        var result1 = soma(100, 100);
        System.out.println(result1);
        System.out.println(soma(200,200));

        var result2 = konta(100,"+",75);
        System.out.println(result2);

    }

    static int soma(int value1, int value2){
        var total=value1 + value2 ;
        return total;
    }

    static int konta (int value1, String operasi, int value2){
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-":
                return value1 -value2;
            default:
                return 0;
        }
    }
}
