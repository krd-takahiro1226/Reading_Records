package com.readrecords.backend.entity;

import lombok.Data;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class SearchBooksResponseRecordsData {
    @XmlElement(name = "srw_dc:dc", namespace = "http://www.loc.gov/zing/srw/")
    private Dc dc;
}
