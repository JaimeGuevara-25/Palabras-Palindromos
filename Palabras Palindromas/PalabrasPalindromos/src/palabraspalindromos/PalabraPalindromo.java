package palabraspalindromos;

import java.util.Scanner;

public class PalabraPalindromo {
    public void inicio(){
        boolean negacion=false;
        while(!negacion){
            Scanner teclado= new Scanner(System.in);
            String nuevo;
            PalindromoBean objclass=new PalindromoBean();
            System.out.println("Ingresa la palabra");
            nuevo = teclado.nextLine();
            if(objclass.espalindromo(nuevo)){
                System.out.println("Palindromo");
            }
            else{
                System.out.println("No Palindromo");
            }
        }
    }
}
