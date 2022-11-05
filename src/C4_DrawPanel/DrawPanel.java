/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   DrawPanel
 * @author      :   Emiliano Costa
 * @date        :   16 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   Estudo de caso de GUIs e imagens gráficas
 * Seção        :   4.15 Estudo de Caso de GUI e imagens gráficas: criando desenhos simples
 * ___________________________________________________________________________________________________________________
 * Descrição    :   figura 4.18 Utilizando DrawLine para conectar os cantos de um painel.
 * ___________________________________________________________________________________________________________________
 * Comentários  :   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package C4_DrawPanel;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

   /**Procedimento usa drawLine.
    para desenhar um X a partir dos cantos do painel*/
    public void paintComponent(Graphics g){
        
        /*chama paintComponent para assegurar que o painel é exibido corretamente*/
        super.paintComponent(g);
        
        int width = getWidth(); //Largura total
        int height = getHeight(); //altura total
       
        /*desenha uma linha a partir do canto superior esquerdo até o inferior direito*/
        g.drawLine(0, 0, width, height);
        
        /*desenha uma linha a partir do canto inferior esquerdo até o superior direito*/
        g.drawLine(0, height, width,0 );
    }
}