package statistics.matcher;

import statistics.Player;

public class Or implements Matcher
{
    private Matcher[] matchers;
    
    public Or(final Matcher... matchers) {
        this.matchers = matchers;
    }
    
    public boolean matches(final Player p) {
        Matcher[] matchers;
        for (int length = (matchers = this.matchers).length, i = 0; i < length; ++i) {
            final Matcher matcher = matchers[i];
            if (matcher.matches(p)) {
                return true;
            }
        }
        return false;
    }
}