package Model;

public enum Player_State {


    /**
     * The player is waiting for his/ her turn.
     */
    WAITING,
    /**
     * The player is playing.
     */
    PLAYING,
    /**
     * The player is missing a turn. She/ he decided not to play.
     */
    MISSING_TURN,
    /**
     * The player has withdrawn from the game. Most likely because she/ he was
     * stuck.
     */
    WITHDRAWN,
    /**
     * The player is done playing. She/ he has placed all her/ his pieces.
     */
    DONE;


}
