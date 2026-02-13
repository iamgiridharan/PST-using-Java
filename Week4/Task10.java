import java.util.*;

public class Task10 {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;

        for (int k = 0; k < layers; k++) {
            List<Integer> layer = new ArrayList<>();

            int top = k, bottom = m - k - 1;
            int left = k, right = n - k - 1;

            // 1. Top row
            for (int j = left; j <= right; j++)
                layer.add(matrix.get(top).get(j));

            // 2. Right column
            for (int i = top + 1; i <= bottom; i++)
                layer.add(matrix.get(i).get(right));

            // 3. Bottom row
            for (int j = right - 1; j >= left; j--)
                layer.add(matrix.get(bottom).get(j));

            // 4. Left column
            for (int i = bottom - 1; i > top; i--)
                layer.add(matrix.get(i).get(left));

            int len = layer.size();
            int rot = r % len;

            // Rotate layer
            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(layer.subList(rot, len));
            rotated.addAll(layer.subList(0, rot));

            int idx = 0;

            // Put back - Top row
            for (int j = left; j <= right; j++)
                matrix.get(top).set(j, rotated.get(idx++));

            // Right column
            for (int i = top + 1; i <= bottom; i++)
                matrix.get(i).set(right, rotated.get(idx++));

            // Bottom row
            for (int j = right - 1; j >= left; j--)
                matrix.get(bottom).set(j, rotated.get(idx++));

            // Left column
            for (int i = bottom - 1; i > top; i--)
                matrix.get(i).set(left, rotated.get(idx++));
        }

        // Print result
        for (List<Integer> row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        matrixRotation(matrix, r);
        sc.close();
    }
}
