/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Shapes
 * @author      :   Emiliano Costa
 * @date        :   18 de mar. de 2022
 * revisão      :   21 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   5 Instruções de controle: Parte 2
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * Figura 5.27  :   desenha uma cascata de formas que iniciam do canto superior esquerdo
 * Modificação  :   
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

    package C5_Shapes;
    import java.awt.Graphics;
    import javax.swing.JPanel;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
public class Shapes extends JPanel{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
    private int choice; //escolha do usuário
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
/*.................................................................................................Construtor.........*/
    
    public Shapes(int escolha) {
        this.choice = escolha;
    }

/*.............................................................................................Outros Métodos.....*/
        
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int largura = getWidth();
        int altura = getHeight();
        for (int i = 0; i < 10; i++){
            switch (choice){
                case 1 -> //Desenha uma cascata de retângulos que iniciam do canto superior esquerdo
                    g.drawRect(10 + i*10, 10+ i*10, 50+ i*10,50 + i * 10);
                case 2 -> //Desenha uma cascata de elipses que iniciam do canto superior esquerdo
                    g.drawOval(10 + i*10, 10+ i*10, 50+ i*10,50 + i * 10);
                default -> System.out.println("Não implementado");
            }                
        }
    }   

}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim classe Shapes*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
