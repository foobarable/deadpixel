import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
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
	private JTextArea taOutput;
	private JLabel lVerticalCountView;
	private JLabel lCountVertical;
	private JLabel lHorizontalCountView;
	private JLabel lCountHorizontal;
	private JLabel lDeadPixelCountView;
	private JLabel lDeadPixelCount;
	private JScrollPane jScrollPane1;
	private JLabel lHeigth;
	private JLabel pWidth;
	private JTextField tfHeight;
	private JTextField tfWidth;
	private JPanel pOptions;
	private JTextField jTextField2;
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
				GroupLayout jPanel2Layout = new GroupLayout((JComponent) pMain);
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
					        .addComponent(getJPanel1(), GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					        .addComponent(getJPanel3(), 0, 341, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					        .addComponent(pbProgress, 0, 651, Short.MAX_VALUE)
					        .addGap(7))
					    .addComponent(getJPanel4(), GroupLayout.Alignment.LEADING, 0, 658, Short.MAX_VALUE)));
				jPanel2Layout.setVerticalGroup(jPanel2Layout.createSequentialGroup()
					.addGap(6)
					.addComponent(getJPanel4(), GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(pbProgress, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
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
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Inputfiles");
		}
		return jLabel1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Output (coordinates)");
		}
		return jLabel2;
	}

	private void jButton1ActionPerformed(ActionEvent evt) {
		File files[] = null;
		System.out.println("jButton1.actionPerformed, event=" + evt);
		this.jFileChooser1.showOpenDialog(getParent());
		files = this.jFileChooser1.getSelectedFiles();
		for (int i = 0; i < files.length; i++) {
			if (verbose)
				System.out.println("Adding " + files[i]);
			// TODO check input
			listmodel.add(
					i,
					new PixelChecker(files[i], this.pbProgress, new Dimension(
							Integer.parseInt(tfWidth.getText()), Integer
									.parseInt(tfHeight.getText()))));
		}
	}

	private void jButton2ActionPerformed(ActionEvent evt) {
		if (debug)
			System.out.println("jButton2.actionPerformed, event=" + evt);
		int index = this.jList1.getSelectedIndex();
		listmodel.remove(index);
	}

	private JCheckBox getJCheckBox1() {
		if (jCheckBox1 == null) {
			jCheckBox1 = new JCheckBox();
			jCheckBox1.setText("Automatically save");
		}
		return jCheckBox1;
	}

	private JFileChooser getJFileChooser1x() {
		if (jFileChooser1 == null) {
			jFileChooser1 = new JFileChooser();
			jFileChooser1.setDialogTitle("Select input files");
			jFileChooser1.setMultiSelectionEnabled(true);
		}
		return jFileChooser1;
	}

	private JList<PixelChecker> getJList1() {
		if (jList1 == null) {
			DefaultListModel<PixelChecker> jList1Model = new DefaultListModel<PixelChecker>();
			jList1 = new JList<PixelChecker>(jList1Model);
			jList1.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1,
					false));
		}
		return jList1;
	}

	private void jButton3ActionPerformed(ActionEvent evt) {
		if (debug)
			System.out.println("jButton3.actionPerformed, event=" + evt);
		if(listmodel.getSize()>0) {
			if(jList1.getSelectedIndex()==-1){
				jList1.setSelectedIndex(0);
			}
			
			for (int i = 0; i < listmodel.getSize(); i++) {
				listmodel.elementAt(i).checkPixel(100 / listmodel.getSize(), Float
						.parseFloat(this.jTextField1.getText()), Integer
						.parseInt(this.jTextField2.getText()));
			}
			if (listmodel.elementAt(jList1.getSelectedIndex()).getOutput() != null) {
				this.taOutput.setText(listmodel.elementAt(
						jList1.getSelectedIndex()).getOutput());
				this.lDeadPixelCountView.setText(Integer.toString(listmodel.getElementAt(jList1.getSelectedIndex()).getDeadPixelCount()));
				this.lHorizontalCountView.setText(Integer.toString(listmodel.getElementAt(jList1.getSelectedIndex()).getHorizontalCount()));
				this.lVerticalCountView.setText(Integer.toString(listmodel.getElementAt(jList1.getSelectedIndex()).getVerticalCount()));
			}
		}
	}

	private JPanel getJPanel1() {
		if (pInput == null) {
			pInput = new JPanel();
			GroupLayout jPanel1Layout = new GroupLayout((JComponent) pInput);
			pInput.setLayout(jPanel1Layout);
			pInput.setBorder(BorderFactory
					.createEtchedBorder(BevelBorder.LOWERED));
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
				        .addGap(0, 68, Short.MAX_VALUE)
				        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
				    .addComponent(getJList1(), GroupLayout.Alignment.LEADING, 0, 277, Short.MAX_VALUE))
				.addContainerGap());
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createSequentialGroup()
				.addGap(8)
				.addGroup(jPanel1Layout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
				        .addComponent(getJLabel1x(), GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(19))
				    .addComponent(jButton1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jButton2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJList1(), 0, 179, Short.MAX_VALUE)
				.addContainerGap());
		}
		return pInput;
	}

	private JPanel getJPanel3() {
		if (pOutput == null) {
			pOutput = new JPanel();
			GroupLayout jPanel3Layout1 = new GroupLayout((JComponent)pOutput);
			pOutput.setLayout(jPanel3Layout1);
			pOutput.setBorder(BorderFactory
					.createEtchedBorder(BevelBorder.LOWERED));

			jPanel3Layout1.setHorizontalGroup(jPanel3Layout1.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel3Layout1.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout1.createSequentialGroup()
				        .addComponent(getJLabel2(), 0, 153, Short.MAX_VALUE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addGroup(jPanel3Layout1.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout1.createSequentialGroup()
				                .addComponent(getLDeadPixelCount(), GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				                .addGap(40))
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout1.createSequentialGroup()
				                .addComponent(getLCountVertical(), GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
				                .addGap(14))
				            .addComponent(getLCountHorizontal(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				        .addGroup(jPanel3Layout1.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout1.createSequentialGroup()
				                .addComponent(getLDeadPixelCountView(), GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
				                .addGap(12))
				            .addComponent(getLVerticalCountView(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getLHorizontalCountView(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
				    .addComponent(getJScrollPane1(), GroupLayout.Alignment.LEADING, 0, 310, Short.MAX_VALUE))
				.addGap(8));
			jPanel3Layout1.setVerticalGroup(jPanel3Layout1.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel3Layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getLDeadPixelCountView(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getLDeadPixelCount(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getJLabel2(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jPanel3Layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getLCountVertical(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getLVerticalCountView(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(jPanel3Layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(getLCountHorizontal(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
				    .addComponent(getLHorizontalCountView(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(getJScrollPane1(), 0, 141, Short.MAX_VALUE)
				.addContainerGap());
		}
		return pOutput;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("0.9");
		}
		return jTextField1;
	}

	private JLabel getLThreshold() {
		if (LThreshold == null) {
			LThreshold = new JLabel();
			LThreshold.setText("Threshold");
		}
		return LThreshold;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Pixel lookahead ");
		}
		return jLabel3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("1");
		}
		return jTextField2;
	}

	private JPanel getJPanel4() {
		if (pOptions == null) {
			pOptions = new JPanel();
			GroupLayout jPanel4Layout = new GroupLayout((JComponent) pOptions);
			pOptions.setLayout(jPanel4Layout);
			pOptions.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
			{
				jButton3 = new JButton();
				jButton3.setText("Search dead pixels");
				jButton3.setBackground(new java.awt.Color(255, 0, 0));
				jButton3.setFont(new java.awt.Font("Monospaced", 1, 12));
				jButton3.setIcon(new ImageIcon(getClass().getClassLoader()
						.getResource("icon2.jpg")));
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
				            .addComponent(getLThreshold(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getPWidth(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addComponent(getJTextField1(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getTfWidth(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
				    .addComponent(jButton4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(jPanel4Layout.createParallelGroup()
				    .addGroup(jPanel4Layout.createSequentialGroup()
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addComponent(getLHeigth(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getJLabel3(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
				        .addGroup(jPanel4Layout.createParallelGroup()
				            .addComponent(getJTextField2(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getJTextField3(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
				    .addComponent(getJCheckBox1(), GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jButton3, 0, 268, Short.MAX_VALUE)
				.addContainerGap());
			jPanel4Layout.setVerticalGroup(jPanel4Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel4Layout.createParallelGroup()
				    .addGroup(jPanel4Layout.createSequentialGroup()
				        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(getJCheckBox1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				            .addComponent(jButton4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				        .addGap(0, 25, GroupLayout.PREFERRED_SIZE)
				        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(getJTextField3(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getLHeigth(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getTfWidth(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				            .addComponent(getPWidth(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
				    .addGroup(GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(jButton3, GroupLayout.Alignment.BASELINE, 0, 71, Short.MAX_VALUE)
				        .addComponent(getJTextField2(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(getJLabel3(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(getJTextField1(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(getLThreshold(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
				.addGap(7));
		}
		return pOptions;
	}

	private JTextField getTfWidth() {
		if (tfWidth == null) {
			tfWidth = new JTextField();
			tfWidth.setText("1920");
		}
		return tfWidth;
	}

	private JTextField getJTextField3() {
		if (tfHeight == null) {
			tfHeight = new JTextField();
			tfHeight.setText("1080");
		}
		return tfHeight;
	}

	private JLabel getPWidth() {
		if (pWidth == null) {
			pWidth = new JLabel();
			pWidth.setText("Horizontal");
		}
		return pWidth;
	}

	private JLabel getLHeigth() {
		if (lHeigth == null) {
			lHeigth = new JLabel();
			lHeigth.setText("Vertical");
		}
		return lHeigth;
	}

	private JScrollPane getJScrollPane1() {
		if(jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setInheritsPopupMenu(true);
			jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			jScrollPane1.setAutoscrolls(true);
			jScrollPane1.setViewportView(getTaOutput());

		}
		return jScrollPane1;
	}
	
	private JLabel getLDeadPixelCount() {
		if(lDeadPixelCount == null) {
			lDeadPixelCount = new JLabel();
			lDeadPixelCount.setText("Total:");
		}
		return lDeadPixelCount;
	}
	
	private JLabel getLDeadPixelCountView() {
		if(lDeadPixelCountView == null) {
			lDeadPixelCountView = new JLabel();
			lDeadPixelCountView.setText("0");
		}
		return lDeadPixelCountView;
	}
	
	private JLabel getLCountHorizontal() {
		if(lCountHorizontal == null) {
			lCountHorizontal = new JLabel();
			lCountHorizontal.setText("Horizontal:");
		}
		return lCountHorizontal;
	}
	
	private JLabel getLHorizontalCountView() {
		if(lHorizontalCountView == null) {
			lHorizontalCountView = new JLabel();
			lHorizontalCountView.setText("0");
		}
		return lHorizontalCountView;
	}
	
	private JLabel getLCountVertical() {
		if(lCountVertical == null) {
			lCountVertical = new JLabel();
			lCountVertical.setText("Vertical:");
		}
		return lCountVertical;
	}
	
	private JLabel getLVerticalCountView() {
		if(lVerticalCountView == null) {
			lVerticalCountView = new JLabel();
			lVerticalCountView.setText("0");
		}
		return lVerticalCountView;
	}
	
	private JTextArea getTaOutput() {
		if(taOutput == null) {
			taOutput = new JTextArea();
		}
		return taOutput;
	}

}
