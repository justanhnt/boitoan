package vn.vtcc.boitoan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.vtcc.boitoan.model.Que;
import vn.vtcc.boitoan.service.GieoQueService;

/**
 * Created by TuanAnh on 22/02/2018.
 */

@Controller
public class GieoQueController {

    @Autowired
    private GieoQueService gieoQueService;

    @RequestMapping(path = "/boique", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Que getQue() {
        return gieoQueService.getQue();
    }

}
