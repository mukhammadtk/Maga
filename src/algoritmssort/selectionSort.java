package Sort;

public class selectionSort {

        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Исходный массив:");
            printArray(arr);

            selectionSort(arr);

            System.out.println("Отсортированный массив:");
            printArray(arr);
        }

        // Метод для сортировки выбором
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Обмен значениями текущего элемента и минимального элемента
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        // Метод для печати массива
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


