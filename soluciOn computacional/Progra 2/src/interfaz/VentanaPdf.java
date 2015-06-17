/*
 * Created by JFormDesigner on Mon May 20 19:59:32 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import alfe.*;
/**
 * @author Jason Gonzalez
 */
public class VentanaPdf extends JFrame {
	public VentanaPdf() {
		initComponents();
		comboBox1.addItem("Inglés");
		comboBox1.addItem("Español");
	}

	public String id;
	
	private void button1MouseClicked(MouseEvent e) {
		// TODO add your code here
		
		id = entradaID.getText();
		try{
			ALFE.generadorPDF.createPdf(id, ALFE.gestorFotos.fotografias.get(id).toString(),
					ALFE.gestorFotos.fotografias.get(id).getNombreArchivo());
		}catch(Exception o){
			System.out.println("Id incorrecto");
		}
	}

	private void button2MouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		entradaID = new JTextField();
		label3 = new JLabel();
		comboBox1 = new JComboBox();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{

		
			//---- label1 ----
			label1.setText("ALFE");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 20));

			//---- label2 ----
			label2.setText("ID de fotograf\u00eda: ");

			//---- label3 ----
			label3.setText("Idioma de informaci\u00f3n:");

			//---- button1 ----
			button1.setText("Generar PDF");
			button1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					button1MouseClicked(e);
				}
			});

			//---- button2 ----
			button2.setText("Salir");
			button2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					button2MouseClicked(e);
				}
			});

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addContainerGap(153, Short.MAX_VALUE)
						.addComponent(label1)
						.addGap(148, 148, 148))
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addGroup(panel1Layout.createSequentialGroup()
								.addComponent(label2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(entradaID, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
							.addGroup(panel1Layout.createSequentialGroup()
								.addComponent(label3)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(panel1Layout.createParallelGroup()
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(button1)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
										.addComponent(button2))
									.addComponent(comboBox1))))
						.addContainerGap(25, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(label1))
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(51, 51, 51)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(label2)
									.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGap(18, 18, 18)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(49, 49, 49)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(button1)
							.addComponent(button2))
						.addContainerGap(25, Short.MAX_VALUE))
			);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JTextField entradaID;
	private JLabel label3;
	private JComboBox comboBox1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
