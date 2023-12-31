package com.application.userdept.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_department")
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ind;
  private String name;
  public Department(){}

  public Long getInd() {
    return ind;
  }

  public void setInd(Long ind) {
    this.ind = ind;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
