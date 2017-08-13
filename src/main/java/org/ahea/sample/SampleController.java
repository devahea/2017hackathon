package org.ahea.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/home")
    public void home(ModelMap modelMap) {

        modelMap.put("timestamp", System.currentTimeMillis());

    }


}
