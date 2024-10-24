package pizzaChallenge;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizza extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizza frame = new pizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pizza() {
		int valorPizza = 0;
		setTitle("PIZZARIA MARA MARIA");
		setBounds(100, 100, 565, 433);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SABORES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(23, 31, 102, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblBorda = new JLabel("BORDA");
		lblBorda.setForeground(Color.WHITE);
		lblBorda.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblBorda.setBounds(21, 177, 60, 14);
		getContentPane().add(lblBorda);
		
		JLabel lblNewLabel_1_1 = new JLabel("TELE ENTREGA");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(6, 273, 122, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ADICIONAIS");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(192, 31, 117, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ENTREGA", "RETIRAR NO LOCAL"}));
		comboBox.setBounds(16, 298, 87, 22);
		getContentPane().add(comboBox);
		
		JCheckBox chckbxPepperoni = new JCheckBox("R$5 PEPPERONI");
		chckbxPepperoni.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxPepperoni.setBounds(6, 52, 119, 23);
		getContentPane().add(chckbxPepperoni);
		if(chckbxPepperoni.isSelected()) {
			 valorPizza+=5;
			}
		JCheckBox chckbxCalabresa = new JCheckBox("R$5 CALABRESA");
		chckbxCalabresa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxCalabresa.setBounds(6, 78, 119, 23);
		getContentPane().add(chckbxCalabresa);
		if(chckbxCalabresa.isSelected()) {
			 valorPizza+=5;
			}
		JCheckBox chckbxPortuguesa = new JCheckBox("R$5 PORTUGUESA");
		chckbxPortuguesa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxPortuguesa.setBounds(6, 104, 119, 23);
		getContentPane().add(chckbxPortuguesa);
		if(chckbxPortuguesa.isSelected()) {
			 valorPizza+=5;
			}
		JCheckBox chckbxTerere = new JCheckBox("R$5 TERERE");
		chckbxTerere.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxTerere.setBounds(6, 130, 119, 23);
		getContentPane().add(chckbxTerere);
		if(chckbxTerere.isSelected()) {
			 valorPizza+=5;
			}
		JRadioButton rdbtnComBorda = new JRadioButton("R$10 Com Borda");
		rdbtnComBorda.setBounds(6, 198, 119, 23);
		getContentPane().add(rdbtnComBorda);
		
		JRadioButton rdbtnSemBorda = new JRadioButton("R$5 Sem Borda");
		rdbtnSemBorda.setBounds(6, 224, 119, 23);
		getContentPane().add(rdbtnSemBorda);
		
		JCheckBox chckbxBatataFrita = new JCheckBox("R$5 BATATA FRITA");
		chckbxBatataFrita.setForeground(Color.BLACK);
		chckbxBatataFrita.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxBatataFrita.setBounds(187, 52, 122, 23);
		getContentPane().add(chckbxBatataFrita);
		if(chckbxBatataFrita.isSelected()) {
			 valorPizza+=5;
			}
		JCheckBox chckbxPepperoni_1_1 = new JCheckBox("R$5 BACON");
		chckbxPepperoni_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxPepperoni_1_1.setBounds(187, 78, 97, 23);
		getContentPane().add(chckbxPepperoni_1_1);
		if(chckbxPepperoni_1_1.isSelected()) {
			 valorPizza+=5;
			}
		JCheckBox chckbxPepperoni_1_1_1 = new JCheckBox("R$5 ALHO FRITO");
		chckbxPepperoni_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxPepperoni_1_1_1.setBounds(187, 104, 97, 23);
		getContentPane().add(chckbxPepperoni_1_1_1);
		if(chckbxPepperoni_1_1_1.isSelected()) {
			 valorPizza+=5;
			}
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnComBorda);
		grupo.add(rdbtnSemBorda);
		if(rdbtnComBorda.isSelected()) {
		 valorPizza+=10;
		}
		else {
			valorPizza+=5;
		}
		JButton btnBuy = new JButton("BUY NOW");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBuy.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnBuy.setBounds(256, 298, 157, 59);
		getContentPane().add(btnBuy);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\pizza_706934.png"));
		lblNewLabel_1.setBounds(-119, -42, 512, 512);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PIZZARIA");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(423, 173, 102, 22);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("MARA MARIA");
		lblNewLabel_2_1.setForeground(Color.ORANGE);
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2_1.setBounds(400, 188, 149, 35);
		getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("PREÇO:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(418, 322, 60, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblValor = new JLabel("");
		lblValor.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblValor.setBounds(479, 322, 60, 14);
		getContentPane().add(lblValor);
		
	
		
	}
}
