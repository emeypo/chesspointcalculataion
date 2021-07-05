package entities.concretes;
import entities.abstracts.Piece;

public class Pawn extends Piece {

	public Pawn(int row, int column, PieceColor color) {
		super(row, column, color);
		this.basePoint=1;
	}

	@Override
	public void CheckBoardForCausingDanger(Piece[][] chessBoardData) { 
		/*Method was written according to pawn's moves. If the pawn causes a
		risk for another piece, it will set its status to danger.*/
		Piece leftDiagonalPiece = chessBoardData[this.row] [this.column - 1];
		Piece rightDiagonalPiece = chessBoardData[this.row] [this.column + 1];
		if (leftDiagonalPiece != null)
		{  
			 leftDiagonalPiece.SetAsInDanger();
		}

		if (rightDiagonalPiece != null)
		{
			rightDiagonalPiece.SetAsInDanger();
		}
	}



}
