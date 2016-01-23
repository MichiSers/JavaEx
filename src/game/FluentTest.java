package game;

import static game.Game.*;

public class FluentTest {
    public static void main(String... args) {
        Game g = Game.create()
                    .player( name("Brent"), age(27), level(3) )
                    .player( name("Sue"), level(10) )
                    .setOnEarth()
                    .player( name("Mary") ).asMaster()
                    .player( )
                    .adversary(Game.create()
                                    .player( name("Capt. Kirk"), age(99))
                                    .setInSpace()
                                    .player( name("Kahn") )
                                    .adversary(Game.create()
                                                    .player( level(1000)  )
                                                    .get())
                                    .get())
                    .get();

        g = Game.create().player(name("Hurensohn")).setInSpace().get();

        System.out.println(g.getSetupString());
    }
}
