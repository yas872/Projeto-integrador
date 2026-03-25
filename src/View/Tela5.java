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
import javax.swing.JTextField;

public class Tela5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela5 frame = new Tela5();
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
	public Tela5() {
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
		panel_1.setLayout(new MigLayout("", "[100.00,grow][grow][grow][grow][grow][grow]", "[53.00,grow][grow][grow][101.00,grow][76.00,grow][77.00,grow][grow]"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setIcon(new ImageIcon(Tela1.class.getResource("/img/alarm.png")));
		panel.add(lblNewLabel, "flowx,cell 0 1");
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Tela1.class.getResource("/routinehacker/ROUTINE HACKER.png")));
		panel.add(label, "cell 0 1");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tela3.class.getResource("/img/Icon button.png")));
		panel.add(lblNewLabel_1, "cell 3 1");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Tela3.class.getResource("/img/arrow_back.png")));
		panel_1.add(lblNewLabel_2, "flowx,cell 0 0,alignx left,aligny top");
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Tela5.class.getResource("/img/personalize.png")));
		panel_1.add(lblNewLabel_4, "cell 2 0,alignx center,aligny bottom");
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Tela5.class.getResource("/img/Generic avatar.png")));
		panel_1.add(lblNewLabel_11, "flowx,cell 1 1");
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Tela5.class.getResource("/img/Telefone_.png")));
		panel_1.add(lblNewLabel_5, "cell 3 1,alignx right,aligny bottom");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 4 1,growx,aligny bottom");
		textField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Tela5.class.getResource("/img/3d_avatar_1.png")));
		panel_1.add(lblNewLabel_13, "flowx,cell 1 2");
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Tela5.class.getResource("/img/Username_.png")));
		panel_1.add(lblNewLabel_6, "cell 3 2,alignx right,aligny center");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 4 2,growx,aligny center");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Tela5.class.getResource("/img/3d_avatar_13.png")));
		panel_1.add(lblNewLabel_16, "flowx,cell 1 3");
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Tela5.class.getResource("/img/Compromissos_.png")));
		panel_1.add(lblNewLabel_7, "cell 3 3,alignx right");
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "cell 4 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Tela5.class.getResource("/img/Biografia_.png")));
		panel_1.add(lblNewLabel_8, "cell 3 4,alignx right");
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "cell 4 4,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Tela5.class.getResource("/img/Curso_.png")));
		panel_1.add(lblNewLabel_9, "cell 3 5,alignx right");
		
		textField_4 = new JTextField();
		panel_1.add(textField_4, "cell 4 5,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\r\n");
		lblNewLabel_10.setIcon(new ImageIcon(Tela5.class.getResource("/img/botao alterar.png")));
		panel_1.add(lblNewLabel_10, "cell 2 6,alignx center,aligny top");
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Tela5.class.getResource("/img/3d_avatar_3.png")));
		panel_1.add(lblNewLabel_14, "cell 1 2,alignx center");
		
		JLabel lblNewLabel_17 = new JLabel("\r\n");
		lblNewLabel_17.setIcon(new ImageIcon(Tela5.class.getResource("/img/3d_avatar_20.png")));
		panel_1.add(lblNewLabel_17, "cell 1 3");
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Tela5.class.getResource("/img/Yasmin Lima Eger yasmin@gmail.com.png")));
		panel_1.add(lblNewLabel_12, "cell 1 1");
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Tela3.class.getResource("/img/Voltar.png")));
		panel_1.add(lblNewLabel_3, "cell 0 0,aligny top");

	}

}
