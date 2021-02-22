package fi.vamk.tentti.entities;

import javax.persistence.*;

@Entity
public class UserEvent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer userid;
  private Integer eventid;

  public UserEvent() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserid() {
    return this.userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public Integer getEventid() {
    return this.eventid;
  }

  public void setEventid(Integer eventid) {
    this.eventid = eventid;
  }

}