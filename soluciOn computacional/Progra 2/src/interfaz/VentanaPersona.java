/*
 * Created by JFormDesigner on Mon May 20 22:18:25 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class VentanaPersona extends JFrame {
	public VentanaPersona() {
		initComponents();
	}

	
	private String nombre;
	private String alias;
	private String correo;
	private String telefono;
	private String apellido;
	
	private void botonAgregarMouseClicked(MouseEvent e) {
		// TODO add your code here
		nombre=entradaNombre.getText();
		alias = entradaAlias.getText();
		correo = entradaCorreo.getText();
		telefono = entradaNumero.getText();
		apellido = entradaApellido.getText();
		
		ALFE.agregarPersona(nombre, apellido, alias, correo, telefono);
		
		this.dispose();
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		labelInicio = new JLabel();
		label1 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		entradaNombre = new JTextField();
		entradaAlias = new JTextField();
		entradaCorreo = new JTextField();
		entradaNumero = new JTextField();
		botonAgregar = new JButton();
		botonSalir = new JButton();
		entradaApellido = new JTextField();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{

			//---- labelInicio ----
			labelInicio.setText("ALFE");
			labelInicio.setFont(new Font("Tahoma", Font.PLAIN, 20));

			//---- label1 ----
			label1.setText("Nombre-Apellido:");

			//---- label3 ----
			label3.setText("Alias:");

			//---- label4 ----
			label4.setText("E-mail:");

			//---- label5 ----
			label5.setText("N\u00famero Telef\u00f3nico:");

			//---- botonAgregar ----
			botonAgregar.setText("Agregar");
			botonAgregar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAgregarMouseClicked(e);
				}
			});

			//---- botonSalir ----
			botonSalir.setText("Salir");
			botonSalir.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonSalirMouseClicked(e);
				}
			});

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(164, 164, 164)
								.addComponent(labelInicio))
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(panel1Layout.createSequentialGroup()
									.addGap(0, 195, Short.MAX_VALUE)
									.addComponent(botonAgregar)
									.addGap(25, 25, 25)
									.addComponent(botonSalir))
								.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
									.addGap(28, 28, 28)
									.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addGroup(panel1Layout.createSequentialGroup()
											.addComponent(label3)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(entradaAlias, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
										.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
											.addComponent(label5)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(entradaNumero, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
										.addGroup(panel1Layout.createSequentialGroup()
											.addComponent(label1)
											.addGap(18, 18, 18)
											.addComponent(entradaNombre, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(entradaApellido))
										.addGroup(panel1Layout.createSequentialGroup()
											.addComponent(label4)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(entradaCorreo, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))))))
						.addContainerGap(25, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(labelInicio)
						.addGap(10, 10, 10)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label1)
							.addComponent(entradaNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(entradaAlias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(entradaCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label5)
							.addComponent(entradaNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAgregar)
							.addComponent(botonSalir))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
	private JLabel labelInicio;
	private JLabel label1;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JTextField entradaNombre;
	private JTextField entradaAlias;
	private JTextField entradaCorreo;
	private JTextField entradaNumero;
	private JButton botonAgregar;
	private JButton botonSalir;
	private JTextField entradaApellido;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
