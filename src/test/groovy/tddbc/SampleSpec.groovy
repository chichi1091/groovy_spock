package tddbc

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

    @Unroll
    def "#start ＞＝ #end の場合は閉区間が作れない"() {
        when:
        def target = new ClosedRange(start, end)

        then:
        // 例外が来たことをチェックしたい
        thrown(IllegalArgumentException)

        where:
        start | end
        10 | 8
        8 | 8
    }

}
