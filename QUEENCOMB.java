
public class QUEENCOMB {
	public static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenCombination(new boolean[4], 0, 2, " ", -1);

	}

	public static void QueenCombination(boolean[] board, int qpsf, int tq, String ans, int lastbox) {

		if (qpsf == tq) {

			count++;
			System.out.println(count + "." + ans);
			return;

		}

		for (int i = lastbox + 1; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				QueenCombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
				board[i] = false;
			}
		}
	}

}
