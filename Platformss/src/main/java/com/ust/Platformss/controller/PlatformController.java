package com.ust.Platformss.controller;

import com.ust.Platformss.client.Customers;
import com.ust.Platformss.client.FullResponse;
import com.ust.Platformss.feignclient.CustomerClient;
import com.ust.Platformss.model.PlatformDetails;
import com.ust.Platformss.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/platforms")
public class PlatformController {
    @Autowired
    private PlatformRepository platformRepository;
    @Autowired
    private CustomerClient client;
    @PostMapping("/addplatforms")
    public void addPlatform(@RequestBody PlatformDetails details) {
        platformRepository.save(details);
    }
    @GetMapping("/withcustomers/{platformid}")
    public FullResponse findplatform(@PathVariable int platformid) {
      PlatformDetails p=  platformRepository.findByPlatformid(platformid).orElse(null);
      List<Customers> list=client.findCustomersByPlatformid(platformid);
      FullResponse fr=new FullResponse();
      fr.setPlatformid(p.getPlatformid());
      fr.setPlatformname(p.getPlatformname());
      fr.setPlatformdescription(p.getPlatformdescription());
      fr.setPlatformowner(p.getPlatformowner());
      fr.setPlatformplans(p.getPlatformplans());
      fr.setCustomers(list);
      return fr;
    }
}
