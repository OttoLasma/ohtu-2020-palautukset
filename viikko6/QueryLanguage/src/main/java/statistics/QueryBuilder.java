
package statistics;

import statistics.matcher.PlaysIn;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Or;
import statistics.matcher.HasAtLeast;
import statistics.matcher.And;
import statistics.matcher.Matcher;
import java.util.ArrayList;

public class QueryBuilder {
	ArrayList<Matcher> matchers;

	public QueryBuilder() {
		this.matchers = new ArrayList<Matcher>();
	}

	Matcher build() {
		final Matcher matcher = (Matcher) new And((Matcher[]) this.matchers.toArray(new Matcher[this.matchers.size()]));
		this.matchers.clear();
		return matcher;
	}

	QueryBuilder hasAtLeast(final int value, final String category) {
		this.matchers.add((Matcher) new HasAtLeast(value, category));
		return this;
	}

	QueryBuilder oneOf(final Matcher... matchers) {
		this.matchers.add((Matcher) new Or(matchers));
		return this;
	}

	QueryBuilder hasFewerThan(final int value, final String category) {
		this.matchers.add((Matcher) new HasFewerThan(value, category));
		return this;
	}

	QueryBuilder playsIn(final String team) {
		this.matchers.add((Matcher) new PlaysIn(team));
		return this;
	}
}