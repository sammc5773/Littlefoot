/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

import javax.swing.JFileChooser;
import javax.swing.event.ChangeEvent;

/**
 * 
 * @author Megan
 */
public class AppGrip extends javax.swing.JApplet {
	// my variables
	private String[] gripList = { "contracture" };
	private String[] extensions = { "Protruded Cylinder Hole",
			"Protruded Rectangular Hole", "Angled Cylinder Barrel",
			"Angled Rectangular Barrel", "Straight Cylinder Barrel",
			"Straight Rectangular Barrel" };
	private GripFab gripFab = new GripFab();

	private DecimalFormat df = new DecimalFormat("###.##");
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JSlider CHLinSlide;
	private javax.swing.JTabbedPane Panel;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JPanel cH;
	private javax.swing.JSlider cHDSlide;
	private javax.swing.JTextField cHDiameter;
	private javax.swing.JCheckBox cHLefty;
	private javax.swing.JTextField cHLin;
	private javax.swing.JCheckBox cHThrough;
	private javax.swing.JPanel cL;
	private javax.swing.JSlider cLDSlider;
	private javax.swing.JTextField cLDiameter;
	private javax.swing.JCheckBox cLLefty;
	private javax.swing.JTextField cLLin;
	private javax.swing.JSlider cLLinSlider;
	private javax.swing.JTextField cLLout;
	private javax.swing.JSlider cLLoutSlider;
	private javax.swing.JPanel cU;
	private javax.swing.JSlider cUASlider;
	private javax.swing.JTextField cUAngle;
	private javax.swing.JSlider cUDSlider;
	private javax.swing.JTextField cUDiameter;
	private javax.swing.JCheckBox cULefty;
	private javax.swing.JTextField cULout;
	private javax.swing.JSlider cULoutSlider;
	private java.awt.Canvas canvas1;
	private javax.swing.JLabel chImage;
	private javax.swing.JButton chooseExtension;
	private javax.swing.JButton chooseGrip;
	private javax.swing.JPanel directory;
	private javax.swing.JFileChooser directoryChooser;
	private javax.swing.JPanel eA;
	private javax.swing.JComboBox extensionsBox;
	private javax.swing.JPanel finish;
	private javax.swing.JComboBox<?> gripBox;
	private javax.swing.JPanel grips;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JSlider jSlider1;
	private javax.swing.JRadioButton newCheck;
	private javax.swing.JRadioButton profileCheck;
	private javax.swing.JFileChooser profileChooser;
	private javax.swing.JPanel rH;
	private javax.swing.JSlider rHHSlider;
	private javax.swing.JTextField rHHeight;
	private javax.swing.JCheckBox rHLefty;
	private javax.swing.JTextField rHLin;
	private javax.swing.JSlider rHLinSlider;
	private javax.swing.JCheckBox rHThrough;
	private javax.swing.JSlider rHWSlider;
	private javax.swing.JTextField rHWidth;
	private javax.swing.JPanel rL;
	private javax.swing.JTextField rLHeight;
	private javax.swing.JSlider rLHslider;
	private javax.swing.JCheckBox rLLefty;
	private javax.swing.JTextField rLLin;
	private javax.swing.JSlider rLLinSlider;
	private javax.swing.JTextField rLLout;
	private javax.swing.JSlider rLLoutSlider;
	private javax.swing.JSlider rLWSlidr;
	private javax.swing.JTextField rLWidth;
	private javax.swing.JPanel rU;
	private javax.swing.JSlider rUASlider;
	private javax.swing.JTextField rUAngle;
	private javax.swing.JSlider rUHSlider;
	private javax.swing.JTextField rUHeight;
	private javax.swing.JCheckBox rULefty;
	private javax.swing.JTextField rULout;
	private javax.swing.JSlider rULoutSlider;
	private javax.swing.JSlider rUWSlider;
	private javax.swing.JTextField rUWidth;
	private javax.swing.JCheckBox selectProfile;
	private javax.swing.JCheckBox selectSTL;
	private javax.swing.JCheckBox selectScad;
	private javax.swing.JButton submitCH;
	private javax.swing.JButton submitCL;
	private javax.swing.JButton submitCU;
	private javax.swing.JButton submitFinish;
	private javax.swing.JButton submitRH;
	private javax.swing.JButton submitRL;
	private javax.swing.JButton submitRU;

