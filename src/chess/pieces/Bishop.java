package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] PossibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// upper left
		p.setValue(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && IsThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// upper right
		p.setValue(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && IsThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// bottom left
		p.setValue(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && IsThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// bottom right
		p.setValue(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && IsThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}

	@Override
	public String toString() {
		return "B";
	}
}
