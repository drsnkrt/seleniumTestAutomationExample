package kioskDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by drsnkrt on 19.12.2017.
 */
@Entity
@Table(name = "t_log")
public class Log {

    @Id
    private String id;
    private String senderSerialNumber;
    private String modemSerialNumber;
    private String isSuccess;
    private String isSent;
    private Date startDate;
    private Date recordDate;
    private Date sentDate;

    public Log() {
    }

    public Log(String id, String senderSerialNumber, String modemSerialNumber, String isSuccess, String isSent, Date startDate, Date recordDate, Date sentDate) {
        super();
        this.id = id;
        this.senderSerialNumber = senderSerialNumber;
        this.modemSerialNumber = modemSerialNumber;
        this.isSuccess = isSuccess;
        this.isSent = isSent;
        this.startDate = startDate;
        this.recordDate = recordDate;
        this.sentDate = sentDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getIsSent() {
        return isSent;
    }

    public void setIsSent(String isSent) {
        this.isSent = isSent;
    }


    public String getSenderSerialNumber() {
        return senderSerialNumber;
    }

    public void setSenderSerialNumber(String senderSerialNumber) {
        this.senderSerialNumber = senderSerialNumber;
    }

    public String getModemSerialNumber() {
        return modemSerialNumber;
    }

    public void setModemSerialNumber(String modemSerialNumber) {
        this.modemSerialNumber = modemSerialNumber;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }
}
