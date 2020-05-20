package org.bbop.apollo.user

import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest
import org.grails.web.json.JSONObject

class UserServiceSpec extends HibernateSpec implements ServiceUnitTest<UserService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test user creation"() {
        when:
        int i = 0
        JSONObject jsonObject = new JSONObject(
            [
                username   : "demouser${i}",
                firstName  : "Bob${i}",
                lastName   : "Jones${i}",
                passwordHash: "randompass",
            ]
        )
        service.createUser(
            jsonObject
        )
        then:
        User.count == 1
    }
}
