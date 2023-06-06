package com.example.hrms.entities.concretes;

import com.example.hrms.entities.abstracts.BaseUser;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name="personnel_id")
@Table(name="personnels")
public class Personnel extends BaseUser {


}
