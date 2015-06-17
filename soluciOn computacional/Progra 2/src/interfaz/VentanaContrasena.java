/*
 * Created by JFormDesigner on Mon May 20 21:55:57 CST 2013
 */

package interfaz;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Jason Gonzalez
 */
public class VentanaContrasena extends JFrame {
	public VentanaContrasena() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		entradaContrasena = new JPasswordField();
		botonGuardar = new JButton();
		botonSalir = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


			//---- label1 ----
			label1.setText("ALFE");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 20));

			//---- label2 ----
			label2.setText("Contrase\u00f1a:");

			//---- botonGuardar ----
			botonGuardar.setText("Guardar");

			//---- botonSalir ----
			botonSalir.setText("Salir");

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(0, 135, Short.MAX_VALUE)
								.addComponent(botonGuardar)
								.addGap(18, 18, 18)
								.addComponent(botonSalir))
							.addGroup(panel1Layout.createParallelGroup()
								.addGroup(panel1Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(label2)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(entradaContrasena, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
								.addGroup(panel1Layout.createSequentialGroup()
									.addGap(131, 131, 131)
									.addComponent(label1))))
						.addContainerGap(37, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1)
						.addGap(11, 11, 11)
						.addGroup(panel1Layout.createParallelGroup()
							.addComponent(label2)
							.addComponent(entradaContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonSalir)
							.addComponent(botonGuardar))
						.addContainerGap(21, Short.MAX_VALUE))
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
				.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
	private JPasswordField entradaContrasena;
	private JButton botonGuardar;
	private JButton botonSalir;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
