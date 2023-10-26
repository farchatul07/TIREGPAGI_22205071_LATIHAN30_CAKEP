/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan30;
import java.util.Scanner;


/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini program Latihan30 yang berisi program untuk memastikan bahwa tugas yang diberikan telah dikerjakan dengan sendiri atau tidak
 */
public class Latihan30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\u001b[31m Kamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
        System.out.print("\u001b[34mJawab \u001b[31m(Yoi/Enggak) \u001b[0m: ");
        String jawab = scanner.next();
        if (jawab.equals("Yoi")) {
            System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
        }else {
            System.out.println("""
                               \n\u001b[31mTetep cakep sih.
                               \u001b[36mSing penting paham konsep nya yee.\u001b[0m""");
            System.out.println("Keep the code works dude");
        }
    }
}
