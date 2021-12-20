import com.aor.numbers.GenericListSorter
import com.aor.numbers.ListDeduplicator
import com.aor.numbers.ListFilterer
import org.junit.jupiter.api.Assertions
import spock.lang.Specification

class ListDeduplicatorTest extends Specification{
    def list = Arrays.asList(1, 2, 4, 2, 5)

    def "deduplicate"() {
        given:
        ListDeduplicator deduplicator = new ListDeduplicator()
        GenericListSorter sorter = Mock(GenericListSorter)
        sorter.sort(list) >> Arrays.asList(1, 2, 4, 2, 5)

        when:
        List<Integer> distinct = deduplicator.deduplicate(list, sorter)

        then:
        distinct == [1, 2, 4, 5]
    }

    def "deduplicate_bug_8726"() {
        given:
        List<Integer> bugList = Arrays.asList(1,2,4,2)
        List<Integer> expected = Arrays.asList(1, 2, 4)
        ListDeduplicator deduplicator = new ListDeduplicator()
        GenericListSorter sorter = Mock(GenericListSorter)
        sorter.sort(bugList) >> Arrays.asList(1,2,2,4)

        when:
        List<Integer> distinct = deduplicator.deduplicate(bugList, sorter)

        then:
        distinct == expected
    }
}