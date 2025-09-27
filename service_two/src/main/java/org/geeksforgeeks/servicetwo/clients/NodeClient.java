package org.geeksforgeeks.servicetwo.clients;

import org.geeksforgeeks.servicetwo.dao.NodePrefixResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:9999", name = "node-app")
public interface NodeClient {

    @GetMapping("/prefix")
    NodePrefixResponse getPrefix();
}
