import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.border.LineBorder;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class DeadPixels extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final boolean verbose = true;
	private static final boolean debug = false;
	private JList<PixelChecker> jList1;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JFileChooser jFileChooser1;
	private JCheckBox jCheckBox1;
	private JTextPane jTextPane1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JProgressBar jProgressBar1;
	private JPanel jPanel2;
	private JButton jButton4;
	private DefaultListModel<PixelChecker> listmodel;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				DeadPixels inst = new DeadPixels();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public DeadPixels() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			
			{
				jPanel2 = new JPanel();
				getContentPane().add(getJFileChooser1x());
				getContentPane().add(jPanel2, BorderLayout.CENTER);
				GroupLayout jPanel2Layout = new GroupLayout((JComponent)jPanel2);
				jPanel2.setLayout(jPanel2Layout);
				jPanel2.setPreferredSize(new java.awt.Dimension(485, 283));
				{
					listmodel = new DefaultListModel<PixelChecker>();
					jList1 = new JList<PixelChecker>(listmodel);
					
				}
				
				{
					jButton1 = new JButton();
					jButton1.setLayout(null);
					jButton1.setText("Add Inputfile(s)");
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
				{
					jButton2 = new JButton();
					jButton2.setText("Remove Inputfile(s)");
					jButton2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton2ActionPerformed(evt);
						}
					});
				}
				{
					jButton3 = new JButton();
					jButton3.setText("Search dead pixels");
					jButton3.setBackground(new java.awt.Color(255,0,0));
					jButton3.setFont(new java.awt.Font("Monospaced",1,12));
					jButton3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icon2.jpg")));
					jButton3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton3ActionPerformed(evt);
						}
					});
				}
				{
					jButton4 = new JButton();
					jButton4.setText("Save selected output");
				}
				{
					jProgressBar1 = new JProgressBar();
					jProgressBar1.setStringPainted(true);
				}
				jPanel2Layout.setHorizontalGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					        .addGroup(jPanel2Layout.createParallelGroup()
					            .addComponent(jButton1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jButton4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jButton2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					            .addComponent(getJCheckBox1(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
					        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					        .addComponent(jButton3, 0, 253, Short.MAX_VALUE)
					        .addGap(9))
					    .addComponent(jProgressBar1, GroupLayout.Alignment.LEADING, 0, 467, Short.MAX_VALUE)
					    .addGroup(jPanel2Layout.createSequentialGroup()
					        .addGroup(jPanel2Layout.createParallelGroup()
					            .addComponent(getJList1(), GroupLayout.Alignment.LEADING, 0, 105, Short.MAX_VALUE)
					            .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					                .addComponent(getJLabel1x(), GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					                .addGap(23)))
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addGroup(jPanel2Layout.createParallelGroup()
					            .addComponent(getJTextPane1(), GroupLayout.Alignment.LEADING, 0, 350, Short.MAX_VALUE)
					            .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					                .addPreferredGap(getJTextPane1(), getJLabel2(), LayoutStyle.ComponentPlacement.INDENT)
					                .addComponent(getJLabel2(), GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 21, Short.MAX_VALUE)))
					        .addGap(6)))
					.addContainerGap());
				jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
					.addGap(7)
					.addGroup(jPanel2Layout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(getJCheckBox1(), GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					        .addGap(6))
					    .addComponent(jButton3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(getJLabel2(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(getJLabel1x(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanel2Layout.createParallelGroup()
					    .addComponent(getJTextPane1(), GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE)
					    .addComponent(getJList1(), GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE))
					.addContainerGap());
			}
			this.setSize(491, 312);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private JLabel getJLabel1x() {
		if(jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Inputfiles");
		}
		return jLabel1;
	}
	
	private JLabel getJLabel2() {
		if(jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Output (Dead pixel coordinates)");
		}
		return jLabel2;
	}
	
	
	
	private JTextPane getJTextPane1() {
		if(jTextPane1 == null) {
			jTextPane1 = new JTextPane();
			jTextPane1.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		}
		return jTextPane1;
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		File files[] = null;
		System.out.println("jButton1.actionPerformed, event="+evt);
		this.jFileChooser1.showOpenDialog(getParent());
		files = this.jFileChooser1.getSelectedFiles();
		for(int i = 0; i < files.length; i++) {
			if(verbose) System.out.println("Adding " + files[i]);
			listmodel.add(i, new PixelChecker(files[i],this.jProgressBar1,new Dimension(1920,1020)));
		}
	}
	
	private void jButton2ActionPerformed(ActionEvent evt) {
		if(debug) System.out.println("jButton2.actionPerformed, event="+evt);
		int index = this.jList1.getSelectedIndex();
		listmodel.remove(index);		
	}
	
	private JCheckBox getJCheckBox1() {
		if(jCheckBox1 == null) {
			jCheckBox1 = new JCheckBox();
			jCheckBox1.setText("Automatically save output");
		}
		return jCheckBox1;
	}
	
	
	private JFileChooser getJFileChooser1x() {
		if(jFileChooser1 == null) {
			jFileChooser1 = new JFileChooser();
			jFileChooser1.setDialogTitle("Select input files");
			jFileChooser1.setMultiSelectionEnabled(true);
		}
		return jFileChooser1;
	}
	
	private JList<PixelChecker> getJList1() {
		if(jList1 == null) {
			DefaultListModel<PixelChecker> jList1Model = 
					new DefaultListModel<PixelChecker>();
			jList1 = new JList<PixelChecker>(jList1Model);
			jList1.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
		}
		return jList1;
	}
	
	private void jButton3ActionPerformed(ActionEvent evt) {
		if(debug) System.out.println("jButton3.actionPerformed, event="+evt);
		for(int i = 0; i < listmodel.size(); i++) {
			listmodel.elementAt(i).checkPixel(100/jList1.getComponentCount());	
		}
	}

}
