package cn.fanstar.client.remote.feigns;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by fanjun on 2018/2/25.
 */
@FeignClient(name="server-demo")
public interface ServerDemoFeign {

    @GetMapping("/api/hello")
    public String hello();
}
