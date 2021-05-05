package kr.ac.deu.cse.scheduler.user.domain;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {

  @Id
  @GeneratedValue
  private UUID id;
  private String username;
  private String password;

  @Builder
  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }
}
