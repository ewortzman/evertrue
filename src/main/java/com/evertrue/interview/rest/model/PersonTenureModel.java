package com.evertrue.interview.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personTenure")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonTenureModel {
	@XmlAttribute(name = "name")
	private String name;
	@XmlAttribute(name = "age")
	private int age;
	@XmlAttribute(name = "tenure")
	private float tenure;

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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the tenure
	 */
	public float getTenure() {
		return tenure;
	}

	/**
	 * @param tenure
	 *            the tenure to set
	 */
	public void setTenure(float tenure) {
		this.tenure = tenure;
	}
}
