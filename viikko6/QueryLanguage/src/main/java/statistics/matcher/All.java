package statistics.matcher;

import java.lang.reflect.Method;
import statistics.Player;

public class All implements Matcher {

    public All() {
    }

    @Override
    public boolean matches(Player p) {
        try {
            return 0 == 0;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new IllegalStateException(" No players");
        }
    }
}
