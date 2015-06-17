/*
 * Created by JFormDesigner on Mon May 20 19:43:11 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class MenuFotos extends JFrame {
	public MenuFotos() {
		initComponents();
	}
	

	private void botonAnadirEmpresarialMouseClicked(MouseEvent e) {
		// TODO add your code here
		FormularioEmpresarial miEmpresarial = new FormularioEmpresarial();
		miEmpresarial.setVisible(true);
	}

	private void botonAnadirPeriodismoMouseClicked(MouseEvent e) {
		// TODO add your code here
		FormularioPeriodismo miPeriodismo = new FormularioPeriodismo();
		miPeriodismo.setVisible(true);
	}

	private void botonAnadirSocialMouseClicked(MouseEvent e) {
		// TODO add your code here
		FormularioSocial miSocial = new FormularioSocial();
		miSocial.setVisible(true);
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		botonAnadirEmpresarial = new JButton();
		botonAnadirPeriodismo = new JButton();
		botonAnadirSocial = new JButton();
		label1 = new JLabel();
		botonSalir = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{

		

			//---- botonAnadirEmpresarial ----
			botonAnadirEmpresarial.setText("A\u00f1adir Foto Empresarial");
			botonAnadirEmpresarial.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAnadirEmpresarialMouseClicked(e);
				}
			});

			//---- botonAnadirPeriodismo ----
			botonAnadirPeriodismo.setText("A\u00f1adir Foto Periodismo");
			botonAnadirPeriodismo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAnadirPeriodismoMouseClicked(e);
				}
			});

			//---- botonAnadirSocial ----
			botonAnadirSocial.setText("A\u00f1adir Foto Social");
			botonAnadirSocial.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAnadirSocialMouseClicked(e);
				}
			});

			//---- label1 ----
			label1.setText("ALFE");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 20));

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
						.addContainerGap(125, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(botonSalir, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonAnadirEmpresarial, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonAnadirPeriodismo, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonAnadirSocial, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(112, 112, 112))
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addComponent(label1)
								.addGap(168, 168, 168))))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1)
						.addGap(11, 11, 11)
						.addComponent(botonAnadirEmpresarial, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(botonAnadirPeriodismo, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(botonAnadirSocial, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(23, 23, 23)
						.addComponent(botonSalir)
						.addContainerGap(58, Short.MAX_VALUE))
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
	private JButton botonAnadirEmpresarial;
	private JButton botonAnadirPeriodismo;
	private JButton botonAnadirSocial;
	private JLabel label1;
	private JButton botonSalir;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
