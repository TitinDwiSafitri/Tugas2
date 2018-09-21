/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syaratmenikah;

/**
 *
 * @author Titin
 */
public class SyaratMenikah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 21;
        String paras = "Cantik";
        String pendidikan = "Pintar";
            if (umur >=20 && umur<=23 && paras == "Cantik" && pendidikan == "Pintar"){
                System.out.println("Pasti Mau !");    
            }
            else if (umur >= 20 && umur<=23 && (paras == "Cantik" && pendidikan == "Gak Pintar")){
                System.out.println("OK lah");
            }
            else if (umur >23 && (paras == "Cantik" && pendidikan == "Gak Pintar")){
                System.out.println("Saya Pikir Dulu");
            }
            else{
                System.out.println("No Way ");
            } 
                
    }
    }
    
}
