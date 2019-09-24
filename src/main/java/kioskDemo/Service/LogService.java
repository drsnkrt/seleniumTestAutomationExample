package kioskDemo.Service;

import kioskDemo.Interface.ILog;
import kioskDemo.entity.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by drsnkrt on 19.12.2017.
 */
@Service
public class LogService {

    @Autowired
    private ILog logDao;

    public List<Log> getAllLogs() {
        List<Log> logList = new ArrayList<>();
        logDao.findAll().forEach(logList::add);
        return logList;
    }

    public Log getLogById(String id) {
        return logDao.findOne(id);
    }

    public void saveLog(Log log) {
        logDao.save(log);
    }

}
