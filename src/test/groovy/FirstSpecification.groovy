import com.aor.numbers.GenericListDeduplicator
import com.aor.numbers.ListAggregator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import spock.lang.Specification

class FirstSpecification extends Specification {
    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 2
        when:
        int result = left + right
        then:
        result == 4
    }

    def "Should be able to remove from list"() {
        given:
        def list = [1, 2, 3, 4]
        when:
        list.remove(0)
        then:
        list == [2, 3, 4]
    }
    def "Should get an index out of bounds when removing a nonexistent item"() {
        given:
        def list = [1, 2, 3, 4]
        when:
        list.remove(20)
        then:
        thrown(IndexOutOfBoundsException)
        list.size() == 4
    }
    def "four divided by two should equal 2"(){
        given:
        int divs = 2
        int divd= 4
        when:
        int result = divd/divs
        then:
        result == 2
    }
    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c
        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }
}
