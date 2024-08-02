package com.readrecords.backend.service;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.readrecords.backend.entity.SearchRetrieveResponse;

@Service
public class XmlParser {
  public SearchRetrieveResponse parse(String xml) throws JAXBException{
    JAXBContext jaxbContext = JAXBContext.newInstance(SearchRetrieveResponse.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringReader reader = new StringReader(xml);
    return (SearchRetrieveResponse) unmarshaller.unmarshal(reader);
  }
}
