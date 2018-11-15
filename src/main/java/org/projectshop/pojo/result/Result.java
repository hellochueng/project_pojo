package org.projectshop.pojo.result;

public class Result {
    private Integer code;
    private String message;
    private Object result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }

    public Result() {
        super();
    }
    public Result(Integer code,String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
