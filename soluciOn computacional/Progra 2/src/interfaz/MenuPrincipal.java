/*
 * Created by JFormDesigner on Mon May 20 19:36:57 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Jason Gonzalez
 */
public class MenuPrincipal extends JFrame {
	public MenuPrincipal() {
		initComponents();
	}

	private void botonAnadirFMouseClicked(MouseEvent e) {
		// TODO add your code here
		MenuFotos miMenu = new MenuFotos();
		miMenu.setVisible(true);
	}

	private void botonAnadirPerMouseClicked(MouseEvent e) {
		// TODO add your code here
		VentanaPersona miPersona = new VentanaPersona();
		miPersona.setVisible(true);
	}

	private void botonConsultaMouseClicked(MouseEvent e) {
		// TODO add your code here
		VentanaConsulta miConsulta = new VentanaConsulta();
		miConsulta.setVisible(true);
	}

	private void botonGeneradorMouseClicked(MouseEvent e) {
		// TODO add your code here
		VentanaPdf miPdf = new VentanaPdf();
		miPdf.setVisible(true);
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void botonEditarFoMouseClicked(MouseEvent e) {
		// TODO add your code here
		MenuEditarFoto miEditor = new MenuEditarFoto();
		miEditor.setVisible(true);
	}

	private void botonFotosMouseClicked(MouseEvent e) {
		// TODO add your code here
		ListaFotografias ventana = new ListaFotografias();
		ventana.setVisible(true);
	}

	private void botonPersonasMouseClicked(MouseEvent e) {
		// TODO add your code here
		ListaPersonas ventana = new ListaPersonas();
		ventana.setVisible(true);
	}

	private void botonEtiquetarMouseClicked(MouseEvent e) {
		// TODO add your code here
		VentanaEtiquetar ventana = new VentanaEtiquetar();
		ventana.setVisible(true);
	}

	private void botonTopNMouseClicked(MouseEvent e) {
		// TODO add your code here
		VentanaTopN miTop = new VentanaTopN();
		miTop.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		labelInicio = new JLabel();
		botonAnadirF = new JButton();
		botonAnadirPer = new JButton();
		botonEditarFo = new JButton();
		botonSalir = new JButton();
		botonConsulta = new JButton();
		botonGenerador = new JButton();
		botonTopN = new JButton();
		botonFotos = new JButton();
		botonPersonas = new JButton();
		botonEtiquetar = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{


			//---- labelInicio ----
			labelInicio.setText("ALFE");
			labelInicio.setFont(new Font("Tahoma", Font.PLAIN, 20));

			//---- botonAnadirF ----
			botonAnadirF.setText("A\u00f1adir Fotograf\u00eda");
			botonAnadirF.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAnadirFMouseClicked(e);
				}
			});

			//---- botonAnadirPer ----
			botonAnadirPer.setText("A\u00f1adir Persona");
			botonAnadirPer.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAnadirPerMouseClicked(e);
				}
			});

			//---- botonEditarFo ----
			botonEditarFo.setText("Editar Fotograf\u00eda");
			botonEditarFo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonEditarFoMouseClicked(e);
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

			//---- botonConsulta ----
			botonConsulta.setText("Consultar Fotograf\u00eda");
			botonConsulta.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonConsultaMouseClicked(e);
				}
			});

			//---- botonGenerador ----
			botonGenerador.setText("Generar Pdf");
			botonGenerador.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonGeneradorMouseClicked(e);
				}
			});

			//---- botonTopN ----
			botonTopN.setText("Ver Top N");
			botonTopN.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonTopNMouseClicked(e);
				}
			});

			//---- botonFotos ----
			botonFotos.setText("Ver Fotos");
			botonFotos.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonFotosMouseClicked(e);
				}
			});

			//---- botonPersonas ----
			botonPersonas.setText("Ver Personas");
			botonPersonas.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonPersonasMouseClicked(e);
				}
			});

			//---- botonEtiquetar ----
			botonEtiquetar.setText("Etiquetar persona");
			botonEtiquetar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonEtiquetarMouseClicked(e);
				}
			});

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(165, 165, 165)
								.addComponent(labelInicio))
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(35, 35, 35)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(botonAnadirF, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonAnadirPer, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonEditarFo, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonTopN, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonFotos, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(botonEtiquetar, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(34, 34, 34)
								.addGroup(panel1Layout.createParallelGroup()
									.addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(botonConsulta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(botonGenerador, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(botonPersonas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addComponent(botonSalir, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(45, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(labelInicio)
						.addGap(37, 37, 37)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAnadirF)
							.addComponent(botonConsulta))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAnadirPer)
							.addComponent(botonGenerador))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonEditarFo)
							.addComponent(botonPersonas))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(botonTopN)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(botonFotos)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(botonEtiquetar)
						.addGap(18, 18, 18)
						.addComponent(botonSalir)
						.addContainerGap(27, Short.MAX_VALUE))
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
				.addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JPanel panel1;
	private JLabel labelInicio;
	private JButton botonAnadirF;
	private JButton botonAnadirPer;
	private JButton botonEditarFo;
	private JButton botonSalir;
	private JButton botonConsulta;
	private JButton botonGenerador;
	private JButton botonTopN;
	private JButton botonFotos;
	private JButton botonPersonas;
	private JButton botonEtiquetar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
