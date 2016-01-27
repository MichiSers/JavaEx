package lambda;

import java.util.List;
import java.util.Set;

/**
 * Created by Michi on 27.01.2016.
 */

@FunctionalInterface
public interface Distinct<o> {

    Set makeDistinct(List o);
}
