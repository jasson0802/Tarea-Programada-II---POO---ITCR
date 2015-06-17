/*
 * Created by JFormDesigner on Thu May 23 00:07:56 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import fotografia.Fotografia;

import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class VentanaTopN extends JFrame {
	public VentanaTopN() {
		initComponents();
		comboTipo.addItem("Empresarial");
		comboTipo.addItem("Periodismo");
		comboTipo.addItem("Social");
	}

	private void botonTopMouseClicked(MouseEvent e) {
		// TODO add your code here
		ArrayList<Fotografia>miLista;
		if(comboTipo.getSelectedItem().equals("Empresarial")){
			 miLista=ALFE.generadorTop.generarTop(ALFE.gestorFotos.fotografias, Integer.parseInt(entradaCantidad.getText()), "FEmp");
			 DefaultListModel modelo = new DefaultListModel();
				for(int i = 0; i<miLista.size();i++){
					modelo.addElement(miLista.get(i).getId()+" "+miLista.get(i).getDescripcion()+" "+miLista.get(i).getFechaCreacion());
				}
				listaN.setModel(modelo);
		}
		else if(comboTipo.getSelectedItem().equals("Periodismo")){
			miLista = ALFE.generadorTop.generarTop(ALFE.gestorFotos.fotografias, Integer.parseInt(entradaCantidad.getText()), "FPer");
			DefaultListModel modelo = new DefaultListModel();
			for(int i = 0; i<miLista.size();i++){
				modelo.addElement(miLista.get(i).getId()+" "+miLista.get(i).getDescripcion()+" "+miLista.get(i).getFechaCreacion());
				
			}
			listaN.setModel(modelo);
		}
		else if(comboTipo.getSelectedItem().equals("Social")){
			miLista =ALFE.generadorTop.generarTop(ALFE.gestorFotos.fotografias, Integer.parseInt(entradaCantidad.getText()), "FSoc");
			DefaultListModel modelo = new DefaultListModel();
			for(int i = 0; i<miLista.size();i++){
				modelo.addElement(miLista.get(i).getId()+" "+miLista.get(i).getDescripcion()+" "+miLista.get(i).getFechaCreacion());
			}
			listaN.setModel(modelo);
		}
		else{System.out.println("Error");}
		
		dialog1.setVisible(true);
		
		}

		private void botonCerrarMouseClicked(MouseEvent e) {
			// TODO add your code here
			dialog1.setVisible(false);
		}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		label1 = new JLabel();
		entradaCantidad = new JTextField();
		label2 = new JLabel();
		comboTipo = new JComboBox();
		botonTop = new JButton();
		botonSalir = new JButton();
		dialog1 = new JDialog();
		scrollPane1 = new JScrollPane();
		listaN = new JList();
		botonCerrar = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Cantidad de elemetos:");

		//---- label2 ----
		label2.setText("Tipo de fotografia:");

		//---- botonTop ----
		botonTop.setText("Ver Top");
		botonTop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				botonTopMouseClicked(e);
			}
		});

		//---- botonSalir ----
		botonSalir.setText("Salir");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(botonTop)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(botonSalir))
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(entradaCantidad, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
							.addComponent(comboTipo, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1)
						.addComponent(entradaCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label2)
						.addComponent(comboTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(botonTop)
						.addComponent(botonSalir))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== dialog1 ========
		{
			Container dialog1ContentPane = dialog1.getContentPane();

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(listaN);
			}

			//---- botonCerrar ----
			botonCerrar.setText("Cerrar");
			botonCerrar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonCerrarMouseClicked(e);
				}
			});

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(dialog1ContentPaneLayout.createParallelGroup()
							.addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
							.addGroup(GroupLayout.Alignment.TRAILING, dialog1ContentPaneLayout.createSequentialGroup()
								.addGap(0, 236, Short.MAX_VALUE)
								.addComponent(botonCerrar)))
						.addContainerGap())
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(botonCerrar)
						.addGap(7, 7, 7))
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JLabel label1;
	private JTextField entradaCantidad;
	private JLabel label2;
	private JComboBox comboTipo;
	private JButton botonTop;
	private JButton botonSalir;
	private JDialog dialog1;
	private JScrollPane scrollPane1;
	private JList listaN;
	private JButton botonCerrar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