	// End of variables declaration//GEN-END:variables
	/**
	 * Initializes the applet AppGrip
	 */
	@Override
	public void init() {
		resize(850, 650);
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AppGrip.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AppGrip.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AppGrip.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AppGrip.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the applet */
		try {
			java.awt.EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					initComponents();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * This method is called from within the init() method to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	@SuppressWarnings("rawtypes")
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		Panel = new javax.swing.JTabbedPane();
		grips = new javax.swing.JPanel();
		gripBox = new javax.swing.JComboBox();
		chooseGrip = new javax.swing.JButton();
		jLabel18 = new javax.swing.JLabel();
		profileChooser = new javax.swing.JFileChooser();
		newCheck = new javax.swing.JRadioButton();
		profileCheck = new javax.swing.JRadioButton();
		cH = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		cHLin = new javax.swing.JTextField();
		cHDiameter = new javax.swing.JTextField();
		cHThrough = new javax.swing.JCheckBox();
		cHLefty = new javax.swing.JCheckBox();
		submitCH = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		CHLinSlide = new javax.swing.JSlider();
		cHDSlide = new javax.swing.JSlider();
		chImage = new javax.swing.JLabel();
		eA = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		extensionsBox = new javax.swing.JComboBox();
		chooseExtension = new javax.swing.JButton();
		jLabel30 = new javax.swing.JLabel();
		cL = new javax.swing.JPanel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		cLLin = new javax.swing.JTextField();
		cLDiameter = new javax.swing.JTextField();
		cLLefty = new javax.swing.JCheckBox();
		submitCL = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		cLLout = new javax.swing.JTextField();
		jLabel36 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		cLLinSlider = new javax.swing.JSlider();
		cLLoutSlider = new javax.swing.JSlider();
		cLDSlider = new javax.swing.JSlider();
		jLabel2 = new javax.swing.JLabel();
		jSlider1 = new javax.swing.JSlider();
		rU = new javax.swing.JPanel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		rUAngle = new javax.swing.JTextField();
		rUHeight = new javax.swing.JTextField();
		rULefty = new javax.swing.JCheckBox();
		submitRU = new javax.swing.JButton();
		jLabel24 = new javax.swing.JLabel();
		rUWidth = new javax.swing.JTextField();
		jLabel25 = new javax.swing.JLabel();
		rULout = new javax.swing.JTextField();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		rULoutSlider = new javax.swing.JSlider();
		rUASlider = new javax.swing.JSlider();
		rUWSlider = new javax.swing.JSlider();
		rUHSlider = new javax.swing.JSlider();
		jLabel43 = new javax.swing.JLabel();
		cU = new javax.swing.JPanel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		cUAngle = new javax.swing.JTextField();
		cUDiameter = new javax.swing.JTextField();
		cULefty = new javax.swing.JCheckBox();
		submitCU = new javax.swing.JButton();
		jLabel29 = new javax.swing.JLabel();
		cULout = new javax.swing.JTextField();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		cULoutSlider = new javax.swing.JSlider();
		cUDSlider = new javax.swing.JSlider();
		cUASlider = new javax.swing.JSlider();
		jLabel47 = new javax.swing.JLabel();
		rL = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		rLLin = new javax.swing.JTextField();
		rLHeight = new javax.swing.JTextField();
		rLLefty = new javax.swing.JCheckBox();
		submitRL = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		rLWidth = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		rLLout = new javax.swing.JTextField();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		rLLinSlider = new javax.swing.JSlider();
		rLLoutSlider = new javax.swing.JSlider();
		rLHslider = new javax.swing.JSlider();
		jLabel35 = new javax.swing.JLabel();
		rLWSlidr = new javax.swing.JSlider();
		rH = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		rHLin = new javax.swing.JTextField();
		rHHeight = new javax.swing.JTextField();
		rHThrough = new javax.swing.JCheckBox();
		rHLefty = new javax.swing.JCheckBox();
		submitRH = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		rHWidth = new javax.swing.JTextField();
		canvas1 = new java.awt.Canvas();
		jLabel4 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		rHLinSlider = new javax.swing.JSlider();
		rHHSlider = new javax.swing.JSlider();
		jLabel21 = new javax.swing.JLabel();
		rHWSlider = new javax.swing.JSlider();
		directory = new javax.swing.JPanel();
		directoryChooser = new javax.swing.JFileChooser();
		jLabel48 = new javax.swing.JLabel();
		finish = new javax.swing.JPanel();
		jLabel49 = new javax.swing.JLabel();
		selectProfile = new javax.swing.JCheckBox();
		selectScad = new javax.swing.JCheckBox();
		selectSTL = new javax.swing.JCheckBox();
		submitFinish = new javax.swing.JButton();
		jLabel50 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		jLabel52 = new javax.swing.JLabel();

		directory();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(Panel));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(Panel));
	}// </editor-fold>//GEN-END:initComponents

	private void cHThroughActionPerformed(java.awt.event.ActionEvent evt) {
		if (cHThrough.isSelected()) {
			cHLin.setText("70");
			CHLinSlide.setValue(100);
			CHLinSlide.setEnabled(false);
			cHLin.setEditable(false);
			gripFab.lin = 70.0;
		} else {
			cHLin.setEditable(true);
			CHLinSlide.setEnabled(true);
		}
	}

	private void rHThroughActionPerformed(java.awt.event.ActionEvent evt) {
		if (rHThrough.isSelected()) {
			rHLin.setText("70");
			rHLinSlider.setValue(100);
			rHLinSlider.setEnabled(false);
			rHLin.setEditable(false);
			gripFab.lin = 70.0;
		} else {
			rHLin.setEditable(true);
			rHLinSlider.setEnabled(true);
		}
	}

	protected void chooseGripActionPerformed(ActionEvent evt)
			throws GripNotFoundException, IOException {
		if (newCheck.isSelected()) {
			if ((gripBox.getSelectedItem() + ".stl").equals("contracture.stl")) {
				Path source = Paths
						.get("C:\\Program Files (x86)\\GripFab\\ContractureGrip\\contractureA.stl");
				Path dir = Paths.get(gripFab.directory);
				Path delete = Paths.get(gripFab.directory
						+ "\\contractureA.stl");
				Files.deleteIfExists(delete);
				Files.copy(source, dir.resolve(source.getFileName()));
				source = Paths
						.get("C:\\Program Files (x86)\\GripFab\\ContractureGrip\\contractureB.stl");
				delete = Paths.get(gripFab.directory + "\\contractureB.stl");
				Files.deleteIfExists(delete);
				Files.copy(source, dir.resolve(source.getFileName()));
				eA();
				showStatus("contrature selected");
			} else
				throw new GripNotFoundException();
		} else if (profileCheck.isSelected()) {
			try {
				gripFab.readProfile(profileChooser.getSelectedFile());
				if (gripFab.position.equals("Protruded Cylinder Hole"))
					cH();
				else if (gripFab.position.equals("Protruded Rectangular Hole"))
					rH();
				else if (gripFab.position.equals("Angled Cylinder Barrel"))
					cU();
				else if (gripFab.position.equals("Angled Rectangular Barrel"))
					rU();
				else if (gripFab.position.equals("Straight Cylinder Barrel"))
					cL();
				else if (gripFab.position.equals("Straight Rectangular Barrel"))
					rL();
				else
					throw new PositionNotSupportedException();
				showStatus("profile selected");
			} catch (NumberFormatException e) {
				showStatus("NumberFormatException, contact developer.");
				e.printStackTrace();
			} catch (IOException e) {
				showStatus("IOException, file not located");
				e.printStackTrace();
			} catch (PositionNotSupportedException e) {
				showStatus("Position in profile is not supported");
				e.printStackTrace();
			}
		} else
			showStatus("please select an option.");
		profileChooser.rescanCurrentDirectory();
	}

	protected void chooseExtensionActionPerformed(ActionEvent evt)
			throws PositionNotSupportedException {
		gripFab.position = (String) extensionsBox.getSelectedItem();
		if (gripFab.position.equals("Protruded Cylinder Hole"))
			cH();
		else if (gripFab.position.equals("Protruded Rectangular Hole"))
			rH();
		else if (gripFab.position.equals("Angled Cylinder Barrel"))
			cU();
		else if (gripFab.position.equals("Angled Rectangular Barrel"))
			rU();
		else if (gripFab.position.equals("Straight Cylinder Barrel"))
			cL();
		else if (gripFab.position.equals("Straight Rectangular Barrel"))
			rL();
		else
			throw new PositionNotSupportedException();
	}

	protected void submitCHActionPerformed(ActionEvent evt) {
		showStatus("submitting diameter...");
		gripFab.diameter = Double.parseDouble(cHDiameter.getText());
		showStatus("submitting protrusion length...");
		gripFab.lin = Double.parseDouble(cHLin.getText());
		showStatus("submitting lefty...");
		gripFab.lefty = cHLefty.isSelected();
		showStatus("Altering unused settings...");
		gripFab.angle = 0;
		gripFab.height = 0;
		gripFab.width = 0;
		gripFab.lout = 0;
		showStatus("Settings Submitted: Please select File for printing");
		finish();

	}

	protected void submitRHActionPerformed(ActionEvent evt) {
		showStatus("submitting height...");
		gripFab.height = Double.parseDouble(rHHeight.getText());
		showStatus("submitting width...");
		gripFab.width = Double.parseDouble(rHWidth.getText());
		showStatus("submitting protrusion length...");
		gripFab.lin = Double.parseDouble(rHLin.getText());
		showStatus("submitting lefty...");
		gripFab.lefty = rHLefty.isSelected();
		showStatus("Altering unused settings...");
		gripFab.angle = 0;
		gripFab.diameter = 0;
		gripFab.lout = 0;
		showStatus("Settings Submitted: Please select File for printing");
		finish();

	}

	protected void submitCLActionPerformed(ActionEvent evt) {
		showStatus("submitting diameter...");
		gripFab.diameter = Double.parseDouble(cLDiameter.getText());
		showStatus("submitting protrusion length...");
		gripFab.lin = Double.parseDouble(cLLin.getText());
		showStatus("submitting extrusion length...");
		gripFab.lout = Double.parseDouble(cLLout.getText());
		showStatus("submitting lefty...");
		gripFab.lefty = cLLefty.isSelected();
		showStatus("Altering unused settings...");
		gripFab.angle = 0;
		gripFab.height = 0;
		gripFab.width = 0;
		showStatus("Settings Submitted: Please select File for printing");
		finish();
	}

	protected void submitRLActionPerformed(ActionEvent evt) {
		showStatus("submitting height...");
		gripFab.height = Double.parseDouble(rLHeight.getText());
		showStatus("submitting width...");
		gripFab.width = Double.parseDouble(rLWidth.getText());
		showStatus("submitting extrusion length...");
		gripFab.lout = Double.parseDouble(rLLout.getText());
		showStatus("submitting protrusion length...");
		gripFab.lin = Double.parseDouble(rLLin.getText());
		showStatus("submitting lefty...");
		gripFab.lefty = rLLefty.isSelected();
		showStatus("Altering unused settings...");
		gripFab.angle = 0;
		gripFab.diameter = 0;
		showStatus("Settings Submitted: Please select File for printing");
		finish();
	}

	protected void submitCUActionPerformed(ActionEvent evt) {
		showStatus("submitting diameter...");
		gripFab.diameter = Double.parseDouble(cUDiameter.getText());
		showStatus("submitting extrusion length...");
		gripFab.lout = Double.parseDouble(cULout.getText());
		showStatus("submitting lefty...");
		gripFab.lefty = cULefty.isSelected();
		showStatus("submitting angle...");
		gripFab.angle = Double.parseDouble(cUAngle.getText());
		showStatus("Altering unused settings...");
		gripFab.lin = 0;
		gripFab.height = 0;
		gripFab.width = 0;
		showStatus("Settings Submitted: Please select File for printing");
		finish();
	}

	protected void submitRUActionPerformed(ActionEvent evt) {
		showStatus("submitting height...");
		gripFab.height = Double.parseDouble(rUHeight.getText());
		showStatus("submitting width...");
		gripFab.width = Double.parseDouble(rUWidth.getText());
		showStatus("submitting extrusion length...");
		gripFab.lout = Double.parseDouble(rULout.getText());
		showStatus("submitting angle...");
		gripFab.angle = Double.parseDouble(rUAngle.getText());
		showStatus("submitting lefty...");
		gripFab.lefty = rULefty.isSelected();
		showStatus("Altering unused settings...");
		gripFab.lin = 0;
		gripFab.diameter = 0;
		showStatus("Settings Submitted: Please select File for printing");
		finish();
	}

	protected void submitFinishActionPerformed(ActionEvent evt)
			throws PositionNotSupportedException, invalidDiameterException,
			STLNotPresentException, invalidDimmensionsException, IOException,
			InterruptedException {
		if (selectProfile.isSelected())
			gripFab.writeProfile();
		if (selectScad.isSelected())
			gripFab.writefile();
		if (selectSTL.isSelected())
			gripFab.writeSTL();
		showStatus("Files are Submitted: Please check your selected directory.");
	}

	protected void extensionsBoxActionPerformed(ActionEvent evt)
			throws PositionNotSupportedException {
		gripFab.position = (String) extensionsBox.getSelectedItem();
		if (gripFab.position.equals("Protruded Cylinder Hole"))
			jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
					"/resources/gripCH.gif")));
		else if (gripFab.position.equals("Protruded Rectangular Hole"))
			jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
					"/resources/gripRH.gif")));
		else if (gripFab.position.equals("Angled Cylinder Barrel"))
			jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
					"/resources/gripCU.gif")));
		else if (gripFab.position.equals("Angled Rectangular Barrel"))
			jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
					"/resources/gripRU.gif")));
		else if (gripFab.position.equals("Straight Cylinder Barrel"))
			jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
					"/resources/gripCL.gif")));
		else if (gripFab.position.equals("Straight Rectangular Barrel"))
			jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
					"/resources/gripRL.gif")));
		else
			throw new PositionNotSupportedException();
	}

	protected void cHDSlideStateChanged(ChangeEvent evt) {
		cHDiameter.setText(df.format((cHDSlide.getValue() * 1.0 / 100) * 11));
	}

	protected void cHLSlideStateChanged(ChangeEvent evt) {
		cHLin.setText(df.format((CHLinSlide.getValue() * 1.0 / 100) * 70));
	}

	protected void rHHSliderStateChanged(ChangeEvent evt) {
		rHHeight.setText(df.format((rHHSlider.getValue() * 1.0 / 100) * 13));
	}

	protected void rHLinSliderStateChanged(ChangeEvent evt) {
		rHLin.setText(df.format((rHLinSlider.getValue() * 1.0 / 100) * 70));
	}

	protected void cLDSliderStateChanged(ChangeEvent evt) {
		cLDiameter.setText(df.format((cLDSlider.getValue() * 1.0 / 100) * 11));
	}

	protected void cLLoutSlideStateChanged(ChangeEvent evt) {
		cLLout.setText(df.format((cLLoutSlider.getValue() * 1.0 / 100) * 200));
	}

	protected void cLLinSliderStateChanged(ChangeEvent evt) {
		cLLin.setText(df.format((cLLinSlider.getValue() * 1.0 / 100) * 70));
	}

	protected void rLHsliderStateChanged(ChangeEvent evt) {
		rLHeight.setText(df.format((rLHslider.getValue() * 1.0 / 100) * 13));
	}

	protected void rLLoutSliderStateChanged(ChangeEvent evt) {
		rLLout.setText(df.format((rLLoutSlider.getValue() * 1.0 / 100) * 200));
	}

	protected void rLLinSliderStateChanged(ChangeEvent evt) {
		rLLin.setText(df.format((rLLinSlider.getValue() * 1.0 / 100) * 70));
	}

	protected void cUASliderStateChanged(ChangeEvent evt) {
		cUAngle.setText(df.format((cUASlider.getValue() * 1.0 / 100) * 90));
	}

	protected void cUDSliderStateChanged(ChangeEvent evt) {
		cUDiameter.setText(df.format((cUDSlider.getValue() * 1.0 / 100) * 11));
	}

	protected void cULoutSliderStateChanged(ChangeEvent evt) {
		cULout.setText(df.format((cULoutSlider.getValue() * 1.0 / 100) * 200));
	}

	protected void rUHSliderStateChanged(ChangeEvent evt) {
		rUHeight.setText(df.format((rUHSlider.getValue() * 1.0 / 100) * 13));
	}

	protected void rUWSliderStateChanged(ChangeEvent evt) {
		rUWidth.setText(df.format((rUWSlider.getValue() * 1.0 / 100) * 13));
	}

	protected void rUASliderStateChanged(ChangeEvent evt) {
		rUAngle.setText(df.format((rUASlider.getValue() * 1.0 / 100) * 90));
	}

	protected void rULoutSliderStateChanged(ChangeEvent evt) {
		rULout.setText(df.format((rULoutSlider.getValue() * 1.0 / 100) * 200));
	}

	protected void rHWSliderStateChanged(ChangeEvent evt) {
		rHWidth.setText(df.format((rHWSlider.getValue() * 1.0 / 100) * 13));
	}

	protected void rLWSliderStateChanged(ChangeEvent evt) {
		rLWidth.setText(df.format((rLWSlidr.getValue() * 1.0 / 100) * 13));
	}

	protected void cHDiameterActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cHDiameter.getText());
		cHDSlide.setValue((int) (text * 100 / 11));
	}

	protected void cHLinActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cHLin.getText());
		CHLinSlide.setValue((int) (text * 100 / 70));
	}

	protected void rHWidthActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rHWidth.getText());
		rHWSlider.setValue((int) (text * 100 / 11));
	}

	protected void rHHeightActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rHHeight.getText());
		rHHSlider.setValue((int) (text * 100 / 13));
	}

	protected void rHLinActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rHLin.getText());
		rHLinSlider.setValue((int) (text * 100 / 70));
	}

	protected void cLLoutActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cLLout.getText());
		cLLoutSlider.setValue((int) (text * 100 / 200));
	}

	protected void cLDiameterActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cLDiameter.getText());
		cLDSlider.setValue((int) (text * 100 / 11));
	}

	protected void cLLinActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cLLin.getText());
		cLLinSlider.setValue((int) (text * 100 / 70));
	}

	protected void rLLoutActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rLLout.getText());
		rLLoutSlider.setValue((int) (text * 100 / 200));
	}

	protected void rLWidthActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rLWidth.getText());
		rLWSlidr.setValue((int) (text * 100 / 13));
	}

	protected void rLHeightActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rLHeight.getText());
		rLHslider.setValue((int) (text * 100 / 13));
	}

	protected void rLLinActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rLLin.getText());
		rLLinSlider.setValue((int) (text * 100 / 70));
	}

	protected void cULoutActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cULout.getText());
		cULoutSlider.setValue((int) (text * 100 / 200));
	}

	protected void cUDiameterActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cUDiameter.getText());
		cUDSlider.setValue((int) (text * 100 / 11));
	}

	protected void cUAngleActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(cUAngle.getText());
		cUASlider.setValue((int) (text * 100 / 90));
	}

	protected void rULoutActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rULout.getText());
		rULoutSlider.setValue((int) (text * 100 / 200));
	}

	protected void rUWidthActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rUWidth.getText());
		rUWSlider.setValue((int) (text * 100 / 13));
	}

	protected void rUHeightActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rUHeight.getText());
		rUHSlider.setValue((int) (text * 100 / 13));
	}

	protected void rUAngleActionPerformed(ActionEvent evt) {
		double text = Double.parseDouble(rUAngle.getText());
		rUASlider.setValue((int) (text * 100 / 90));
	}

	protected void profileCheckActionPerformed(ActionEvent evt) {
		if (profileCheck.isSelected()) {
			profileChooser.setVisible(true);
			chooseGrip.setVisible(false);
		}
	}

	protected void newCheckActionPerformed(ActionEvent evt) {
		if (newCheck.isSelected()) {
			profileChooser.setVisible(false);
			chooseGrip.setVisible(false);
		}
	}

	protected void profileChooserActionPerformed(ActionEvent evt)
			throws GripNotFoundException {
		int result = profileChooser.showSaveDialog(this);
		if (result == JFileChooser.APPROVE_OPTION)
			try {
				chooseGripActionPerformed(evt);
			} catch (IOException e) {
				showStatus("IOException from Grips");
				e.printStackTrace();
			}

	}

	protected void directoryChooserActionPerformed(ActionEvent evt)
			throws IOException {
		int result = directoryChooser.showSaveDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			gripFab.directory = directoryChooser.getSelectedFile()
					.getAbsolutePath();
			System.out.println(gripFab.directory);
			gripFab.name = gripFab.directory.substring(gripFab.directory
					.lastIndexOf("\\") + 1);
			Path source = Paths
					.get("C:\\Program Files (x86)\\GripFab\\openScad\\export.bat");
			Path dir = Paths.get(gripFab.directory);
			Path delete = Paths.get(gripFab.directory + "\\export.bat");
			Files.deleteIfExists(delete);
			Files.copy(source, dir.resolve(source.getFileName()));
			source = Paths
					.get("C:\\Program Files (x86)\\GripFab\\openScad\\openscad.exe");
			delete = Paths.get(gripFab.directory + "\\openscad.exe");
			Files.deleteIfExists(delete);
			Files.copy(source, dir.resolve(source.getFileName()));
			grips();

		}

	}

	private void directory() {
		jLabel48.setText("Choose Directory:");
		directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		directoryChooser.setAcceptAllFileFilterUsed(false);

		directoryChooser.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					directoryChooserActionPerformed(evt);
				} catch (IOException e) {
					showStatus("files will not copy");
					e.printStackTrace();
				}
			}
		});

		directoryChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

		jLabel48.setText("Choose Directory:");

		javax.swing.GroupLayout directoryLayout = new javax.swing.GroupLayout(
				directory);
		directory.setLayout(directoryLayout);
		directoryLayout
				.setHorizontalGroup(directoryLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								directoryLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												directoryLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																directoryChooser,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																885,
																Short.MAX_VALUE)
														.addGroup(
																directoryLayout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel48)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		directoryLayout
				.setVerticalGroup(directoryLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								directoryLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel48)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												directoryChooser,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												609, Short.MAX_VALUE)
										.addContainerGap()));
		Panel.addTab("Choose Directory", directory);
		Panel.setSelectedIndex(Panel.indexOfTab("Choose Directory"));
	}

	@SuppressWarnings("rawtypes")
	private void grips() {
		gripBox.setModel(new javax.swing.DefaultComboBoxModel(gripList));

		chooseGrip.setText("Choose");
		chooseGrip.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					chooseGripActionPerformed(evt);
				} catch (GripNotFoundException e) {
					showStatus("Grip was not found exception");
					e.printStackTrace();
				} catch (IOException e) {
					showStatus("IO expception from Grips");
					e.printStackTrace();
				}
			}
		});

		jLabel18.setText("or");

		profileChooser.setVisible(false);
		profileChooser.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					profileChooserActionPerformed(evt);
				} catch (GripNotFoundException e) {
					showStatus("Please select a different profile");
					e.printStackTrace();
				}
			}
		});

		buttonGroup1.add(newCheck);
		newCheck.setSelected(true);
		newCheck.setText("New Grip");
		newCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newCheckActionPerformed(evt);
			}
		});

		buttonGroup1.add(profileCheck);
		profileCheck.setText("Grip From Profile:");
		profileCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				profileCheckActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout gripsLayout = new javax.swing.GroupLayout(grips);
		grips.setLayout(gripsLayout);
		gripsLayout
				.setHorizontalGroup(gripsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gripsLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gripsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																profileChooser,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																574,
																Short.MAX_VALUE)
														.addGroup(
																gripsLayout
																		.createSequentialGroup()
																		.addComponent(
																				newCheck)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				gripBox,
																				0,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																gripsLayout
																		.createSequentialGroup()
																		.addComponent(
																				profileCheck)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				chooseGrip))
														.addGroup(
																gripsLayout
																		.createSequentialGroup()
																		.addGap(24,
																				24,
																				24)
																		.addComponent(
																				jLabel18)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		gripsLayout
				.setVerticalGroup(gripsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								gripsLayout
										.createSequentialGroup()
										.addGap(12, 12, 12)
										.addGroup(
												gripsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																gripBox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(newCheck))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel18)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												gripsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																chooseGrip)
														.addComponent(
																profileCheck))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												profileChooser,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(46, Short.MAX_VALUE)));

		Panel.addTab("Grips", grips);
		Panel.setSelectedIndex(Panel.indexOfTab("Grips"));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void eA() {
		jLabel3.setText("Extension:");

		extensionsBox
				.setModel(new javax.swing.DefaultComboBoxModel(extensions));
		extensionsBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					extensionsBoxActionPerformed(evt);
				} catch (PositionNotSupportedException e) {
					showStatus("Position Not Supported");
					e.printStackTrace();
				}
			}
		});

		chooseExtension.setText("Choose");
		chooseExtension.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					chooseExtensionActionPerformed(evt);
				} catch (PositionNotSupportedException e) {
					showStatus("Position was not supported? We are very sorry we put that there, how silly. Choose another option please.");
					e.printStackTrace();
				}
			}
		});

		jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripCH.gif"))); // NOI18N
		jLabel30.setText("");

		javax.swing.GroupLayout eALayout = new javax.swing.GroupLayout(eA);
		eA.setLayout(eALayout);
		eALayout.setHorizontalGroup(eALayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						eALayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel3)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(extensionsBox, 0, 831,
										Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(chooseExtension)
								.addContainerGap())
				.addGroup(
						eALayout.createSequentialGroup()
								.addGap(118, 118, 118)
								.addComponent(jLabel30,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										746,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		eALayout.setVerticalGroup(eALayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						eALayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										eALayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														extensionsBox,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(chooseExtension))
								.addGap(18, 18, 18).addComponent(jLabel30)
								.addContainerGap(186, Short.MAX_VALUE)));
		Panel.addTab("Extension", eA);
		Panel.setSelectedIndex(Panel.indexOfTab("Extension"));
	}

	private void cH() {
		cHLin.setText(gripFab.lin + "");
		cHLin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cHLinActionPerformed(evt);
			}
		});

		cHDiameter.setText(gripFab.diameter + "");
		cHDiameter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cHDiameterActionPerformed(evt);
			}
		});

		cHThrough.setText("Through");
		cHThrough.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cHThroughActionPerformed(evt);
			}
		});

		submitCH.setText("Submit");
		submitCH.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitCHActionPerformed(evt);
			}
		});

		CHLinSlide.setMaximum(100);
		CHLinSlide.setValue((int) (gripFab.lin * 100));
		CHLinSlide.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cHLSlideStateChanged(evt);
			}
		});

		cHDSlide.setMaximum(100);
		cHDSlide.setValue((int) (gripFab.diameter * 100));
		cHDSlide.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cHDSlideStateChanged(evt);
			}
		});

		jLabel5.setText("Diameter:");

		jLabel6.setText("Protrusion Length:");

		cHLefty.setText("Lefty");

		jLabel1.setText("mm");

		jLabel28.setText("mm");

		chImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripCH.gif"))); // NOI18N
		chImage.setText("");

		javax.swing.GroupLayout cHLayout = new javax.swing.GroupLayout(cH);
		cH.setLayout(cHLayout);
		cHLayout.setHorizontalGroup(cHLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						cHLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										cHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cHLayout.createSequentialGroup()
																.addComponent(
																		cHLefty)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		cHThrough))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														cHLayout.createSequentialGroup()
																.addGroup(
																		cHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						cHLayout.createSequentialGroup()
																								.addGroup(
																										cHLayout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel6)
																												.addComponent(
																														jLabel5))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										cHLayout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														cHDSlide,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addComponent(
																														CHLinSlide,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)))
																				.addGroup(
																						cHLayout.createSequentialGroup()
																								.addComponent(
																										submitCH)
																								.addGap(85,
																										85,
																										85)
																								.addComponent(
																										chImage,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										569,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(0,
																										104,
																										Short.MAX_VALUE)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						cHLin,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						cHDiameter,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel28)
																				.addComponent(
																						jLabel1))))
								.addContainerGap()));
		cHLayout.setVerticalGroup(cHLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						cHLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										cHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cHLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel5)
																.addComponent(
																		cHDiameter,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel1))
												.addComponent(
														cHDSlide,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										cHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														cHLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel6)
																.addComponent(
																		cHLin,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel28))
												.addComponent(
														CHLinSlide,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										cHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cHLayout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		cHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						cHLefty)
																				.addComponent(
																						cHThrough))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		submitCH))
												.addGroup(
														cHLayout.createSequentialGroup()
																.addGap(22, 22,
																		22)
																.addComponent(
																		chImage)))
								.addContainerGap(213, Short.MAX_VALUE)));
		Panel.remove(rH);
		Panel.remove(cL);
		Panel.remove(rL);
		Panel.remove(cU);
		Panel.remove(rU);
		Panel.addTab("Settings", cH);
		Panel.setSelectedIndex(Panel.indexOfTab("Settings"));
	}

	private void rH() {
		rHLin.setText(gripFab.lin + "");
		rHLin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rHLinActionPerformed(evt);
			}
		});

		rHHeight.setText(gripFab.height + "");
		rHHeight.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rHHeightActionPerformed(evt);
			}
		});

		rHThrough.setText("Through");
		rHThrough.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rHThroughActionPerformed(evt);
			}
		});

		submitRH.setText("Submit");
		submitRH.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitRHActionPerformed(evt);
			}
		});

		rHWidth.setText(gripFab.width + "");
		rHWidth.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rHWidthActionPerformed(evt);
			}
		});

		rHLinSlider.setMaximum(100);
		rHLinSlider.setValue((int) (gripFab.lin * 100 / 70));
		rHLinSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rHLinSliderStateChanged(evt);
			}
		});

		rHHSlider.setMaximum(100);
		rHHSlider.setValue((int) (gripFab.height * 100 / 13));
		rHHSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rHHSliderStateChanged(evt);
			}
		});

		rHWSlider.setMaximum(100);
		rHWSlider.setValue((int) (gripFab.width * 100 / 13));
		rHWSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rHWSliderStateChanged(evt);
			}
		});

		jLabel7.setText("Height:");

		jLabel8.setText("Protrusion Length:");

		rHLefty.setText("Lefty");

		jLabel9.setText("Width:");

		jLabel4.setText("mm");

		jLabel19.setText("mm");

		jLabel20.setText("mm");

		jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripRH.gif"))); // NOI18N
		jLabel21.setText("jLabel21");

		javax.swing.GroupLayout rHLayout = new javax.swing.GroupLayout(rH);
		rH.setLayout(rHLayout);
		rHLayout.setHorizontalGroup(rHLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						rHLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										rHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rHLayout.createSequentialGroup()
																.addGroup(
																		rHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jLabel7)
																				.addComponent(
																						jLabel9))
																.addGap(69, 69,
																		69)
																.addGroup(
																		rHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						rHHSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						rHWSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		rHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						rHLayout.createSequentialGroup()
																								.addComponent(
																										rHWidth,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel19))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						rHLayout.createSequentialGroup()
																								.addComponent(
																										rHHeight,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel4))))
												.addGroup(
														rHLayout.createSequentialGroup()
																.addComponent(
																		jLabel8)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		rHLinSlider,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		rHLin,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel20))
												.addGroup(
														rHLayout.createSequentialGroup()
																.addComponent(
																		submitRH)
																.addGap(58, 58,
																		58)
																.addComponent(
																		jLabel21,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		569,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		canvas1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(0,
																		175,
																		Short.MAX_VALUE))
												.addGroup(
														rHLayout.createSequentialGroup()
																.addComponent(
																		rHLefty)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		rHThrough)))
								.addContainerGap()));
		rHLayout.setVerticalGroup(rHLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						rHLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										rHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rHLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(
																		rHLayout.createSequentialGroup()
																				.addComponent(
																						jLabel7)
																				.addGap(10,
																						10,
																						10))
																.addComponent(
																		jLabel4,
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		22,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														rHHeight,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														rHHSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										rHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														rHLayout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		rHWSlider,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														rHLayout.createSequentialGroup()
																.addGroup(
																		rHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						rHLayout.createSequentialGroup()
																								.addGap(11,
																										11,
																										11)
																								.addGroup(
																										rHLayout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel19)
																												.addComponent(
																														rHWidth,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))
																				.addGroup(
																						rHLayout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel9)))
																.addGap(1, 1, 1)))
								.addGroup(
										rHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rHLayout.createSequentialGroup()
																.addGap(10, 10,
																		10)
																.addComponent(
																		jLabel8))
												.addGroup(
														rHLayout.createSequentialGroup()
																.addGap(4, 4, 4)
																.addGroup(
																		rHLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel20)
																				.addComponent(
																						rHLin,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														rHLayout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		rHLinSlider,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rHLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rHLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(
																		rHLayout.createSequentialGroup()
																				.addComponent(
																						rHLefty)
																				.addGap(18,
																						18,
																						18)
																				.addComponent(
																						submitRH))
																.addGroup(
																		rHLayout.createSequentialGroup()
																				.addGap(68,
																						68,
																						68)
																				.addComponent(
																						canvas1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														rHLayout.createSequentialGroup()
																.addGap(53, 53,
																		53)
																.addComponent(
																		jLabel21,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		350,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(rHThrough))
								.addContainerGap(121, Short.MAX_VALUE)));

		Panel.addTab("Settings", rH);
		Panel.remove(cH);
		Panel.remove(cL);
		Panel.remove(rL);
		Panel.remove(cU);
		Panel.remove(rU);
		Panel.setSelectedIndex(Panel.indexOfTab("Settings"));
	}

	private void cL() {
		cLLin.setText(gripFab.lin + "");
		cLLin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cLLinActionPerformed(evt);
			}
		});

		cLDiameter.setText(gripFab.diameter + "");
		cLDiameter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cLDiameterActionPerformed(evt);
			}
		});

		submitCL.setText("Submit");
		submitCL.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitCLActionPerformed(evt);
			}
		});

		cLLout.setText(gripFab.lout + "");
		cLLout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cLLoutActionPerformed(evt);
			}
		});

		cLLinSlider.setMaximum(100);
		cLLinSlider.setValue((int) (gripFab.lin * 100 / 70));
		cLLinSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cLLinSliderStateChanged(evt);
			}
		});

		cLLoutSlider.setMaximum(100);
		cLLoutSlider.setValue((int) (gripFab.lout * 100 / 200));
		cLLoutSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cLLoutSlideStateChanged(evt);
			}
		});

		cLDSlider.setMaximum(100);
		cLDSlider.setValue((int) (gripFab.diameter * 100 / 11));
		cLDSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cLDSliderStateChanged(evt);
			}
		});

		jLabel14.setText("Diameter:");

		jLabel15.setText("Protrusion Length:");

		cLLefty.setText("Lefty");

		jLabel17.setText("Extrusion Length:");

		jLabel36.setText("mm");

		jLabel37.setText("mm");

		jLabel38.setText("mm");

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripCL.gif"))); // NOI18N

		javax.swing.GroupLayout cLLayout = new javax.swing.GroupLayout(cL);
		cL.setLayout(cLLayout);
		cLLayout.setHorizontalGroup(cLLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						cLLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										cLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cLLayout.createSequentialGroup()
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel14)
																				.addComponent(
																						jLabel16)
																				.addComponent(
																						jLabel17))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						cLLoutSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						cLDSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						cLLayout.createSequentialGroup()
																								.addComponent(
																										cLLout,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel37))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						cLLayout.createSequentialGroup()
																								.addComponent(
																										cLDiameter,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel36))))
												.addGroup(
														cLLayout.createSequentialGroup()
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel15)
																				.addComponent(
																						cLLefty)
																				.addComponent(
																						submitCL))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						cLLinSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addGroup(
																						cLLayout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addGap(0,
																										0,
																										Short.MAX_VALUE))
																				.addComponent(
																						jSlider1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		cLLin,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jLabel38)))
								.addContainerGap()));
		cLLayout.setVerticalGroup(cLLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						cLLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										cLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														cLLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel14)
																.addComponent(
																		cLDiameter,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel36))
												.addComponent(
														cLDSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel16)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										cLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cLLayout.createSequentialGroup()
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						cLLayout.createSequentialGroup()
																								.addGap(4,
																										4,
																										4)
																								.addGroup(
																										cLLayout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														cLLout,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel37)))
																				.addComponent(
																						jLabel17))
																.addGroup(
																		cLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						cLLayout.createSequentialGroup()
																								.addGap(11,
																										11,
																										11)
																								.addGroup(
																										cLLayout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														cLLin,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel38)))
																				.addGroup(
																						cLLayout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										cLLayout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jSlider1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel15)))))
												.addComponent(
														cLLoutSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														cLLinSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										cLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cLLayout.createSequentialGroup()
																.addComponent(
																		cLLefty)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		submitCL))
												.addComponent(jLabel2))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		Panel.remove(cH);
		Panel.remove(rH);
		Panel.remove(rL);
		Panel.remove(cU);
		Panel.remove(rU);
		Panel.addTab("Settings", cL);
		Panel.setSelectedIndex(Panel.indexOfTab("Settings"));
	}

	private void rL() {
		rLLin.setText(gripFab.lin + "");
		rLLin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rLLinActionPerformed(evt);
			}
		});

		rLHeight.setText(gripFab.height + "");
		rLHeight.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rLHeightActionPerformed(evt);
			}
		});

		submitRL.setText("Submit");
		submitRL.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitRLActionPerformed(evt);
			}
		});

		rLWidth.setText(gripFab.width + "");
		rLWidth.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rLWidthActionPerformed(evt);
			}
		});

		rLLout.setText(gripFab.lout + "");
		rLLout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rLLoutActionPerformed(evt);
			}
		});

		rLLinSlider.setMaximum(100);
		rLLinSlider.setValue((int) (gripFab.lin * 100 / 70));
		rLLinSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rLLinSliderStateChanged(evt);
			}
		});

		rLLoutSlider.setMaximum(100);
		rLLoutSlider.setValue((int) (gripFab.lout * 100 / 200));
		rLLoutSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rLLoutSliderStateChanged(evt);
			}
		});

		rLHslider.setMaximum(100);
		rLHslider.setValue((int) (gripFab.height * 100 / 13));
		rLHslider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rLHsliderStateChanged(evt);
			}
		});

		rLWSlidr.setMaximum(100);
		rLWSlidr.setValue((int) (gripFab.height * 100 / 13));
		rLWSlidr.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rLWSliderStateChanged(evt);
			}
		});

		jLabel10.setText("Height:");

		jLabel11.setText("Protrusion Length:");

		rLLefty.setText("Lefty");

		jLabel12.setText("Width:");

		jLabel13.setText("Extrusion Length:");

		jLabel31.setText("mm");

		jLabel32.setText("mm");

		jLabel33.setText("mm");

		jLabel34.setText("mm");

		jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripRL.gif"))); // NOI18N
		jLabel35.setText("jLabel35");

		javax.swing.GroupLayout rLLayout = new javax.swing.GroupLayout(rL);
		rL.setLayout(rLLayout);
		rLLayout.setHorizontalGroup(rLLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						rLLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										rLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rLLayout.createSequentialGroup()
																.addGroup(
																		rLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel13)
																				.addComponent(
																						jLabel12)
																				.addComponent(
																						jLabel10))
																.addGap(18, 18,
																		18)
																.addGroup(
																		rLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						rLHslider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						rLLoutSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						rLWSlidr,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		rLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						rLLayout.createSequentialGroup()
																								.addComponent(
																										rLLout,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel33))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						rLLayout.createSequentialGroup()
																								.addComponent(
																										rLWidth,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel32))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						rLLayout.createSequentialGroup()
																								.addComponent(
																										rLHeight,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel31))))
												.addGroup(
														rLLayout.createSequentialGroup()
																.addGroup(
																		rLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel11)
																				.addComponent(
																						rLLefty)
																				.addComponent(
																						submitRL))
																.addGap(20, 20,
																		20)
																.addGroup(
																		rLLayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						rLLayout.createSequentialGroup()
																								.addComponent(
																										rLLinSlider,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										rLLin,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel34))
																				.addGroup(
																						rLLayout.createSequentialGroup()
																								.addGap(10,
																										10,
																										10)
																								.addComponent(
																										jLabel35,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										745,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(0,
																										5,
																										Short.MAX_VALUE)))))
								.addContainerGap()));
		rLLayout.setVerticalGroup(rLLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						rLLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										rLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rLLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel10)
																.addComponent(
																		rLHeight,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel31))
												.addComponent(
														rLHslider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rLLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel12)
																.addComponent(
																		rLWidth,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel32))
												.addComponent(
														rLWSlidr,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rLLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel13)
																.addComponent(
																		rLLout,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel33))
												.addComponent(
														rLLoutSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rLLayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel11)
																.addComponent(
																		rLLin,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel34))
												.addComponent(
														rLLinSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rLLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rLLayout.createSequentialGroup()
																.addComponent(
																		rLLefty)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		submitRL))
												.addComponent(
														jLabel35,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														507,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		Panel.addTab("Settings", rL);
		Panel.remove(cH);
		Panel.remove(rH);
		Panel.remove(cL);
		Panel.remove(rU);
		Panel.remove(cU);
		Panel.setSelectedIndex(Panel.indexOfTab("Settings"));
	}

	private void cU() {
		cUAngle.setText(gripFab.angle + "");
		cUAngle.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cUAngleActionPerformed(evt);
			}
		});

		cUDiameter.setText(gripFab.diameter + "");
		cUDiameter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cUDiameterActionPerformed(evt);
			}
		});

		cULout.setText(gripFab.lout + "");
		cULout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cULoutActionPerformed(evt);
			}
		});

		cULoutSlider.setMaximum(100);
		cULoutSlider.setValue((int) (gripFab.lout * 100 / 200));
		cULoutSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cULoutSliderStateChanged(evt);
			}
		});

		cUDSlider.setMaximum(100);
		cUDSlider.setValue((int) (gripFab.diameter * 100 / 11));
		cUDSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cUDSliderStateChanged(evt);
			}
		});

		cUASlider.setMaximum(100);
		cUASlider.setValue((int) (gripFab.angle * 100 / 90));
		cUASlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				cUASliderStateChanged(evt);
			}
		});

		jLabel26.setText("Diameter:");

		jLabel27.setText("Angle:");

		cULefty.setText("Lefty");

		submitCU.setText("Submit");
		submitCU.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitCUActionPerformed(evt);
			}
		});

		jLabel29.setText("Extrusion Length:");

		jLabel44.setText("mm");

		jLabel45.setText("mm");

		jLabel46.setText("mm");

		jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripCU.gif"))); // NOI18N

		javax.swing.GroupLayout cULayout = new javax.swing.GroupLayout(cU);
		cU.setLayout(cULayout);
		cULayout.setHorizontalGroup(cULayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						cULayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										cULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														cULayout.createSequentialGroup()
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel29)
																				.addComponent(
																						jLabel26)
																				.addComponent(
																						jLabel27))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						cULoutSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						cUDSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						cUASlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						cULayout.createSequentialGroup()
																								.addComponent(
																										cUDiameter,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(19,
																										19,
																										19)
																								.addComponent(
																										jLabel44))
																				.addGroup(
																						cULayout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addGroup(
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										cULayout.createSequentialGroup()
																												.addComponent(
																														cUAngle,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																												.addComponent(
																														jLabel46))
																								.addGroup(
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										cULayout.createSequentialGroup()
																												.addComponent(
																														cULout,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														jLabel45)))))
												.addGroup(
														cULayout.createSequentialGroup()
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						cULefty)
																				.addComponent(
																						submitCU))
																.addGap(52, 52,
																		52)
																.addComponent(
																		jLabel47)
																.addGap(0,
																		37,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		cULayout.setVerticalGroup(cULayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						cULayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										cULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														cULayout.createSequentialGroup()
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						cULayout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(
																										jLabel26)
																								.addComponent(
																										cUDiameter,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										jLabel44))
																				.addComponent(
																						cUDSlider,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						cULayout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(
																										jLabel29)
																								.addComponent(
																										cULout,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										jLabel45))
																				.addComponent(
																						cULoutSlider,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		cULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel27)
																				.addComponent(
																						cUAngle,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel46)))
												.addComponent(
														cUASlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										cULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														cULayout.createSequentialGroup()
																.addComponent(
																		cULefty)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		submitCU))
												.addComponent(jLabel47))
								.addContainerGap(146, Short.MAX_VALUE)));
		Panel.remove(cH);
		Panel.remove(rH);
		Panel.remove(cL);
		Panel.remove(rL);
		Panel.remove(rU);
		Panel.addTab("Settings", cU);
		Panel.setSelectedIndex(Panel.indexOfTab("Settings"));
	}

	private void rU() {
		rUAngle.setText(gripFab.angle + "");
		rUAngle.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rUAngleActionPerformed(evt);
			}
		});

		rUHeight.setText(gripFab.height + "");
		rUHeight.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rUHeightActionPerformed(evt);
			}
		});

		submitRU.setText("Submit");
		submitRU.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				submitRUActionPerformed(evt);
			}
		});

		rUWidth.setText(gripFab.width + "");
		rUWidth.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rUWidthActionPerformed(evt);
			}
		});

		rULout.setText(gripFab.lout + "");
		rULout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				rULoutActionPerformed(evt);
			}
		});

		rULoutSlider.setMaximum(100);
		rULoutSlider.setValue((int) (gripFab.lout * 100 / 200));
		rULoutSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rULoutSliderStateChanged(evt);
			}
		});

		rUASlider.setMaximum(100);
		rUASlider.setValue((int) (gripFab.angle * 100 / 90));
		rUASlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rUASliderStateChanged(evt);
			}
		});

		rUWSlider.setMaximum(100);
		rUWSlider.setValue((int) (gripFab.width * 100 / 13));
		rUWSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rUWSliderStateChanged(evt);
			}
		});

		rUHSlider.setMaximum(100);
		rUHSlider.setValue((int) (gripFab.height * 100 / 13));
		rUHSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				rUHSliderStateChanged(evt);
			}
		});

		jLabel22.setText("Height:");

		jLabel23.setText("Angle:");

		rULefty.setText("Lefty");

		jLabel24.setText("Width:");

		jLabel25.setText("Extrusion Length:");

		jLabel39.setText("mm");

		jLabel40.setText("mm");

		jLabel41.setText("mm");

		jLabel42.setText("mm");

		jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/resources/gripRU.gif"))); // NOI18N
		jLabel43.setText("jLabel43");

		javax.swing.GroupLayout rULayout = new javax.swing.GroupLayout(rU);
		rU.setLayout(rULayout);
		rULayout.setHorizontalGroup(rULayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						rULayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rULayout.createSequentialGroup()
																.addGroup(
																		rULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel25)
																				.addComponent(
																						jLabel22)
																				.addComponent(
																						jLabel23)
																				.addComponent(
																						jLabel24))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		rULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						rUWSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						rUASlider,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						rULoutSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						rUHSlider,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)))
												.addGroup(
														rULayout.createSequentialGroup()
																.addGroup(
																		rULayout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						rULefty)
																				.addComponent(
																						submitRU))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		28,
																		Short.MAX_VALUE)
																.addComponent(
																		jLabel43,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		723,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														rULayout.createSequentialGroup()
																.addComponent(
																		rULout,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel41))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														rULayout.createSequentialGroup()
																.addComponent(
																		rUHeight,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel39))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														rULayout.createSequentialGroup()
																.addComponent(
																		rUAngle,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jLabel42))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														rULayout.createSequentialGroup()
																.addComponent(
																		rUWidth,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel40)))
								.addContainerGap()));
		rULayout.setVerticalGroup(rULayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						rULayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rULayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel22)
																.addComponent(
																		rUHeight,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel39))
												.addComponent(
														rUHSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rULayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel24)
																.addComponent(
																		rUWidth,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel40))
												.addComponent(
														rUWSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														rULayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel25)
																.addComponent(
																		rULout,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel41))
												.addComponent(
														rULoutSlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rULayout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel23)
																.addComponent(
																		rUAngle,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel42))
												.addComponent(
														rUASlider,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										rULayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														rULayout.createSequentialGroup()
																.addComponent(
																		rULefty)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		submitRU))
												.addComponent(jLabel43))
								.addContainerGap(109, Short.MAX_VALUE)));
		Panel.remove(cH);
		Panel.remove(rH);
		Panel.remove(cL);
		Panel.remove(rL);
		Panel.remove(cU);
		Panel.addTab("Settings", rU);
		Panel.setSelectedIndex(Panel.indexOfTab("Settings"));
	}

	private void finish() {
		jLabel49.setText("Select desired Files:");

		selectProfile.setText("Profile");

		selectScad.setText("OpenSCAD File");

		selectSTL.setText("STL File (for printing)");

		submitFinish.setText("Finish");
		submitFinish.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					submitFinishActionPerformed(evt);
				} catch (PositionNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (invalidDiameterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (STLNotPresentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (invalidDimmensionsException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel50.setText("Once submitted all selected files wil appear in selected directory.");

		jLabel51.setText("Profile and STL files can be moved from this location.");

		jLabel52.setText("The OpenSCAD file requires files located in the selected directory, copy the directory if you wish to move this file.");

		javax.swing.GroupLayout finishLayout = new javax.swing.GroupLayout(
				finish);
		finish.setLayout(finishLayout);
		finishLayout
				.setHorizontalGroup(finishLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								finishLayout
										.createSequentialGroup()
										.addGroup(
												finishLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																finishLayout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				finishLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								finishLayout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												selectProfile)
																										.addComponent(
																												jLabel49))
																						.addGroup(
																								finishLayout
																										.createSequentialGroup()
																										.addGap(51,
																												51,
																												51)
																										.addGroup(
																												finishLayout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																selectSTL)
																														.addComponent(
																																selectScad)))))
														.addGroup(
																finishLayout
																		.createSequentialGroup()
																		.addGap(28,
																				28,
																				28)
																		.addGroup(
																				finishLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel50)
																						.addComponent(
																								submitFinish)
																						.addComponent(
																								jLabel51)
																						.addComponent(
																								jLabel52))))
										.addContainerGap(234, Short.MAX_VALUE)));
		finishLayout
				.setVerticalGroup(finishLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								finishLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel49)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(selectProfile)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												selectScad,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(selectSTL)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(submitFinish)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel50)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel51)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel52)
										.addContainerGap(443, Short.MAX_VALUE)));

		Panel.addTab("Finish", finish);
		Panel.setSelectedIndex(Panel.indexOfTab("Finish"));
	}

}