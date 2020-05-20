package org.bbop.apollo


import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import org.bbop.apollo.user.User
import spock.lang.Specification

@SuppressWarnings('MethodName')
@Integration
@Rollback
class BootstrapServiceSpec extends Specification {

    BootstrapService bootstrapService

    def setup() {
        User.deleteAll(User.all)
    }

    def cleanup() {
        User.deleteAll(User.all)
    }

    void "test something"() {

        when: "we add users"
        bootstrapService.createUsers()

        then:"fix me"
        User.count == 10
    }
}
