package com.evertrue.interview.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "companyTenure")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyTenureModel {
	@XmlAttribute(name = "company")
	private String company;
	@XmlAttribute(name = "avg_retention")
	private float avgRetention;
	@XmlAttribute(name = "most_tenured")
	private List<PersonTenureModel> mostTenured;
}
