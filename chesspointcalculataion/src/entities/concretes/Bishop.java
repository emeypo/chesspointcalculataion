package entities.concretes;

import entities.abstracts.Piece;

public class Bishop extends Piece{

	public Bishop(int row, int column, PieceColor pieceColor) {
		super(row, column, pieceColor);
		this.basePoint=5;
	}


	@Override
	public void CheckBoardForCausingDanger(Piece[][] chessBoardData) {
		
	}

}
