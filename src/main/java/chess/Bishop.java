package chess;

import java.util.List;
import java.util.ArrayList;

class Bishop extends Piece {
    Bishop(final Color color, final Position source) {
        super.setColor(color);
        super.setSymbol(Symbol.B);
        super.setStatus(Status.ALIVE);
        super.setPosition(source);
    }

    public void kill(final Piece target) {
    }

    public void move(final Piece target) {
    }

    public void die() {
    }

    public boolean isPosibleMove(final Piece target) {
        return true;
    }

    public List<Piece> getPosibleMoves(final ChessBoard chb) {
        List<Piece> array = new ArrayList<Piece>();
        return array;
    }

    public void checkmate() {
    }
}
