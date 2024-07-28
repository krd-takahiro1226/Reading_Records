package com.readrecords.backend.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "SearchRetrieveResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
// APIレスポンス用のEntity(第一階層)
public class SearchRetrieveResponse {
  @XmlElement(name = "version")
  private String version;
  @XmlElement(name = "numberOfRecords")
  private int numberOfRecords;
  @XmlElement(name = "nextRecordPosition")
  private int nextRecordPosition;
  @XmlElement(name = "records")
  private List<SearchBooksResponseRecords> records;
}
