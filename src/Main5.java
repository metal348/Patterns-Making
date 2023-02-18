import java.util.Scanner;

class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String input = sc.nextLine();
        for(int i = 0; i<input.length()-1;i++){
            char c = input.charAt(i);
            AllPattern a1 = new AllPattern();
            switch(c){
                case 'A':
                a1.displayA(c);
                break;
                case 'B':
                a1.displayB(c);
                break;
                case 'C':
                a1.displayC(c);
                break;
                case 'D':
                a1.displayD(c);
                break;
                case 'E':
                a1.displayE(c);
                
            }
        }
    }
}