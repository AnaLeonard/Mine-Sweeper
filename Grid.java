//YOUTUBE LINK --->   https://youtu.be/S95Ojx8VqSM
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Grid extends JFrame {

	private boolean[][] bombGrid;
	private int[][] countGrid;
	private int numColumns;
	private int numRows;
	private int numBombs;

	private static final int NUMCOLUMNS = 10;
	private static final int NUMROWS = 10;
	private static final int NUMBOMBS = 25;

	private JButton button[][];
	private JFrame gridFrame;
	private int win;


	public Grid() {
		this.numBombs = NUMBOMBS;
		this.numRows = NUMROWS;
		this.numColumns = NUMCOLUMNS;
		createBombGrid();
		createCountGrid();
		gui();

	}

	public Grid(int rows, int columns) {
		this.numBombs = NUMBOMBS;
		this.numRows = rows;
		this.numColumns = columns;
		createBombGrid();
		createCountGrid();
		gui();

	}

	public Grid(int rows, int columns, int numBombs) {
		numRows = rows;
		numColumns = columns;
		this.numBombs = numBombs;
		createBombGrid();
		createCountGrid();
		gui();

	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumColumns() {
		return numColumns;
	}

	public int getNumBombs() {
		return numBombs;
	}

	public boolean[][] getBombGrid() {
		boolean copyBombGrid[][] = new boolean[numRows][numColumns];
		for (int r = 0; r < copyBombGrid.length; r++) {
			for (int c = 0; c < copyBombGrid[r].length; c++) {
				copyBombGrid[r][c] = bombGrid[r][c];
			}
		}
		return copyBombGrid;
	}

	public int[][] getCountGrid() {
		int copycountGrid[][] = new int[numRows][numColumns];
		for (int r = 0; r < copycountGrid.length; r++) {
			for (int c = 0; c < copycountGrid[r].length; c++) {
				copycountGrid[r][c] = countGrid[r][c];
			}
		}
		return copycountGrid;
	}

	public boolean isBombAtLocation(int row, int column) {
		return bombGrid[row][column];
	}

	public int getCountAtLocation(int r, int c) {
		int count = 0;
// checks the starting point
		if (c >= 0 && r >= 0 && c < numColumns && r < numRows && isBombAtLocation(r, c)) {
			count++;
		}
// checks right
		if (c + 1 >= 0 && r >= 0 && c + 1 < numColumns && r < numRows && isBombAtLocation((r), c + 1)) {
			count++;
		}
// checks left
		if (c - 1 >= 0 && r >= 0 && c - 1 < numColumns && r < numRows && isBombAtLocation((r), c - 1)) {
			count++;
		}
// checks down left
		if (c - 1 >= 0 && r + 1 >= 0 && c - 1 < numColumns && r + 1 < numRows && isBombAtLocation((r + 1), c - 1)) {
			count++;
		}
// checks down right
		if (c + 1 >= 0 && r + 1 >= 0 && c + 1 < numColumns && r + 1 < numRows && isBombAtLocation((r + 1), c + 1)) {
			count++;
		}
// checks down
		if (c >= 0 && r + 1 >= 0 && c < numColumns && r + 1 < numRows && isBombAtLocation(r + 1, c)) {
			count++;
		}
// checks up
		if ((c >= 0 && r - 1 >= 0 && c < numColumns && r - 1 < numRows) && (isBombAtLocation((r - 1), c))) {
			count++;
		}
// checks top left
		if (c - 1 >= 0 && r - 1 >= 0 && c - 1 < numColumns && r - 1 < numRows && isBombAtLocation((r - 1), c - 1)) {
			count++;
		}
// checks top right
		if (c + 1 >= 0 && r - 1 >= 0 && c + 1 < numColumns && r - 1 < numRows && isBombAtLocation((r - 1), c + 1)) {
			count++;
		}
		return count;
	}

	private void createBombGrid() {
		int numOfBombs = 0, row = 0, column = 0;
		Random randomBombs = new Random();
		bombGrid = new boolean[numRows][numColumns];
		boolean numOfBombsInGrid;

// goes through both the rows and columns and sets everything to false 
		for (int r = 0; r < bombGrid.length; r++) {
			for (int c = 0; c < bombGrid[r].length; c++) {
				bombGrid[r][c] = false;
			}
		}

// generates random bombs
		while (numOfBombs < numBombs) {
			row = randomBombs.nextInt(numRows);
			column = randomBombs.nextInt(numColumns);
			numOfBombsInGrid = bombGrid[row][column];
			if (numOfBombsInGrid == false) {
				bombGrid[row][column] = true;
				numOfBombs= numOfBombs + 1;
			}
		}
	}

	private void createCountGrid() {
		countGrid = new int[numRows][numColumns];
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numColumns; c++) {
				countGrid[r][c] = getCountAtLocation(r, c);
			}
		}
	}

	private void gui() {
		gridFrame = new JFrame();
// number of boxes needed to click in order to win

// the size of the grid depends on the rows * columns
		setLayout(new GridLayout(numRows, numColumns));

// each botton has a coordinate
		button = new JButton[numRows][numColumns];

		int r = 0, c = 0;

		for (r = 0; r < numRows; r++) {
			for (c = 0; c < numColumns; c++) {
				button[r][c] = new JButton();
				button[r][c].setForeground(Color.blue);
				button[r][c].addActionListener(new ButtonListener(r, c));

				add(button[r][c]);
			}
		}
		setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("MineSweeper by Ana Leonardo");
	}

	public void winner() {
		for (int r = 0; r < getNumRows(); r++) {
			for (int c = 0; c < getNumColumns(); c++) {
				button[r][c] = new JButton("");
				button[r][c].setForeground(Color.blue);
				button[r][c].setEnabled(true);

			}
		}
		String userNumBombs = "Would you like to choose the number of Bombs?";
		String wonGame = "You WON! Would you like to try again?";
		String lost = "You Lost! Would you like to try again?";
		String userEdit = "Would you like to make your own rows and columns?";
		
		int rowS = 0, columnS = 0, b;
		
		int userAnswer = JOptionPane.showConfirmDialog(gridFrame, wonGame);

		if(userAnswer == JOptionPane.YES_OPTION) {
			userAnswer = JOptionPane.showConfirmDialog(gridFrame, userEdit);
			
			if(userAnswer == JOptionPane.YES_OPTION) {
				String userRows = JOptionPane.showInputDialog("How many rows do you want?");
				String userColumns = JOptionPane.showInputDialog("How many Columns do you want?");
				
				rowS = Integer.parseInt(userRows);
				columnS = Integer.parseInt(userColumns);
				
				int userBombs = JOptionPane.showConfirmDialog(gridFrame, userNumBombs);
				
				if(userAnswer == JOptionPane.YES_OPTION) {
					String userB = JOptionPane.showInputDialog("How many rows do you want?");
					b = Integer.parseInt(userB);
					Grid c = new Grid(rowS,columnS,b);
				}
				if(userAnswer == JOptionPane.NO_OPTION) {
					Grid c = new Grid(rowS,columnS);
								
			}
			if(userAnswer == JOptionPane.NO_OPTION) {
				Grid c = new Grid();

			}

		}
		else {
			System.exit(0);
		}
	}
	}

	public void reset() {
		Grid newG;
		for (int r = 0; r < getNumRows(); r++) {
			for (int c = 0; c < getNumColumns(); c++) {
				button[r][c] = new JButton("");
				button[r][c].setForeground(Color.blue);
				button[r][c].setEnabled(true);

			}
		}

		String lost = "You Lost! Would you like to try again?";
		String userEdit = "Would you like to make your own rows and columns?";
		String userNumBombs = "Would you like to choose the number of Bombs?";

		int userAnswer = JOptionPane.showConfirmDialog(gridFrame, lost);
		int rowS = 0, columnS = 0, b;
		if (userAnswer == JOptionPane.YES_OPTION) {
			userAnswer = JOptionPane.showConfirmDialog(gridFrame, userEdit);

			if (userAnswer == JOptionPane.YES_OPTION) {
				String userRows = JOptionPane.showInputDialog("How many rows do you want?");
				String userColumns = JOptionPane.showInputDialog("How many Columns do you want?");

				rowS = Integer.parseInt(userRows);
				columnS = Integer.parseInt(userColumns);

				int userBombs = JOptionPane.showConfirmDialog(gridFrame, userNumBombs);
				if (userBombs == JOptionPane.YES_OPTION) {
					String userB = JOptionPane.showInputDialog("How many Bombs do you want?");
					b = Integer.parseInt(userB);
					newG = new Grid(rowS, columnS, b);
				} 
				if (userBombs == JOptionPane.NO_OPTION) {

					 newG= new Grid(rowS, columnS);
				}

			}
			else {
				//(userAnswer == JOptionPane.NO_OPTION) {
			
				 newG = new Grid();//NUMROWS, NUMCOLUMNS);

			}

		} 
		else {
			System.exit(0);
		}

	}

	private class ButtonListener implements ActionListener {
		int row, col;

		public ButtonListener(int row, int col) {
			this.row = row;
			this.col = col;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			// if bombs exists in that location
			if (isBombAtLocation(row, col)) {
				// print out everything when you lose
				if (isBombAtLocation(row, col)) {
					for (int r = 0; r < getNumRows(); r++) {
						for (int c = 0; c < getNumColumns(); c++) {
							if (!isBombAtLocation(r, c)) {
								button[r][c].setText(String.valueOf(getCountAtLocation(r, c)));
							} else {
								button[r][c].setIcon(new ImageIcon("C:\\Users\\Dell Inspiron\\Downloads\\swing.jpg"));

							}
						}
					}
					reset();
				} 
				else {
					button[row][col].setText(String.valueOf(getCountAtLocation(row, col)));
				}
			}
			// prints how many bombs are near
			else {
				button[row][col].setText(String.valueOf(getCountAtLocation(row, col)));
				win++;
				if (win == (numRows * numColumns) - numBombs) {
					winner();
				}
			}

		}
	}

}