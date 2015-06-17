/*
 * Created by JFormDesigner on Mon May 20 20:36:08 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import alfe.*;
import constantesTipos.*;
import fotografia.*;
import persona.*
;/**
 * @author Jason Gonzalez
 */

import constantesTipos.*;

public class FormularioEmpresarial extends JFrame {
	public FormularioEmpresarial() {
		initComponents();
		
		misConstantes = new ConstantesTipos();
		for(int i = 0; i<misConstantes.listaPaises.size();i++){
			comboPaises.addItem(misConstantes.listaPaises.get(i));
		}
		
		rutaQR = "";
		
	}

	private String rutaImagen;
	private String rutaQR; 
	private String compania;
	private String twitter;
	private String facebook;
	private ConstantesTipos misConstantes;
	
	private String ID;
	
	private String dia;
	private String mes;
	private String anio;
	private String descripcion;
	private String tamano;
	private String base;
	private String altura;
	private String formato;
	private String pais;
	
	private Image imagen;
	
	
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
		
		entradaTamanio.setText(tamano);
		
		
		
		
		
		
	}

	private void botonCrearMouseClicked(MouseEvent e) {
		// TODO add your code here
		twitter = entradaTwitter.getText();
		facebook = entradaFacebook.getText();
		dia = entradaDia.getText();
		mes = entradaMes.getText();
		anio = entradaAnio.getText();
		compania = entradaCompania.getText();
		base = entradaBase.getText();
		altura = entradaAltura.getText();
		pais = comboPaises.getSelectedItem().toString();
		formato = entradaFormato.getText();
		descripcion = entradaDescripcion.getText();
		
		
		try{
			ALFE.gestorFotos.agregarFotografia(rutaImagen, pais, descripcion, dia, mes, anio, Integer.parseInt(base), 
					Integer.parseInt(altura), formato, Double.parseDouble(tamano), compania, facebook, twitter, rutaQR);			
			this.dispose();
		}
		catch(Exception p){
			System.out.println("Valores inválidos");
		}
		
		
		
		}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void botonAgregarQRMouseClicked(MouseEvent e) {
		// TODO add your code here
		JFileChooser explorador2 = new JFileChooser();
		explorador2.setDialogTitle("Seleccionar Imagen");
		
		//Muestro un dialogo sin pasarle parent con el boton de abrir
		int seleccion = explorador2.showDialog(this, "Aceptar");
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
		File archivo = explorador2.getSelectedFile();
		rutaQR = archivo.getPath();
		entradaQR.setText(rutaQR);
	}

	

	
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
		entradaCompania = new JTextField();
		label4 = new JLabel();
		entradaTwitter = new JTextField();
		label5 = new JLabel();
		entradaFacebook = new JTextField();
		label6 = new JLabel();
		entradaDia = new JTextField();
		entradaQR = new JTextField();
		botonAgregarQR = new JButton();
		botonCrear = new JButton();
		botonSalir = new JButton();
		entradaAnio = new JTextField();
		entradaMes = new JTextField();
		label7 = new JLabel();
		entradaBase = new JTextField();
		entradaAltura = new JTextField();
		label8 = new JLabel();
		label9 = new JLabel();
		entradaTamanio = new JTextField();
		label10 = new JLabel();
		entradaDescripcion = new JTextField();
		entradaFormato = new JTextField();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{


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
			label3.setText("Compa\u00f1ia:");

			//---- label4 ----
			label4.setText("Cuenta de Twitter:");

			//---- label5 ----
			label5.setText("Cuenta de Facebook:");

			//---- label6 ----
			label6.setText("Fecha(dd/mm/aaa):");

			//---- botonAgregarQR ----
			botonAgregarQR.setText("Agregar QR");
			botonAgregarQR.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAgregarQRMouseClicked(e);
				}
			});

			//---- botonCrear ----
			botonCrear.setText("Crear");
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
			label8.setText("Formato:");

			//---- label9 ----
			label9.setText("Tama\u00f1o(Kb):");

			//---- label10 ----
			label10.setText("Descripci\u00f3n:");

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addComponent(botonCrear, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addGap(149, 149, 149))
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addComponent(label1)
								.addGap(181, 181, 181))))
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(botonSalir, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addGroup(panel1Layout.createSequentialGroup()
									.addComponent(label9)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(entradaTamanio, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(label10)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(entradaDescripcion, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(panel1Layout.createSequentialGroup()
									.addComponent(botonAgregarImg)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(entradaImagen, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
										.addComponent(label5)
										.addGap(18, 18, 18)
										.addComponent(entradaFacebook, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
									.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
										.addComponent(label4)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(entradaTwitter))
									.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
										.addComponent(label3)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaCompania))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label2)
										.addGap(18, 18, 18)
										.addComponent(comboPaises, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
									.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
										.addComponent(label6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaMes, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))))
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addGroup(panel1Layout.createSequentialGroup()
									.addComponent(label7)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(label8)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(entradaFormato))
								.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
									.addComponent(botonAgregarQR)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(entradaQR, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(35, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(9, 9, 9)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(entradaImagen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(botonAgregarImg))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(comboPaises, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(entradaCompania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(entradaTwitter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label5)
							.addComponent(entradaFacebook, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(entradaMes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label6)
								.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAgregarQR)
							.addComponent(entradaQR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label7)
							.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label8)
							.addComponent(entradaFormato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label9)
							.addComponent(entradaTamanio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label10)
							.addComponent(entradaDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
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
				.addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
	private JTextField entradaImagen;
	private JButton botonAgregarImg;
	private JLabel label2;
	private JComboBox comboPaises;
	private JLabel label3;
	private JTextField entradaCompania;
	private JLabel label4;
	private JTextField entradaTwitter;
	private JLabel label5;
	private JTextField entradaFacebook;
	private JLabel label6;
	private JTextField entradaDia;
	private JTextField entradaQR;
	private JButton botonAgregarQR;
	private JButton botonCrear;
	private JButton botonSalir;
	private JTextField entradaAnio;
	private JTextField entradaMes;
	private JLabel label7;
	private JTextField entradaBase;
	private JTextField entradaAltura;
	private JLabel label8;
	private JLabel label9;
	private JTextField entradaTamanio;
	private JLabel label10;
	private JTextField entradaDescripcion;
	private JTextField entradaFormato;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
