package statistics.matcher;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import statistics.Player;

public class Not implements Matcher {
    private Matcher m;

    public Not(Matcher t) {
        this.m = t;
    }

    @Override
    public boolean matches(Player p) {
        try {
            Boolean method = this.m.matches(p);
            return !(method);

        } catch (Exception ex) {
            System.out.println(ex);
            throw new IllegalStateException("Player does not have field");
        }
    }
}
