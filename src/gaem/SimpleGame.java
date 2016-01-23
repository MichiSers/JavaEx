package gaem;

import java.util.ArrayList;

/**
 * Created by Michi on 23.01.2016.
 */
public class SimpleGame implements Game {

    private String location;
    private ArrayList<Player> players;

    public SimpleGame(){
        players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void setAsMaster(Player player){
        player.asMaster(true);
    }

    public void setLocation(String loc){
        location = loc;
    }

    public void print(){
        for(Player p : players){
            System.out.println(p);
        }

        System.out.println("Game is set in " + location);
    }


}
