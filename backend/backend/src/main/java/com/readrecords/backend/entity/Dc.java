package com.readrecords.backend.entity;

import lombok.Data;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Dc {
    @XmlElement(name = "dc:title", namespace = "http://www.loc.gov/zing/srw/")
    private String title;

    @XmlElement(name = "dc:creator", namespace = "http://www.loc.gov/zing/srw/")
    private String creator;

    @XmlElement(name = "dc:subject", namespace = "http://www.loc.gov/zing/srw/")
    private List<String> subjects;

    @XmlElement(name = "dc:language", namespace = "http://www.loc.gov/zing/srw/")
    private String language;
}
