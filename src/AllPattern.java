class AllPattern{
    void displayA(char c){

    }
    void displayB(char c){
        
    }
    void displayC(char c){
        
    }
    void displayD(char c){
        
    }
    void displayE(char c){
        int size = 7; // adjust the size of the pattern as needed
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == size / 2) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}