import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExQuinzeTres extends JFrame{
	JButton botao;
	String nome;
	JLabel rotulo;
	public ExQuinzeTres(){
	super("Exemplo de Input Dialog");
	Container tela = getContentPane();
	tela.setLayout(null);
	nome = JOptionPane.showInputDialog("Entre com seu nome: ");
	rotulo = new JLabel("");
	botao = new JButton("Sair");
	rotulo.setBounds(10,40,350,20);
	botao.setBounds(100,90,100,20);
	botao.setToolTipText("Botão que finaliza a janela");
	rotulo.setText("O nome digitado foi: "+nome.toUpperCase());
	tela.add(rotulo);
	tela.add(botao);
	botao.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	int opcao;
	Object[] botoes = {"Sim","Não"};
	opcao = JOptionPane.showOptionDialog(null,"Deseja mesmo fechar a janela?","Fechar",
	JOptionPane.YES_NO_OPTION,
	JOptionPane.QUESTION_MESSAGE,
	null,botoes,botoes[0]);
	if (opcao==JOptionPane.YES_OPTION)
	System.exit(0);
	}});
	setSize(300,200);
	setVisible(true);
	setLocationRelativeTo(null);
	}

public static void main(String args[]){
ExQuinzeTres app = new ExQuinzeTres();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

