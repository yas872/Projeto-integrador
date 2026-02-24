import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class teste2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste2 frame = new teste2();
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
	public teste2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(52, 176, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[401px,grow]", "[37px][grow]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(52, 176, 243));
		contentPane.add(panel, "cell 0 0,alignx left,aligny top");
		panel.setLayout(new MigLayout("", "[46px][46px][89px][89px][89px]", "[23px]"));
		
		JLabel icone = new JLabel("New label");
		panel.add(icone, "cell 0 0,alignx left,aligny center");
		
		JLabel texto = new JLabel("New label");
		panel.add(texto, "cell 1 0,alignx left,aligny center");
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton, "cell 2 0,alignx left,aligny top");
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2, "cell 3 0,alignx left,aligny top");
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1, "cell 4 0,alignx left,aligny top");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "cell 0 1,grow");

	}

}
