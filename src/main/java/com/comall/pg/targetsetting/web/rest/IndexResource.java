package com.comall.pg.targetsetting.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class IndexResource {



    @GetMapping("")
    @Timed
    public String getTargets() {
        return "ddddddd";
    }

}
