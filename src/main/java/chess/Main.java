package chess;

class Main {

    private String aux;

    Main() {
        aux = "";
    }

    public static void main(final String[] args) {
        GameConsole console = new GameConsole();
        console.drawChessBoard();
    }
}
