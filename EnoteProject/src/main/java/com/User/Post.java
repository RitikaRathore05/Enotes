package com.User;

import java.sql.Date;
//import java.sql.Timestamp;

public class Post {
  private int id;
  private String title;
  private String content;
  private Date pdate;
  private UserDetails user;
/**
 * @param id
 * @param title
 * @param content
 * @param pdate
 * @param use
 */
public Post(int id, String title, String content, Date pdate, UserDetails use) {
	super();
	this.id = id;
	this.title = title;
	this.content = content;
	this.pdate = pdate;
	this.user = use;
}
public Post() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getPdate() {
	return pdate;
}
public void setPdate(Date timestamp) {
	this.pdate = timestamp;
}
public UserDetails getUse() {
	return user;
}
public void setUse(UserDetails user) {
	this.user = user;
}
  
  
}
