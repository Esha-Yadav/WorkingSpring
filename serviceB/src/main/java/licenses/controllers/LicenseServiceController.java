package licenses.controllers;

import com.sun.org.apache.xpath.internal.operations.Bool;
import licenses.clients.OrganizationRestTemplateClient;
import licenses.clients.ServiceBFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/serviceB")
public class LicenseServiceController {

    @Autowired
    ServiceBFeignClient client;

    @RequestMapping(value="/checkEven/{num}",method = RequestMethod.GET)
    public Boolean getLicenses(@PathVariable("num") Long num) {
        return client.getOrganization(num);
    }


}
