/*
 * Created by JFormDesigner on Wed May 22 13:56:44 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import fotografia.Periodismo;
import fotografia.Social;

/**
 * @author Jason Gonzalez
 */
public class VentanaInformacionSocial extends JFrame {
	public VentanaInformacionSocial(Social pFoto) {
		initComponents();
		foto = pFoto;
		

		imagenExterna = new ImageIcon(foto.getNombreArchivo()).getImage();
	    etiqueta.setIcon((Icon) imagenExterna);		
	    
	    panelImagen.add(etiqueta);
	    textoInformacion.setText(foto.toString());
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}
	
	public Social foto;
	public String Sonido;
	
	public  JLabel etiqueta = new JLabel(); 
	
	public Image imagenExterna;

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panelImagen = new JScrollPane();
		scrollPane2 = new JScrollPane();
		textoInformacion = new JTextPane();
		botonSalir = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== scrollPane2 ========
		{
			scrollPane2.setViewportView(textoInformacion);
		}

		//---- botonSalir ----
		botonSalir.setText("Salir");
		botonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				botonSalirMouseClicked(e);
			}
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(2, 2, 2)
					.addComponent(panelImagen, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(botonSalir, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(botonSalir)
					.addGap(0, 7, Short.MAX_VALUE))
				.addComponent(panelImagen)
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JScrollPane panelImagen;
	private JScrollPane scrollPane2;
	private JTextPane textoInformacion;
	private JButton botonSalir;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
