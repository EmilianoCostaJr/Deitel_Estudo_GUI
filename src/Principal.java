/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Principal
 * @author      :   Emiliano Costa
 * @date        :   5 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   Estudo de caso de GUIs e imagens gráficas
 * Descrição    :   TestDrive para os aplicativos
 * ___________________________________________________________________________________________________________________
 * Commit       :   05 de nov. de 2022 >> Ok! projeto pronto para deslanchar
 *                  07 de nov. de 2022 >> Inclusão do capítulo 5
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


import C3_Dialog.BemVindo;
import C3_Dialog.Insere;
import C3_Dialog.Soma;
import C4_DrawPanel.DrawPanelTest;
import javax.swing.JOptionPane;

 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
/**Alterado no VisualCode*/
public class Principal {

    /**Procedimento principal que inicia e termina a aplicação*/
    public static void main(String[] args){
        choice(); 
    }/*FIM Método main()*/

    /**Procedimento drive conduz a execução do aplicativo escolhido*/
    public static void drive(int escolha){
        switch(escolha){
        case 31 -> BemVindo.inicio();
        case 32 -> Insere.inicio();
        case 33 -> Soma.inicio();
        case 40 -> DrawPanelTest.inicio();
        case 41 -> DrawPanelTest.exer_01();
        case 42 -> DrawPanelTest.exer_02();
        case 50 -> C5_Shapes.ShapesTest.figura_5_27();
        case 51 -> C5_Shapes.ShapesTest.exer_5_1();
        case 52 -> C5_Shapes.ShapesTest.exer_5_2();       
        default -> JOptionPane.showMessageDialog(null, "Houve erro na escolha");
        }
        choice();
        
    }/*FIM Método drive()*/


    public static void choice(){
        
        int seleciona;
        try {
            seleciona = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do exercício\n ou zero para sair"));
        } catch (Exception e) {
            seleciona = 0;
            String msg = String.format("Exception: %s%n", e.getMessage());
            JOptionPane.showMessageDialog(null,msg);
        }
        
        if(seleciona != 0)
            drive(seleciona);
        
        JOptionPane.showMessageDialog(null,"Encerrando o app");/*Alteração feita na WEB*/
    }/*FIM Método choice()*/

}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Principal*/

