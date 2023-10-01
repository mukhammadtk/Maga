package Sort;

public class insertionSort {

        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Исходный массив:");
            printArray(arr);

            insertionSort(arr);

            System.out.println("Отсортированный массив:");
            printArray(arr);
        }

        // Метод для сортировки вставками
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                // Сдвигаем все элементы, которые больше key, на одну позицию вправо
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                // Вставляем key на правильное место
                arr[j + 1] = key;
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


