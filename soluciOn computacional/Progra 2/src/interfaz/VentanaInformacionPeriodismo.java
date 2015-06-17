/*
 * Created by JFormDesigner on Wed May 22 14:04:46 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import alfe.ALFE;

import constantesTipos.ConstantesTipos;
import fotografia.Periodismo;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 * @author Jason Gonzalez
 */
public class VentanaInformacionPeriodismo extends JFrame {
	public VentanaInformacionPeriodismo(Periodismo pFoto) {
		initComponents();
		
		foto = pFoto;
		Sonido = foto.getSonidoEvento();
	
		cancion = new File(Sonido);
		
		imagenExterna = new ImageIcon(foto.getNombreArchivo()).getImage();
	    etiqueta.setIcon((Icon) imagenExterna);		
	    
	    panelImagen.add(etiqueta);
	    
	    textoInformacion.setText(foto.toString());
	}

	public Periodismo foto;
	public String Sonido;
	
	public  JLabel etiqueta = new JLabel(); 
	
	public Image imagenExterna;
	
	public File cancion;
	public BasicPlayer player = new BasicPlayer();
	
	
	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void botonPlayMouseClicked(MouseEvent e) throws Exception {
		// TODO add your code here
		try{
		 player.open(cancion);
		 player.play();}
		catch(Exception o){System.out.println("No se encuentra el archivo de sonido");}
	}

	private void botonStopMouseClicked(MouseEvent e) {
		// TODO add your code here
		try{
			player.stop();
		}catch(Exception o)
		{
			System.out.println("No se pudo abrir el archivo");
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panelImagen = new JScrollPane();
		scrollPane2 = new JScrollPane();
		textoInformacion = new JTextPane();
		botonSalir = new JButton();
		botonPlay = new JButton();
		botonStop = new JButton();
		
		

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

		//---- botonPlay ----
		botonPlay.setText(">");
		botonPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					botonPlayMouseClicked(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		//---- botonStop ----
		botonStop.setText("||");
		botonStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				botonStopMouseClicked(e);
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
						.addComponent(botonSalir, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(botonPlay, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(botonStop, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(6, 6, 6))
						.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(panelImagen)
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(botonPlay)
						.addComponent(botonStop))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(botonSalir)
					.addGap(0, 4, Short.MAX_VALUE))
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
	private JButton botonPlay;
	private JButton botonStop;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
