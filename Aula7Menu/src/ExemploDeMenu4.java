import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploDeMenu4 extends JFrame{
JMenuBar barra;
JMenu opcoes,fonte,cor,estilo,tamanho;
JMenuItem limpar,sair,azul,verde,vermelho,amarelo,preto;
JCheckBoxMenuItem nomeE[];
ButtonGroup grupoT,grupoE;
JRadioButtonMenuItem tamanhoF[];
String tam[] = {"12","14","16","18"};
String est[] = {"Normal", "Negrito", "Italico", "Negrito e Itaco"};
public ExemploDeMenu4(){
super("Exemplo de Menus com JRadioButtonMenuItem");
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
grupoE = new ButtonGroup();
nomeE = new JCheckBoxMenuItem[4];
for(int i = 0; i < 4; i++){
nomeE[i] = new JCheckBoxMenuItem(est[i]);
estilo.add(nomeE[i]);
grupoE.add(nomeE[i]);
}
tamanho = new JMenu("Tamanho");
grupoT = new ButtonGroup();
tamanhoF = new JRadioButtonMenuItem[4];
for(int i = 0; i < 4; i++){
tamanhoF[i] = new JRadioButtonMenuItem(tam[i]); 
tamanho.add(tamanhoF[i]);
grupoT.add(tamanhoF[i]);
}
sair = new JMenuItem("Sair");
opcoes.setMnemonic(KeyEvent.VK_O);
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
cor.add(azul);
cor.add(verde);
cor.add(vermelho);
cor.add(amarelo);
cor.add(preto);
fonte.add(cor);
fonte.add(estilo);
fonte.add(tamanho);
setSize(500,300);
setLocationRelativeTo(null);
setVisible(true);
}
public static void main (String args[]){
ExemploDeMenu4 app = new ExemploDeMenu4();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
 
