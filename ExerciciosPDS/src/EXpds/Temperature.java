package EXpds;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperature extends JFrame {

	private JPanel contentPane;
	private JTextField textFaro;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature frame = new Temperature();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Temperature() {
		setTitle("CONVERTER TEMPERATURA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCel = new JLabel("Temperatura em Celcius:");
		lblCel.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 14));
		lblCel.setBounds(13, 143, 173, 38);
		contentPane.add(lblCel);
		
		textFaro = new JTextField();
		textFaro.setBounds(277, 98, 115, 27);
		contentPane.add(textFaro);
		textFaro.setColumns(10);
		
		JLabel lblFaro = new JLabel("Digite uma temperatura em Farenheit:");
		lblFaro.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 14));
		lblFaro.setBounds(13, 90, 254, 38);
		contentPane.add(lblFaro);
		
		JLabel lblCelso = new JLabel("");
		lblCelso.setBounds(185, 145, 89, 38);
		contentPane.add(lblCelso);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		     Double temperaturaF = Double.parseDouble(textFaro.getText());
		     Conversao conv = new Conversao();
		     Double temperaturaC = conv.calculo(temperaturaF);
		     lblCelso.setText(String.format("%.2f",temperaturaC));
			} catch (NumberFormatException erro) {
				JOptionPane.showInternalMessageDialog(null, "Por favor insira uma temperatura válida","Atenção", JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnConverter.setBounds(161, 212, 131, 38);
		contentPane.add(btnConverter);
		
		JLabel lblNewLabel = new JLabel("ESSE É O SISTEMA CERTO PRA VOCÊ!");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel.setBounds(84, 41, 284, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NÃO SABE FAZER CONTAS BÁSICAS NA CALCULADORA? ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(44, 11, 365, 38);
		contentPane.add(lblNewLabel_1);
		
	}
}
