import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int loopCount = sc.nextInt();
        sc.nextLine();

        String[] inputStrArr = new String[loopCount];

        int tanggal;
        int bulan;
        int tahun;
        int total = 0;
        int terjualBerapa;

        for(int i = 0; i < loopCount; i++) {
            inputStrArr[i] = sc.nextLine();
        }

        for(int i = 0; i < loopCount; i++) {

            try{
                tanggal = Integer.parseInt(inputStrArr[i].substring(0,2));
                bulan = Integer.parseInt(inputStrArr[i].substring(3,5));
                tahun = Integer.parseInt(inputStrArr[i].substring(6,10));
                terjualBerapa = Integer.parseInt(inputStrArr[i].substring(11,inputStrArr[i].length()-1));
            } catch (NumberFormatException e){
                tanggal = Integer.parseInt(String.valueOf(inputStrArr[i].charAt(0)));
                bulan = Integer.parseInt(String.valueOf(inputStrArr[i].charAt(2)));
                tahun = Integer.parseInt(inputStrArr[i].substring(4,8));
                terjualBerapa = Integer.parseInt(inputStrArr[i].substring(9,inputStrArr[i].length()-1));
            }

            switch (toLowerCase(inputStrArr[i].charAt(inputStrArr[i].length() - 1))) {
                case 'j' -> System.out.print(terjualBerapa + " Jaket\t");
                case 's' -> System.out.print(terjualBerapa + " Sneakers\t");
                case 't' -> System.out.print(terjualBerapa + " Topi\t");
                default -> {
                    terjualBerapa = 0;
                    System.out.print("Invalid\t");
                }
            }

            System.out.print(tanggal + " ");

            switch (bulan) {
                case 1 -> System.out.print("Januari");
                case 2 -> System.out.print("Februari");
                case 3 -> System.out.print("Maret");
                case 4 -> System.out.print("April");
                case 5 -> System.out.print("Mei");
                case 6 -> System.out.print("Juni");
                case 7 -> System.out.print("Juli");
                case 8 -> System.out.print("Agustus");
                case 9 -> System.out.print("September");
                case 10 -> System.out.print("Oktober");
                case 11 -> System.out.print("November");
                case 12 -> System.out.print("Desember");
            }
            System.out.println(" " + tahun);

            total += terjualBerapa;
        }
        System.out.printf("Total\t= %d barang\n",total);

    }
}