package entities.concretes;

import entities.abstracts.Piece;

public class Queen extends Piece{

	public Queen(int row, int column, PieceColor color) {
		super(row, column, color);
		this.basePoint=9;
	}

	@Override
	public void CheckBoardForCausingDanger(Piece[][] chessBoardData) {
		
	}

}
