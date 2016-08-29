package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaDefMonitorizacoes generated by hbm2java
 */
@Entity
@Table(name = "MBC_FICHA_DEF_MONITORIZACOES", schema = "AGH")
public class MbcFichaDefMonitorizacoes extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6698142106787398087L;
	private Long seq;
	private Integer version;
	private MbcMonitorizacao mbcMonitorizacao;
	private Boolean monitorado;
	private Boolean interfaceado;
	private String justificativa;
	private MbcFichaAnestesias fichaAnestesia;
	private Date criadoEm;
	private RapServidores servidor;

	public MbcFichaDefMonitorizacoes() {
	}

	@Id
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MOZ_SEQ", nullable = false)
	public MbcMonitorizacao getMbcMonitorizacao() {
		return this.mbcMonitorizacao;
	}

	public void setMbcMonitorizacao(MbcMonitorizacao mbcMonitorizacao) {
		this.mbcMonitorizacao = mbcMonitorizacao;
	}

	@Column(name = "MONITORADO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getMonitorado() {
		return this.monitorado;
	}

	public void setMonitorado(Boolean monitorado) {
		this.monitorado = monitorado;
	}

	@Column(name = "INTERFACEADO", nullable = false, length = 1)
	@Length(max = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getInterfaceado() {
		return this.interfaceado;
	}

	public void setInterfaceado(Boolean interfaceado) {
		this.interfaceado = interfaceado;
	}

	@Column(name = "JUSTIFICATIVA", length = 2000)
	@Length(max = 2000)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FIC_SEQ", nullable = false)
	public MbcFichaAnestesias getFichaAnestesia() {
		return fichaAnestesia;
	}

	public void setFichaAnestesia(MbcFichaAnestesias fichaAnestesia) {
		this.fichaAnestesia = fichaAnestesia;
	}
	
	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		SERVIDOR("servidor"),
		MONITORIZACAO("mbcMonitorizacao"),
		MONITORADO("monitorado"),
		INTERFACEADO("interfaceado"),
		JUSTIFICATIVA("justificativa"),
		FICHA_ANESTESIA("fichaAnestesia"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof MbcFichaDefMonitorizacoes)) {
			return false;
		}
		MbcFichaDefMonitorizacoes other = (MbcFichaDefMonitorizacoes) obj;
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