package licenses.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrganizationRestTemplateClient {
    @Autowired
    RestTemplate restTemplate;

    public Boolean getOrganization(Long num){
        ResponseEntity<Boolean> restExchange =
                restTemplate.exchange(
                        "http://serviceA/v1/booleans/{num}",
                        HttpMethod.GET,
                        null, Boolean.class, num);

        return restExchange.getBody();
    }
}
