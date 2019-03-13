package sourish.controllers;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/booleans")
public class OrganizationServiceController {


    @RequestMapping(value="/{num}",method = RequestMethod.GET)
    public Boolean getOrganization(@PathVariable("num") Long num) {
        return num%2==0;
    }


}
