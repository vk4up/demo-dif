package com.org.bu.app.domain;

import com.opencsv.bean.CsvBindByName;

public class Policy {

	@CsvBindByName(column = "policyID")
	private String policyID;

	@CsvBindByName(column = "statecode")
	private String stateCode;

	@CsvBindByName(column = "county")
	private String county;

	@CsvBindByName(column = "eq_site_limit")
	private String eqSiteLimit;

	@CsvBindByName(column = "hu_site_limit")
	private String huSiteLimit;

	@CsvBindByName(column = "fl_site_limit")
	private String flSiteLimit;

	@CsvBindByName(column = "fr_site_limit")
	private String frSiteLimit;

	@CsvBindByName(column = "tiv_2011")
	private String tiv2011;

	@CsvBindByName(column = "tiv_2012")
	private String tiv2012;

	@CsvBindByName(column = "eq_site_deductible")
	private String eqSiteDeductible;

	@CsvBindByName(column = "hu_site_deductible")
	private String huSiteDeductible;

	@CsvBindByName(column = "fl_site_deductible")
	private String flSiteDeductible;

	@CsvBindByName(column = "fr_site_deductible")
	private String frSiteDeductible;

	@CsvBindByName(column = "point_latitude")
	private String pointLatitude;

	@CsvBindByName(column = "point_longitude")
	private String pointLongitude;

	@CsvBindByName(column = "line")
	private String line;

	@CsvBindByName(column = "construction")
	private String construction;

	@CsvBindByName(column = "point_granularity")
	private String pointGranularity;

	public Policy() {
		super();
	}

	public Policy(String policyID, String stateCode, String county, String eqSiteLimit, String huSiteLimit,
			String flSiteLimit, String frSiteLimit, String tiv2011, String tiv2012, String eqSiteDeductible,
			String huSiteDeductible, String flSiteDeductible, String frSiteDeductible, String pointLatitude,
			String pointLongitude, String line, String construction, String pointGranularity) {
		super();
		this.policyID = policyID;
		this.stateCode = stateCode;
		this.county = county;
		this.eqSiteLimit = eqSiteLimit;
		this.huSiteLimit = huSiteLimit;
		this.flSiteLimit = flSiteLimit;
		this.frSiteLimit = frSiteLimit;
		this.tiv2011 = tiv2011;
		this.tiv2012 = tiv2012;
		this.eqSiteDeductible = eqSiteDeductible;
		this.huSiteDeductible = huSiteDeductible;
		this.flSiteDeductible = flSiteDeductible;
		this.frSiteDeductible = frSiteDeductible;
		this.pointLatitude = pointLatitude;
		this.pointLongitude = pointLongitude;
		this.line = line;
		this.construction = construction;
		this.pointGranularity = pointGranularity;
	}

	public String getPolicyID() {
		return policyID;
	}

	public void setPolicyID(String policyID) {
		this.policyID = policyID;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getEqSiteLimit() {
		return eqSiteLimit;
	}

	public void setEqSiteLimit(String eqSiteLimit) {
		this.eqSiteLimit = eqSiteLimit;
	}

	public String getHuSiteLimit() {
		return huSiteLimit;
	}

	public void setHuSiteLimit(String huSiteLimit) {
		this.huSiteLimit = huSiteLimit;
	}

	public String getFlSiteLimit() {
		return flSiteLimit;
	}

	public void setFlSiteLimit(String flSiteLimit) {
		this.flSiteLimit = flSiteLimit;
	}

	public String getFrSiteLimit() {
		return frSiteLimit;
	}

	public void setFrSiteLimit(String frSiteLimit) {
		this.frSiteLimit = frSiteLimit;
	}

	public String getTiv2011() {
		return tiv2011;
	}

	public void setTiv2011(String tiv2011) {
		this.tiv2011 = tiv2011;
	}

	public String getTiv2012() {
		return tiv2012;
	}

	public void setTiv2012(String tiv2012) {
		this.tiv2012 = tiv2012;
	}

	public String getEqSiteDeductible() {
		return eqSiteDeductible;
	}

	public void setEqSiteDeductible(String eqSiteDeductible) {
		this.eqSiteDeductible = eqSiteDeductible;
	}

	public String getHuSiteDeductible() {
		return huSiteDeductible;
	}

	public void setHuSiteDeductible(String huSiteDeductible) {
		this.huSiteDeductible = huSiteDeductible;
	}

	public String getFlSiteDeductible() {
		return flSiteDeductible;
	}

	public void setFlSiteDeductible(String flSiteDeductible) {
		this.flSiteDeductible = flSiteDeductible;
	}

	public String getFrSiteDeductible() {
		return frSiteDeductible;
	}

	public void setFrSiteDeductible(String frSiteDeductible) {
		this.frSiteDeductible = frSiteDeductible;
	}

	public String getPointLatitude() {
		return pointLatitude;
	}

	public void setPointLatitude(String pointLatitude) {
		this.pointLatitude = pointLatitude;
	}

	public String getPointLongitude() {
		return pointLongitude;
	}

	public void setPointLongitude(String pointLongitude) {
		this.pointLongitude = pointLongitude;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getConstruction() {
		return construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public String getPointGranularity() {
		return pointGranularity;
	}

	public void setPointGranularity(String pointGranularity) {
		this.pointGranularity = pointGranularity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Policy [policyID=").append(policyID).append(", stateCode=").append(stateCode)
				.append(", county=").append(county).append(", eqSiteLimit=").append(eqSiteLimit)
				.append(", huSiteLimit=").append(huSiteLimit).append(", flSiteLimit=").append(flSiteLimit)
				.append(", frSiteLimit=").append(frSiteLimit).append(", tiv2011=").append(tiv2011).append(", tiv2012=")
				.append(tiv2012).append(", eqSiteDeductible=").append(eqSiteDeductible).append(", huSiteDeductible=")
				.append(huSiteDeductible).append(", flSiteDeductible=").append(flSiteDeductible)
				.append(", frSiteDeductible=").append(frSiteDeductible).append(", pointLatitude=").append(pointLatitude)
				.append(", pointLongitude=").append(pointLongitude).append(", line=").append(line)
				.append(", construction=").append(construction).append(", pointGranularity=").append(pointGranularity)
				.append("]");
		return builder.toString();
	}
	
}
