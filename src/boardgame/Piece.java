package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position  = null; // se nao colocar nada j� � nulo por padr�o, colocando apenas para did�tica
	}
	
	protected Board getBoard() {
		return board;
	}

}
