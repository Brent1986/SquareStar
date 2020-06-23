public class SquareStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }
        int startRow = 1;
        while (startRow <= number){
            int startCol = 1;
            while (startCol <= number){
                if (startRow == 1 || startRow == number){
                    System.out.print("*");
                } else if (startCol == 1 || startCol == number){
                    System.out.print("*");
                } else if (startRow == startCol){
                    System.out.print("*");
                } else if (startCol == ((number - startRow)+1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                startCol ++;
            }
            startRow ++;
            // Skip to new line
            System.out.println();
        }
    }
}
