package chess;

import boardgame.Board;

public class ChessMatch {
	//classe que contém as regras do meu jogo de xadrez
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	//retorna a matriz de peças da partida de xadrez
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
}