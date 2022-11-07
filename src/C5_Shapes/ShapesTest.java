/**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   ShapesTest
 * @author      :   Emiliano Costa
 * @date        :   18 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   5 - Instruções de Controle Parte 2       
 * Seção        :   5.11 (Opcional) Estudo de caso de GUIs e imagens gráficas: desenhando retângulos e ovais
 * ...................................................................................................................
 * Descrição    :   TestDrive 
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package C5_Shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class ShapesTest{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    
    public static void figura_5_27(){

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(displaySeleçao()));
        Shapes panel = new Shapes(escolha);
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
        
    }
    
    public static void exer_5_1(){
        ShapesCirculos panel = new ShapesCirculos();
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }
    
    public static void exer_5_2(){
        int cont = 1; 
        JOptionPane.showMessageDialog(null,"Dezenha 5 barras");
        
        int barra1 = tamanhoBarra(cont++);
        int barra2 = tamanhoBarra(cont++);
        int barra3 = tamanhoBarra(cont++);
        int barra4 = tamanhoBarra(cont++);
        int barra5 = tamanhoBarra(cont++);
        
        ShapesBarras panel = new ShapesBarras(barra1,barra2,barra3,barra4,barra5);
                
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }
    
    private static int tamanhoBarra(int contador)
    {
        int valor;
        try {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,String.format("Digite o valor da %d° Barra", contador)));
        } catch (Exception e) {
            valor = 0;
        }
         return  valor;
    }

    private static String displaySeleçao(){
        return String.format("""
                   Digite 1 para desenhar retangulos
                   Digite 2 para desenhar ovais """);
    }
               
}
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
