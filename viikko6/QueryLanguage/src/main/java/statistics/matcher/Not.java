package statistics.matcher;

import statistics.Player;

public class Not implements Matcher
{
    Matcher matcher;
    
    public Not(final Matcher matcher) {
        this.matcher = matcher;
    }
    
    public boolean matches(final Player p) {
        return !this.matcher.matches(p);
    }
}
