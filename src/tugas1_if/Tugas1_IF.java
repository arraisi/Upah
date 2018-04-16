/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_if;

import java.util.Scanner;

/**
 *
 * @author arrai
 */
public class Tugas1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugas1_IF baca = new Tugas1_IF();
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String Nama = input.next();
        System.out.println("Base Pay : ");
        int Upah = input.nextInt();
        System.out.println("Jam Kerja : ");
        int JamKerja = input.nextInt();
        
        BasePay(Upah);
        
        if(JamKerja < 40){
            int x = Upah * JamKerja;
            System.out.println("Upah = " + x);
        }
        if(JamKerja > 40 && JamKerja <= 60){
            double x = (40*Upah)+((JamKerja-40) * (1.5+Upah));
            System.out.println("Upah : " + x);
        }
        if(JamKerja > 60){
            System.out.println("Salah");
        }
// TODO code application logic here
    }
    public static void BasePay(int Nilai){
        if(Nilai < 8000){
            System.out.println("Hasil : 0");
        }
    }
    //public static void JamKerja(int Nilai){
        //if(Nilai > 40){
            //int x = Upah * 1.5;
            //System.out.println("Upah = ");
             
        //}
    //}
}
