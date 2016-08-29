package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamInfPaciente generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamIcpSq1", sequenceName="AGH.MAM_ICP_SQ1", allocationSize = 1)
@Table(name = "MAM_INF_PACIENTES", schema = "AGH")
public class MamInfPaciente extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5119758229573114550L;
	private Long seq;
	private Integer version;
	private MamEmgInfPaciente mamEmgInfPaciente;
	private Long trgSeq;

	public MamInfPaciente() {
	}

	public MamInfPaciente(Long seq, MamEmgInfPaciente mamEmgInfPaciente) {
		this.seq = seq;
		this.mamEmgInfPaciente = mamEmgInfPaciente;
	}

	public MamInfPaciente(Long seq, MamEmgInfPaciente mamEmgInfPaciente, Long trgSeq) {
		this.seq = seq;
		this.mamEmgInfPaciente = mamEmgInfPaciente;
		this.trgSeq = trgSeq;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamIcpSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EIP_SEQ", nullable = false)
	public MamEmgInfPaciente getMamEmgInfPaciente() {
		return this.mamEmgInfPaciente;
	}

	public void setMamEmgInfPaciente(MamEmgInfPaciente mamEmgInfPaciente) {
		this.mamEmgInfPaciente = mamEmgInfPaciente;
	}

	@Column(name = "TRG_SEQ")
	public Long getTrgSeq() {
		return this.trgSeq;
	}

	public void setTrgSeq(Long trgSeq) {
		this.trgSeq = trgSeq;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MAM_EMG_INF_PACIENTES("mamEmgInfPaciente"),
		TRG_SEQ("trgSeq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MamInfPaciente)) {
			return false;
		}
		MamInfPaciente other = (MamInfPaciente) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}