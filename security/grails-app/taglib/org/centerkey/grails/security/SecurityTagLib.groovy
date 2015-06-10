// Grails Security Plugin ~ MIT License ~ Copyright (c) 2015 by individual contributors

package org.centerkey.grails.security

class SecurityTagLib {

   static namespace = "security"

   def username = {
      // Usage:
      //    <security:username />
      out << "lee@example.com"
      }

}
