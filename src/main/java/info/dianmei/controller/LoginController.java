package info.dianmei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lout on 2017/3/21.
 */
@RestController
public class LoginController {


    @RequestMapping(value="login")
    public String getName(){
        return "success";
    }
}
