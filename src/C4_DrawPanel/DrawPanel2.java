/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   DrawPanel2
 * @author      :   Emiliano Costa
 * @date        :   16 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição.                                                             
 * Capitulo     :   Estudo de caso de GUIs e imagens gráficas.
 * Seção        :   4.15 Estudo de Caso de GUI e imagens gráficas: criando desenhos simples.
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Exercício 4.2 (descrição no fim do arquivo).
 * ___________________________________________________________________________________________________________________
 * Comentários  :   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


package C4_DrawPanel;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel2 extends JPanel{
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth(); //Largura total
        int height = getHeight(); //altura total
        int passos = 15;
        for (int cont = 0; cont < passos; cont++){
            //g.drawLine(y0,x0,yf,xf);
            g.drawLine(0, height * cont/passos, width * cont / passos, height);
            g.drawLine(width * cont / passos,height, width, height * (passos-cont)/passos);
            g.drawLine(width, height * (passos-cont)/passos, width -(width * cont / passos),0 );
            g.drawLine(width * (passos - cont )/passos, 0, 0, height * cont/passos);
        }
    }
}

/**A Figura 4.21. 
Exibe dois projetos adicionais criados utilizando-se loops while e drawLine.
a) Crie o projeto na captura de tela da esquerda na Figura 4.21. 
Comece dividindo cada borda em um número igual de incrementos (escolhemos 15 novamente). 
A primeira linha inicia no canto superior esquerdo e termina um passo à direita na extremidade inferior. 
Para cada linha sucessiva, move-se para baixo um incremento na borda esquerda e um incremento para a direita na borda 
inferior. Continue desenhando linhas até alcançar o canto inferior direito. 
A figura deve ser dimensionada à medida que você redimensiona a janela, de modo que as extremidades sempre toquem as 
bordas.
b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura de 
tela da direita na Figura 4.21*/
