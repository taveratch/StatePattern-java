/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Waiting extends State{

    public Waiting(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        if (player.isFriendWounded()) {
            System.out.println("My friend is wounded!");
            player.setState(new Healing(player));
        }else if(player.isOpponentsNearby()) {
            System.out.println("Found opponents about here!");
            player.setState(new Attacking(player));
        }else {
            System.out.println("I'm waiting");
        }
    }
}
