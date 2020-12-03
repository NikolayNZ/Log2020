package com.gmai.log2020;

import com.gmai.log2020.Parameter;

public class Characteristic{
    private Parameter  Parameter;
    private String message;
    private String date;

    public Characteristic(){
    }

    public Characteristic(com.gmai.log2020.Parameter parameter, String message, String date) {
        Parameter = parameter;
        this.message = message;
        this.date = date;
    }

    public com.gmai.log2020.Parameter getParameter() {
        return Parameter;
    }

    public void setParameter(com.gmai.log2020.Parameter parameter) {
        Parameter = parameter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return Parameter +
                ", message = '" + message + '\'' +
                ", date = " + date;
    }
}

