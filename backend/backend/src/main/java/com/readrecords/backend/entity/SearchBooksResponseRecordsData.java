package com.readrecords.backend.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import jakarta.persistence.Entity;
import lombok.Data;

@XmlRootElement(name = "recordData")
@Data
@Entity
public class SearchBooksResponseRecordsData {
  @XmlElement(name = "srw_dc:dc")
  private Dc dc;
}
