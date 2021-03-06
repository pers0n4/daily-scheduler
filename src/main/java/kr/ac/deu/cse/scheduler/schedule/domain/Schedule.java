package kr.ac.deu.cse.scheduler.schedule.domain;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "schedules")
@Entity
public abstract class Schedule implements ScheduleStrategy {

  @Id
  @GeneratedValue
  protected UUID id;

  protected String title;
  protected String memo;
  protected int importance;
}
