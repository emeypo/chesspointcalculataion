import business.concretes.ChessBoardManager;

public class Main {

	public static void main(String[] args) {
		ChessBoardManager chessBoardManager = new ChessBoardManager();
		chessBoardManager.ReadChessBoard("C:/cstechchess/chesspointcalculataion/board1.txt");
		chessBoardManager.WritePoints();
	}

}
