package entities.abstracts;
//It's an interface because all pieces have a different calculation of danger and our base class piece will implement this interface.
public interface PieceService {
	void CheckBoardForCausingDanger(Piece[][] chessBoardData);
}
