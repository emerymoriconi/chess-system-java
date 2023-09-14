package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	//classe que contém as regras do meu jogo de xadrez
	
	private Board board;
	
	public ChessMatch() {
		//na hora que a partida começa, cria-se um tabuleiro e chama o método initialSetup
		board = new Board(8, 8);
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		//metodo que coloca as peças usando as coordenadas normais do xadrez
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//método responsável por iniciar a partida de xadrez, colocando as peças no tabuleiro
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
