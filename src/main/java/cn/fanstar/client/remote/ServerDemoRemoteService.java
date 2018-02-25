package cn.fanstar.client.remote;

import cn.fanstar.client.remote.feigns.ServerDemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fanjun on 2018/2/25.
 */
@Service
public class ServerDemoRemoteService {


    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private ServerDemoFeign serverDemoFeign;


    public String hello(){
        //TODO 远程访问异常编码
        return restTemplate.getForObject("http://server-demo/api/hello", String.class);
    }

    public String helloFeign(){
         //TODO feign 异常以及熔断
        return serverDemoFeign.hello();
    }


}
