import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JProgressBar;


public class PixelChecker {

	private static final long serialVersionUID = 1L;
	private File inputFile;
	private ArrayList<String> output=null;
	private JProgressBar progress;
	private static final boolean verbose = true; 
	
	private int[][] inputData;
	
	public PixelChecker(File input,JProgressBar ps, Dimension dim) {
		this.inputFile = input;
		this.progress = ps;
		System.out.println("Created pixelchecker class");
		inputData = new int[dim.width][dim.height];
		if(verbose) System.out.println("Width: " + dim.width + " Heigth: " + dim.height);
		System.out.println("Trying to read file");
		readFile();
	}
	
	
	public void readFile(){
		try {
			FileInputStream fstream = new FileInputStream(inputFile);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			int linecount = 0;
			String[] tokens;
			while ((line = br.readLine()) != null)   {
				
				tokens =  line.split(",");
				//System.out.println("Number of tokens: " + tokens.length);
				for (int i = 0; i < tokens.length; i++) {
					inputData[i][linecount] = Integer.parseInt(tokens[i]);
				}
				linecount++;
				
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	
	}
	
	
	public void checkPixel(int progressrange)  {
		output = new ArrayList<String>();
		output.add("Foo");
	}
	
	
	public String toString() {
		return inputFile.toString();
	}


	public String getOutput() {
		return output.toString();
	}


	public void setOutput(ArrayList<String> output) {
		this.output = output;
	}
}
