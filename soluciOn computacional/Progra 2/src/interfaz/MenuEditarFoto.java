/*
 * Created by JFormDesigner on Mon May 20 19:47:52 CST 2013
 */

package interfaz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import fotografia.Empresarial;
import fotografia.Fotografia;
import fotografia.Periodismo;
import fotografia.Social;

import alfe.ALFE;

/**
 * @author Jason Gonzalez
 */
public class MenuEditarFoto extends JFrame {
	public MenuEditarFoto() {
		initComponents();
	}

	private void botonSalirMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void botonEditarMouseClicked(MouseEvent e) {
		// TODO add your code here
		if(entradaID.getText().startsWith("FPer")){
			try{
				ALFE miAlfe = new ALFE();
				Periodismo miFoto = (Periodismo) miAlfe.gestorFotos.fotografias.get(entradaID.getText());
				VentanaEdicionPeriodismo ventana = new VentanaEdicionPeriodismo(miFoto);
				ventana.setVisible(true);
			}
			catch(Exception o){
				
			}
			
		}
		else if(entradaID.getText().startsWith("FSoc")){
			try{
				ALFE miAlfe = new ALFE();
				Social miFoto = (Social) miAlfe.gestorFotos.fotografias.get(entradaID.getText());
				VentanaEdicionSocial ventana = new VentanaEdicionSocial(miFoto);
				ventana.setVisible(true);
				
			}
			catch(Exception p){}
		}
		else if(entradaID.getText().startsWith("FEmp")){
			try{
				ALFE miAlfe = new ALFE();
				Empresarial miFoto = (Empresarial) miAlfe.gestorFotos.fotografias.get(entradaID.getText());
				VentanaEdicionEmpresarial ventana = new VentanaEdicionEmpresarial(miFoto);
				ventana.setVisible(true);
			}
			catch(Exception p){}
		}
		else{
			System.out.println("ID inválido");
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Jason Gonzalez
		panel1 = new JPanel();
		labelInicio = new JLabel();
		labelId = new JLabel();
		entradaID = new JTextField();
		botonEditar = new JButton();
		botonSalir = new JButton();

		//======== this ========
		Container contentPane = getContentPane();

		//======== panel1 ========
		{

			

			//---- labelInicio ----
			labelInicio.setText("ALFE");

			//---- labelId ----
			labelId.setText("ID de Fotograf\u00eda:");

			//---- botonEditar ----
			botonEditar.setText("Editar");
			botonEditar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					botonEditarMouseClicked(e);
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
								.addGap(144, 144, 144)
								.addComponent(labelInicio))
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(21, 21, 21)
								.addComponent(labelId)
								.addGroup(panel1Layout.createParallelGroup()
									.addGroup(panel1Layout.createSequentialGroup()
										.addGap(44, 44, 44)
										.addComponent(botonEditar)
										.addGap(18, 18, 18)
										.addComponent(botonSalir))
									.addGroup(panel1Layout.createSequentialGroup()
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(34, Short.MAX_VALUE))
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(labelInicio)
						.addGap(18, 18, 18)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(labelId)
							.addComponent(entradaID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(botonSalir)
							.addComponent(botonEditar))
						.addGap(23, 23, 23))
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
	private JLabel labelInicio;
	private JLabel labelId;
	private JTextField entradaID;
	private JButton botonEditar;
	private JButton botonSalir;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
