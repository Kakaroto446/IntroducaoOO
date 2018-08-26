import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.Timer;

public class ExDesseseis extends JFrame{
JButton copiar,limpar,mini;
JLabel rotulo1,rotulo2,rotulo3,rotulo4, rotulo5;
JTextField texto1,texto2;
int ds,dia,mes,ano;
Calendar data;
String diasemana[]={"Domingo","Segunda - Feira","Terça - Feira","Quarta - Feira",
"Quinta - Feira","Sexta - Feira","Sábado"};
String meses[]={"Janeiro","Fevereiro","Março","Abril","Maio","Junho",
"Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

int hh,mm,ss,h;
Calendar hora;
DecimalFormat formato;

public ExDesseseis(){
super("Exemplo de saídas maiúsculas");
Container tela = getContentPane();
tela.setLayout(null);
rotulo1 = new JLabel("Antes: ");
rotulo2 = new JLabel("Depois: ");
texto1 = new JTextField(20);
texto2 = new JTextField(20);
copiar = new JButton("Aumentar");
limpar = new JButton("Limpar");
mini = new JButton("Diminuir");
rotulo1.setBounds(20,30,50,20);
rotulo2.setBounds(20,60,50,20);
texto1.setBounds(60,30,180,20);
texto2.setBounds(60,60,180,20);
copiar.setBounds(20,130,100,20);
limpar.setBounds(180,130,100,20);
mini.setBounds(20,155,100,20);
copiar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
texto2.setText(texto1.getText().toUpperCase());}});
limpar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
texto1.setText("");
texto2.setText("");
texto1.requestFocus();}});

mini.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String texto;
texto = texto1.getText().toUpperCase();
texto1.setText(texto);
texto2.setText(texto1.getText().toLowerCase());}});

rotulo3 = new JLabel("");
rotulo4 = new JLabel("");
rotulo4.setBounds(40,350,280,20);
rotulo3.setBounds(40,380,280,20);
data = Calendar.getInstance();
ds = data.get(Calendar.DAY_OF_WEEK);
dia = data.get(Calendar.DAY_OF_MONTH);
mes = data.get(Calendar.MONTH);
ano = data.get(Calendar.YEAR);
rotulo3.setText("Data: "+ds+" "+dia+"/"+(mes+1)+"/"+ano);
rotulo4.setText("Data: "+diasemana[ds-1]+", "+dia+" de "+meses[mes]+" de "+ano);

rotulo5 = new JLabel("");
rotulo5.setBounds(40,430,280,20);
ActionListener tarefa = (new ActionListener(){
public void actionPerformed(ActionEvent e){
HORAS();
}
});
javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
time.start();


tela.add(rotulo1);
tela.add(rotulo2);
tela.add(rotulo3);
tela.add(rotulo4);
tela.add(texto1);
tela.add(texto2);
tela.add(copiar);
tela.add(limpar);
tela.add(mini);
tela.add(rotulo5);



setSize(350,200);
setVisible(true);
setLocationRelativeTo(null); }

private void HORAS(){
hora = Calendar.getInstance();
hh = hora.get(Calendar.HOUR_OF_DAY);
mm = hora.get(Calendar.MINUTE);
ss = hora.get(Calendar.SECOND);
formato = new DecimalFormat("00");
rotulo5.setText("Hora: "+formatar(hh%12)+":"+formatar(mm)+":"+formatar(ss));
}
private String formatar(int num){
formato = new DecimalFormat("00");
return formato.format(num);
}



public static void main(String args[]){
	ExDesseseis app = new ExDesseseis();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}