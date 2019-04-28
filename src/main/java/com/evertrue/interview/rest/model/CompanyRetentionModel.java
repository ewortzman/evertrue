package com.evertrue.interview.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "companyTenure")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyRetentionModel {
	@XmlAttribute(name = "company")
	private String name;
	@XmlAttribute(name = "avg_retention")
	private float avgRetention;
}
