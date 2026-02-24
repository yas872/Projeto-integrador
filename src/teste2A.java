import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
 

public class teste2A extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste2A frame = new teste2A();
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
	public teste2A() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 581);
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
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel.add(lblNewLabel_4, "cell 1 1");
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(teste2A.class.getResource("/img/contato.png")));
		panel.add(lblNewLabel_2, "cell 2 1");
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(teste2A.class.getResource("/img/entrar.png")));
		panel.add(lblNewLabel_3, "cell 3 1");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(243, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow][][grow]", "[grow]"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(243, 255, 255));
		panel_1.add(panel_2, "cell 0 0,grow");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(teste2A.class.getResource("/img/Full-width.png")));
		panel_1.add(lblNewLabel_1, "cell 1 0");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(243, 255, 255));
		panel_1.add(panel_3, "cell 2 0,grow");

	}

}
