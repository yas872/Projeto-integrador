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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
 

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
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
		lblNewLabel.setIcon(new ImageIcon(Tela1.class.getResource("/img/alarm.png")));
		panel.add(lblNewLabel, "flowx,cell 0 1");
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Tela1.class.getResource("/routinehacker/ROUTINE HACKER.png")));
		panel.add(label, "cell 0 1");
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Tela1.class.getResource("/img/Segment 1.png")));
		panel.add(lblNewLabel_4, "cell 1 1");
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "47 99957-2667");
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Tela1.class.getResource("/img/contato.png")));
		panel.add(lblNewLabel_2, "cell 2 1");
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Tela1.class.getResource("/img/entrar.png")));
		panel.add(lblNewLabel_3, "cell 3 1");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(243, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[grow][][grow]", "[grow]"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(243, 255, 255));
		panel_1.add(panel_2, "cell 0 0,alignx center,growy");
		panel_2.setLayout(new MigLayout("", "[]", "[grow][grow,center][grow][grow]"));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Tela1.class.getResource("/img/O que somos_.png")));
		panel_2.add(lblNewLabel_5, "cell 0 1,alignx center");
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Tela1.class.getResource("/img/somos_uma_equipe.png")));
		panel_2.add(lblNewLabel_6, "flowx,cell 0 2");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tela1.class.getResource("/img/Full-width.png")));
		panel_1.add(lblNewLabel_1, "cell 1 0");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(243, 255, 255));
		panel_1.add(panel_3, "cell 2 0,alignx center,growy");
		panel_3.setLayout(new MigLayout("", "[]", "[grow][grow][grow][grow][grow][grow]"));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Tela1.class.getResource("/img/Vector.png")));
		panel_3.add(lblNewLabel_7, "cell 0 0,alignx center,aligny center");
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Tela1.class.getResource("/img/access_alarm.png")));
		panel_3.add(lblNewLabel_9, "cell 0 2,alignx center");
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Tela1.class.getResource("/img/Vector (1).png")));
		panel_3.add(lblNewLabel_11, "cell 0 4,alignx center");
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Tela1.class.getResource("/img/Sem energia.png")));
		panel_3.add(lblNewLabel_14, "cell 0 1");
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Tela1.class.getResource("/img/Sem tempo.png")));
		panel_3.add(lblNewLabel_15, "cell 0 3");
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Tela1.class.getResource("/img/Atolado de tarefas.png")));
		panel_3.add(lblNewLabel_16, "cell 0 5");

	}

}
