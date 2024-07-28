package com.readrecords.backend.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "records")
@Data
// APIレスポンス用のEntity(第二階層)
public class SearchBooksResponseRecords {
  @XmlElement(name = "recordSchema")
  private String recordSchema;
  @XmlElement(name = "recordPacking")
  private String recordPacking;
  @XmlElement(name = "recordData")
  private SearchBooksResponseRecordsData recordData;
  @XmlElement(name = "recordPosition")
  private int recordPosition;
}
