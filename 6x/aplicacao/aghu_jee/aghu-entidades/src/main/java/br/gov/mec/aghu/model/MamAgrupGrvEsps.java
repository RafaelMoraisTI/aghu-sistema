package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoPrevAtende;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamGravidade generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamGxeSq1", sequenceName="AGH.MAM_GXE_SQ1", allocationSize = 1)
@Table(name = "MAM_AGRUP_GRV_X_ESPS", schema = "AGH")
public class MamAgrupGrvEsps extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5660024045081852297L;
	private Short seq;
	private MamAgrupGravidade mamAgrupGravidade;
	private MamEmgEspecialidades mamEmgEspecialidades;
	private DominioTipoPrevAtende indPrevAtend;	
	private DominioSituacao indSituacao;
	private Date criadoEm;		
	private Integer serMatricula;
	private Short serVinCodigo;	

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamGxeSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AGR_SEQ")
	@NotNull
	public MamAgrupGravidade getMamAgrupGravidade() {
		return mamAgrupGravidade;
	}

	public void setMamAgrupGravidade(MamAgrupGravidade mamAgrupGravidade) {
		this.mamAgrupGravidade = mamAgrupGravidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EEP_ESP_SEQ")
	@NotNull
	public MamEmgEspecialidades getMamEmgEspecialidades() {
		return mamEmgEspecialidades;
	}

	public void setMamEmgEspecialidades(MamEmgEspecialidades mamEmgEspecialidades) {
		this.mamEmgEspecialidades = mamEmgEspecialidades;
	}

	@Column(name = "IND_PREV_ATEND", length = 1)	
	@Enumerated(EnumType.STRING)
	public DominioTipoPrevAtende getIndPrevAtend() {
		return indPrevAtend;
	}

	public void setIndPrevAtend(DominioTipoPrevAtende indPrevAtend) {
		this.indPrevAtend = indPrevAtend;
	}

	@Column(name = "IND_SITUACAO", length = 1)	
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Column(name = "SER_MATRICULA", nullable = false)
	@NotNull
	public Integer getSerMatricula() {
		return serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	@NotNull
	public Short getSerVinCodigo() {
		return serVinCodigo;
	}
	
	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}
	
	
	

	public enum Fields {

		SEQ("seq"),		
		MAN_AGRUP_GRAVIDADE( "mamAgrupGravidade"),
		MAN_EMG_ESPECIALIDADES ("mamEmgEspecialidades"),
		IND_PREV_ATEND ("indPrevAtend"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA("serMatricula"),
		AGR_SEQ("mamAgrupGravidade.seq"),
		ESP_SEQ("mamEmgEspecialidades.espSeq");		

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
		if (!(obj instanceof MamAgrupGrvEsps)) {
			return false;
		}
		MamAgrupGrvEsps other = (MamAgrupGrvEsps) obj;
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