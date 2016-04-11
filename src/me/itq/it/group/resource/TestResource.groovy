package me.itq.it.group.resource

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

/**
 * Test Resource
 * Created by William.Wei on 2015/9/11.
 */
@Path('web')
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Component
class TestResource {
    @Autowired
    def userService
    @GET
    def index() {

        def user = userService.getUser()
        def data = [
                test: 'ok',
                user: user
        ]
        return Response.ok(data).build()
    }
}