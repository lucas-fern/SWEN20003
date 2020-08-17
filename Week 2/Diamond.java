public class Diamond {

    int size;

    public Diamond(int size) {this.size = size/2;}

    public void setSize(int size) {
        this.size = size/2;
    }

    public void printDiamond() {
        int i, k, space;

        for (i = 1; i <= size; i++) {
            k = 0;
            for (space = 1; space < size - i + 2; space++) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("#");
                k++;
            }
            System.out.println();
        }

        while (i > 0) {
            k = 0;
            for (space = 1; space <= size - i + 1; space++) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("#");
                k++;
            }

            System.out.println();
            i--;
        }
    }

    public void printDiamond(int size) {
        this.size = size;
        printDiamond();
    }
}