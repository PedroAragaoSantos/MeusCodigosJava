package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InterfaceGrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica frame = new InterfaceGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceGrafica() {
		setTitle("Meu Primeiro Exemplo Em Java Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JLabel lblSauda = new JLabel("Vose gostar de programasao?");
		lblSauda.setBounds(95, 53, 267, 18);
		lblSauda.setHorizontalAlignment(SwingConstants.CENTER);
		lblSauda.setFont(new Font("Source Code Pro ExtraLight", Font.BOLD, 14));
		
		JButton btnNao = new JButton("nao");
		btnNao.setBounds(344, 171, 65, 23);
		btnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				JOptionPane.showMessageDialog(null, "Muito bem Otima escolha! :)");
			}
		});
		contentPane.setLayout(null);
		
		JButton btnTeste1 = new JButton("Sim");
		btnTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Que pena boa sorte:(");
			}
			
		});
		btnTeste1.setBounds(42, 171, 69, 23);
		contentPane.add(btnTeste1);
		contentPane.add(lblSauda);
		contentPane.add(btnNao);
		
		JLabel lblEscolha = new JLabel("");
		lblEscolha.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 16));
		lblEscolha.setBounds(147, 28, 208, 14);
		contentPane.add(lblEscolha);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "voce tem serteza"+ "AAAAAAAAAAAAAAAAAAAA","BBBBBB", JOptionPane.YES_NO_OPTION);
				JOptionPane.showMessageDialog(null, "Voce tem serteza?", "AAAAAAAAAAAAAAAAA", JOptionPane.YES_NO_OPTION);
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null, "Voce tem certeza?");
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "show!");
				}
			}
		});
		btnFechar.setBounds(174, 228, 89, 23);
		contentPane.add(btnFechar);
	}
}
