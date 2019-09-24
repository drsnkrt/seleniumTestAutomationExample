package kioskDemo.Interface;

import kioskDemo.entity.LogDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by drsnkrt on 19.12.2017.
 */
public interface ILogDetails extends CrudRepository<LogDetails, String> {

    public List<LogDetails> findByLogId(String logId);

}
