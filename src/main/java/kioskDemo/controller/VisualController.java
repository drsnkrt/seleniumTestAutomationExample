package kioskDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by drsnkrt on 21.12.2017.
 */
@RestController
public class VisualController {


    private String sessionID = "";
    String baseUri = "http://192.168.1.1";
    String modemModel = "";


    //return just view
    @RequestMapping({"/", "/home"})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping("/hata")
    public ModelAndView hata() {
        ModelAndView hata = new ModelAndView();
        hata.setViewName("hata");
        return hata;
    }



    @RequestMapping("/post")
    public ModelAndView sendPost(Map<String, Object> context) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("post");

        return mav;
    }


}
