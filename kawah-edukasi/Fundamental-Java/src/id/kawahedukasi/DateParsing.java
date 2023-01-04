package id.kawahedukasi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateParsing {
    public static void main(String[] args){
        String tanggal = "12 December 2022";
        LocalDate firstDate = LocalDate.parse(tanggal,DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        String firstOutput = firstDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Format awal tanggal adalah : "+tanggal);
        System.out.println("Format tanggal setelah diubah : "+firstOutput);
        System.out.println("==============================================");
        String tanggalWaktu = "20221112_091112";
        LocalDateTime secondFormat = LocalDateTime.parse(tanggalWaktu,DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String secondOutput = secondFormat.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Format awal tanggal adalah : "+tanggalWaktu);
        System.out.println("Format tanggal setelah diubah : "+secondOutput);
        System.out.println("==============================================");
        LocalDateTime currentTime = LocalDateTime.now();
        String output = currentTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
        System.out.println("Tanggal sekarang adalah : "+ output);
        LocalDateTime kadalwarsa = currentTime.plusYears(1);
        kadalwarsa = kadalwarsa.plusMonths(6);
        kadalwarsa = kadalwarsa.plusDays(12);
        kadalwarsa = kadalwarsa.plusHours(3);
        kadalwarsa = kadalwarsa.plusMinutes(12);
        kadalwarsa = kadalwarsa.plusSeconds(20);
        String outputKadalwarsa = kadalwarsa.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Tanggal kadalwarsa adalah : "+ outputKadalwarsa);

    }
}
