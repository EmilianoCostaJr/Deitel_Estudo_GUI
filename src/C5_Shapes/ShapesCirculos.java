/**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ShapesCirculos
 * @author      :   Emiliano Costa
 * @date        :   9 de abr. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   5 - Instruções de Controle Parte 2       
 * Seção        :   5.11 (Opcional) Estudo de caso de GUIs e imagens gráficas: desenhando retângulos e ovais
 * ...................................................................................................................
 * Descrição    :   
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package C5_Shapes;

import java.awt.Graphics;
import javax.swing.JPanel;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class ShapesCirculos extends JPanel
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
{

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int largura = getWidth();
        int altura = getHeight();
        
        /*Dezenha os circulos*/
        for (int i = 0; i < 12; i++)
        {
            g.drawOval(largura/2 - i*10, altura/2 - i*10,  10+ i*20,10 + i * 20);
        }

    }

}
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
