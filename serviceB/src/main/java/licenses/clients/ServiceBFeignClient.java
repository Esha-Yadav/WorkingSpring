package licenses.clients;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("serviceA")
public interface ServiceBFeignClient {
    @RequestMapping(
            method= RequestMethod.GET,
            value="/v1/booleans/{num}",
            consumes="application/json")
    Boolean getOrganization(@PathVariable("num") Long number);

}
