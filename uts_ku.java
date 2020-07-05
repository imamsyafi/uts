/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201146_uts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author N
 */
public class uts_ku {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Scanner asd = new Scanner (System.in);
                int atm = 0;
        
        String nama;
        
        System.out.println("Masukkan nama anda !");
            nama=scan.nextLine();
        System.out.println("Masukkan nomer tujuan anda !");
           int nomer =scan.nextInt();
        System.out.println("Masukkan jumlah uang yang akan di kirim !");
           int uang=scan.nextInt();
        System.out.println("Pilih bank yang akan di transfer : "
                + "\n 1.BRI "
                + "\n 2.Mandiri "
                + "\n 3.BNI "
                + "\n 4.Bank Jatim "
                + "\n 5.BCA");
        System.out.print("ketik angka : "); 
        atm = scan.nextInt();
            
        switch(atm){       
            case 1 : 
                System.out.println("Nama pengirim : "+nama);
                System.out.println("Anda menggunakan bank : BRI");
                System.out.println("Jumlah uang yang dikirim : "+uang);
                boolean running = true;
                String jawab;
                int counter = 0;
            
          while (running) {
              System.out.println("apakah anda ingin  memesan rujak cingur?");
              System.out.println("jawab [iya / tidak]");
                            
              jawab = scan.nextLine();
              
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter++;
          }
                System.out.println("anda telah melakukan transfer sebanyak " + counter + " kali");
            break;
            case 2 : 
                System.out.println("Nama pengirim : "+nama);
                System.out.println("Anda menggunakan bank : Mandiri");
                System.out.println("Jumlah uang yang dikirim : "+uang);
                boolean running1 = true;
                String jawab1;
                int counter1 = 0;
            
          while (running1) {
              System.out.println("apakah anda ingin  memesan rujak cingur?");
              System.out.println("jawab [iya / tidak]");
                            
              jawab = scan.nextLine();
              
        if (jawab.equalsIgnoreCase("tidak") ){
            running1 = false;
        }
        counter1++;
          }  
                System.out.println("anda telah melakukan transfer sebanyak " + counter1 + " kali");
                break;
            case 3 : 
                System.out.println("Nama pengirim : "+nama);
                System.out.println("Anda menggunakan bank : BNI");
                System.out.println("Jumlah uang yang dikirim : "+uang);
                boolean running2 = true;
                String jawab2;
                int counter2 = 0;
            
          while (running2) {
              System.out.println("apakah anda ingin  memesan rujak cingur?");
              System.out.println("jawab [iya / tidak]");
                            
              jawab = scan.nextLine();
              
        if (jawab.equalsIgnoreCase("tidak") ){
            running2 = false;
        }
        counter2++;
          }  
                System.out.println("anda telah melakukan transfer sebanyak " + counter2 + " kali");
                break;
            case 4 : 
                System.out.println("Nama pengirim : "+nama);
                System.out.println("Anda menggunakan bank : Bank Jatim");
                System.out.println("Jumlah uang yang dikirim : "+uang);
                boolean running3 = true;
                String jawab3;
                int counter3 = 0;
            
          while (running3) {
              System.out.println("apakah anda ingin  memesan rujak cingur?");
              System.out.println("jawab [iya / tidak]");
                            
              jawab = scan.nextLine();
              
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter3++;
          }  
                System.out.println("anda telah melakukan transfer sebanyak " + counter3 + " kali");
                break;
            case 5 : 
                System.out.println("Nama pengirim : "+nama);
                System.out.println("Anda menggunakan bank : BCA");
                System.out.println("Jumlah uang yang dikirim : "+uang);
                boolean running4 = true;
                String jawab4;
                int counter4 = 0;
            
          while (running4) {
              System.out.println("apakah anda ingin  memesan rujak cingur?");
              System.out.println("jawab [iya / tidak]");
                            
              jawab = scan.nextLine();
              
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter4++;
          }  
                System.out.println("anda telah melakukan transfer sebanyak " + counter4 + " kali");
                break; 
                default:
                    
        }System.out.println("~ Silahkan periksa saldo anda kembali ~");
    }   
}
