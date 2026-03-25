package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class Tela4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela4 frame = new Tela4();
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
	public Tela4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 779);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 176, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(126, 201, 255));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[grow 7][grow][left][][][]", "[][][]"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(243, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow][grow][grow]", "[120:n:120,grow][28:n:28,grow][48:n:48,grow][grow]"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Tela4.class.getResource("/img/atvdbutton.png")));
		panel_1.add(lblNewLabel_2, "flowy,cell 1 0,alignx center,aligny center");
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Tela4.class.getResource("/img/Seus afazeres.png")));
		panel_1.add(lblNewLabel_6, "cell 0 1,alignx center,aligny top");
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Tela4.class.getResource("/img/Seus compromissos.png")));
		panel_1.add(lblNewLabel_7, "cell 1 1,alignx center,aligny top");
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Tela4.class.getResource("/img/Suas aulas.png")));
		panel_1.add(lblNewLabel_8, "cell 2 1,alignx center,aligny top");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 0 2,growx");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 1 2,growx");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "cell 2 2,growx");
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "cell 0 3,growx,aligny top");
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel_3.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel_3.add(chckbxNewCheckBox);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		panel_4.add(lblNewLabel_9);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel_4.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tela4.class.getResource("/img/Generic avatar.png")));
		panel.add(lblNewLabel_1, "cell 0 1,alignx center");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela4.class.getResource("/routinehacker/ROUTINE HACKER.png")));
		panel.add(lblNewLabel, "cell 1 1,alignx center,aligny center");

	}

}
