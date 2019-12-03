package cn.hw.memerservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GitController {

    @Autowired
    private Perpertys gitConfig;

    @GetMapping(value = "show")
    public Object show(){
        return gitConfig;
    }
}
