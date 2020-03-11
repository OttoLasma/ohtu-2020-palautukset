package statistics.matcher;

import statistics.Player;

public class HasFewerThan implements Matcher {
	Not negaatio;

	public HasFewerThan(final int value, final String category) {
		this.negaatio = new Not((Matcher) new HasAtLeast(value, category));
	}

	public boolean matches(final Player p) {
		return this.negaatio.matches(p);
	}
}