package org.example;

import java.util.List;

public class ResponseParser {
    private boolean success;
    private Integer errorCode;
    private String extra;
    private List<JsonTasks> tasks;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public List<JsonTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<JsonTasks> tasks) {
        this.tasks = tasks;
    }
}
