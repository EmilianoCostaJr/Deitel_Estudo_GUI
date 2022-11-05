/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Insere
 * @author      : Emiliano Costa
 * @date        : 13 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings                                                                       
 * Figura 3.13  :   NameDialog.Java                                                                               
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Obtendo a entrada de usuário a partir de um diálogo.   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

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