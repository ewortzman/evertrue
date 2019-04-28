package com.evertrue.interview.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="personTenure")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonTenureModel {
	@XmlAttribute(name="name")
	private String name;
	@XmlAttribute(name="age")
	private int age;
	@XmlAttribute(name="tenure")
	private float tenure;
}
