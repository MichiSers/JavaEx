package game;

public interface Game {

    public static GameBuilder create() { return new SimpleGameBuilder(); }
    
    static PlayerDetail name(String name) {
        return new PlayerDetail<>(name, PlayerDetail.PlayerDetailType.NAME);
    }
    
    static PlayerDetail age(int age) {
        return new PlayerDetail<>(age, PlayerDetail.PlayerDetailType.AGE);
    }

    static PlayerDetail level(int level) {
        return new PlayerDetail<>(level, PlayerDetail.PlayerDetailType.LEVEL);
    }
    
    // further (public abstract) methods defined here:

    String getSetupString();
}
