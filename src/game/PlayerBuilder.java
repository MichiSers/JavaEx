package game;

public interface PlayerBuilder extends GameBuilder, LocationBuilder, GameBuilderTerminator {
    GameLocationBuilder asMaster();
}
