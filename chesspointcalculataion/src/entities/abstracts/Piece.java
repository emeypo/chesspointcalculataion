package entities.abstracts;
public abstract class Piece implements PieceService{
	public int row;
    public int column;
	private PieceColor pieceColor;
    
	public enum PieceColor //Because there can only be two types of colors.
	{
	    Black,
	    White
	}

    public float basePoint;
    public boolean isInDanger;

    public Piece(int row, int column, PieceColor pieceColor)
    {
        this.row = row;
        this.column = column;
        this.pieceColor = pieceColor;

        this.isInDanger = false;
    }

    public void SetAsInDanger()
    {
        this.isInDanger = true;
    }

    public float CalculatePoint()
    {
		if (isInDanger)
			return basePoint * 0.5f;
		else 
			return basePoint;
    }

}
