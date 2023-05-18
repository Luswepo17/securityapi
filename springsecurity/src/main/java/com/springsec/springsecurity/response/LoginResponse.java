package com.springsec.springsecurity.response;

public class LoginResponse {
    
    String message;
    String status;
    
    public LoginResponse(String message, String status) {
        this.message = message;
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public LoginResponse(){}

    @Override
    public String toString(){
        return "LoginResponse{" +
                "message='" + message + '\''+
                ", status='" + status+ '\''+
                '}';    
    }


}
