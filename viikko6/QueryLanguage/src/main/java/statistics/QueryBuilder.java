package statistics;

import statistics.matcher.All;
import statistics.matcher.Matcher;

import javax.management.Query;

public class QueryBuilder {
    private Query query;

    public QueryBuilder() {
        query = new Query();
    }

    public Query query(){
        return query;
    }

    public Matcher build() {
        All a = new All();
        return a;
    }
}
