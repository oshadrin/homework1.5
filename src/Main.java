public class Main {
    public static void main(String[] args) {
    task1_2_3_4();
    }
    public static void task1_2_3_4() {
//task1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        int[] arr3 = new int[2];
        arr3[0] = 4;
        arr3[1] = 5;
//task2
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }
        for (int d = 0; d < arr3.length; d++) {
            if (d < arr3.length - 1) {
                System.out.print(arr3[d] + ", ");
            } else {
                System.out.println(arr3[d]);
            }
        }
//task3
        for (int k = arr.length - 1; k >= 0; k--) {
            if (k > 0) {
                System.out.print(arr[k] + ", ");
            } else {
                System.out.println(arr[k]);
            }
        }
        for (int l = arr2.length - 1; l >= 0; l--) {
            if (l > 0) {
                System.out.print(arr2[l] + ", ");
            } else {
                System.out.println(arr2[l]);
            }
        }
        for (int s = arr3.length - 1; s >= 0; s--) {
            if (s > 0) {
                System.out.print(arr3[s] + ", ");
            } else {
                System.out.println(arr3[s]);
            }
        }
//task4
        for(int c = 0; c < arr.length; c++) {
            if (arr[c] % 2 != 0) {
                arr[c] = arr[c] +1;
            }
            System.out.print(arr[c] + " ");
        }
    }
}