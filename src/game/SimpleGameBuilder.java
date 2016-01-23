package game;

public class SimpleGameBuilder implements PlayerBuilder, GameBuilder, LocationBuilder, SemiInterface, GameLocationBuilder, GameBuilderTerminator {

    private final SimpleGame game;
    private Player lastPlayer;
            
    protected SimpleGameBuilder() {
        game = new SimpleGame();
    }
    
    @Override
    public PlayerBuilder player(PlayerDetail... details) {
        lastPlayer = new SimplePlayer();
        for(PlayerDetail<?> detail : details) {
            switch(detail.attributeType) {
                case NAME:
                    lastPlayer.setName( (String)detail.getAttribute());
                    break;
                case AGE:
                    lastPlayer.setAge( (Integer)detail.getAttribute());
                    break;
                case LEVEL:
                    lastPlayer.setLevel( (Integer)detail.getAttribute());
            }
        }
        game.addPlayer( lastPlayer );
        return this;
    }

    @Override
    public SemiInterface setInSpace() {
        game.setLocation("in Outer Space");
        return this;
    }

    @Override
    public SemiInterface setOnEarth() {
        game.setLocation("on Planet Earth ");
        return this;
    }

    @Override
    public SemiInterface setUnderwater() {
        game.setLocation("in the Seven Seas");
        return this;
    }

    @Override
    public GameLocationBuilder asMaster() {
        game.setPlayerAsMaster(lastPlayer);
        return this;
    }

    @Override
    public Game get() {
        return game;
    }
    
    @Override
    public SemiInterface adversary(Game oponentGame) {
        game.addAdversary(oponentGame);
        return this;
    }

}
