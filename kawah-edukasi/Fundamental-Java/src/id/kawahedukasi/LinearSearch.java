package id.kawahedukasi;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        int size = arr.length;
        int i = 0;
        Scanner inputkey = new Scanner(System.in);
        System.out.println("Masukkan key yang ingin anda cari : ");
        int key = inputkey.nextInt();
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Ketemu di index " + i);
                break;
            }
        } if (i == size) {
            System.out.println("Tidak ketemu");
        }
    }
}
