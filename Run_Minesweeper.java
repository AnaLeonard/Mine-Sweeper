public class Run_Minesweeper{
	public static void main(String[] args) {
		Grid a = new Grid();
		for (int r = 0; r < a.getNumRows(); r++) {
			for (int c = 0; c < a.getNumColumns(); c++) {
				System.out.println( a.isBombAtLocation(r,c) + "  " + r +","+c);

					
			}	
		}	
	}
}	