package id.kawahedukasi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operator {
        public static void main(String[] args){
            Scanner inputUser;
            Float phi, r, p, l, t, luasLingkaran, volumeBalok;
            inputUser = new Scanner(System.in);
            //Luas Lingkaran
            System.out.println("===== PERHITUNGAN LUAS LINGKARAN =====");
            System.out.print("Masukkan nilai jari-jari lingkaran (m): ");
            r = inputUser.nextFloat();
            phi = 3.14f;
            luasLingkaran = phi*r*r;
            System.out.println("Luas lingkaran adalah = "+luasLingkaran+" m^2");

            //Volume Balok
            System.out.println("===== PERHITUNGAN VOLUME BALOK =====");
            System.out.print("Masukkan nilai panjang (m): ");
            p = inputUser.nextFloat();
            System.out.print("Masukkan nilai lebar (m): ");
            l = inputUser.nextFloat();
            System.out.print("Masukkan nilai tinggi (m): ");
            t = inputUser.nextFloat();
            volumeBalok = p*l*t;
            System.out.println("Volume balok adalah = "+volumeBalok+" m^3");
            System.out.println("=============================================");
            System.out.println("PROGRAM PERSYARATAN PENDAFTARAN KAWAH EDUKASI ");
            System.out.print("Masukkan usia anda : ");
            Integer age = inputUser.nextInt();
            Boolean isAge = (age >= 17 && age <= 27);
            System.out.println("Apakah usia anda sesuai dengan persyaratan? ");
            System.out.println(isAge);

            System.out.print("Masukkan Pendidikan terakhir anda (huruf kapital) : ");
            String edu = inputUser.next();
            Boolean isEdu = (edu.equals("SMA") ||edu.equals("SMK")|| edu.equals("D3") || edu.equals("D4")|| edu.equals("S1"));
            System.out.println("Apakah pendidikan anda sesuai dengan persyaratan? ");
            System.out.println(isEdu);

            System.out.print("Masukkan kesungguhan anda untuk belajar (y) : ");
            String commit = inputUser.next();
            Boolean isCommit = (commit.equals("y"));
            System.out.println("Anda siap untuk bersungguh-sungguh sesuai dengan persyaratan? ");
            System.out.println(isCommit);

            System.out.print("Masukkan kesediaan anda untuk bekerja di IT konsultan (y) : ");
            String available = inputUser.next();
            Boolean isAvail = (available.equals("y"));
            System.out.println("Anda berkomitmen bersedia kerja di IT konsultan sesuai dengan persyaratan? ");
            System.out.println(isAvail);
        }
}
