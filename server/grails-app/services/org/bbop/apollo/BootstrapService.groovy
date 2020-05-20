package org.bbop.apollo

import grails.gorm.transactions.Transactional
import org.bbop.apollo.user.User
import org.grails.web.json.JSONObject

@Transactional
class BootstrapService {

    def userService

    def createUsers(int numUsers = 10) {

        for (int i = 0; i < 10; i++) {
            println "creating user ${i}"
            JSONObject jsonObject = new JSONObject(
                [
                    username   : "demouser${i}",
                    firstName  : "Bob${i}",
                    lastName   : "Jones${i}",
                    passwordHash: "randompass",
                ]
            )
            userService.createUser(
                jsonObject
            )
        }
        println "user count ${User.count}"

    }

    void deleteAllUsers() {
        User.deleteAll(User.all)
    }
}
