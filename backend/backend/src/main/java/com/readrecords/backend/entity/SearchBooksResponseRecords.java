package com.readrecords.backend.entity;

import lombok.Data;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SearchBooksResponseRecords {
    @XmlElement(name = "recordSchema", namespace = "http://www.loc.gov/zing/srw/")
    private String recordSchema;

    @XmlElement(name = "recordPacking", namespace = "http://www.loc.gov/zing/srw/")
    private String recordPacking;

    @XmlElement(name = "recordData", namespace = "http://www.loc.gov/zing/srw/")
    private SearchBooksResponseRecordsData recordData;

    @XmlElement(name = "recordPosition", namespace = "http://www.loc.gov/zing/srw/")
    private int recordPosition;
}
