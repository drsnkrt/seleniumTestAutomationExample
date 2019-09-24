package kioskDemo.Interface;

import kioskDemo.entity.Log;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by drsnkrt on 19.12.2017.
 */
public interface ILog extends CrudRepository<Log, String> {


}
