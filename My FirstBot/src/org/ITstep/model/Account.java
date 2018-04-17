package org.ITstep.model;

public class Account {

 private String firstName;
 private String secondName;
 private String email;
 private String password;
 
 public String getFirstName() {
  return firstName;
 }
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }
 public String getSecondName() {
  return secondName;
 }
 public void setSecondName(String secondName) {
  this.secondName = secondName;
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
 
// public Account() {
// }
 
 public Account(String firstName, String secondName, String email, String password) {
  this.firstName = firstName;
  this.secondName = secondName;
  this.email = email;
  this.password = password;
 }
}
