package id.kawahedukasi;

import java.util.*;

public class MakeList{
    public static void main(String[] args) {
        // List 10 makanan
        List<String> makanan = List.of("sate", "bakso", "mie ayam", "seblak", "bubur", "pempek", "ayam goreng", "nasi", "pecel lele", "nasi goreng");
        System.out.println(makanan);

        // 3 Tahun Piala dunia
        List<String> worldCupYears = List.of("2014","2002","1998");
        System.out.println(worldCupYears);

        //Sort List of Province (Desc)
        List<String> province = new ArrayList<>();
        province.add("Aceh");
        province.add("Riau");
        province.add("Bangka Belitung");
        province.add("Sumatera Selatan");
        province.add("DKI Jakarta");
        province.add("Bali");
        province.add("Papua Barat");
        province.add("Kalimantan Selatan");
        province.add("Sulawesi Tenggara");
        province.add("Nusa Tenggara Barat");
        province.add("Nusa Tenggara Timur");
        Collections.sort(province, (a, b) -> b.compareTo(a));
        System.out.println(province);

        //remove data
        List<String> progLang = new ArrayList<>();
        progLang.add("C++");
        progLang.add("C");
        progLang.add("Python");
        progLang.add("Go");
        progLang.add("Scala");
        progLang.add("Ruby");
        progLang.add("Java");
        progLang.add("JavaScript");
        progLang.add("PHP");
        progLang.add("Perl");
        progLang.add("Swift");
        progLang.add("FORTRAN");
        System.out.println(progLang);

        progLang.remove("Swift");
        progLang.remove("C++");
        progLang.remove("Python");
        progLang.remove("Java");
        progLang.remove("C");
        System.out.println(progLang);


    }
}
