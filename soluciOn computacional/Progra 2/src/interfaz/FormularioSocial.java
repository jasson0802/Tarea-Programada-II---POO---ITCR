/*
 * Created by JFormDesigner on Mon May 20 21:39:21 CST 2013
 */

package interfaz;

import java.awt.*;
import persona.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import alfe.*;
import constantesTipos.*;
import fotografia.*;
import persona.*;
/**
 * @author Jason Gonzalez
 */

import constantesTipos.*;

public class FormularioSocial extends JFrame {
	public FormularioSocial() {
		initComponents();
		ConstantesTipos misConstantes = new ConstantesTipos();
		
		for(int i = 0; i<misConstantes.actividades.size();i++){
			comboActividad.addItem(misConstantes.actividades.get(i));
		}
		
		comboLocacion.addItem("Al aire libre");
		comboLocacion.addItem("Sitio cerrado");
		
		comboTipo.addItem("Pública");
		comboTipo.addItem("Privada");
		
		for(int i = 0; i<misConstantes.listaPaises.size();i++){
			comboPaises.addItem(misConstantes.listaPaises.get(i));
		}
		
		
		
	}

	private ConstantesTipos misConstantes;
	private void botonAgregarImgMouseClicked(MouseEvent e) {
		// TODO add your code here
		JFileChooser explorador = new JFileChooser();
		

		/*for(int i =0;i<misConstantes.formatosImagen.size();i++){
			FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter(misConstantes.formatosImagen.get(i));
			explorador.setFileFilter(filtroImagen);
		}*/

		
		explorador.setDialogTitle("Seleccionar Imagen");
		
		//Muestro un dialogo sin pasarle parent con el boton de abrir
		int seleccion = explorador.showDialog(this, "Aceptar");
		//analizamos la respuesta
		switch(seleccion) {
		case JFileChooser.APPROVE_OPTION:
		 //seleccionó abrir
		 break;

		case JFileChooser.CANCEL_OPTION:
		 //dio click en cancelar o cerro la ventana
		 break;

		case JFileChooser.ERROR_OPTION:
		 //llega aqui si sucede un error
		 break;
		}
		File archivo = explorador.getSelectedFile();
		rutaImagen = archivo.getPath();
		entradaImagen.setText(rutaImagen);
		
		tamano = String.valueOf((archivo.length()));
		
		imagen = new ImageIcon(rutaImagen).getImage();
		
		entradaBase.setText(String.valueOf(imagen.getHeight(null)));
		entradaAltura.setText(String.valueOf(imagen.getWidth(null)));
				
		
		entradaTamano.setText(tamano);
		
		
	}

	private Image imagen;
	
