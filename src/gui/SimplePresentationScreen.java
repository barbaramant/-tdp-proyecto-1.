package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextPane textLU;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 270));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informaci\u00F3n del alumno", null, tabInformation, "Muestra la informaci\u00F3n declarada por el alumno");
		
		textLU = new JTextPane();
		textLU.setText(""+studentData.getId());
		
		JLabel lblNewLabel = new JLabel("L.U");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblGithubUrl = new JLabel("Github URL");
		lblGithubUrl.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JTextPane textApellido = new JTextPane();
		textApellido.setText(studentData.getLastName());
		
		JTextPane textNombre = new JTextPane();
		textNombre.setText(studentData.getFirstName());
		
		JTextPane textEmail = new JTextPane();
		textEmail.setText(studentData.getMail());
		
		JTextPane textGithubURL = new JTextPane();
		textGithubURL.setText(studentData.getGithubURL());
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textLU, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblGithubUrl, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textGithubURL, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(textLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblApellido)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(textGithubURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGithubUrl))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		JLabel labelPic = new JLabel("");
		labelPic.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/bm.jpg")));
		
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		String hora = fecha.format(LocalDateTime.now());
		String dia = String.valueOf(LocalDate.now().getDayOfMonth());
		String mes = String.valueOf(LocalDate.now().getMonthValue());
		String anio = Integer.toString(LocalDate.now().getYear());
		
		JLabel lblFecha = new JLabel("Esta ventana fue generada el "+dia+"/"+mes+"/"+anio+" a las"+hora);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblFecha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tabbedPane, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(labelPic, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFecha))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(labelPic, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
