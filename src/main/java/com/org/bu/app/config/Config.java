package com.org.bu.app.config;

import org.springframework.data.annotation.Id;

public class Config {

	@Id
	public String id;

	public String source;

	public String target;

	public String sql;

	public Integer cols;

	public Integer batchSize;

	public Config() {
		super();
	}

	public Config(String id, String source, String target, String sql, Integer cols, Integer batchSize) {
		super();
		this.id = id;
		this.source = source;
		this.target = target;
		this.sql = sql;
		this.cols = cols;
		this.batchSize = batchSize;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Integer getCols() {
		return cols;
	}

	public void setCols(Integer cols) {
		this.cols = cols;
	}

	public Integer getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Config [id=").append(id).append(", source=").append(source).append(", target=").append(target)
				.append(", sql=").append(sql).append(", cols=").append(cols).append(", batchSize=").append(batchSize)
				.append("]");
		return builder.toString();
	}

}
