/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Insere
 * @author      : Emiliano Costa
 * @date        : 13 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : CONCEITOS DE COMPUTAÇÃO COM O ESSENCIAL DE C++
 * Capitulo     : 1. Introdução 
 * Exercício    : P1.2
 *
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 2 Introdução aos aplicativos Java                                                                       
 * Figura 2.7   : Seção 2.5 Outra aplicação: adicionando inteiros                                                                                
 * ___________________________________________________________________________________________________________________
 * Descrição    :
 * 1-  Primeiro uso da declaração import java.util.Scanner - API JAVA
 * 2 - Demonstra o Objeto input da classe Scanner    
 * ___________________________________________________________________________________________________________________
 * Modificações :
 * ___________________________________________________________________________________________________________________
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package C3_Dialog;

import javax.swing.JOptionPane;



/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Insere {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    
    
    public static void inicio(){
        String entrada = JOptionPane.showInputDialog("Qual seu nome?"); 
        String saida = String.format("Bem vindo %s a aula de dialog.", entrada); 
        JOptionPane.showMessageDialog(null,saida);
    }
    
    /**Procedimento usa apenas uma linha de código para recebe um nome e exibir uma mensagem*/
    public static void nome(){

        JOptionPane.showMessageDialog(
            null,
            String.format(
                "Bem vindo %s a aula de dialog.",
                JOptionPane.showInputDialog("Qual seu nome?")));
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM::::::*/