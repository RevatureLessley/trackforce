package com.revature.entity;
// Generated Nov 7, 2017 9:24:46 PM by Hibernate Tools 5.2.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TfCurriculum generated by hbm2java
 */
@Entity
@Table(name = "TF_CURRICULUM", schema = "ADMIN")
public class TfCurriculum implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8213885869880424792L;
	private BigDecimal tfCurriculumId;
	private String tfCurriculumName;
	private Set<TfBatch> tfBatches = new HashSet<TfBatch>(0);

	public TfCurriculum() {
	}

	public TfCurriculum(BigDecimal tfCurriculumId) {
		this.tfCurriculumId = tfCurriculumId;
	}

	public TfCurriculum(BigDecimal tfCurriculumId, String tfCurriculumName, Set<TfBatch> tfBatches) {
		this.tfCurriculumId = tfCurriculumId;
		this.tfCurriculumName = tfCurriculumName;
		this.tfBatches = tfBatches;
	}

	@Id

	@Column(name = "TF_CURRICULUM_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTfCurriculumId() {
		return this.tfCurriculumId;
	}

	public void setTfCurriculumId(BigDecimal tfCurriculumId) {
		this.tfCurriculumId = tfCurriculumId;
	}

	@Column(name = "TF_CURRICULUM_NAME", length = 30)
	public String getTfCurriculumName() {
		return this.tfCurriculumName;
	}

	public void setTfCurriculumName(String tfCurriculumName) {
		this.tfCurriculumName = tfCurriculumName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfCurriculum")
	public Set<TfBatch> getTfBatches() {
		return this.tfBatches;
	}

	public void setTfBatches(Set<TfBatch> tfBatches) {
		this.tfBatches = tfBatches;
	}

	
	

}
