package likou;

import java.util.Scanner;

public class ChessProblem {
	int size;
	int[][] board;
	int specialROW;
	int specialCOL;
	int number = 0;
	public ChessProblem(int specialRow, int specialCol, int size) {
		this.size = size;
		this.specialCOL = specialCOL;
		this.specialROW = specialROW;
		board = new int[size][size];
	}
 	public void setBoard(int specialROW, int specialCOL, int leftROW, int leftCOL, int size) {
		if (1 == size) {
			return;
		}
		int subSize = size / 2;
		number++;
		int n = number;
		if (specialROW < leftROW + subSize && specialCOL < leftCOL + subSize) {
			setBoard(specialROW, specialCOL, leftROW, leftCOL, subSize);
		}
		else {
			board[leftROW + subSize - 1][leftCOL + subSize - 1] = n;
			setBoard(leftROW + subSize - 1, leftCOL + subSize - 1, leftROW, leftCOL, subSize);
		}

		if (specialROW < leftROW + subSize && specialCOL >= leftCOL + subSize) {
			setBoard(specialROW, specialCOL, leftROW, leftCOL + subSize, subSize);
		}
		else {
			board[leftROW + subSize -1][leftCOL + subSize] = n;
			setBoard(leftROW + subSize -1, leftCOL + subSize, leftROW, leftCOL + subSize, subSize);
		}

		if (specialROW >= leftROW + subSize && specialCOL < leftCOL + subSize) {
			setBoard(specialROW, specialCOL, leftROW + subSize, leftCOL, subSize);
		}
		else {
			board[leftROW + subSize][leftCOL + subSize - 1] = n;
			setBoard(leftROW + subSize, leftCOL + subSize - 1, leftROW + subSize, leftCOL, subSize);
		}
		if (specialROW >= leftROW + subSize && specialCOL >= leftCOL + subSize) {
			setBoard(specialROW, specialCOL, leftROW + subSize, leftCOL + subSize, subSize);
		}
		else {
			board[leftROW + subSize][leftCOL + subSize] = n;
			setBoard(leftROW + subSize, leftCOL + subSize, leftROW + subSize, leftCOL + subSize, subSize);			
		}	
	}
 	public void printBoard(int specialRow,int specialCol,int size) {
 		setBoard(specialRow, specialCol, 0, 0, size);
 		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");				
			}
			System.out.println();
		}
 	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 8;
		System.out.println("请输入꣺特殊值的行：");
		int specialRow = input.nextInt(N);
		System.out.println("请输入特殊点的列：");
		int specialCol = input.nextInt(N);
		ChessProblem chessProblem = new ChessProblem(specialRow , specialCol , N);
		chessProblem.printBoard(specialRow, specialCol, N);
		System.out.println("18 软件二班 罗文桃 235120008");
	}
}
