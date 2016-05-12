/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public abstract class State {

    Player player;

    public State(Player player) {
        this.player = player;
    }

    abstract void doAction();

    public Player getPlayer() {
        return player;
    }
}
