package validation.hibernatevalidator;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

public class Passport {

    @NotNull()
    private String series;

    @DecimalMin("0")
    private long number;

    @NotNull
    @Past
    private Date acquireDate;

    @NotNull
    @Future
    private Date validTo;

    public String getSeries() {
        return series;
    }

    public long getNumber() {
        return number;
    }

    public Date getAcquireDate() {
        return acquireDate;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setAcquireDate(Date acquireDate) {
        this.acquireDate = acquireDate;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", number=" + number +
                ", acquireDate=" + acquireDate +
                ", validTo=" + validTo +
                '}';
    }
}
