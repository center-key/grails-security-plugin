// Grails Security Plugin ~ MIT License ~ Copyright (c) 2015 by individual contributors

package org.centerkey.grails.security

import grails.plugins.*

class SecurityGrailsPlugin extends Plugin {

   def grailsVersion = "3.0.1 > *"
   def pluginExcludes = [ //resources that are excluded from plugin packaging
      "grails-app/views/error.gsp"
      ]

   // Plugin metadata
   def title =           "Grails Security Plugin"
   def author =          "Center Key"
   def description =     "Straightforward security you can understand"
   def profiles =        ["web"]
   def documentation =   "http://centerkey.org/"
   def license =         "MIT"
   def organization =    [name: "Center Key", url: "http://centerkey.org/"]
   def developers =      [[name: "Dem Pilafian"]]
   def issueManagement = [system: "GitHub", url: "https://github.com/center-key/grails-security-plugin/issues"]
   def scm =             [url: "https://github.com/center-key/grails-security-plugin"]

   Closure doWithSpring() { {->
         // TODO Implement runtime spring config (optional)
         }
      }

   void doWithDynamicMethods() {
      // TODO Implement registering dynamic methods to classes (optional)
      }

   void doWithApplicationContext() {
      // TODO Implement post initialization spring config (optional)
      }

   void onChange(Map<String, Object> event) {
      // TODO Implement code that is executed when any artefact that this plugin is
      // watching is modified and reloaded. The event contains: event.source,
      // event.application, event.manager, event.ctx, and event.plugin.
      }

   void onConfigChange(Map<String, Object> event) {
      // TODO Implement code that is executed when the project configuration changes.
      // The event is the same as for 'onChange'.
      }

   void onShutdown(Map<String, Object> event) {
      // TODO Implement code that is executed when the application shuts down (optional)
      }

}
