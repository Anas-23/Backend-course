package id.kawahedukasi;

import java.util.Scanner;

public class InputOutputVariable {
    public static void main(String[] args) {

        Scanner myName = new Scanner(System.in);
        System.out.print("Silakan tulis nama anda : ");

        String NamaUser = myName.next();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + NamaUser);
        System.out.println("==================================");
        Short satu, dua;
        satu = 1;
        dua = 2;
        char a, b;
        a = 'a';
        b = 'b';
        Boolean T, F;
        T = true;
        F = false;
        System.out.println("Berikut adalah tipe data short : ");
        System.out.println("satu = " + satu + " ; dua = " + dua);
        System.out.println("Berikut adalah tipe data char : ");
        System.out.println("a = " + a + " ; b = " + b);
        System.out.println("Berikut adalah tipe data boolean : ");
        System.out.println("T = " + T + " ; F = " + F);
        System.out.println("==================================");
        String variabelSatu = "Saya senang ";
        String variabelDua = "belajar ";
        String variabelTiga = "Java Language";
        String mergeVariabel = variabelSatu + variabelDua + variabelTiga;

        System.out.printf(mergeVariabel);
    }
}
