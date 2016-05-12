/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Healing extends State {


    public Healing(Player player) {
        super(player);
    }

    @Override
    public void doAction() {
        if(player.isWounded()){
            System.out.println("I'm wounded then runnnn!");
            player.setState(new Fleeing(player));
        }else if(!player.isFriendWounded()){
            System.out.println("No wounded friends");
            player.setState(new Attacking(player));
        }else {
            System.out.println("I'm healing");
        }
    }
}
