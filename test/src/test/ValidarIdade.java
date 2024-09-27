package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValidarIdade extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textName;
	private JTextField textAge;
	private JTextField lblResposta;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarIdade frame = new ValidarIdade();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ValidarIdade() {
		setTitle("Validador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Source Code Pro Black", Font.PLAIN, 15));
		lblNome.setBounds(76, 57, 46, 14);
		getContentPane().add(lblNome);
		
		textName = new JTextField();
		textName.setBounds(132, 55, 149, 20);
		getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Source Code Pro Black", Font.PLAIN, 15));
		lblIdade.setBounds(76, 101, 66, 14);
		getContentPane().add(lblIdade);
		
		textAge = new JTextField();
		textAge.setBounds(132, 99, 86, 20);
		getContentPane().add(textAge);
		textAge.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Source Code Pro Black", Font.PLAIN, 15));
		lblResposta.setBounds(10, 182, 414, 69);
		getContentPane().add(lblResposta);

		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// mostraResultado();
				String nome = textName.getText();
				String idadeStr = textAge.getText();
				
				try {
					int idade = Integer.parseInt(idadeStr);
					String mensagem = ("Nome: "+nome+" | "+ "Idade: "+idade); 
					lblResposta.setText(mensagem);
				}catch(NumberFormatException ex) {
					lblResposta.setText("por favor, insira uma idade valida: ");
				}
				 
				int IdadeNum = Integer.parseInt(idadeStr);
				if(IdadeNum<18) {
					lblResposta.setText("menor de idade");
				}else { 
					lblResposta.setText("maior de idade");
				}
				int IdadeNu = Integer.parseInt(idadeStr);
				if(IdadeNu<0) {
					lblResposta.setText("digite uma idade valida");
				}
			}
		});
		btnValidar.setBounds(169, 148, 89, 23);
		getContentPane().add(btnValidar);
		

	}
	
	//private void mostrarResultado() {
		//String nome = textName.getText();
		//String idade = textAge.getText();
		//lblResposta.setText(nome);
	//}
}
