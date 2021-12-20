import com.aor.numbers.DivisibleByFilter
import com.aor.numbers.GenericListFilter
import com.aor.numbers.ListFilterer
import com.aor.numbers.PositiveFilter
import org.junit.jupiter.api.Assertions
import spock.lang.Specification

class ListFiltererTest extends Specification{
    def list = Arrays.asList(1,-1,0,3)

    def "ListFilterer"(){
        given:
        List<Integer> expected = Arrays.asList(1,-1,0,3)
        GenericListFilter stubFilter = Mock(GenericListFilter)
        stubFilter.accept(_) >> true
        ListFilterer filterer = new ListFilterer(stubFilter)

        when:
        List<Integer> nothingFiltered = filterer.filter(list)

        then:
        expected == nothingFiltered
    }

    def "PositiveFilter"(){
        given:
        List<Integer> expected = Arrays.asList(1,-1,0,3)
        ListFilterer filterer = new ListFilterer(new PositiveFilter())

        when:
        List<Integer> positives = filterer.filter(list)

        then:
        expected == positives
    }

    def "DivisibleByFilter"(){
        given:
        List<Integer> expected = Arrays.asList(1,-1,0,3);
        ListFilterer filterer = new ListFilterer(new DivisibleByFilter(3));

        when:
        List<Integer> divisibleByThree = filterer.filter(list);

        then:
        expected == divisibleByThree

    }
}
