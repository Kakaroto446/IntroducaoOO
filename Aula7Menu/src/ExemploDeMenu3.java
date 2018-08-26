import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploDeMenu3 extends JFrame{
JMenuBar barra;
JMenu opcoes,fonte,estilo,cor;
JMenuItem limpar,sair,tamanho,azul,verde,vermelho,amarelo,preto;
JCheckBoxMenuItem normal, negrito, italico, negritoitalico;
public ExemploDeMenu3(){
super("Exemplo de Menus com JChekBoxMenuItem");
Container tela = getContentPane();
tela.setLayout(null);
barra = new JMenuBar();
setJMenuBar(barra);
opcoes = new JMenu("Opcoes");
barra.add(opcoes);
limpar = new JMenuItem("Limpar");
fonte = new JMenu("Fonte");
cor = new JMenu("Cor");
azul = new JMenuItem("Azul");
verde = new JMenuItem("Verde");
vermelho = new JMenuItem("Vermelho");
amarelo = new JMenuItem("Amarelo");
preto = new JMenuItem("Preto");
estilo = new JMenu("Estilo");
tamanho = new JMenuItem("Tamanho");
normal = new JCheckBoxMenuItem("Normal");
negrito = new JCheckBoxMenuItem("Negrito");
italico = new JCheckBoxMenuItem("Italico");
negritoitalico = new JCheckBoxMenuItem("Negrito e Italico");
sair = new JMenuItem("Sair");
opcoes.setMnemonic(KeyEvent.VK_O);
limpar.setMnemonic(KeyEvent.VK_L);
fonte.setMnemonic(KeyEvent.VK_F);
sair.setMnemonic(KeyEvent.VK_S);
cor.setMnemonic(KeyEvent.VK_C);
estilo.setMnemonic(KeyEvent.VK_E);
normal.setMnemonic(KeyEvent.VK_M);
negrito.setMnemonic(KeyEvent.VK_N);
italico.setMnemonic(KeyEvent.VK_I);
negritoitalico.setMnemonic(KeyEvent.VK_C);
tamanho.setMnemonic(KeyEvent.VK_T);
opcoes.add(limpar);
opcoes.add(fonte);
opcoes.addSeparator(); 
opcoes.add(sair);
cor.add(azul);
cor.add(verde);
cor.add(vermelho);
cor.add(amarelo);
cor.add(preto);
estilo.add(normal);
estilo.add(negrito);
estilo.add(italico);
estilo.add(negritoitalico);
fonte.add(cor);
fonte.add(estilo);
fonte.add(tamanho);
setSize(500,300);
setLocationRelativeTo(null);
setVisible(true);
}
public static void main (String args[]){
ExemploDeMenu3 app = new ExemploDeMenu3();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
