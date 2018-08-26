	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

		public class ExemploSplashScreen extends JFrame{
		TelaInicial inicio;
		JButton botaosair;
		
		public ExemploSplashScreen(){
		super("Exemplo de Splash Screen");
		Container tela = getContentPane();
		tela.setLayout(null);
		inicio = new TelaInicial();
		inicio.setVisible(true);
		botaosair = new JButton ("Sair");
		botaosair.setBounds(100,50,100,20);
		botaosair.addActionListener(
		new ActionListener(){
		public void actionPerformed(ActionEvent e){
		System.exit(0); } } );
		tela.add(botaosair);
		setSize(300, 150);
		setLocationRelativeTo(null);
		}
		
		public static void main(String args[]){
			ExemploSplashScreen app = new ExemploSplashScreen();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void principal(){
		setVisible(true);}
		private class TelaInicial extends JWindow{
		public TelaInicial(){
		Container tela = getContentPane();
		tela.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		ImageIcon imagem = new ImageIcon("fundo.jpg");
		JLabel rotulo = new JLabel(imagem);
		tela.add(rotulo);
		ActionListener fechar = new ActionListener(){
		public void actionPerformed(ActionEvent e){
		setVisible(false);
		dispose();
		principal();}};
		javax.swing.Timer timer = new javax.swing.Timer(5000,fechar);
		timer.start();
		pack();
		setLocationRelativeTo(null);
		
		} }
		} 