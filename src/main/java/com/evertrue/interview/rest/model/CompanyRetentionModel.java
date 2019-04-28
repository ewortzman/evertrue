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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the avgRetention
	 */
	public float getAvgRetention() {
		return avgRetention;
	}

	/**
	 * @param avgRetention
	 *            the avgRetention to set
	 */
	public void setAvgRetention(float avgRetention) {
		this.avgRetention = avgRetention;
	}
}
