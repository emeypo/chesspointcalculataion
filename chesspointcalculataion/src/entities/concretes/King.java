package entities.concretes;

import entities.abstracts.Piece;

public class King extends Piece{

	public King(int row, int column, PieceColor color) {
		super(row, column, color);
		this.basePoint=100;
}

	@Override
	public void CheckBoardForCausingDanger(Piece[][] chessBoardData) {
		
	}

}
