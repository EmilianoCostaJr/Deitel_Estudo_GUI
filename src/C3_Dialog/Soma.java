/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Soma
 * @author      :   Emiliano Costa
 * @date        :   20 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Modifique o programa de adição na Figura 2.7 para utilizar entrada e saída baseadas em caixas de 
                    diálogo com os métodos da classe JOptionPane. 
                    Uma vez que o método showInputDialog retorna uma String, você deve converter a String que o usuário 
                    insere em um int para utilização em cálculos. 
                    O método static parseInt da classe Integer (pacote java.lang) recebe um argumento String que 
                    representa um inteiro e retorna o valor como um int. 
                    Se a String não contiver um inteiro válido, o programa terminará com um erro.
                    Soma dois números inteiros e mostra o resultado
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package C3_Dialog;

import javax.swing.JOptionPane;

/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM IMPORTS::::::::*/


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Soma {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

    
    /**Procedimento que soma dois numeros e mostra resultado*/
    public static void inicio(){
    /*Exercicio Exercicio do estudo de caso 3.6*/
        int iParcela1, iParcela2;/*2coisas*/
        JOptionPane.showMessageDialog(null, "Soma dois inteiros");
        iParcela1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));/*2 coisas*/
        iParcela2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));/*2 coisas*/
        JOptionPane.showMessageDialog(null, String.format("Soma = %d", iParcela1 + iParcela2));/*3 coisas*/
    }
    
    /**Cada linha de instrução fazendo somente um coisa!*/
    public static void somaDialog2(){
        int iParcelaUm;
        int iParcelaDois;
        int iSoma;/*extra, uma coisa a mais*/
        String sMensagemDialog;/*extra, uma coisa a mais*/
        JOptionPane.showMessageDialog(null, "Soma dois inteiros");
        sMensagemDialog = JOptionPane.showInputDialog("Digite um numero inteiro");
        iParcelaUm = Integer.parseInt(sMensagemDialog);
        sMensagemDialog = JOptionPane.showInputDialog("Digite um numero inteiro");
        iParcelaDois = Integer.parseInt(sMensagemDialog);
        iSoma = iParcelaUm + iParcelaDois;
        sMensagemDialog = String.format("Soma = %d", iSoma);
        JOptionPane.showMessageDialog(null,sMensagemDialog);
}

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

