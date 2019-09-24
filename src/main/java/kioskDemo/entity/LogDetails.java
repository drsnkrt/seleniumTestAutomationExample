package kioskDemo.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by drsnkrt on 19.12.2017.
 */
@Entity
@Table(name = "t_logDetails")
public class LogDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String scriptName;
    private String isSuccess;
    private Date startDate;
    private Date endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    private Log log;


    public LogDetails() {
    }

    public LogDetails(int id, String scriptName, String isSuccess, Date startDate, Date endDate, String logId) {
        super();
        this.id = id;
        this.scriptName = scriptName;
        this.isSuccess = isSuccess;
        this.startDate = startDate;
        this.endDate = endDate;
        this.log = new Log(logId, "", "", "", "", new Date(), new Date(), new Date());
    }


    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public String isSuccess() {
        return isSuccess;
    }

    public void setSuccess(String success) {
        isSuccess = success;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
