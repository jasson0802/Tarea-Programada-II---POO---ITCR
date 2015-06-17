/*
 * Created by JFormDesigner on Wed May 22 13:56:24 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import fotografia.Empresarial;
import fotografia.Social;

/**
 * @author Jason Gonzalez
 */
public class VentanaInformacionEmpresarial extends JFrame {
	public VentanaInformacionEmpresarial(Empresarial pFoto) {
		initComponents();
		foto = pFoto;
	    
	    textoInformacion.setText(foto.toString());
	    
	   
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	public Empresarial foto;
	public String Sonido;
	
	
	ImageIcon imagen = new ImageIcon(foto.getNombreArchivo());
	
	public  JLabel etiqueta = new JLabel(imagen); 
	

	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panelImagen = new JScrollPane();
		scrollPane2 = new JScrollPane();
		textoInformacion = new JTextPane();
		panelQR = new JScrollPane();
		botonSalir = new JButton();
		
		panelImagen.add(etiqueta);

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
					.addComponent(panelImagen, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(0, 61, Short.MAX_VALUE)
							.addComponent(botonSalir)
							.addContainerGap())
						.addComponent(panelQR, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
						.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(panelImagen)
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(panelQR, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(botonSalir)
					.addContainerGap())
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
	private JScrollPane panelQR;
	private JButton botonSalir;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
