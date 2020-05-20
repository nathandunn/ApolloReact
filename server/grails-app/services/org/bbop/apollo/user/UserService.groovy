package org.bbop.apollo.user

import grails.gorm.transactions.Transactional
import org.grails.web.json.JSONObject

@Transactional
class UserService {

    def createUser(JSONObject jsonObject) {
        new User(
            firstName: jsonObject.firstName,
            lastName: jsonObject.lastName,
            passwordHash: jsonObject.passwordHash,
            inactive: false,
            username: jsonObject.username,
        ).save(failOnError: true,flush: true)

    }
}
