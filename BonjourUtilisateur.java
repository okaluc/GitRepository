/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bonjourutilisateur;
import java.util.Scanner;
import java.util.*;


/**
 *
 * @author nausiluke
 */
public class BonjourUtilisateur {

    /**
     * @param args the command line arguments
     */
    String nom="";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.println("entrez votre nom: ");
        String str = sc.nextLine();
        System.out.println("bonjour "+str+" soyez la bienvenue ");
        
      
        
    }
    
}