	private void botonCrearMouseClicked(MouseEvent e) {
		// TODO add your code here
		dia = entradaDia.getText();
		mes = entradaMes.getText();
		anio = entradaAnio.getText();
		
	
		
		base = entradaBase.getText();
		altura = entradaAltura.getText();
		formato = entradaFormato.getText();
		actividad = comboActividad.getSelectedItem().toString();
		pais = comboPaises.getSelectedItem().toString();
		descripcion = entradaDescripcion.getText();
		
		
		if(comboTipo.getSelectedItem().toString().equals("Privada")){
			dialog1.setVisible(true);
		}
		else{
		
		try{
			ALFE.gestorFotos.agregarFotografia(rutaImagen, pais, descripcion, dia, mes, anio, Integer.parseInt(base), 
					Integer.parseInt(altura),formato , Double.parseDouble(tamano), dia, mes, anio, "Baile", 
					true, true, "");
			this.dispose();
			
			
			
		}
		catch(Exception p){
			System.out.println("Valores inválidos");
		}
		}
		
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void botonAceptar2MouseClicked(MouseEvent e) {
		// TODO add your code here
		password = entradaPassword.getText();
		
		
		try{
			ALFE.gestorFotos.agregarFotografia(rutaImagen, pais, descripcion, dia, mes, anio, Integer.parseInt(base), 
					Integer.parseInt(altura),formato , Double.parseDouble(tamano), dia, mes, anio, "Baile", 
					true, false, password);
			
		}catch(Exception p){
			System.out.println("Valores inválidos");
		}
		dialog1.dispose();
	}

	private void botonSalir2MouseClicked(MouseEvent e) {
		// TODO add your code here
		dialog1.dispose();
	}


	
	private String password;
	private String dia;
	private String mes;
	private String anio;
	private String descripcion;
	private String tamano;
	private String base;
	private String altura;
	private String formato;
	private String rutaImagen;
	private String pais;
	private String actividad;

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		label1 = new JLabel();
		entradaImagen = new JTextField();
		botonAgregarImg = new JButton();
		label2 = new JLabel();
		comboPaises = new JComboBox();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		entradaDia = new JTextField();
		botonCrear = new JButton();
		botonSalir = new JButton();
		comboActividad = new JComboBox();
		comboLocacion = new JComboBox();
		comboTipo = new JComboBox();
		entradaAnio = new JTextField();
		entradaMes = new JTextField();
		label7 = new JLabel();
		entradaBase = new JTextField();
		entradaAltura = new JTextField();
		label8 = new JLabel();
		entradaTamano = new JTextField();
		label9 = new JLabel();
		entradaDescripcion = new JTextField();
		label10 = new JLabel();
		entradaFormato = new JTextField();
		dialog1 = new JDialog();
		label11 = new JLabel();
		entradaPassword = new JTextField();
		botonSalir2 = new JButton();
		botonAceptar2 = new JButton();

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

			//---- botonAgregarImg ----
			botonAgregarImg.setText("Agregar Imagen");
			botonAgregarImg.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAgregarImgMouseClicked(e);
				}
			});

			//---- label2 ----
			label2.setText("Pais:");

			//---- label3 ----
			label3.setText("Tipo de Actividad:");

			//---- label4 ----
			label4.setText("Locacion:");

			//---- label5 ----
			label5.setText("Tipo de Fotografia");

			//---- label6 ----
			label6.setText("Fecha(dd/mm/aaa):");

			//---- botonCrear ----
			botonCrear.setText("Guardar");
			botonCrear.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonCrearMouseClicked(e);
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

			//---- label7 ----
			label7.setText("Dimensiones(Largo-Ancho):");

			//---- label8 ----
			label8.setText("Tama\u00f1o(Kb):");

			//---- label9 ----
			label9.setText("Descripci\u00f3n:");

			//---- label10 ----
			label10.setText("Formato:");

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(160, 160, 160)
								.addComponent(botonCrear, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
								.addComponent(botonSalir, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(27, 27, 27)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(botonAgregarImg)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaImagen, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label5, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(comboTipo))
									.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
										.addComponent(label2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboPaises, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
									.addGroup(panel1Layout.createSequentialGroup()
										.addGroup(panel1Layout.createParallelGroup()
											.addComponent(label3)
											.addComponent(label4))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(panel1Layout.createParallelGroup()
											.addComponent(comboActividad)
											.addComponent(comboLocacion)))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label7)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaMes, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
									.addGroup(panel1Layout.createSequentialGroup()
										.addGroup(panel1Layout.createParallelGroup()
											.addComponent(label8)
											.addComponent(label9))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(panel1Layout.createParallelGroup()
											.addGroup(panel1Layout.createSequentialGroup()
												.addComponent(entradaTamano, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
												.addGap(18, 18, 18)
												.addComponent(label10)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(entradaFormato, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
												.addGap(29, 29, 29))
											.addComponent(entradaDescripcion, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))))))
						.addContainerGap(21, Short.MAX_VALUE))
					.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addGap(0, 197, Short.MAX_VALUE)
						.addComponent(label1)
						.addGap(185, 185, 185))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(9, 9, 9)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAgregarImg)
							.addComponent(entradaImagen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(comboPaises, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label2))
						.addGap(18, 18, 18)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(comboActividad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(comboLocacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label5)
							.addComponent(comboTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label6)
							.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaMes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label7)
							.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label8)
							.addComponent(entradaTamano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label10)
							.addComponent(entradaFormato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label9)
							.addComponent(entradaDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonCrear)
							.addComponent(botonSalir))
						.addContainerGap())
			);
		}

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== dialog1 ========
		{
			Container dialog1ContentPane = dialog1.getContentPane();

			//---- label11 ----
			label11.setText("Contrase\u00f1a:");

			//---- botonSalir2 ----
			botonSalir2.setText("Salir");
			botonSalir2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonSalir2MouseClicked(e);
				}
			});

			//---- botonAceptar2 ----
			botonAceptar2.setText("Aceptar");
			botonAceptar2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAceptar2MouseClicked(e);
				}
			});

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(dialog1ContentPaneLayout.createParallelGroup()
							.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
								.addComponent(label11)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(entradaPassword, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
							.addGroup(GroupLayout.Alignment.TRAILING, dialog1ContentPaneLayout.createSequentialGroup()
								.addGap(0, 34, Short.MAX_VALUE)
								.addComponent(botonAceptar2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(botonSalir2)))
						.addContainerGap())
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addGroup(dialog1ContentPaneLayout.createSequentialGroup()
						.addGap(37, 37, 37)
						.addGroup(dialog1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label11)
							.addComponent(entradaPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addGroup(dialog1ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonSalir2)
							.addComponent(botonAceptar2))
						.addContainerGap(13, Short.MAX_VALUE))
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JPanel panel1;
	private JLabel label1;
	private JTextField entradaImagen;
	private JButton botonAgregarImg;
	private JLabel label2;
	private JComboBox comboPaises;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JTextField entradaDia;
	private JButton botonCrear;
	private JButton botonSalir;
	private JComboBox comboActividad;
	private JComboBox comboLocacion;
	private JComboBox comboTipo;
	private JTextField entradaAnio;
	private JTextField entradaMes;
	private JLabel label7;
	private JTextField entradaBase;
	private JTextField entradaAltura;
	private JLabel label8;
	private JTextField entradaTamano;
	private JLabel label9;
	private JTextField entradaDescripcion;
	private JLabel label10;
	private JTextField entradaFormato;
	private JDialog dialog1;
	private JLabel label11;
	private JTextField entradaPassword;
	private JButton botonSalir2;
	private JButton botonAceptar2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
