package web.app

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(CountryController)
class CountryControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void testSomething() {
        controller.index()
        assert 'Welcome to the xyz' == response.text
//        expect:"fix me"
//            true == false
    }
}
