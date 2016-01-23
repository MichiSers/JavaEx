package gaem;

/**
 * Created by Michi on 23.01.2016.
 */
public interface GameBuilder {

    public GameBuilder player(String name);
    public GameBuilder asMaster();
    public Game setInSpace ();
    public Game setOnEarth ();
    public Game setUnderwater ();
}
