/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senhaforte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
     
/**
 *
 * @author bsiccet
 */
public class TestaSenhaForte 
{
    @Test
    public void testSenhaForte()
    {
        SenhaForte senha = new SenhaForte("Senha5!kd");
        
        assertTrue(senha.verificarSenhaForte()); 
        
        senha.setSenha("senha");
        assertFalse(senha.verificarSenhaForte());
        
        senha.setSenha("sQs28-10-1992");
        assertFalse(senha.verificarSenhaForte());
        
        senha.setSenha("28/10/1992Ta");
        assertFalse(senha.verificarSenhaForte());
        
        senha.setSenha("W28-10/1992s");
        assertFalse(senha.verificarSenhaForte());
        
        senha.setSenha("Eu<3Modular");
        assertFalse(senha.verificarSenhaForte());
        
        senha.setSenha("Senha-123");
        assertFalse(senha.verificarSenhaForte());
        
        senha.setSenha("jeR4ja!kw");
        assertTrue(senha.verificarSenhaForte());
        
        senha.setSenha("senha28129832J!");
        assertTrue(senha.verificarSenhaForte());
        
        senha.setSenha("Ja7&kaji");
        assertTrue(senha.verificarSenhaForte());
        
        senha.setSenha("3ja$ja93lE");
        assertTrue(senha.verificarSenhaForte());
        
        senha.setSenha("8u47#Kla");
        assertTrue(senha.verificarSenhaForte());
        
        senha.setSenha("iekk7&3laK");
        assertTrue(senha.verificarSenhaForte());
        
        senha.setSenha("837ja7*KIs");
        assertTrue(senha.verificarSenhaForte());
        
    }
       
}
