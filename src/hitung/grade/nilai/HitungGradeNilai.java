package hitung.grade.nilai;

import java.util.Scanner;

public class HitungGradeNilai {
    public static void main(String[] args) {
        // TODO code application logic here
  
        System.out.println("KODE MAHASISWA");
        System.out.println("Muhammad Rifki \t:1");
        System.out.println("Firmansyah \t:2");
        System.out.println("Darwati \t:3");
        
        Scanner cc=new Scanner (System.in);
        System.out.println("\nMasukkan kode mahasiswa");
        int nama  = cc.nextInt ();
        switch (nama){
            
            case 1 -> {
                System.out.println("Nama\t: Muhammad Rifki");
                System.out.println("Alamat\t: Palembang");
                System.out.println("Program\t: TI BILINGUAL B");
            }
            
            case 2 -> {
                System.out.println("Firmansyah");
                System.out.println("Alamat\t: Palembang");
                System.out.println("Program\t: Syariah");
            }
                
            case 3 -> {
                System.out.println("Nama\t: Darwati");
                System.out.println("Alamat\t: Palembang");
                System.out.println("Program\t: Ushuludin");
            }
                
            }
        //tambah daftar nilai supaya kita dapat mengimput data
        System.out.println("\nMasukkan nilai");
        int grade = cc.nextInt();
         
            if ((grade >=87) && (grade <=100)){
                System.out.println("predikat :A");
                System.out.println("Tetap pertahankan prestasimu ya nak!");
            }
            else if ((grade <87) && (grade >=76)){
                System.out.println("predikat :B");
            }
            else if ((grade <76)&&(grade >=66)){
                System.out.println("predikat :C");
            }
            else if((grade <66)&&(grade >=56)){
                System.out.println("predikat :D");
            }
            else if((grade <56)&& (grade >=46)){
                System.out.println("predikat :E");
            }
            else if((grade <=45) && (grade >=30)){
                System.out.println("Mohon maaf kamu harus mengulangi matakuliah tahun depan");
            }
            else {
                System.out.println("Hidupmu terlalu santai, harus banyak belajar lagi!");

        }
        
     
    }
    
}
