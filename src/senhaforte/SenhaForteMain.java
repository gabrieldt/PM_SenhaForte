/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senhaforte;

import java.util.Scanner;

/**
 *
 * @author gabriel.tormin
 */
public class SenhaForteMain 
{ 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner entrada = new Scanner( System.in );
        String senha;
        SenhaForte senhaF;
        
        System.out.println("### VERIFICAR SENHA FORTE ###");
        System.out.println("Digite a senha a ser verificada: ");
        senha = entrada.nextLine();
        
        senhaF = new SenhaForte(senha);
        
        if(senhaF.verificarSenhaForte())
        {
            System.out.println("A senha é forte!");
        }
        else
        {
            System.out.println("A senha não é forte!");
        }
            
    }
    
    
    
}
