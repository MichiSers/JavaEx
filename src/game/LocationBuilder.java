package game;

public interface LocationBuilder extends GameBuilderTerminator {
    SemiInterface setInSpace();
    SemiInterface setOnEarth();
    SemiInterface setUnderwater();
    SemiInterface adversary(Game oponentGame);
}