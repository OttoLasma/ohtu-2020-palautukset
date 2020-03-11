package statistics;

import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import java.util.Iterator;
import statistics.matcher.Matcher;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

public class Main {
	public static void main(final String[] args) {
		Statistics stats = new Statistics(new PlayerReaderImpl("https://nhl27112019.herokuapp.com/players.txt"));
		 
	    QueryBuilder query = new QueryBuilder();
	 
	    Matcher m1 = query.playsIn("PHI")
	            .hasAtLeast(10, "assists")
	            .hasFewerThan(8, "goals").build();

	  Matcher m2 = query.playsIn("EDM")
	            .hasAtLeast(20, "points").build();

	  Matcher m = query.oneOf(m1, m2).build();

		for (Player player : stats.matches(m)) {
			System.out.println(player);
		}
	}
}
