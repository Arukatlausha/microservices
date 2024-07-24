package com.ust.Platformss.feignclient;

import com.ust.Platformss.client.Customers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="subscribers",url="http://localhost:9091/customers")
public interface CustomerClient {
@GetMapping("/platform/{platformid}")
    List<Customers> findCustomersByPlatformid(@PathVariable int platformid);
}
