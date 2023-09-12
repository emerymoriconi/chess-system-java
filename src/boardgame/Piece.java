package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//tabuleiro não pode ser visível ao jogo
	protected Board getBoard() {
		return board;
	}
}
