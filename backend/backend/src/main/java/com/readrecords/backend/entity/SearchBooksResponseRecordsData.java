package com.readrecords.backend.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "recordData")
@Data
public class SearchBooksResponseRecordsData {
  @XmlElement(name = "srw_dc:dc")
  private Dc dc;
}
