package com.wordnik.petstore.model;

public class User {
  /* Unique identifier for the user */
  private Long id = null;
  /* Unique username */
  private String username = null;
  /* First name of the user */
  private String firstName = null;
  /* Last name of the user */
  private String lastName = null;
  /* Email address of the user */
  private String email = null;
  /* Password name of the user */
  private String password = null;
  /* Phone number of the user */
  private String phone = null;
  /* User Status */
  private Integer userStatus = null;
  //public enum userStatusEnum { 1-registered, 2-active, 3-closed, }; 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  userStatus: ").append(userStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

