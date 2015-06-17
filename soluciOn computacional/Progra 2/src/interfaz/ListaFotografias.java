/*
 * Created by JFormDesigner on Mon May 20 21:51:45 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;

import fotografia.Fotografia;

import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class ListaFotografias extends JFrame {
	public ListaFotografias() {
		initComponents();

		Enumeration<Fotografia> e = ALFE.gestorFotos.fotografias.elements();
		DefaultListModel listModel = new DefaultListModel();
		
		while(e.hasMoreElements()){
			listModel.addElement(e.nextElement().getId()+"    " + e.nextElement().getNombreArchivo() +
					"  "+e.nextElement().getDescripcion());
		}
		
		listaFotos.setModel(listModel);
		
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		scrollPane1 = new JScrollPane();
		listaFotos = new JList();
		botonSalir = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{

	
			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(listaFotos);
			}

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
						.addContainerGap()
						.addGroup(panel1Layout.createParallelGroup()
							.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addGap(0, 311, Short.MAX_VALUE)
								.addComponent(botonSalir)))
						.addContainerGap())
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
						.addComponent(botonSalir)
						.addContainerGap())
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
	private JScrollPane scrollPane1;
	private JList listaFotos;
	private JButton botonSalir;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
