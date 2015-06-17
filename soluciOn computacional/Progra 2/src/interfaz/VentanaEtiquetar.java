/*
 * Created by JFormDesigner on Wed May 22 19:06:53 CST 2013
 */

package interfaz;

import fotografia.Empresarial;
import fotografia.Periodismo;
import fotografia.Social;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import persona.Persona;

import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class VentanaEtiquetar extends JFrame {
	public VentanaEtiquetar() {
		initComponents();
		entradaRelacion.setText("");
		for(int i = 0; i<ALFE.personas.size();i++){
			comboPersonas.addItem(ALFE.personas.get(i).getNombre()+" " + ALFE.personas.get(i).getApellido());
		}
		
	}

	private String id;
	private void botonAceptarMouseClicked(MouseEvent e) {
		// TODO add your code here
		id = entradaID.getText();
		if(entradaID.getText().startsWith("FSoc")){
			try{
				Social foto = (Social) ALFE.gestorFotos.fotografias.get(id);
				
				if(foto.getPassword()==""){
				vEtiqueta.setVisible(true);}
				else{
					vContrasena.setVisible(true);
				}
			}catch(Exception o){
				System.out.println("ID incorrecto");
			}
		}
		else{
			System.out.println("ID incorrecto");
		}
	}

	private void botonAceptar2MouseClicked(MouseEvent e) {
		// TODO add your code here
		String password = new String(entradaContrasena.getPassword());
		if(password.equals(ALFE.gestorFotos.fotografias.get(entradaID).getId())){
			vEtiqueta.setVisible(true);
		}
		else{
			System.out.println("La contraseña es incorrecta");
		}
		
	}

	private void botonEtiquetarMouseClicked(MouseEvent e) {
		// TODO add your code here
		Social foto = (Social) ALFE.gestorFotos.fotografias.get(entradaID.getText());
		Persona miPersona;
		for(int i = 0; i<ALFE.personas.size();i++){
			if(comboPersonas.getSelectedItem().toString().startsWith(ALFE.personas.get(i).getNombre())){
				if(comboPersonas.getSelectedItem().toString().endsWith(ALFE.personas.get(i).getApellido())){
					miPersona = ALFE.personas.get(i);
					foto.etiquetarPersona(miPersona, entradaRelacion.getText());
					break;
				}
				else{
					System.out.println("No se encuentra persona");
					break;
				}
		}else{System.out.println("No se encuentra persona");}
					
		}
	}

	private void botonCancelarMouseClicked(MouseEvent e) {
		// TODO add your code here
		vContrasena.setVisible(false);
	}

	private void botonCancelar2MouseClicked(MouseEvent e) {
		// TODO add your code here
		vEtiqueta.setVisible(false);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		entradaID = new JTextField();
		label1 = new JLabel();
		botonAceptar = new JButton();
		botonSalir = new JButton();
		vContrasena = new JDialog();
		entradaContrasena = new JPasswordField();
		label2 = new JLabel();
		botonAceptar2 = new JButton();
		botonCancelar = new JButton();
		vEtiqueta = new JDialog();
		label3 = new JLabel();
		comboPersonas = new JComboBox();
		label4 = new JLabel();
		entradaRelacion = new JTextField();
		botonEtiquetar = new JButton();
		botonCancelar2 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("ID");

		//---- botonAceptar ----
		botonAceptar.setText("Aceptar");
		botonAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				botonAceptarMouseClicked(e);
			}
		});

		//---- botonSalir ----
		botonSalir.setText("Salir");

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label1)
							.addGap(18, 18, 18)
							.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(botonAceptar)
							.addGap(28, 28, 28)
							.addComponent(botonSalir)))
					.addGap(23, 23, 23))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(30, 30, 30)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1)
						.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(botonAceptar)
						.addComponent(botonSalir))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());

		//======== vContrasena ========
		{
			Container vContrasenaContentPane = vContrasena.getContentPane();

			//---- label2 ----
			label2.setText("Contrase\u00f1a:");

			//---- botonAceptar2 ----
			botonAceptar2.setText("Aceptar");
			botonAceptar2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonAceptar2MouseClicked(e);
				}
			});

			//---- botonCancelar ----
			botonCancelar.setText("Cancelar");
			botonCancelar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonCancelarMouseClicked(e);
				}
			});

			GroupLayout vContrasenaContentPaneLayout = new GroupLayout(vContrasenaContentPane);
			vContrasenaContentPane.setLayout(vContrasenaContentPaneLayout);
			vContrasenaContentPaneLayout.setHorizontalGroup(
				vContrasenaContentPaneLayout.createParallelGroup()
					.addGroup(vContrasenaContentPaneLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(vContrasenaContentPaneLayout.createParallelGroup()
							.addGroup(vContrasenaContentPaneLayout.createSequentialGroup()
								.addComponent(label2)
								.addGap(16, 16, 16)
								.addComponent(entradaContrasena, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(35, Short.MAX_VALUE))
							.addGroup(GroupLayout.Alignment.TRAILING, vContrasenaContentPaneLayout.createSequentialGroup()
								.addGap(0, 43, Short.MAX_VALUE)
								.addComponent(botonAceptar2)
								.addGap(18, 18, 18)
								.addComponent(botonCancelar)
								.addGap(37, 37, 37))))
			);
			vContrasenaContentPaneLayout.setVerticalGroup(
				vContrasenaContentPaneLayout.createParallelGroup()
					.addGroup(vContrasenaContentPaneLayout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addGroup(vContrasenaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(entradaContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(vContrasenaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonAceptar2)
							.addComponent(botonCancelar))
						.addContainerGap(48, Short.MAX_VALUE))
			);
			vContrasena.pack();
			vContrasena.setLocationRelativeTo(vContrasena.getOwner());
		}

		//======== vEtiqueta ========
		{
			Container vEtiquetaContentPane = vEtiqueta.getContentPane();

			//---- label3 ----
			label3.setText("Persona");

			//---- label4 ----
			label4.setText("Relaci\u00f3n:");

			//---- botonEtiquetar ----
			botonEtiquetar.setText("Etiquetar");
			botonEtiquetar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonEtiquetarMouseClicked(e);
				}
			});

			//---- botonCancelar2 ----
			botonCancelar2.setText("Cancelar");
			botonCancelar2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonCancelar2MouseClicked(e);
				}
			});

			GroupLayout vEtiquetaContentPaneLayout = new GroupLayout(vEtiquetaContentPane);
			vEtiquetaContentPane.setLayout(vEtiquetaContentPaneLayout);
			vEtiquetaContentPaneLayout.setHorizontalGroup(
				vEtiquetaContentPaneLayout.createParallelGroup()
					.addGroup(vEtiquetaContentPaneLayout.createSequentialGroup()
						.addGroup(vEtiquetaContentPaneLayout.createParallelGroup()
							.addGroup(vEtiquetaContentPaneLayout.createSequentialGroup()
								.addGap(29, 29, 29)
								.addGroup(vEtiquetaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addComponent(label4)
									.addComponent(label3))
								.addGap(18, 18, 18)
								.addGroup(vEtiquetaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(comboPersonas, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
									.addComponent(entradaRelacion, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
							.addGroup(vEtiquetaContentPaneLayout.createSequentialGroup()
								.addGap(76, 76, 76)
								.addComponent(botonEtiquetar)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(botonCancelar2)))
						.addContainerGap(43, Short.MAX_VALUE))
			);
			vEtiquetaContentPaneLayout.setVerticalGroup(
				vEtiquetaContentPaneLayout.createParallelGroup()
					.addGroup(vEtiquetaContentPaneLayout.createSequentialGroup()
						.addGap(19, 19, 19)
						.addGroup(vEtiquetaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(comboPersonas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(vEtiquetaContentPaneLayout.createParallelGroup()
							.addComponent(label4)
							.addComponent(entradaRelacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(vEtiquetaContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonEtiquetar)
							.addComponent(botonCancelar2))
						.addContainerGap(23, Short.MAX_VALUE))
			);
			vEtiqueta.pack();
			vEtiqueta.setLocationRelativeTo(vEtiqueta.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Jason Gonzalez
	private JTextField entradaID;
	private JLabel label1;
	private JButton botonAceptar;
	private JButton botonSalir;
	private JDialog vContrasena;
	private JPasswordField entradaContrasena;
	private JLabel label2;
	private JButton botonAceptar2;
	private JButton botonCancelar;
	private JDialog vEtiqueta;
	private JLabel label3;
	private JComboBox comboPersonas;
	private JLabel label4;
	private JTextField entradaRelacion;
	private JButton botonEtiquetar;
	private JButton botonCancelar2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
