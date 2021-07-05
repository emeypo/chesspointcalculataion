package business.concretes;
import java.io.File;
import java.util.Scanner;

import entities.abstracts.Piece;
import entities.abstracts.Piece.PieceColor;
import entities.concretes.Knight;
import entities.concretes.Pawn;
import entities.concretes.King;
import entities.concretes.Queen;
import entities.concretes.Rook;
import entities.concretes.Bishop;

public class ChessBoardManager
{
    public Piece[][] chessBoardData;

    public void ReadChessBoard(String filePath)
    {
        String[][] chessBoardDataStr = new String[8] [8];
        this.chessBoardData = new Piece[8] [8];
        //Firstly reading the txt file to an array was chosen as the method.
		Scanner scan = new Scanner(filePath);
		while (scan.hasNextLine()) {
        for (int r = 0; r < 8; r++)
        {
            for (int c = 0; c < 0; c++)
            {
                String dataStr = chessBoardDataStr[r][c];
            	
                if (dataStr.isEmpty() || dataStr == "--")
                    continue;

                char pieceTypeStr=dataStr.charAt(0);
            	char pieceColorStr=dataStr.charAt(1);
                PieceColor pieceColor = pieceColorStr == 'b' ? PieceColor.White : PieceColor.Black;

                if (pieceTypeStr=='a') //knight=at.
            	{
            		Piece piece = new Knight(r,c,pieceColor);
            	}
            	else if  (pieceTypeStr=='p') //pawn=piyon. 
            	{
            		Piece piece = new Pawn(r,c,pieceColor);
            	}
            	else if  (pieceTypeStr=='s') //king=þah.
            	{
            		Piece piece = new King(r,c,pieceColor);
            	}
            	else if  (pieceTypeStr=='v') //queen=vezir.
            	{
            		Piece piece = new Queen(r,c,pieceColor);
            	}
            	else if  (pieceTypeStr=='k') //rook=kale.
            	{
            		Piece piece = new Rook(r,c,pieceColor);
            	}
            	else if  (pieceTypeStr=='f') //bishop=fil.
            	{
            		Piece piece = new Bishop(r,c,pieceColor);
            	}
                
            }
          }
		}
        
		//Second array has been created to call the method for checking dangerous pieces.
		for (int r = 0; r < 8; r++)
        {
            for (int c = 0; c < 0; c++)
            {
				if (chessBoardData[r][c] != null)
					chessBoardData[r][c].CheckBoardForCausingDanger(chessBoardData);
			}
		}
    
	}
	public void WritePoints()
	{
		for (int r = 0; r < 8; r++)
        {
			String line = "";
			
            for (int c = 0; c < 0; c++)
            {
				if (chessBoardData[r][c] != null)
					line += chessBoardData[r][c].CalculatePoint();
			}
			
			System.out.println(line);
		}
	}
}
