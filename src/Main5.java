import java.util.Scanner;

class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String input = sc.nextLine();
        for(int i = 0; i<=input.length()-1;i++){
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
                break;
                case 'F':
                a1.displayF(c);
                break;
                case 'G':
                a1.displayG(c);
                break;
                case 'H':
                a1.displayH(c);
                break;
                case 'I':
                a1.displayI(c);
                break;
                case 'J':
                a1.displayJ(c);
                break;
                case 'K':
                a1.displayK(c);
                break;
                case 'L':
                a1.displayL(c);
                break;
                case 'M':
                a1.displayM(c);
                break;
                case 'N':
                a1.displayN(c);
                break;
                case 'O':
                a1.displayO(c);
                break;
                case 'P':
                a1.displayP(c);
                break;
                case 'Q':
                a1.displayQ(c);
                break;
                case 'R':
                a1.displayR(c);
                break;
                case 'S':
                a1.displayS(c);
                break;
                case 'T':
                a1.displayT(c);
                break;
                case 'U':
                a1.displayU(c);
                break;
                case 'V':
                a1.displayV(c);
                break;
                case 'X':
                a1.displayX(c);
                break;
                case 'Y':
                a1.displayY(c);
                break;
                case 'Z':
                a1.displayZ(c);
                break;


                
            }
        }
    }
}