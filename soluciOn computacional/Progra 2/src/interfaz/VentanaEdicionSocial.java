/*
 * Created by JFormDesigner on Tue May 21 11:03:39 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import alfe.ALFE;

import constantesTipos.ConstantesTipos;

import fotografia.Fotografia;
import fotografia.Social;

/**
 * @author Jason Gonzalez
 */
public class VentanaEdicionSocial extends JFrame {
	public VentanaEdicionSocial(Social miFoto) {
		initComponents();
		foto = miFoto;
		
		
		ConstantesTipos misConstantes = new ConstantesTipos();
		for(int i = 0; i<misConstantes.actividades.size();i++){
			comboActividad.addItem(misConstantes.actividades.get(i));
		}
		
		
		for(int i = 0; i<misConstantes.listaPaises.size();i++){
			comboPaises.addItem(misConstantes.listaPaises.get(i));
		}
		
		comboLocacion.addItem("Al aire libre");
		comboLocacion.addItem("Sitio cerrado");
		
		comboTipo.addItem("Pública");
		comboTipo.addItem("Privada");
		
		entradaBase.setText(String.valueOf(foto.dimensiones[0]));
		entradaAltura.setText(String.valueOf(foto.dimensiones[1]));
		
		entradaDescripcion.setText(foto.getDescripcion());
		entradaFormato.setText(foto.getTipoArchivo());
		entradaDia.setText(foto.getFechaActividad());
		entradaTamano.setText(String.valueOf(foto.getTamanoArchivo()));
		
		entradaImagen.setText(foto.getNombreArchivo());
		
	}

	private Social foto;
	
	private Image imagen;
	private void botonAgregarImgMouseClicked(MouseEvent e) {

		JFileChooser explorador = new JFileChooser();
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
		
		
		entradaTamano.setText(tamano);}
	
	
	
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
	private boolean locacion;
	private boolean tipo;

	private void botonCrearMouseClicked(MouseEvent e) {
		// TODO add your code here
		dia = foto.dia;
		mes = foto.mes;
		anio = foto.anio;
	
		
		base = entradaBase.getText();
		altura = entradaAltura.getText();
		formato = entradaFormato.getText();
		actividad = comboActividad.getSelectedItem().toString();
		pais = comboPaises.getSelectedItem().toString();
		
		if(comboLocacion.getSelectedItem().toString().equals("Al aire libre")){
			locacion = true;
		}
		else if(comboLocacion.getSelectedItem().toString().equals("Sitio Cerrado")){
			locacion = false;
		}
		
		
		if(comboTipo.getSelectedItem().toString().equals("Privada")){
			tipo = false;
			
		}
		else if (comboTipo.getSelectedItem().toString().equals("Pública")){
			tipo = true;
		}
		
		ALFE.gestorFotos.modificarFotografia(foto.getId(), rutaImagen, pais, descripcion, dia, mes, anio, Integer.parseInt(base),
				Integer.parseInt(altura), formato, Double.parseDouble(tamano), dia, mes, anio, actividad, true, true, "");
		
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
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
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		entradaDia = new JTextField();
		botonAgregarPersona = new JButton();
		botonCrear = new JButton();
		botonSalir = new JButton();
		comboActividad = new JComboBox();
		comboLocacion = new JComboBox();
		comboTipo = new JComboBox();
		entradaAnio = new JTextField();
		entradaMes = new JTextField();
		label7 = new JLabel();
		entradaBase = new JTextField();
		label8 = new JLabel();
		entradaTamano = new JTextField();
		label9 = new JLabel();
		entradaDescripcion = new JTextField();
		label10 = new JLabel();
		entradaFormato = new JTextField();
		entradaAltura = new JTextField();

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
			label3.setText("Tipo de Actividad:");

			//---- label4 ----
			label4.setText("Locacion:");

			//---- label5 ----
			label5.setText("Tipo de Fotografia");

			//---- label6 ----
			label6.setText("Fecha(dd/mm/aaa):");

			//---- botonAgregarPersona ----
			botonAgregarPersona.setText("Agregar Persona");

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
								.addGap(37, 37, 37)
								.addComponent(botonAgregarPersona)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
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
												.addComponent(entradaFormato, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
												.addGap(8, 8, 8))
											.addComponent(entradaDescripcion, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label7)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaMes, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))))
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
							.addComponent(botonAgregarPersona)
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
	private JButton botonAgregarPersona;
	private JButton botonCrear;
	private JButton botonSalir;
	private JComboBox comboActividad;
	private JComboBox comboLocacion;
	private JComboBox comboTipo;
	private JTextField entradaAnio;
	private JTextField entradaMes;
	private JLabel label7;
	private JTextField entradaBase;
	private JLabel label8;
	private JTextField entradaTamano;
	private JLabel label9;
	private JTextField entradaDescripcion;
	private JLabel label10;
	private JTextField entradaFormato;
	private JTextField entradaAltura;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
