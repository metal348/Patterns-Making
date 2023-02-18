
import java.util.Scanner;

class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String input = sc.nextLine();
        FirstLine f1 = new FirstLine(input);
        System.out.println();
        SecondLine f2 = new SecondLine(input);
        System.out.println();
        ThirdLine f3 = new ThirdLine(input);
        System.out.println();
        FourthLine f4 = new FourthLine(input);
        System.out.println();
        FifthLine f5 = new FifthLine(input);
        System.out.println();
        SixthLine f6 = new SixthLine(input);
        System.out.println();
        LastLine f7 = new LastLine(input);
        System.out.println();
    }
}