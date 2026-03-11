import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class Tela5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		panel_1.setLayout(new MigLayout("", "[grow][grow][grow]", "[grow][grow][grow][grow]"));
		
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Tela3.class.getResource("/img/Voltar.png")));
		panel_1.add(lblNewLabel_3, "cell 0 0,aligny top");
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Tela5.class.getResource("/img/personalize.png")));
		panel_1.add(lblNewLabel_4, "cell 1 0,alignx center");

	}

}
