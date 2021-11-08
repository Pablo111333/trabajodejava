/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadecontactostrabajo;
import java.util.Scanner;
/**
 *
 * @author Seba
 */
public class Agendadecontactostrabajo {
    public static void Datospersonales(String nom,String apell,String edad, String hobbie,String editordecodigo,String sistemaoperativo){
        
        System.out.println("Tu nombre es:" +nom);
        System.out.println("Tu apellido es:" +apell);
        System.out.println("Tu edad es:" +edad);
        System.out.println("Hobbie=" +hobbie);
        System.out.println("Editor de codigo preferido" +editordecodigo);
        System.out.println("Sistema operativo:" +sistemaoperativo);
    }

   
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
         
       String nom,apell,edad,hobbie,editordecodigo,sistemaoperativo;
   
          
       System.out.println("Ingrese su nombre:");
       nom=sc.nextLine();
       System.out.println("Ingrese su apellido:");
        apell=sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad= sc.nextLine();
        
        System.out.println("Hobbie:");
         hobbie=sc.nextLine();
       System.out.println("Editor de codigo preferido?");
       editordecodigo=sc.nextLine();
      System.out.println("Sistema operativo :");
      sistemaoperativo=sc.nextLine();
       
    
      Datospersonales(nom,apell,edad,hobbie,editordecodigo,sistemaoperativo);
        
    
         
         }
    
}
