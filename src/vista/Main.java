/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Usuario[] listaUsuarios=new Usuario[2];
        int n=0;
        Scanner es=new Scanner(System.in);
        Usuario objeto0=new Usuario();
        Usuario objeto1=new Usuario("Gaby","Valladares", 'G', "Ibarra", "gvalladares@ist17dejulio.edu.ec");
        Usuario objeto2=new Usuario("Gaby","Valladares", 'G', "Ibarra", "gvalladares@ist17dejulio.edu.ec");
        Usuario objeto3=new Usuario("Gaby","Valladares", 'G', "Ibarra", "gvalladares@ist17dejulio.edu.ec");
        Usuario objeto4=new Usuario("Gaby","Valladares", 'G', "Ibarra", "gvalladares@ist17dejulio.edu.ec");
        Usuario objeto5=new Usuario("Gaby","Valladares", 'G', "Ibarra", "gvalladares@ist17dejulio.edu.ec");
   
         for (int i = 0; i < listaUsuarios.length; i++) {
             Usuario objeto=new Usuario(es.next(), es.next(), es.next().charAt(0), es.next(), es.next());
             listaUsuarios[i]=objeto;
            objeto.imprimirVoid();
             String resultado=objeto.imprimir();
             if(!resultado.isEmpty()){
                 System.out.println("*****"+resultado.charAt(1));
             }
             System.out.println("---RESULTADO----"+resultado);
        }
    
    }
}
