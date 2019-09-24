package kioskDemo.controller;

import kioskDemo.Service.LogService;
import kioskDemo.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by drsnkrt on 19.12.2017.
 */
@RestController
public class LogController {

    @Autowired
    private LogService logService;


    @RequestMapping(value = "/logs")
    public List<Log> getAllLogs() {
        return logService.getAllLogs();
    }

    @RequestMapping(value = "/logs", method = RequestMethod.POST)
    public void saveLog(@RequestBody Log log) {
        logService.saveLog(log);
    }

    @RequestMapping("/logs/{testId}")
    public Log getLog(@PathVariable String id) {
        return logService.getLogById(id);

    }

}
