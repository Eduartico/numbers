import com.aor.numbers.ListSorter
import spock.lang.Specification

class ListSorterTest extends Specification{
    def list = Arrays.asList(4,3,2,1)

    def "sort"() {
        given:
        List<Integer> expected = Arrays.asList(4,3,2,1)
        ListSorter sorter = new ListSorter()

        when:
        List<Integer> sorted = sorter.sort(list)

        then:
        expected == sorted
    }

    def "sort_bug_8726"() {
        given:
        List<Integer> bugList = Arrays.asList(1, 2, 4, 2)
        List<Integer> expected = Arrays.asList(1, 2, 2, 4)
        ListSorter sorter = new ListSorter()

        when:
        List<Integer> sorted = sorter.sort(bugList)

        then:
        expected == sorted
    }
}