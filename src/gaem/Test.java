package gaem;

/**
 * Created by Michi on 23.01.2016.
 */
public class Test {

    public static void main(String[] args){
        Game g = Game.create().player("Tom").player("Annie").asMaster().player("Louise").setInSpace();
        g = Game.create().setInSpace();
        g.print();
    }
}
