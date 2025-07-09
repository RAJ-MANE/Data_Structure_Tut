import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] onearray = new int[4];
        int[][] twoarray = new int[3][3];

        System.out.println("Enter elements for one D array");
        for (int i = 0; i < 4; i++) {
            onearray[i] = sc.nextInt();
        }

        System.out.println("One D array elements are:");
        for (int i = 0; i < 4; i++) {
            System.out.println(onearray[i]);
        }

        System.out.println("Enter elements for two D array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoarray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Two D array elements are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoarray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

