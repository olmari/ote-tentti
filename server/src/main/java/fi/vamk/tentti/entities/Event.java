package fi.vamk.tentti.entities;

import java.sql.*;
import javax.persistence.*;

@Entity
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String location;
  private Date time;

  public Event() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return this.location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Date getTime() {
    return this.time;
  }

  public void setTime(Date time) {
    this.time = time;
  }
}