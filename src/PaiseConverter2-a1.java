import java.util.Scanner;

class PaiseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price in rupees, like (13.46)\n> ");
        System.out.println("The price in paise: " + (int)Math.round(sc.nextDouble()*100));
    }
}
