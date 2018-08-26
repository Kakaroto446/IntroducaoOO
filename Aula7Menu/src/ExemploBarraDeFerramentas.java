import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExemploBarraDeFerramentas extends JFrame{
	JToolBar barra;
	JButton direita,esquerda,centralizar,recortar,copiar,colar;
	ImageIcon imagens[];
public ExemploBarraDeFerramentas(){
	super("Exemplo de Barra de Ferramentas");
	Container tela = getContentPane();
	tela.setLayout(null);
	String icones[]={"right.png","left.png","central.png","cut.png","copy.png","colar.png"};
	imagens = new ImageIcon[6];
	for(int i = 0;i < 6;i++){
	imagens[i] = new ImageIcon(icones[i]);}
	direita = new JButton(imagens[0]);
	esquerda = new JButton(imagens[1]);
	centralizar = new JButton(imagens[2]);
	recortar = new JButton(imagens[3]);
	copiar = new JButton(imagens[4]);
	colar = new JButton(imagens[5]);
	direita.setToolTipText("Direita (Ctrl+d)");
	esquerda.setToolTipText("Esquerda (Ctrl+e)");
	centralizar.setToolTipText("Centralizar (Ctrl+z)");
	recortar.setToolTipText("Recortar (Ctrl+x)");
	copiar.setToolTipText("Copiar (Ctrl+c)");
	colar.setToolTipText("Colar (Ctrl+v)");
	barra = new JToolBar("Barra de Ferramentas");
	UIManager.put("ToolTip.background",SystemColor.info);
	UIManager.put("ToolTip.foreground",Color.blue);
	barra.setRollover(true);
	barra.add(direita);
	barra.add(esquerda);
	barra.add(centralizar);
	barra.addSeparator();
	barra.add(recortar);
	barra.add(copiar);
	barra.add(colar);
	barra.setBounds(1,1,260,50);
	tela.add(barra);
	setSize(320,340);
	setLocationRelativeTo(null);
	setVisible(true);}

public static void main (String args[]){
ExemploBarraDeFerramentas app = new ExemploBarraDeFerramentas();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
 
