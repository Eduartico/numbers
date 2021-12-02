import com.aor.numbers.GenericListDeduplicator
import com.aor.numbers.ListAggregator
import spock.lang.Specification

class ListAggregatorTest {
    def list = Arrays.asList(1, 2, 4, 2, 5)

    def "sum"() {
        given:
        def aggregator = new ListAggregator();
        when:
        int sum = aggregator.sum(list)
        then:
        sum == 14
    }

    def "max"() {
        given:
        def aggregator = new ListAggregator();
        when:
        int max = aggregator.max(list)
        then:
        max == 5
    }

    def "min"() {
        given:
        def aggregator = new ListAggregator();
        when:
        int min = aggregator.min(list)
        then:
        min == 1
    }

    def "distinct"() {
        given:
        def aggregator = new ListAggregator()
        def deduplicator = Mock(GenericListDeduplicator)
        deduplicator.deduplicate(list) >> Arrays.asList(1, 2, 4, 5)
        when:
        def distintc = aggregator.distinct(list, deduplicator)
        then:
        distintc == 4
    }

    def "max_bug_7263"() {
        given:
        List<Integer> maxBug = Arrays.asList(-1, -4, -5)
        ListAggregator aggregator = new ListAggregator()
        when:
        int max = aggregator.max(maxBug)
        then:
        max == -1
    }

    def "distinct_bug_8726"() {
        given:
        List<Integer> distinctBug = Arrays.asList(1, 2, 4, 2)
        ListAggregator aggregator = new ListAggregator()
        GenericListDeduplicator deduplicator = Mock(GenericListDeduplicator)
        deduplicator.deduplicate(distinctBug) >> Arrays.asList(1, 2, 4)
        when:
        int distinct = aggregator.distinct(distinctBug, deduplicator);
        then:
        distinct == 3
    }
}