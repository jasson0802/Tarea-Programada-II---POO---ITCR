/*
 * Created by JFormDesigner on Tue May 21 11:04:01 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import constantesTipos.ConstantesTipos;

import alfe.ALFE;

import fotografia.Fotografia;
import fotografia.Periodismo;

/**
 * @author Jason Gonzalez
 */
public class VentanaEdicionPeriodismo extends JFrame {
	public VentanaEdicionPeriodismo(Periodismo miFoto) {
		initComponents();		
		foto = miFoto;
		
		entradaImagen.setText(foto.getNombreArchivo());
		entradaLatitud.setText(foto.getLatitud());
		entradaLongitud.setText(foto.getLongitud());
		entradaFormato.setText(foto.getTipoArchivo());
		entradaHora.setText(foto.getHora());
		entradaSonido.setText(foto.getSonidoEvento());
		entradaBase.setText(String.valueOf(foto.dimensiones[0]));
		entradaAltura.setText(String.valueOf(foto.dimensiones[1]));
		
		entradaDescripcion.setText(foto.getDescripcion());
		
		
		ConstantesTipos misConstantes=new ConstantesTipos();
		for(int i = 0; i<misConstantes.listaPaises.size();i++){
			comboPaises.addItem(misConstantes.listaPaises.get(i));
		}
		
		for(int j = 0; j<misConstantes.ambitos.size();j++){
			comboAmbito.addItem(misConstantes.ambitos.get(j));
		}
		
		for(int k=0;k<misConstantes.eventos.size();k++){
			comboEvento.addItem(misConstantes.eventos.get(k));
		}
		
	}
	
	private Periodismo foto;
	private String rutaImagen;
	private String rutaSonido = "";
	
	private String dia;
	private String mes;
	private String anio;
	
	private String descripcion;
	private String tamano;
	
	private String base;
	private String altura;
	
	private String formato;
	
	private String longitud;
	private String latitud;
	
	private String pais;
	private String evento;
	private String ambito;
	
	private String hora;

	private Image imagen;
	private void botonAgregarImgMouseClicked(MouseEvent e) {
		// TODO add your code here
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
		
				
				
		
		entradaTamano.setText(tamano);
		
	}

	private void botonAgregarSonidoMouseClicked(MouseEvent e) {
		// TODO add your code here
		JFileChooser explorador2 = new JFileChooser();
		explorador2.setDialogTitle("Seleccionar Sonido");
		
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
		File archivo2 = explorador2.getSelectedFile();
		rutaSonido = archivo2.getPath();
		entradaSonido.setText(rutaSonido);
	}

