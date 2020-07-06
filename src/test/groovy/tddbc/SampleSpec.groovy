package tddbc;

import spock.lang.Specification
import spock.lang.Unroll

class SampleSpec extends Specification {

    def "3,8を渡すと[3,8]が取得できる"() {
        given:
        def target = new ClosedRange(3, 8)

        when:
        def result = target.getRange()

        then:
        result == "[3,8]"
    }

    def "should return 'Hello TDD BootCamp!' in Java"() {

        given:
        def sut = new ClosedRange()

        when:
        String actual = sut.say()

        then:
        actual == 'Hello TDD BootCamp!'

    }

    @Unroll
    def "should return '#expected' in Groovy"() {

        given:
        def sut = new SampleOfGroovy()

        expect:
        sut.say() == expected

        where:
        expected << ['Hello TDD BootCamp!']

    }

}
