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

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
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

	/**
	 * @return the mostTenured
	 */
	public List<PersonTenureModel> getMostTenured() {
		return mostTenured;
	}

	/**
	 * @param mostTenured
	 *            the mostTenured to set
	 */
	public void setMostTenured(List<PersonTenureModel> mostTenured) {
		this.mostTenured = mostTenured;
	}
}
