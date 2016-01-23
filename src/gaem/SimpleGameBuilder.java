package gaem;

/**
 * Created by Michi on 23.01.2016.
 */
public class SimpleGameBuilder implements GameBuilder, SemiInterface {

    private SimpleGame game;
    private Player newPlayer;

    public SimpleGameBuilder(){
        this.game = new SimpleGame();
    }

    @Override
    public GameBuilder player(String name) {
        newPlayer = new SimplePlayer(name);
        game.addPlayer(newPlayer);
        return this;
    }

    @Override
    public GameBuilder asMaster() {
//        game.setAsMaster(newPlayer);

        newPlayer.asMaster(true);
        return this;
    }

    @Override
    public Game setInSpace() {
        game.setLocation("Space");
        return game;
    }

    @Override
    public Game setOnEarth() {
        game.setLocation("Earth");
        return game;
    }

    @Override
    public Game setUnderwater() {
        game.setLocation("Underwater");
        return game;
    }


}
