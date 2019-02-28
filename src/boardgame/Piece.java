package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position  = null; // se nao colocar nada já é nulo por padrão, colocando apenas para didática
	}
	
	protected Board getBoard() {
		return board;
	}

}
