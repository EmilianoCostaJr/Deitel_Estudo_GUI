/**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ShapesBarras
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
class ShapesBarras extends JPanel
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
{

    private final int barra1;
    private final int barra2;
    private final int barra3;
    private final int barra4;
    private final int barra5;
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Construtor:::::::::*/
    public ShapesBarras(int barra1, int barra2, int barra3, int barra4, int barra5)
    {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.barra3 = barra3;
        this.barra4 = barra4;
        this.barra5 = barra5;
    }
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Métodos:::::::::*/
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int largura = getWidth();
        int altura = getHeight();
        g.drawRect(largura / 10, (altura / 100)*5 ,(largura / 20)* this.barra1,altura /10);
        g.drawRect(largura / 10, (altura / 100)*25, (largura / 20)* this.barra2,altura /10);
        g.drawRect(largura / 10, (altura / 100)*45, (largura / 20)* this.barra3,altura /10);
        g.drawRect(largura / 10, (altura / 100)*65, (largura / 20)* this.barra4,altura /10);
        g.drawRect(largura / 10, (altura / 100)*85, (largura / 20)* this.barra5,altura /10);
    }
    
}/*Fim classe ShapesBarras*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