	private void botonCrearMouseClicked(MouseEvent e) {
		// TODO add your code here
		
		dia = foto.dia;
		mes = foto.mes;
		anio = foto.anio;
		
		base = entradaBase.getText();
		altura = entradaAltura.getText();
		
		descripcion = entradaDescripcion.getText();
		formato = entradaFormato.getText();
		
		
		tamano = entradaTamano.getText();
		
		longitud = entradaLongitud.getText();
		latitud = entradaLatitud.getText();
		
		pais = comboPaises.getSelectedItem().toString();
		evento = comboEvento.getSelectedItem().toString();
		ambito = comboAmbito.getSelectedItem().toString();
		
		hora = entradaHora.getText();
		
		
		ALFE.gestorFotos.modificarFotografia(foto.getId(), rutaImagen, pais, descripcion, dia, mes, anio, Integer.parseInt(base), Integer.parseInt(altura), formato,
				Double.parseDouble(tamano), evento, hora, ambito, rutaSonido, longitud, latitud);
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
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
		entradaLatitud = new JTextField();
		label5 = new JLabel();
		label6 = new JLabel();
		entradaDia = new JTextField();
		botonAgregarSonido = new JButton();
		botonCrear = new JButton();
		botonSalir = new JButton();
		comboEvento = new JComboBox();
		entradaLongitud = new JTextField();
		comboAmbito = new JComboBox();
		label7 = new JLabel();
		entradaHora = new JTextField();
		entradaSonido = new JTextField();
		entradaAnio = new JTextField();
		label8 = new JLabel();
		entradaBase = new JTextField();
		label9 = new JLabel();
		label10 = new JLabel();
		entradaTamano = new JTextField();
		label11 = new JLabel();
		entradaDescripcion = new JTextField();
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
			label3.setText("Tipo Evento:");

			//---- label4 ----
			label4.setText("Latitud, Longitud:");

			//---- label5 ----
			label5.setText("\u00c1mbito");

			//---- label6 ----
			label6.setText("Fecha(dd/mm/aaa):");

			//---- botonAgregarSonido ----
			botonAgregarSonido.setText("Agregar Sonido");
			botonAgregarSonido.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAgregarSonidoMouseClicked(e);
				}
			});

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
			label7.setText("Hora:");

			//---- label8 ----
			label8.setText("Dimensiones(Largo-Ancho):");

			//---- label9 ----
			label9.setText("Formato:");

			//---- label10 ----
			label10.setText("Tama\u00f1o(Kb):");

			//---- label11 ----
			label11.setText("Descripci\u00f3n:");

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
						.addContainerGap(205, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addComponent(botonCrear, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(botonSalir, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addGap(33, 33, 33))
							.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
								.addComponent(label1)
								.addGap(191, 191, 191))))
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(27, 27, 27)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
							.addGroup(panel1Layout.createSequentialGroup()
								.addComponent(botonAgregarImg)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(entradaImagen, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
							.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
								.addComponent(label11)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(entradaDescripcion))
							.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
								.addComponent(label8)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(label10)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(entradaTamano, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGroup(panel1Layout.createSequentialGroup()
								.addComponent(botonAgregarSonido)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(entradaSonido))
							.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
								.addComponent(label3)
								.addGap(27, 27, 27)
								.addComponent(comboEvento))
							.addGroup(panel1Layout.createSequentialGroup()
								.addComponent(label2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboPaises, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
							.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
								.addGroup(panel1Layout.createParallelGroup()
									.addComponent(label4)
									.addComponent(label5))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(panel1Layout.createParallelGroup()
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(entradaLatitud, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(entradaLongitud))
									.addComponent(comboAmbito)))
							.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
								.addGroup(panel1Layout.createParallelGroup()
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(label7)
										.addGap(80, 80, 80))
									.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
										.addComponent(label6, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
								.addGroup(panel1Layout.createParallelGroup()
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(78, 78, 78)
										.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))
									.addGroup(panel1Layout.createSequentialGroup()
										.addComponent(entradaHora, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(label9)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(entradaFormato)))))
						.addContainerGap())
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(9, 9, 9)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(entradaImagen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(botonAgregarImg))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(comboPaises, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label2))
						.addGap(18, 18, 18)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(comboEvento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(entradaLatitud, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaLongitud, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label5)
							.addComponent(comboAmbito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label6)
							.addComponent(entradaDia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaAnio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label7)
							.addComponent(entradaHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label9)
							.addComponent(entradaFormato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAgregarSonido)
							.addComponent(entradaSonido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label8)
							.addComponent(label10)
							.addComponent(entradaTamano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(entradaAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label11)
							.addComponent(entradaDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonSalir)
							.addComponent(botonCrear))
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
	private JLabel label1;
	private JTextField entradaImagen;
	private JButton botonAgregarImg;
	private JLabel label2;
	private JComboBox comboPaises;
	private JLabel label3;
	private JLabel label4;
	private JTextField entradaLatitud;
	private JLabel label5;
	private JLabel label6;
	private JTextField entradaDia;
	private JButton botonAgregarSonido;
	private JButton botonCrear;
	private JButton botonSalir;
	private JComboBox comboEvento;
	private JTextField entradaLongitud;
	private JComboBox comboAmbito;
	private JLabel label7;
	private JTextField entradaHora;
	private JTextField entradaSonido;
	private JTextField entradaAnio;
	private JLabel label8;
	private JTextField entradaBase;
	private JLabel label9;
	private JLabel label10;
	private JTextField entradaTamano;
	private JLabel label11;
	private JTextField entradaDescripcion;
	private JTextField entradaFormato;
	private JTextField entradaAltura;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
