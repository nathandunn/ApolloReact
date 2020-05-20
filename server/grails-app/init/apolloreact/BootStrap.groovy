package apolloreact

import org.bbop.apollo.user.User

class BootStrap {

    def init = { servletContext ->
        println "in bootstrap "
        User.withNewTransaction {
            for(int i = 0 ; i < 10 ; i++){
                println "creating user ${i}"
                new User(
                    firstName: "Bob${i}",
                    lastName: "Jones${i}",
                    passwordHash: "randompass",
                    inactive: false,
                    username: "demouser${i}",
                ).save(failOnError: true,flush: true)
            }
        }
        println "out bootstrap "
        println "user count ${User.count}"
    }
    def destroy = {
    }
}
