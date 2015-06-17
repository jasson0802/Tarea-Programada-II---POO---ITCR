/*
 * Created by JFormDesigner on Mon May 20 20:05:48 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

import javazoom.jlgui.basicplayer.BasicPlayer;

import fotografia.Empresarial;
import fotografia.Fotografia;
import fotografia.Periodismo;
import fotografia.Social;
import javax.sound.sampled.*;
import java.io.*;



import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class VentanaConsulta extends JFrame {
	public VentanaConsulta() {
		initComponents();
	}

	public String id;

	
	
	
	
	
	
	private void botonConsultaMouseClicked(MouseEvent e) {
		// TODO add your code here
		id = entradaID.getText();
		if(id.startsWith("FEmp")){
			//try{
				fotoEmpresarial = (Empresarial) ALFE.gestorFotos.fotografias.get(id);
				
				/*ImageIcon imagen = new ImageIcon(fotoEmpresarial.getNombreArchivo());
				JLabel etiqueta = new JLabel(imagen); 
				pImagenEmpresarial.add(etiqueta);
				ImageIcon imagen2 = new ImageIcon(fotoEmpresarial.getCodigoQR());
				*/
				informacionEmpresarial.setText(fotoEmpresarial.toString());
				
				miImagenEmpresarial.setIcon(new ImageIcon(fotoEmpresarial.getNombreArchivo()));
				
				dialogEmpresarial.setVisible(true);
				
				miImagenQR.setIcon(new ImageIcon(fotoEmpresarial.getCodigoQR()));
				
				
				
	//		}catch(Exception o){
		//		System.out.println("No se encuentra la fotografia");
			}
		//}}
		else if(id.startsWith("FPer")){
			//try{
				fotoPeriodismo =  (Periodismo) ALFE.gestorFotos.fotografias.get(id);
				/*ImageIcon imagen = new ImageIcon(fotoPeriodismo.getNombreArchivo());
				JLabel etiqueta = new JLabel(imagen); 
				pImagenPeriodismo.add(etiqueta);*/
				informacionPeriodismo.setText(fotoPeriodismo.toString());
				
				miImagenPeriodismo.setIcon(new ImageIcon(fotoPeriodismo.getNombreArchivo()));
				dialogPeriodismo.setVisible(true);
			//}catch(Exception o){
				//System.out.println("No se encuentra la fotografia");
			//}
		}
		else if(id.startsWith("FSoc")){
		//	try{
				fotoSocial = (Social) ALFE.gestorFotos.fotografias.get(id);
				if(fotoSocial.getPassword()==""){
				/*ImageIcon imagen = new ImageIcon(fotoSocial.getNombreArchivo());
				JLabel etiqueta = new JLabel(imagen); 
				pImagenSocial.add(etiqueta);*/
				informacionSocial.setText(fotoSocial.toString());
				miImagenSocial.setIcon(new ImageIcon(fotoSocial.getNombreArchivo()));
				dialogSocial.setVisible(true);}
				else{
					dialog1.setVisible(true);
				}
			//}catch(Exception o){
				//System.out.println("No se encuentra la fotografia");
				
			//}
		}
		else{
			System.out.println("ID incorrecto");
		}
		
	}

	private void botonVerMouseClicked(MouseEvent e) {
		// TODO add your code here
		Social foto = (Social) ALFE.gestorFotos.fotografias.get(id);
		String password = new String(entryContrasena.getPassword());
		if(foto.getPassword().equals(password)){
			informacionSocial.setText(fotoSocial.toString());
			miImagenSocial.setIcon(new ImageIcon(fotoSocial.getNombreArchivo()));
			dialogSocial.setVisible(true);
		}
		else{
			System.out.println("Contraseña inválida");
		}
		
	}

	private Periodismo fotoPeriodismo;
	private Social fotoSocial;
	private Empresarial fotoEmpresarial;
	
	private void botonSalir2MouseClicked(MouseEvent e) {
		// TODO add your code here
		dialog1.dispose();
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	/*public BasicPlayer player = new BasicPlayer();
	private void botonPlayMouseClicked(MouseEvent e) {
		// TODO add your code here
		String Sonido = fotoPeriodismo.getSonidoEvento();
		File cancion = new File(Sonido);
		
		
		try{
			 player.open(cancion);
			 player.play();}
			catch(Exception o){System.out.println("No se encuentra el archivo de sonido");}
		
	}*/

	/*private void botonStopMouseClicked(MouseEvent e) {
		// TODO add your code here
		try{
			player.stop();
		}catch(Exception o)
		{
			System.out.println("No se pudo abrir el archivo");
		}
	}*/

	private void salirPeriodismoMouseClicked(MouseEvent e) {
		// TODO add your code here
		dialogPeriodismo.dispose();
	}

	private void salirSocialMouseClicked(MouseEvent e) {
		// TODO add your code here
		dialogSocial.dispose();
		this.dispose();
	}

	private void salirEmpresarialMouseClicked(MouseEvent e) {
		// TODO add your code here
		dialogEmpresarial.dispose();
		this.dispose();
	}

	private AudioFileFormat aff;
    private AudioInputStream ais;
    private Clip audio;
	private void botonPlayMouseClicked(MouseEvent e) {
		// TODO add your code here
		
		File sf = new File(fotoPeriodismo.getSonidoEvento());
		 try
	     {
	       aff = AudioSystem.getAudioFileFormat(sf); 
	       ais = AudioSystem.getAudioInputStream(sf);
	            
	       AudioFormat af = aff.getFormat(); 
	            
	       DataLine.Info info=new DataLine.Info(Clip.class,ais.getFormat(), 
	                        ((int) ais.getFrameLength()*af.getFrameSize())); 
	            
	       audio = (Clip)AudioSystem.getLine(info);
	       audio.open(ais);
	       audio.start();//Clip.LOOP_CONTINUOUSLY
	     }  catch(Exception o){System.out.println("El archivo no existe");}
	}

	private void botonStopMouseClicked(MouseEvent e) {
		// TODO add your code here
		audio.stop();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		entradaID = new JTextField();
		botonConsulta = new JButton();
		botonSalir = new JButton();
		dialog1 = new JDialog();
		panel2 = new JPanel();
		label3 = new JLabel();
		label4 = new JLabel();
		entryContrasena = new JPasswordField();
		botonVer = new JButton();
		botonSalir2 = new JButton();
		dialogPeriodismo = new JDialog();
		pImagenPeriodismo = new JScrollPane();
		miImagenPeriodismo = new JLabel();
		informacionPeriodismo = new JTextField();
		botonPlay = new JButton();
		botonStop = new JButton();
		salirPeriodismo = new JButton();
		dialogEmpresarial = new JDialog();
		pImagenEmpresarial = new JScrollPane();
		miImagenEmpresarial = new JLabel();
		informacionEmpresarial = new JTextPane();
		pImagenQR = new JScrollPane();
		miImagenQR = new JLabel();
		salirEmpresarial = new JButton();
		dialogSocial = new JDialog();
		pImagenSocial = new JScrollPane();
		miImagenSocial = new JLabel();
		informacionSocial = new JTextField();
		salirSocial = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{


			//---- label1 ----
			label1.setText("ALFE");
			label1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

			//---- label2 ----
			label2.setText("ID Fotograf\u00eda:");

			//---- botonConsulta ----
			botonConsulta.setText("Consultar Informaci\u00f3n");
			botonConsulta.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonConsultaMouseClicked(e);
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

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGroup(panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(138, 138, 138)
								.addComponent(label1))
							.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(panel1Layout.createSequentialGroup()
									.addContainerGap()
									.addComponent(botonConsulta)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(botonSalir))
								.addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
									.addGap(18, 18, 18)
									.addComponent(label2)
									.addGap(18, 18, 18)
									.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(25, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonSalir)
							.addComponent(botonConsulta))
						.addGap(33, 33, 33))
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

		//======== dialog1 ========
		{
			Container dialog1ContentPane = dialog1.getContentPane();

			//======== panel2 ========
			{

				// JFormDesigner evaluation mark
				panel2.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


				//---- label3 ----
				label3.setText("Contrase\u00f1a:");

				//---- label4 ----
				label4.setText("ALFE");
				label4.setFont(new Font("Times New Roman", Font.PLAIN, 20));

				//---- botonVer ----
				botonVer.setText("Ver Foto");
				botonVer.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						botonVerMouseClicked(e);
					}
				});

				//---- botonSalir2 ----
				botonSalir2.setText("Salir");
				botonSalir2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						botonSalir2MouseClicked(e);
					}
				});

				GroupLayout panel2Layout = new GroupLayout(panel2);
				panel2.setLayout(panel2Layout);
				panel2Layout.setHorizontalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addGroup(panel2Layout.createParallelGroup()
								.addGroup(panel2Layout.createSequentialGroup()
									.addGap(97, 97, 97)
									.addComponent(label4))
								.addGroup(panel2Layout.createSequentialGroup()
									.addGap(19, 19, 19)
									.addComponent(label3)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addGroup(panel2Layout.createSequentialGroup()
											.addComponent(botonVer)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(botonSalir2))
										.addComponent(entryContrasena, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(25, Short.MAX_VALUE))
				);
				panel2Layout.setVerticalGroup(
					panel2Layout.createParallelGroup()
						.addGroup(panel2Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label4)
							.addGap(18, 18, 18)
							.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(label3)
								.addComponent(entryContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(29, 29, 29)
							.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(botonVer)
								.addComponent(botonSalir2))
							.addContainerGap(29, Short.MAX_VALUE))
				);
			}

			GroupLayout dialog1ContentPaneLayout = new GroupLayout(dialog1ContentPane);
			dialog1ContentPane.setLayout(dialog1ContentPaneLayout);
			dialog1ContentPaneLayout.setHorizontalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			dialog1ContentPaneLayout.setVerticalGroup(
				dialog1ContentPaneLayout.createParallelGroup()
					.addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			);
			dialog1.pack();
			dialog1.setLocationRelativeTo(dialog1.getOwner());
		}

		//======== dialogPeriodismo ========
		{
			Container dialogPeriodismoContentPane = dialogPeriodismo.getContentPane();

			//======== pImagenPeriodismo ========
			{

				//---- miImagenPeriodismo ----
				miImagenPeriodismo.setText("text");
				pImagenPeriodismo.setViewportView(miImagenPeriodismo);
			}

			//---- botonPlay ----
			botonPlay.setText(">");
			botonPlay.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonPlayMouseClicked(e);
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

			//---- salirPeriodismo ----
			salirPeriodismo.setText("Salir");
			salirPeriodismo.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					salirPeriodismoMouseClicked(e);
				}
			});

			GroupLayout dialogPeriodismoContentPaneLayout = new GroupLayout(dialogPeriodismoContentPane);
			dialogPeriodismoContentPane.setLayout(dialogPeriodismoContentPaneLayout);
			dialogPeriodismoContentPaneLayout.setHorizontalGroup(
				dialogPeriodismoContentPaneLayout.createParallelGroup()
					.addGroup(dialogPeriodismoContentPaneLayout.createSequentialGroup()
						.addComponent(pImagenPeriodismo, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(dialogPeriodismoContentPaneLayout.createParallelGroup()
							.addGroup(dialogPeriodismoContentPaneLayout.createSequentialGroup()
								.addGroup(dialogPeriodismoContentPaneLayout.createParallelGroup()
									.addGroup(dialogPeriodismoContentPaneLayout.createSequentialGroup()
										.addComponent(botonPlay)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
										.addComponent(botonStop))
									.addComponent(salirPeriodismo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
							.addComponent(informacionPeriodismo, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
			);
			dialogPeriodismoContentPaneLayout.setVerticalGroup(
				dialogPeriodismoContentPaneLayout.createParallelGroup()
					.addGroup(dialogPeriodismoContentPaneLayout.createSequentialGroup()
						.addComponent(pImagenPeriodismo, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
						.addContainerGap())
					.addGroup(dialogPeriodismoContentPaneLayout.createSequentialGroup()
						.addComponent(informacionPeriodismo, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
						.addGap(22, 22, 22)
						.addGroup(dialogPeriodismoContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonPlay)
							.addComponent(botonStop))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(salirPeriodismo)
						.addGap(15, 15, 15))
			);
			dialogPeriodismo.pack();
			dialogPeriodismo.setLocationRelativeTo(dialogPeriodismo.getOwner());
		}

		//======== dialogEmpresarial ========
		{
			Container dialogEmpresarialContentPane = dialogEmpresarial.getContentPane();

			//======== pImagenEmpresarial ========
			{

				//---- miImagenEmpresarial ----
				miImagenEmpresarial.setText("text");
				pImagenEmpresarial.setViewportView(miImagenEmpresarial);
			}

			//======== pImagenQR ========
			{

				//---- miImagenQR ----
				miImagenQR.setText("text");
				pImagenQR.setViewportView(miImagenQR);
			}

			//---- salirEmpresarial ----
			salirEmpresarial.setText("Salir");
			salirEmpresarial.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					salirEmpresarialMouseClicked(e);
				}
			});

			GroupLayout dialogEmpresarialContentPaneLayout = new GroupLayout(dialogEmpresarialContentPane);
			dialogEmpresarialContentPane.setLayout(dialogEmpresarialContentPaneLayout);
			dialogEmpresarialContentPaneLayout.setHorizontalGroup(
				dialogEmpresarialContentPaneLayout.createParallelGroup()
					.addGroup(dialogEmpresarialContentPaneLayout.createSequentialGroup()
						.addComponent(pImagenEmpresarial, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(dialogEmpresarialContentPaneLayout.createParallelGroup()
							.addComponent(salirEmpresarial, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(dialogEmpresarialContentPaneLayout.createSequentialGroup()
								.addComponent(informacionEmpresarial, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
							.addComponent(pImagenQR))
						.addContainerGap())
			);
			dialogEmpresarialContentPaneLayout.setVerticalGroup(
				dialogEmpresarialContentPaneLayout.createParallelGroup()
					.addComponent(pImagenEmpresarial, GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
					.addGroup(dialogEmpresarialContentPaneLayout.createSequentialGroup()
						.addComponent(informacionEmpresarial, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pImagenQR, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(salirEmpresarial)
						.addContainerGap())
			);
			dialogEmpresarial.pack();
			dialogEmpresarial.setLocationRelativeTo(dialogEmpresarial.getOwner());
		}

		//======== dialogSocial ========
		{
			Container dialogSocialContentPane = dialogSocial.getContentPane();

			//======== pImagenSocial ========
			{

				//---- miImagenSocial ----
				miImagenSocial.setText("text");
				pImagenSocial.setViewportView(miImagenSocial);
			}

			//---- salirSocial ----
			salirSocial.setText("Salir");
			salirSocial.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					salirSocialMouseClicked(e);
				}
			});

			GroupLayout dialogSocialContentPaneLayout = new GroupLayout(dialogSocialContentPane);
			dialogSocialContentPane.setLayout(dialogSocialContentPaneLayout);
			dialogSocialContentPaneLayout.setHorizontalGroup(
				dialogSocialContentPaneLayout.createParallelGroup()
					.addGroup(dialogSocialContentPaneLayout.createSequentialGroup()
						.addComponent(pImagenSocial, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(dialogSocialContentPaneLayout.createParallelGroup()
							.addComponent(informacionSocial, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
							.addComponent(salirSocial, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
						.addContainerGap())
			);
			dialogSocialContentPaneLayout.setVerticalGroup(
				dialogSocialContentPaneLayout.createParallelGroup()
					.addGroup(dialogSocialContentPaneLayout.createSequentialGroup()
						.addGroup(dialogSocialContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(pImagenSocial, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
							.addComponent(informacionSocial, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(salirSocial)
						.addContainerGap())
			);
			dialogSocial.pack();
			dialogSocial.setLocationRelativeTo(dialogSocial.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JTextField entradaID;
	private JButton botonConsulta;
	private JButton botonSalir;
	private JDialog dialog1;
	private JPanel panel2;
	private JLabel label3;
	private JLabel label4;
	private JPasswordField entryContrasena;
	private JButton botonVer;
	private JButton botonSalir2;
	private JDialog dialogPeriodismo;
	private JScrollPane pImagenPeriodismo;
	private JLabel miImagenPeriodismo;
	private JTextField informacionPeriodismo;
	private JButton botonPlay;
	private JButton botonStop;
	private JButton salirPeriodismo;
	private JDialog dialogEmpresarial;
	private JScrollPane pImagenEmpresarial;
	private JLabel miImagenEmpresarial;
	private JTextPane informacionEmpresarial;
	private JScrollPane pImagenQR;
	private JLabel miImagenQR;
	private JButton salirEmpresarial;
	private JDialog dialogSocial;
	private JScrollPane pImagenSocial;
	private JLabel miImagenSocial;
	private JTextField informacionSocial;
	private JButton salirSocial;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
