// NotificationDTO.java
package com.wipro.userms.dto;

public class NotificationDTO {
    private UserDTO user;
    private String action;

    // getters and setters
    public UserDTO getUser() { return user; }
    public void setUser(UserDTO user) { this.user = user; }
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
}
