package gaem;

/**
 * Created by Michi on 23.01.2016.
 */
public interface Game {

    public static GameBuilder create (){
        return new SimpleGameBuilder();
    }

    public void print();
}
