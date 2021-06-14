package com.main.quality.exception;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError {

    private int status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime date;

    private String message;

    public StandardError(int status, LocalDateTime date, String message) {
        this.status = status;
        this.date = date;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}