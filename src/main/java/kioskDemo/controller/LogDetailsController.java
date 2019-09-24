package kioskDemo.controller;

import kioskDemo.Service.LogDetailsService;
import kioskDemo.entity.Log;
import kioskDemo.entity.LogDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by drsnkrt on 19.12.2017.
 */
@RestController
public class LogDetailsController {


    @Autowired
    private LogDetailsService logDetailsService;


    @RequestMapping("logs/{id}/logDetails")
    public List<LogDetails> getAllLogDetails(@PathVariable String id) {
        return logDetailsService.getAllLogDetails(id);
    }

    @RequestMapping("logs/{id}/logDetails/{id}")
    public LogDetails getAllLogDetailsById(@PathVariable String logId) {
        return logDetailsService.getLogDetail(logId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "logs/{id}/logDetails")
    public void saveLogDetails(@RequestBody LogDetails logDetails, @PathVariable String id) {
        logDetails.setLog(new Log(id, "", "", "", "", new Date(), new Date(), new Date()));
        logDetailsService.saveLogDetails(logDetails);
    }

}
