package com.ysjtest.api;

import com.alibaba.fastjson.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * RESTful api demo
 */
@Path("/hello")
public class Hello {
    @Path("getstudent")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent() {
        List<Student> lists = new ArrayList<Student>();
        lists.add(new Student("1","mayun",23));
        lists.add(new Student("2","mahuateng",24));
        lists.add(new Student("3","zhouhongyi",25));
        JSONObject json = new JSONObject();
        return Response.status(Response.Status.OK).entity(json.toJSONString(lists)).build();
    }
}