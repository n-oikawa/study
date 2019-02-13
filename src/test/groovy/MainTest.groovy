import spock.lang.Specification
import spock.lang.Unroll
import study01.Main

@Unroll
class MainTest extends Specification {

    Main sut = new Main()

    def "Run"() {

        expect:
        sut.run(1) == 2
    }
}
