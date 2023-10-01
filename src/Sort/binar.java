package Sort;

public class binar {
    public class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {11, 12, 22, 25, 34, 64, 90};
            int target = 25; // Значение, которое мы ищем

            int result = binarySearch(arr, target);

            if (result != -1) {
                System.out.println("Элемент " + target + " найден по индексу " + result);
            } else {
                System.out.println("Элемент " + target + " не найден в массиве.");
            }
        }

        // Метод для бинарного поиска
        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Вычисляем средний индекс

                if (arr[mid] == target) {
                    return mid; // Найдено значение, возвращаем индекс
                }

                if (arr[mid] < target) {
                    left = mid + 1; // Искать в правой половине
                } else {
                    right = mid - 1; // Искать в левой половине
                }
            }

            return -1; // Элемент не найден
        }


        }
    }


