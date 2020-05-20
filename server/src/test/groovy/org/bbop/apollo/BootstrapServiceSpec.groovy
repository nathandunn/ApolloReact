package org.bbop.apollo

import grails.test.hibernate.HibernateSpec
import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import groovy.transform.CompileStatic
import org.bbop.apollo.user.User
import org.bbop.apollo.user.UserService
import spock.lang.Specification

//@CompileStatic
class BootstrapServiceSpec extends Specification implements DataTest,ServiceUnitTest<BootstrapService>{

    UserService userService
    BootstrapService bootstrapService
    List<Class> getDomainClasses() { [User] }

    def setupSpec() {
        mockDomain User
    }


    def setup() {
    }

    def cleanup() {
    }

}
