package apolloreact

import org.bbop.apollo.user.User

class BootStrap {

    def bootstrapService

    def init = { servletContext ->
        println "in bootstrap "
        bootstrapService.createUsers(10)
        println "out bootstrap "
    }
    def destroy = {
        bootstrapService.deleteAllUsers()
    }
}
