import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaTeste2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTeste2 frame = new TelaTeste2();
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
	public TelaTeste2() {
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
			panel.setLayout(new MigLayout("", "[grow][left][][][]", "[][][]"));
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBackground(new Color(240, 240, 240));
			lblNewLabel.setIcon(new ImageIcon(teste2A.class.getResource("/img/alarm.png")));
			panel.add(lblNewLabel, "flowx,cell 0 1");
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(teste2A.class.getResource("/routinehacker/ROUTINE HACKER.png")));
			panel.add(label, "cell 0 1");
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Icon button.png")));
			panel.add(lblNewLabel_1, "cell 3 1");
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(243, 255, 255));
			contentPane.add(panel_1, BorderLayout.CENTER);
			panel_1.setLayout(new MigLayout("", "[grow][grow][grow]", "[grow][grow][grow][30:n:30,grow][30:n:30,grow][grow][grow]"));
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/arrow_back.png")));
			panel_1.add(lblNewLabel_2, "flowx,cell 0 0");
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Voltar.png")));
			panel_1.add(lblNewLabel_3, "cell 0 0");
			
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Generic avatar.png")));
			panel_1.add(lblNewLabel_4, "cell 1 1,alignx center,aligny center");
			
			JLabel lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Login.png")));
			panel_1.add(lblNewLabel_5, "cell 1 2,alignx center,aligny top");
			
			JLabel lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Matrícula_.png")));
			panel_1.add(lblNewLabel_6, "cell 0 3,alignx right");
			
			textField = new JTextField();
			panel_1.add(textField, "cell 1 3,grow");
			textField.setColumns(20);
			
			JLabel lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Digite sua senha_.png")));
			panel_1.add(lblNewLabel_7, "cell 0 4,alignx right,aligny top");
			
			textField_1 = new JTextField();
			panel_1.add(textField_1, "cell 1 4,grow");
			textField_1.setColumns(20);
			
			JLabel lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setIcon(new ImageIcon(TelaTeste2.class.getResource("/img/Content.png")));
			panel_1.add(lblNewLabel_8, "cell 1 5,alignx center,aligny top");

}
}
