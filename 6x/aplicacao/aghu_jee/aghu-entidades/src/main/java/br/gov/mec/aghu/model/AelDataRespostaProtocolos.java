package br.gov.mec.aghu.model;

// Generated 26/02/2010 15:51:00 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelDataRespostaProtocolos generated by hbm2java
 */
@Entity
@Table(name = "AEL_DATA_RESPOSTA_PROTOCOLOS", schema = "AGH")
public class AelDataRespostaProtocolos extends BaseEntityId<AelDataRespostaProtocolosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2150663079214577969L;
	private AelDataRespostaProtocolosId id;
	private AelProjetoPacientes aelProjetoPacientes;
	private Date dthrResposta;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indSituacao;
	private String justificativa;
	private Set<AelRespostaQuesitos> aelRespostaQuesitoses = new HashSet<AelRespostaQuesitos>(
			0);

	public AelDataRespostaProtocolos() {
	}

	public AelDataRespostaProtocolos(AelDataRespostaProtocolosId id,
			AelProjetoPacientes aelProjetoPacientes, Date dthrResposta,
			Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.aelProjetoPacientes = aelProjetoPacientes;
		this.dthrResposta = dthrResposta;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public AelDataRespostaProtocolos(AelDataRespostaProtocolosId id,
			AelProjetoPacientes aelProjetoPacientes, Date dthrResposta,
			Integer serMatricula, Short serVinCodigo, String indSituacao,
			String justificativa, Set<AelRespostaQuesitos> aelRespostaQuesitoses) {
		this.id = id;
		this.aelProjetoPacientes = aelProjetoPacientes;
		this.dthrResposta = dthrResposta;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indSituacao = indSituacao;
		this.justificativa = justificativa;
		this.aelRespostaQuesitoses = aelRespostaQuesitoses;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "ppoPjqSeq", column = @Column(name = "PPO_PJQ_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "ppoSeqp", column = @Column(name = "PPO_SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "ppjPjqSeq", column = @Column(name = "PPJ_PJQ_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "ppjPacCodigo", column = @Column(name = "PPJ_PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public AelDataRespostaProtocolosId getId() {
		return this.id;
	}

	public void setId(AelDataRespostaProtocolosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PPJ_PJQ_SEQ", referencedColumnName = "PJQ_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PPJ_PAC_CODIGO", referencedColumnName = "PAC_CODIGO", nullable = false, insertable = false, updatable = false) })
	public AelProjetoPacientes getAelProjetoPacientes() {
		return this.aelProjetoPacientes;
	}

	public void setAelProjetoPacientes(AelProjetoPacientes aelProjetoPacientes) {
		this.aelProjetoPacientes = aelProjetoPacientes;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_RESPOSTA", nullable = false, length = 7)
	public Date getDthrResposta() {
		return this.dthrResposta;
	}

	public void setDthrResposta(Date dthrResposta) {
		this.dthrResposta = dthrResposta;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "JUSTIFICATIVA", length = 500)
	@Length(max = 500)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelDataRespostaProtocolos")
	public Set<AelRespostaQuesitos> getAelRespostaQuesitoses() {
		return this.aelRespostaQuesitoses;
	}

	public void setAelRespostaQuesitoses(
			Set<AelRespostaQuesitos> aelRespostaQuesitoses) {
		this.aelRespostaQuesitoses = aelRespostaQuesitoses;
	}

	public enum Fields {
		PPJ_PAC_CODIGO("id.ppjPacCodigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof AelDataRespostaProtocolos)) {
			return false;
		}
		AelDataRespostaProtocolos other = (AelDataRespostaProtocolos) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
