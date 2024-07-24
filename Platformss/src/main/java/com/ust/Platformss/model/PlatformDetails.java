package com.ust.Platformss.model;

import jdk.jfr.DataAmount;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class PlatformDetails {
@Id
public  int platformid;
public String platformname;
public String platformdescription;
public String platformowner;
public String platformplans;
}
