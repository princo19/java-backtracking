
public class QUEENCOMBOX {
	public static int count =0;
	public static void main(String[] args) {
		
		QueenCOMBINATIONBOX(new boolean[4], 0, 0, 2, " ");
	}
	
	public static void QueenCOMBINATIONBOX(boolean [] box , int col , int qpsf , int tq , String ans) {
		if(qpsf == tq) {
			count++;
			System.out.println(count + " - " + ans);
			return;
		}
		if(col == box.length) {
			return;
		}
		
		
		//place queen
		box[col] = true;
		QueenCOMBINATIONBOX(box, col+1, qpsf+1, tq, ans+"b"+col);
		box[col]= false;
		
		
		// no place
		QueenCOMBINATIONBOX(box, col+1, qpsf, tq, ans);
		
	}

}
