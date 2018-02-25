package cn.fanstar.client.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fanjun on 2018/2/25.
 */
@Service
public class RemoteRibbonServerDemoService {


    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        //TODO 远程访问异常编码
        return restTemplate.getForObject("http://server-demo/api/hello", String.class);
    }


}
