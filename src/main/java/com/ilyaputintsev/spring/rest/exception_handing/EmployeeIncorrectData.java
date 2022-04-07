package com.ilyaputintsev.spring.rest.exception_handing;

public class EmployeeIncorrectData {

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public EmployeeIncorrectData() {
    }

    private  String info;
}
