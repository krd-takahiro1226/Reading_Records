package com.readrecords.backend.entity;

import lombok.Data;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "searchRetrieveResponse", namespace = "http://www.loc.gov/zing/srw/")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SearchRetrieveResponse {
    @XmlElement(name = "version", namespace = "http://www.loc.gov/zing/srw/")
    private String version;

    @XmlElement(name = "numberOfRecords", namespace = "http://www.loc.gov/zing/srw/")
    private int numberOfRecords;

    @XmlElement(name = "nextRecordPosition", namespace = "http://www.loc.gov/zing/srw/")
    private int nextRecordPosition;

    @XmlElementWrapper(name = "records", namespace = "http://www.loc.gov/zing/srw/")
    @XmlElement(name = "record", namespace = "http://www.loc.gov/zing/srw/")
    private List<SearchBooksResponseRecords> records;
}
