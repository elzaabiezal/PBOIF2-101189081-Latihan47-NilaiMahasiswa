/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Program ini berisi program untuk menampilkan Nilai
 */
public class PBOIF210119081Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        int quis,uts,uas;
        
        System.out.print("QUIZ\t:");
        quis = scanner.nextInt();
        System.out.print("QUIZ\t:");
        uts = scanner.nextInt();
        System.out.print("QUIZ\t:");
        uas = scanner.nextInt();
        
        nilai.setQuis(quis);
        nilai.setUts(uts);
        nilai.setUas(uas);
        System.out.println();
        System.out.println("Nilai Akhir\t:" + nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas()));
        System.out.println();
        System.out.println("Index = " + nilai.menentukanIndex(nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas())));
        System.out.println("Ketarangan =" + nilai.menentukanKeterangan(nilai.menentukanIndex(nilai.hitungNilaiAkhir(nilai.getQuis(), nilai.getUts(), nilai.getUas()))));
        
    }
    
}
    

