package Model;

import java.util.List;

public interface Game {


    /**
     * 初始化 Blokus model
     * Initializes the Blokus model.
     */
    public void initialize();

    /**
     * Gets the board.
     *
     * @return the board.
     */
    public Board getBoard();

    /**
     * Sets the given number of players as bots.
     *
     * @param nb_of_bots is the number of bots playing the game.
     */
    public void setBotPlayers(int nb_of_bots);

    /**
     * Gets the players of the game.
     *
     * @return the players of the game.
     */
    public List<Player> getPlayers();

    /**
     * Gets the moves of the game.
     *
     * @return the moves of the game.
     */
    public List<Move> getMoves();

    /**
     * Gets the current player of the game.
     *
     * @return the current player of the game.
     */
    public Player getCurrentPlayer();

    /**
     * Gets the winner of the game. The winner has the highest score. If
     * multiple players happen to have the same highest score, they all win the
     * game.
     *
     * @return the winner(s).
     */
    public List<Player> getWinner();

    /**
     * Indicates the end of the game. The game is over if one of the two assert
     * is respected...
     * <ul>
     * <li>... all the playing players have placed all their pieces;</li>
     * <li>... all the players are stuck. A player is stuck when she/ he
     * withdraws from the game;</li>
     * </ul>
     *
     * @return true if the game is over.
     */
    public boolean isOver();

    /**
     * Selects the piece of the current player.
     *
     * @param shape is the shape of the piece to select.
     * @throws IllegalStateException if the current player stock is empty.
     */
    public void selectCurrentPlayerPiece(Piece piece);

    /**
     * Places the current player piece on the board at the given position.
     *
     * @param row is a row of the board where to place the piece.
     * @param column is a column of the board where to place the piece.
     * @throws IllegalStateException if the current player has not selected a
     * piece.
     * @throws ModelException if is the piece the current selected cannot be
     * placed at the given position.
     */
    public void placePiece(int row, int column);

    /**
     * Rotates the current player piece 90 degrees clockwise.
     */
    public void rotateCurrentPlayerPiece();

    /**
     * Turns the current piece player over.
     */
    public void turnCurrentPlayerPieceOver();
    
    public void withdrawCurrentPlayer();
    
    public void missTurnCurrentPlayer();

    /**
     * Passes to the next player.
     */
    public void nextPlayer();

    /**
     * Adds the view as an observer of this game.
     *
     * @param view is the observer.
     */
       
//    public void addObserver(Observer o);

}
