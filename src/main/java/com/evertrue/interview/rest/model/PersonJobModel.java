package com.evertrue.interview.rest.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "companyTenure")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonJobModel {
	@XmlAttribute(name = "position")
	private String position;
	@XmlAttribute(name = "company")
	private String company;
	@XmlAttribute(name = "state")
	private String state;
	@XmlAttribute(name = "start")
	private Date start;
	@XmlAttribute(name = "end")
	private Date end;
}
