package aulaLayouts;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Layout extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
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
	public Layout() {
		setBounds(100, 100, 536, 460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblAnahita = new JLabel("");
		lblAnahita.setBounds(200, 181, 24, 24);
		lblAnahita.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Anahita2.png"));
		getContentPane().add(lblAnahita);

		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(200, 286, 205, 37);
		getContentPane().add(lblResultado);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Blumenau", "Gaspar", "Florianopolis", "Calmon" }));
		comboBox.setBounds(27, 280, 109, 22);
		getContentPane().add(comboBox);

		JButton btnMostrar = new JButton("Mostrar Seleção");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcaoSelecionada = (String) comboBox.getSelectedItem();
				lblResultado.setText("Você escolheu: " + opcaoSelecionada);

			}
		});
		btnMostrar.setBounds(27, 311, 109, 23);
		getContentPane().add(btnMostrar);

		JCheckBox chk1 = new JCheckBox("Laranja");
		chk1.setBounds(51, 34, 97, 23);
		getContentPane().add(chk1);

		JCheckBox chk2 = new JCheckBox("Goiaba");
		chk2.setBounds(211, 34, 97, 23);
		getContentPane().add(chk2);

		JCheckBox chk3 = new JCheckBox("Melancia");
		chk3.setBounds(367, 34, 97, 23);
		getContentPane().add(chk3);

		JButton lblValidarFruta = new JButton("Validar");
		lblValidarFruta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "";
				if (chk1.isSelected()) {
					mensagem = chk1.getText() + " ";
				}
				if (chk2.isSelected()) {
					mensagem += chk2.getText() + " ";
				}
				if (chk3.isSelected()) {
					mensagem += chk3.getText();
				}
				JOptionPane.showInternalMessageDialog(null, mensagem);
			}
		});
		lblValidarFruta.setBounds(200, 83, 89, 23);
		getContentPane().add(lblValidarFruta);

		JRadioButton rb1 = new JRadioButton("opisao 1");
		rb1.setBounds(39, 143, 109, 23);
		getContentPane().add(rb1);

		JRadioButton rb2 = new JRadioButton("opisao 2");
		rb2.setBounds(200, 143, 109, 23);
		getContentPane().add(rb2);

		JRadioButton rb3 = new JRadioButton("opisao 3");
		rb3.setBounds(355, 143, 109, 23);
		getContentPane().add(rb3);

		


		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rb1);
		grupo.add(rb2);
		grupo.add(rb3);

		JButton btnTestarRB = new JButton("Testar RB");
		btnTestarRB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = new String();
				if (rb1.isSelected()) {
					mensagem = "Botao 1 selecionaudo";
				}
				if (rb2.isSelected()) {
					mensagem = "Botao 2 selecionaudo";

				}if (rb3.isSelected()) {
					mensagem = "Botao 3 selecionaudo";

				}
				JOptionPane.showInternalMessageDialog(null, mensagem);
			}
		});
		btnTestarRB.setBounds(200, 198, 89, 23);
		getContentPane().add(btnTestarRB);
	}
}
