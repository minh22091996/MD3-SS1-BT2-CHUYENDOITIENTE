import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner resul = new Scanner(System.in);
        System.out.println("nhap tien usd");
        double usd = resul.nextDouble();
        double vnd = usd * 25000;
        System.out.println(usd + "usd se bang " + vnd + "vnd" );
    }
}
