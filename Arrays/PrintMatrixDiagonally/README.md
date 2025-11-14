#Link
https://leetcode.com/discuss/post/391708/google-phone-screen-print-matrix-diagona-3iy5/

# Print Matrix Diagonally

This program prints a given 2D matrix diagonally. It works for both **rectangular** and **jagged arrays**.

## Problem Statement

Given a 2D matrix (possibly jagged), print its elements **diagonally** starting from the first column of each row and then from the last row's remaining columns.

### Example Input (Jagged Array)

```
4
1 2 3 4
5
6 7
8 9 0
```

### Example Output

```
1 5 6 8 2 7 9 3 0 4
```

## Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][];

        // Input the matrix (supports jagged array)
        for (int i = 0; i < row; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            arr[i] = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                arr[i][j] = Integer.parseInt(parts[j]);
            }
        }

        // Print diagonals starting from first column of each row
        for (int i = 0; i < row; i++) {
            if (i == row - 1) {
                for (int j = 0; j < arr[i].length; j++) {
                    printDiagonal(i, j, arr);
                }
                break;
            }
            printDiagonal(i, 0, arr);
        }
    }

    static void printDiagonal(int row, int col, int[][] arr) {
        int i = row, j = col;
        while (i >= 0) {
            if (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
            }
            i--;
            j++;
        }
        System.out.println();
    }
}
```

## How It Works

1. Read the number of rows.
2. Read each row and store in a jagged array.
3. For each row (except the last), start printing diagonals from column 0.
4. For the last row, start printing diagonals from every column.
5. The `printDiagonal` function prints elements along the diagonal moving **upwards in rows and right in columns**.

## Notes

* Supports both **rectangular** and **jagged** arrays.
* Handles multiple spaces between numbers.
* Efficiently prints all diagonals without extra space.
