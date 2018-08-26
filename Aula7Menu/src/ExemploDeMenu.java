import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploDeMenu extends JFrame {
    JMenuBar barra;
    JMenu opcoes,fonte,cor;
    JMenuItem limpar,sair,estilo,tamanho,azul,verde,vermelho,amarelo,preto;
    public ExemploDeMenu(){
        super("Exemplo de Menus");
        Container tela = getContentPane();
        tela.setLayout(null);
        barra = new JMenuBar();
        setJMenuBar(barra);
        opcoes = new JMenu("Opções");
        barra.add(opcoes);
        limpar = new JMenuItem("Limpar");
        sair = new JMenuItem("Sair");
        cor = new JMenu("Cor");
        azul = new JMenuItem("Azul");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        amarelo = new JMenuItem("Amarelo");
        preto = new JMenuItem("Preto");
        estilo = new JMenuItem("Estilo");
        tamanho = new JMenuItem("Tamanho");
        limpar.setMnemonic(KeyEvent.VK_L);
        fonte.setMnemonic(KeyEvent.VK_F);
        sair.setMnemonic(KeyEvent.VK_S);
        cor.setMnemonic(KeyEvent.VK_C);
        estilo.setMnemonic(KeyEvent.VK_E);
        tamanho.setMnemonic(KeyEvent.VK_T);
        opcoes.add(limpar);
        opcoes.add(fonte);
        opcoes.addSeparator();
        opcoes.add(sair);
        fonte.add(cor);
        fonte.add(estilo);
        fonte.add(tamanho);
        cor.add(azul);
        cor.add(verde);
        cor.add(vermelho);
        cor.add(amarelo);
        cor.add(preto);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        }
        public static void main (String args[]){
        ExemploDeMenu app = new ExemploDeMenu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
    
    
    

