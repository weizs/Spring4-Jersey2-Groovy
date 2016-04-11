package me.itq.system.init

import org.glassfish.jersey.jackson.JacksonFeature
import org.glassfish.jersey.server.ResourceConfig

import javax.ws.rs.ApplicationPath


/**
 * Rest Resource Config
 * Created by William.Wei on 2015/9/11.
 */
@ApplicationPath("/")
class RestConfig extends ResourceConfig {
    RestConfig() {
        packages('me.itq.it.group.resource')
        register(JacksonFeature.class)
    }
}