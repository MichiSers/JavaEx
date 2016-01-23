package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SimpleGame implements Game {
    static final String NO_LOCATION = "nowhere";

    private List<Player> players = new ArrayList<>();
    private final List<Game> oponentGames = new ArrayList<>();
    private String location = NO_LOCATION;
    
    SimpleGame() {}
    
    void addPlayer(Player newPlayer) {
        players.add(newPlayer);
    }
    
    void setPlayerAsMaster(Player player) {
        player.setMaster(true);
    }
    
    void setLocation(String location) {
        if( NO_LOCATION.equals(this.location) )
            this.location = location;
        else
            throw new IllegalArgumentException("Location has already been set " + this.location);
    }
    
    void addAdversary(Game oponentGame) {
        this.oponentGames.add(oponentGame);
    }

    @Override
    public String getSetupString() {
        StringBuilder sb = new StringBuilder(); 
        sb.append("Simple Game set ").append(location).append(" with following player(s) ").append(Arrays.toString(players.toArray()));
        if( !this.oponentGames.isEmpty() ) {
            sb.append("\nOponent(s):");
            for(Game oponent : this.oponentGames)
                sb.append("\n-").append(oponent.getSetupString());
        }
        return sb.toString();
    }
}
