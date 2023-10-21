package br.com.diel.exceptions;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ExceptionResponde implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponde(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }    


}
