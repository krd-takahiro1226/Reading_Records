package com.readrecords.backend.service;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.readrecords.backend.dto.SearchBooksResponse;

@Service
public class XmlParser {
  public SearchBooksResponse parse(String xml) throws JAXBException{
    JAXBContext jaxbContext = JAXBContext.newInstance(SearchBooksResponse.class);
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
    StringReader reader = new StringReader(xml);
    return (SearchBooksResponse) unmarshaller.unmarshal(reader);
  }
}
