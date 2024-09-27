/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_pantalla_de_inicio;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_15_PANTALLA_DE_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //constantes 
        final String USUARIO = "Admin";//PERMITE SI EL USUARIO ESTE BIEN
        final String CONTRASEÑA = "Admin";
        //final double PI = 3.1416;
        
        String usuario;
        String contraseña;
         Scanner captu = new Scanner(System.in);
         
         System.out.println("Escribir tu nombre de usuario");
         usuario = captu.nextLine();
         System.out.println("Escribir tu contraseña porfa");
         contraseña = captu.nextLine();
        //COMO CALIADAMOS EL ACCESO?
        if (usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA)){
             System.out.println("ACCESO PERMITIDO FLAC");
        }else{
             System.out.println("ACCESO DESNEGADO NO ERES FLAC");
         }
    }
    
}
