package entities.concretes;
import entities.abstracts.Piece;

public class Knight extends Piece {

	public Knight(int row, int column, PieceColor pieceColor) {
		super(row, column, pieceColor);
		this.basePoint=3;
	}

	@Override
	public void CheckBoardForCausingDanger(Piece[][] chessBoardData) {
		
	}


}
