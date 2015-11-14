/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senhaforte;

/**
 *
 * @author gabriel.tormin
 */
public class SenhaForte 
{
    private String senha;
    
    public SenhaForte(String senha) 
    {
        this.senha = senha;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    
    /**
     * funcao que verifica se a senha e forte ou nao
     * 
     * @return um booleano indicando se a senha e forte (true) ou nao (false)
     */
    
    boolean verificarSenhaForte()
    {
        /**
         * verificar se a senha tem pelo menos 8 caracteres
         */
        if(this.senha.length() < 8)
        {
            System.out.println("Tem menos de 8 caracteres!");
            return false;
        }
            
       
        /**
         * verificar se a senha tem ao menos um caractere numérico
         */
        if(verificaCaractereNumerico(this.senha))
        {
            System.out.println("A senha nao possue digito NUMERICO!");
            return false;
        }
            
        
        /**
         * verificar se a senha tem ao menos um caractere maiúsculo
         */
        if(verificaCaractereMaiusculo(this.senha))
        {
            System.out.println("A senha não possue caractere MAIUSCULO!");
            return false;
        }
        
        /**
         * verificar se a senha tem ao menos um caractere minúsculo
         */
        if(verificaCaractereMinusculo(this.senha))
        {
            System.out.println("A senha não possue caractere MINUSCULO!");
            return false;
        }    
              
        
        /**
         * verificar se a senha tem ao menos um caractere de pontuação
         */
        if(!verificaCaracterePontuacao(this.senha))
        {
            System.out.println("A senha não possue caractere de PONTUAÇÃO!");
            return false;
        }
        
        /**
         * verificar se a senha representa uma data
         */
        if(verificaSenhaIgualData(this.senha))
        {
            System.out.println("A senha não pode ser igual a uma DATA!");
            return false;
        }
        
        /**
         * verificar se a senha é simples
         */
        if(verificaSenhaSimples(this.senha))
        {
            System.out.println("A senha não pode ser SIMPLES!");
            return false;
        }
                
        /**
         * Se passou por todos os pre-requisitos entao a senha e forte
         */
        return true;
    }
    
    /**
     *  Funcao que verifica se existe pelo menos um caractere numerico na senha
     * 
     * @param senha
     * @return 
     */
    boolean verificaCaractereNumerico(String senha)
    {
       /**
        *   verifica se NAO tem digito numerico
        *   caso NAO possua digito numerico retorna true
        */
       return senha.matches( "[^0-9]+" );
    }
    
     /**
     *  Funcao que verifica se existe pelo menos um caractere maiusculo na senha
     * 
     * @param senha
     * @return 
     */
    boolean verificaCaractereMaiusculo(String senha)
    {
        /**
         *  verifica se NAO tem caractere maiusculo
         *  caso NAO possua caractere maiusculo retorna true
         */
        return senha.matches( "[^A-Z]+" );
    }
    
     /**
     *  Funcao que verifica se existe pelo menos um caractere minusculo na senha
     * 
     * @param senha
     * @return 
     */
    boolean verificaCaractereMinusculo(String senha)
    {
        /**
         *  verifica se NAO tem caractere minusculo
         *  caso NAO possua caractere minusculo retorna true
         */ 
        return senha.matches( "[^a-z]+" );
    }
    
     /**
     *  Funcao que verifica se existe pelo menos 
     *  um caractere de pontuacao na senha
     * 
     * @param senha
     * @return 
     */
    boolean verificaCaracterePontuacao(String senha)
    {
        /**
         *  verifica se tem caractere de pontuacao
         *  caso possua caractere de pontuacao retorna true
         */
        return senha.matches( "([a-zA-Z0-9]*\\p{Punct}+[a-zA-Z0-9]*)+" );
    }
    
     /**
     *  Funcao que verifica se a senha e igual a uma data
     * 
     * @param senha
     * @return 
     */
    boolean verificaSenhaIgualData(String senha)
    {
        /**
         *  estruturas de data:
         *  dd/mm/aaaa , dd/mm/aa , dd-mm-aaaa , dd-mm-aa , 
         *  dd-mm/aaaa , dd/mm-aa , dd/mm-aaaa , dd-mm/aa , 
         */
        return senha.matches( "([a-zA-Z0-9\\p{Punct}]*[0-3][0-9](/|-)[0-1][0-9](/|-)[1-2]?[0-9]?[0-9][0-9][a-zA-Z0-9\\p{Punct}]*)+" );
    }
    
     /**
     *  Funcao que verifica se a senha e simples, ou seja, 
     *  se a senha data e igual a algumas senhas simples pre-definidas
     *  em um array
     * 
     * @param senha
     * @return 
     */
    boolean verificaSenhaSimples(String senha)
    {
        /**
         *  algumas senhas foram colocadas como exemplo...mas esse array poder
         *  preenchido com quantas senhas 'faceis' forem necessarias
         */
        String[] senhaSimples = {"Eu<3Modular", "Senha-01", "Senha-123", "P@ssw0rd"};
        
        for (String senhaSimp : senhaSimples)
        {
            /**
             *  compara a senha digitada pelo usuario com
             *  todas as senhas dentro do array senhaSimples até encontrar
             *  uma igual
             */
            if (senha.compareTo(senhaSimp) == 0)
            {
                /**
                 *  se a senha digitada pelo usuario estiver contida
                 *  no array senhaSimples e retornado o valor true
                 */
                return true;
            }
        }
        
        return false;
    }   
    
}
