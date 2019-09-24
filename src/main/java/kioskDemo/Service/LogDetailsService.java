package kioskDemo.Service;

import kioskDemo.Interface.ILogDetails;
import kioskDemo.entity.LogDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by drsnkrt on 19.12.2017.
 */
@Service
public class LogDetailsService {

    @Autowired
    private ILogDetails logDetailsDao;

    public List<LogDetails> getAllLogDetails(String logId) {
        List<LogDetails> logDetailsList = new ArrayList<>();
        logDetailsDao.findByLogId(logId).forEach(logDetailsList::add);
        return logDetailsList;
    }

    public LogDetails getLogDetail(String id) {
        return logDetailsDao.findOne(id);
    }

    public void saveLogDetails(LogDetails logDetails) {
        logDetailsDao.save(logDetails);
    }
}
