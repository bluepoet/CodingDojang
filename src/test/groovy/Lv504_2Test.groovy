import net.bluepoet.algorithm.lv1.Lv1504_2
import spock.lang.Specification


/**
 * Created by bluepoet on 2016. 12. 5..
 */
class Lv504_2Test extends Specification {
    def "10부터 15까지 각 숫자가 몇개인지 테스트한다."() {
        when:
        def resultMap = Lv1504_2.calculate(10, 6)

        then:
        resultMap.get("0") == 1
        resultMap.get("1") == 7
        resultMap.get("2") == 1
        resultMap.get("3") == 1
        resultMap.get("4") == 1
        resultMap.get("5") == 1
    }
}