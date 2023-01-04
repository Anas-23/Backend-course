package id.kawahedukasi;

import id.kawahedukasi.model.User;
import id.kawahedukasi.model.Account;
import id.kawahedukasi.model.Address;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        User user1 = new User("Anas", "Anas1234");
        Address address = new Address("Jalan Sawo", "Lubuk Raja", "Kab. OKU", "Sumatera Selatan");
        Account account = new Account("Anas", "Anas1234", "Anas Fatur Rahman", "anas@example.com", "1234567890", "01/01/2000", "Baturaja", address);
        // Verifikasi username dan password
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Username anda\t: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Masukkan Username anda\t: ");
        String inputPassword = scanner.next();

        user1.verifyUsername(inputUsername);
        user1.verifyPassword(inputPassword);
        System.out.println("======================================================");

        // Implement getter
        System.out.println("Username anda adalah\t: " + user1.getUsername());
        System.out.println("Password anda adalah\t: " + user1.getPassword());
        System.out.println("======================================================");
        System.out.println("Alamat dari " + account.getFullName() + " adalah\t: " + account.getAddress() + "\n");
        System.out.println("Email dari " + account.getFullName() + " adalah\t: " + account.getEmail() + "\n");
        System.out.println("Nomor Telepon dari " + account.getFullName() + " adalah\t: " + account.getPhoneNumber() + "\n");
        System.out.println("Tanggal lahir dari " + account.getFullName() + " adalah\t: " + account.getDob() + "\n");
        System.out.println("Tempat lahir dari " + account.getFullName() + " adalah\t: " + account.getPob() + "\n");

        // Implementasi setter
        // Ubah tempat lahir
        System.out.println("======================================================");

        account.setPob("Batumarta");
        System.out.println("Hasil perbaikan data : ");
        System.out.println("Tempat lahir dari " + account.getFullName() + " adalah\t: " + account.getPob() + "\n");
    }
}