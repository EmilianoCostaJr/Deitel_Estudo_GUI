/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   DrawPanel1
 * @author      :   Emiliano Costa
 * @date        :   16 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição.                                                             
 * Capitulo     :   Estudo de caso de GUIs e imagens gráficas.
 * Seção        :   4.15 Estudo de Caso de GUI e imagens gráficas: criando desenhos simples.
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Exercício 4.1 (descrição no fim do arquivo).
 * ___________________________________________________________________________________________________________________
 * Comentários  :   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


package C4_DrawPanel;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel1 extends JPanel{
    
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);

       int largura = getWidth(); //Largura total
        int altura = getHeight(); //altura total
        int passos = 10;
        
        for (int cont = 0; cont < passos; cont++){
            g.drawLine(0, 0, largura * cont / passos, altura * (passos-cont)/passos);
            g.drawLine(largura,0, largura -(largura * cont / passos), altura * (passos-cont)/passos);
            g.drawLine(0, altura, largura -(largura * cont / passos), altura * (passos-cont)/passos);
            g.drawLine(largura, altura, largura * cont / passos, altura * (passos-cont)/passos);
        }
    }
}

/**Exercício 4.1.
Utilizar loops e instruções de controle para desenhar linhas pode levar a muitos projetos interessantes.

a) Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior esquerdo, 
estendendo-as até que cubram a metade superior esquerda do painel. Uma abordagem é dividir a largura e altura em um 
número igual de passos (descobrimos que 15 passos funcionam bem). 
A primeira extremidade de uma linha sempre estará no canto superior esquerdo (0, 0).
A segunda extremidade pode ser encontrada iniciando no canto inferior esquerdo e movendo-se para cima em um passo 
vertical e para a direita em um passo horizontal. 

Desenhe uma linha entre as duas extremidades. Continue movendo-se para cima e para o passo à direita a fim de encontrar 
cada extremidade sucessiva. 
A figura deve ser dimensionada de maneira correspondente à medida que você redimensiona a janela.

b) Modifique sua resposta da parte (a) para que as linhas se estendam dos quatro cantos, como mostrado na captura de 
tela da direita na Figura 4.20. As linhas de cantos opostos devem se cruzar no meio.*/