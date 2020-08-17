public class Week2Triangles {
    public static void main(String[] args) {

        final int triangleSize = 5;
        int i, j;

        for (i = 1; i <= triangleSize; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}