package com.readrecords.backend.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement(name = "srw_dc:dc")
@Data
// APIレスポンス用のEntity
public class Dc {
  @XmlElement(name = "dc:title")
  private String title;
  @XmlElement(name = "dc:creator")
  private String creator;
  @XmlElement(name = "dc:subject")
  private List<String> subjects;
  @XmlElement(name = "dc:language")
  private String language;
}
