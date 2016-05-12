/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Fleeing extends State {

    public Fleeing(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        if (!player.isWounded()) {
            System.out.println("I'm not wounded");
            player.setState(new Waiting(player));
        }else{
            System.out.println("I'm fleeing");
        }
    }
}
