import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Tela4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		panel_1.setLayout(new MigLayout("", "[grow][grow][grow]", "[grow][grow][grow][grow][grow]"));
		
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tela4.class.getResource("/img/Generic avatar.png")));
		panel.add(lblNewLabel_1, "cell 0 1,alignx center");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela4.class.getResource("/routinehacker/ROUTINE HACKER.png")));
		panel.add(lblNewLabel, "cell 1 1,alignx center,aligny center");

	}

}
