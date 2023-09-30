package algoritms;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int num[] = {1, 3, 0, 7, 4, 5, 6};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                    sorted = false;
                }
            }
        }

            System.out.println(Arrays.toString(num));
        }
    }

