/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   DrawPanelTest
 * @author      :   Emiliano Costa
 * @date        :   16 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   Estudo de caso de GUIs e imagens gráficas
 * Seção        :   4.15 Estudo de caso de GUIs e imagens gráficas: criando desenhos simples
 * Descrição    :   TestDrive para os aplicativos
 * ___________________________________________________________________________________________________________________
 * Comentários  :   ERRO : não esta aparecendo o desenho das linhas no painel
 *                  SOLUÇÃO: nome de método (paintComponent) na classe DrawPanel estava com grafia errada
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

package C4_DrawPanel;

import java.awt.Color;
import javax.swing.JFrame;


public class DrawPanelTest{
   
    public static void inicio(){
 
        /*cria um painel que contém nosso desenho*/
        DrawPanel panel = new DrawPanel();
        
        /*cria um novo quadro para armazenar o painel*/
        JFrame app = new JFrame();
        
        panel.setBackground(Color.YELLOW);
        
        app.setTitle("Painel desenhando duas linha que se cruzam");
        
        /*configura o frame para ser encerrado quando ele é fechado*/
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*adiciona o painel ao frame*/
        app.add(panel);
        
        /*configura o tamanho do frame*/
        app.setSize(300, 300);
        
        /*torna o frame visível*/
        app.setVisible(true);
        
    }
    
    public static void exer_01(){
        DrawPanel1 panel = new DrawPanel1();
        JFrame app = new JFrame();

        panel.setBackground(Color.CYAN);
        
        app.setTitle("Linhas que se estendem a partir de um canto");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);    
    }
    
    public static void exer_02(){
        
        DrawPanel2 panel = new DrawPanel2();
        JFrame app = new JFrame();
        
        panel.setBackground(Color.GREEN);

        app.setTitle("Desenhando de linhas com loops e drawline.");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/