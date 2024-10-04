package Ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NomeSobrenome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSobrenome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NomeSobrenome frame = new NomeSobrenome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public NomeSobrenome() {
		setTitle("NOME E SOBRENOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo = new JLabel("DIGITE SEU NOME E SEU SOBRENOME NOS CAMPOS ABAIXO");
		lblInfo.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblInfo.setBounds(10, 23, 414, 14);
		contentPane.add(lblInfo);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNome.setBounds(10, 72, 50, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("SOBRENOME:");
		lblSobrenome.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSobrenome.setBounds(10, 139, 97, 14);
		contentPane.add(lblSobrenome);
		
		textNome = new JTextField();
		textNome.setBounds(70, 70, 162, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(112, 137, 120, 20);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JLabel lblMostrarNome = new JLabel("");
		lblMostrarNome.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblMostrarNome.setBounds(50, 179, 333, 31);
		contentPane.add(lblMostrarNome);
		
		JButton btnNewButton = new JButton("MOSTRAR NOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String sobrenome = textSobrenome.getText();
				String mensagem = (nome+" "+sobrenome);
				lblMostrarNome.setText(mensagem);
				
			}
		});
		btnNewButton.setBounds(151, 221, 132, 30);
		contentPane.add(btnNewButton);
		

	}
}