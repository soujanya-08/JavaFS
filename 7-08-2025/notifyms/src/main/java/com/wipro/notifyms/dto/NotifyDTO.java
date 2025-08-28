package com.wipro.notifyms.dto;

public class NotifyDTO {
	 private UserDTO user;
	    private String action;
		public UserDTO getUser() {
			return user;
		}
		public void setUser(UserDTO user) {
			this.user = user;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
	    
}
