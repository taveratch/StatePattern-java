/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Attacking extends State {

    public Attacking(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        if(player.isFriendWounded()) {
            System.out.println("My friend is wounded!");
            player.setState(new Healing(player));
        }else if(!player.isOpponentsNearby()) {
            System.out.println("No opponents found");
            player.setState(new Waiting(player));
        }else if(player.isWounded()) {
            System.out.println("I'm wounded");
            player.setState(new Fleeing(player));
        }else {
            System.out.println("I'm attacking");
        }
    }
}
