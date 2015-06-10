// Grails Security Plugin ~ MIT License ~ Copyright (c) 2015 by individual contributors

package org.centerkey.grails.security

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SecurityService {

   def grailsApplication
   //def encoder = new BCryptPasswordEncoder()

   def summary() {
      log.println("Initial user: ${grailsApplication.config.security.initialSetupUser}")
      grailsApplication.config.security.roles.each { log.println("Role: ${it}") }
      }

   def cleanupEmail(String email) {
      return email.trim().toLowerCase()
      }

}
