import java.util.Scanner;

/**
 * Created by TAWEESOFT on 5/12/16 AD.
 */
public class Player {
    private boolean wounded;
    private boolean friendWounded;
    private boolean opponentsNearby;

    private State state;

    public Player() {
        this.state = new Waiting(this);
    }

    public void startEventLoop() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                while(true) {
                    state.doAction();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }

    public boolean isWounded() {
        return wounded;
    }

    public void setWounded(boolean wounded) {
        this.wounded = wounded;
    }

    public boolean isFriendWounded() {
        return friendWounded;
    }

    public void setFriendWounded(boolean friendWounded) {
        this.friendWounded = friendWounded;
    }

    public boolean isOpponentsNearby() {
        return opponentsNearby;
    }

    public void setOpponentsNearby(boolean opponentsNearby) {
        this.opponentsNearby = opponentsNearby;
    }

    public static void main(String[] ar){
        Player player = new Player();
        player.startEventLoop();
        Scanner scan = new Scanner(System.in);
        while(true){
            int option = scan.nextInt();
            switch(option) {
                case 1 :
                    player.setWounded(true);
                    break;
                case 2 :
                    player.setWounded(false);
                    break;
                case 3 :
                    player.setFriendWounded(true);
                    break;
                case 4 :
                    player.setFriendWounded(false);
                    break;
                case 5 :
                    player.setOpponentsNearby(true);
                    break;
                case 6 :
                    player.setOpponentsNearby(false);
                    break;
            }
        }

    }

    public void setState(State state) {
        this.state = state;
    }
}
