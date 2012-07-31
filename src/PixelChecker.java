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
    private String output = null;
    private JProgressBar progress;
    private static final boolean verbose = false;
    private Dimension dimension;
    private int verticalCount;
    private int horizontalCount;
    private int[][] inputData;
    private long time;

    public PixelChecker(File input, JProgressBar ps, Dimension dim) {
	this.inputFile = input;
	this.progress = ps;
	this.dimension = dim;
	System.out.println("Created pixelchecker class");
	inputData = new int[dim.width][dim.height];
	if (verbose) System.out.println("Width: " + dim.width + " Heigth: " + dim.height);
	System.out.println("Trying to read file");
	readFile();
    }

    public void readFile() {
	try {
	    FileInputStream fstream = new FileInputStream(inputFile);
	    DataInputStream in = new DataInputStream(fstream);
	    BufferedReader br = new BufferedReader(new InputStreamReader(in));
	    String line;
	    int linecount = 0;
	    String[] tokens;
	    while ((line = br.readLine()) != null) {

		tokens = line.split(",");
		// System.out.println("Number of tokens: " + tokens.length);
		for (int i = 0; i < tokens.length; i++) {
		    inputData[i][linecount] = Integer.parseInt(tokens[i]);
		}
		linecount++;
		// TODO: Check if linecount > dimension.height

	    }
	    in.close();

	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public void checkPixel(int progressrange, float threshold, int lookahead) {
	long beforetime = System.currentTimeMillis();
	long aftertime;
	output = new String();
	this.horizontalCount = 0;
	this.verticalCount = 0;
	// TODO check lookahead pixels in other order

	if (verbose)
	    System.out.println("Checking pixel.. lookahead is " + lookahead
		    + ", threshold is " + threshold);
	for (int i = 0; i < dimension.width; i++) {
	    for (int j = 0; j < dimension.height; j++) {
		for (int k = 1; k < lookahead + 1; k++) {
		    if (i<dimension.width-lookahead) {
			if (inputData[i + k][j] != 0) {
			    if (((float) inputData[i][j]) / ((float) inputData[i + k][j]) < threshold) {
				output += ("(" + i + "|" + (dimension.height - j) + ")\n");
				this.horizontalCount++;
				if (verbose) System.out.println("Found dead pixel next to this one at ("+ i+ "|"+ (dimension.height - j)+ ") "+ (inputData[i][j])+ " / "+ inputData[i + k][j]+ " = "+ (float) inputData[i][j]/ (float) inputData[i + k][j]);
				break;
			    }
			}
		    }
		    else {
			//if (inputData[i -k][j] != 0) {
				if (((float) inputData[i][j]) / ((float) inputData[i - k][j]) < threshold) {
				output += ("(" + i + "|" + (dimension.height - j) + ")\n");
				this.horizontalCount++;
				if (verbose) System.out.println("Found dead pixel next to this one at ("+ i+ "|"+ (dimension.height - j)+ ") "+ (inputData[i][j])+ " / "+ inputData[i - k][j]+ " = "+ (float) inputData[i][j]/ (float) inputData[i - k][j]);
				break;
			    }
			//}
		    }
		    if(j<dimension.height-lookahead) {
			if (inputData[i][j + k] != 0) {
			    if (((float) inputData[i][j]) / ((float) inputData[i][j + k]) < threshold) {
				output += ("(" + i + "|" + (dimension.height - j) + ")\n");
				this.verticalCount++;
				if (verbose)System.out.println("Found dead pixel below this one at ("+ i+ "|"+ (dimension.height - j)+ ") "+ (inputData[i][j])+ " / "+ inputData[i][j + k]+ " = "+ ((float) inputData[i][j] / (float) inputData[i][j+ k]));
				break;
			    }    
			}
		    }
		    else {
			if (inputData[i][j-k] != 0) {
			    if (((float) inputData[i][j]) / ((float) inputData[i][j - k]) < threshold) {
				    output += ("(" + i + "|" + (dimension.height - j) + ")\n");
				    this.verticalCount++;
				    if (verbose)System.out.println("Found dead pixel below this one at ("+ i+ "|"+ (dimension.height - j)+ ") "+ (inputData[i][j])+ " / "+ inputData[i][j - k]+ " = "+ ((float) inputData[i][j] / (float) inputData[i][j- k]));
				    break;
			    }    
			}   
		    }
		}
	    }
	}
	
	aftertime = System.currentTimeMillis();
	this.setTime(aftertime - beforetime);
	System.out.println("Done checking " + inputFile.toString()
		+ " Vertical: " + this.verticalCount + " Horizontal: "
		+ this.horizontalCount + " Total: "
		+ (this.verticalCount + this.horizontalCount));
    }

    public String toString() {
	return inputFile.toString();
    }

    public int getVerticalCount() {
	return verticalCount;
    }

    public int getHorizontalCount() {
	return horizontalCount;
    }

    public String getOutput() {
	return output;
    }

    public void setOutput(String output) {
	this.output = output;
    }

    public int getDeadPixelCount() {
	return this.verticalCount + this.horizontalCount;
    }

    public long getTime() {
	return time;
    }

    public void setTime(long time) {
	this.time = time;
    }

}
