package cn.fanstar.client.controller;

import cn.fanstar.client.remote.ServerDemoRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanjun on 2018/2/25.
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private ServerDemoRemoteService serverDemoRemoteService;

    @GetMapping("/hello")
    public String hello(){

        return String.format("client-demo remote ribbon call : %s", serverDemoRemoteService.hello());
    }

    @GetMapping("/hello-feign")
    public String helloFeign(){

        return String.format("client-demo remote feign call : %s", serverDemoRemoteService.helloFeign());
    }




}
