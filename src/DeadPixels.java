import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.border.BevelBorder;
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
	private JLabel LThreshold;
	private JLabel jLabel3;
	private JTextField jTextField1;
	private JPanel pOutput;
	private JPanel pInput;
	private JButton jButton3;
	private JButton jButton2;
	private JButton jButton1;
	private JFileChooser jFileChooser1;
	private JCheckBox jCheckBox1;
	private JLabel lHeigth;
	private JLabel pWidth;
	private JTextField tfHeight;
	private JTextField tfWidth;
	private JPanel pOptions;
	private JTextField jTextField2;
	private JTextPane jTextPane1;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JProgressBar pbProgress;
	private JPanel pMain;
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
				pMain = new JPanel();
				getContentPane().add(getJFileChooser1x());
				getContentPane().add(pMain, BorderLayout.CENTER);
				GroupLayout jPanel2Layout = new GroupLayout((JComponent)pMain);
				pMain.setLayout(jPanel2Layout);
				pMain.setPreferredSize(new java.awt.Dimension(678, 369));
				{
					listmodel = new DefaultListModel<PixelChecker>();
					jList1 = new JList<PixelChecker>(listmodel);
					
				}

				{
					pbProgress = new JProgressBar();
					pbProgress.setStringPainted(true);
				}
				jPanel2Layout.setHorizontalGroup(jPanel2Layout.createSequentialGroup()
					.addGap(7)
					.addGroup(jPanel2Layout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					        .addComponent(getJPanel4(), GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 15, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					        .addComponent(getJPanel1(), GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					        .addComponent(getJPanel3(), 0, 334, Short.MAX_VALUE))
					    .addComponent(pbProgress, GroupLayout.Alignment.LEADING, 0, 651, Short.MAX_VALUE))
					.addGap(7));
				jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
					.addGap(6)
					.addComponent(getJPanel4(), GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addComponent(pbProgress, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, GroupLayout.PREFERRED_SIZE)
					.addGroup(jPanel2Layout.createParallelGroup()
					    .addComponent(getJPanel1(), GroupLayout.Alignment.LEADING, 0, 242, Short.MAX_VALUE)
					    .addComponent(getJPanel3(), GroupLayout.Alignment.LEADING, 0, 242, Short.MAX_VALUE))
					.addContainerGap(12, 12));
			}
			this.setSize(665, 383);
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
			listmodel.add(i, new PixelChecker(files[i],this.pbProgress,new Dimension(1920,1020)));
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
		if(listmodel.elementAt(jList1.getSelectedIndex()).getOutput() != null) {
			this.jTextPane1.setText(listmodel.elementAt(jList1.getSelectedIndex()).getOutput());
			
		}
		
	}
	
	private JPanel getJPanel1() {
		if(pInput == null) {
			pInput = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent)pInput);
			pInput.setLayout(jPanel1Layout);
			pInput.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			{
				jButton1 = new JButton();
				jButton1.setLayout(null);
				jButton1.setText("+");
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jButton2 = new JButton();
				jButton2.setText("-");
				jButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton2ActionPerformed(evt);
					}
				});
			}
			jPanel1Layout.setHorizontalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(getJLabel1x(), GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 88, Short.MAX_VALUE)
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				    .addComponent(getJList1(), GroupLayout.Alignment.LEADING, 0, 253, Short.MAX_VALUE))
				.addContainerGap());
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(jButton1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				        .addComponent(jButton2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(getJLabel1x(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(9)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(getJList1(), 0, 101, Short.MAX_VALUE)
				.addContainerGap());
		}
		return pInput;
	}
	
	private JPanel getJPanel3() {
		if(pOutput == null) {
			pOutput = new JPanel();
			GroupLayout jPanel3Layout = new GroupLayout((JComponent)pOutput);
			pOutput.setLayout(jPanel3Layout);
			pOutput.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			jPanel3Layout.setHorizontalGroup(jPanel3Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel3Layout.createParallelGroup()
				    .addComponent(getJTextPane1(), GroupLayout.Alignment.LEADING, 0, 291, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
				        .addComponent(getJLabel2(), GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 71, Short.MAX_VALUE)))
				.addContainerGap());
			jPanel3Layout.setVerticalGroup(jPanel3Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(getJLabel2(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(getJTextPane1(), 0, 165, Short.MAX_VALUE)
				.addContainerGap());
		}
		return pOutput;
	}
	
	private JTextField getJTextField1() {
		if(jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("0.9");
		}
		return jTextField1;
	}
	
	private JLabel getLThreshold() {
		if(LThreshold == null) {
			LThreshold = new JLabel();
			LThreshold.setText("Threshold");
		}
		return LThreshold;
	}

	private JLabel getJLabel3() {
		if(jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Pixel lookahead ");
		}
		return jLabel3;
	}
	
	private JTextField getJTextField2() {
		if(jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("1");
		}
		return jTextField2;
	}
	
	private JPanel getJPanel4() {
		if(pOptions == null) {
			pOptions = new JPanel();
			GroupLayout jPanel4Layout = new GroupLayout((JComponent)pOptions);
			pOptions.setLayout(jPanel4Layout);
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
				jButton4.setText("Save selected");
			}
			jPanel4Layout.setHorizontalGroup(jPanel4Layout.createSequentialGroup()
				.addGroup(jPanel4Layout.createParallelGroup()
				    .addGroup(jPanel4Layout.createSequentialGroup()
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addGroup(jPanel4Layout.createSequentialGroup()
				                .addComponent(getLThreshold(), GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
				                .addGap(0, 0, Short.MAX_VALUE))
				            .addComponent(getPWidth(), GroupLayout.Alignment.LEADING, 0, 79, Short.MAX_VALUE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addComponent(getJTextField1(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getTfWidth(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				        .addGap(27))
				    .addGroup(jPanel4Layout.createSequentialGroup()
				        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE)))
				.addGroup(jPanel4Layout.createParallelGroup()
				    .addGroup(jPanel4Layout.createSequentialGroup()
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addComponent(getJLabel3(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
				                .addComponent(getLHeigth(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
				                .addGap(83)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addComponent(getJTextField2(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getJTextField3(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
				        .addGap(25))
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
				        .addPreferredGap(getLHeigth(), getJCheckBox1(), LayoutStyle.ComponentPlacement.INDENT)
				        .addComponent(getJCheckBox1(), GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE));
			jPanel4Layout.setVerticalGroup(jPanel4Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel4Layout.createParallelGroup()
				    .addGroup(jPanel4Layout.createSequentialGroup()
				        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(getJCheckBox1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jButton4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(getLThreshold(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getJTextField2(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getJLabel3(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getJTextField1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addGap(6))
				    .addComponent(jButton3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
				.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getJTextField3(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getLHeigth(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getTfWidth(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getPWidth(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)));
		}
		return pOptions;
	}
	
	private JTextField getTfWidth() {
		if(tfWidth == null) {
			tfWidth = new JTextField();
			tfWidth.setText("1920");
		}
		return tfWidth;
	}
	
	private JTextField getJTextField3() {
		if(tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.setText("1080");
		}
		return tfHeight;
	}
	
	private JLabel getPWidth() {
		if(pWidth == null) {
			pWidth = new JLabel();
			pWidth.setText("Width");
		}
		return pWidth;
	}
	
	private JLabel getLHeigth() {
		if(lHeigth == null) {
			lHeigth = new JLabel();
			lHeigth.setText("Heigth");
		}
		return lHeigth;
	}

}
