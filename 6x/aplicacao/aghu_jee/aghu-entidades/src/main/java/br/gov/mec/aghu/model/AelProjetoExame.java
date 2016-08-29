package br.gov.mec.aghu.model;

// Generated 18/03/2011 10:47:15 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelProjetoExames generated by hbm2java
 */
@Entity
@Table(name = "AEL_PROJETO_EXAMES", schema = "AGH")
public class AelProjetoExame extends BaseEntityId<AelProjetoExameId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5094777105377959692L;
	private AelProjetoExameId id;
	private Integer version;
	private Date criadoEm;
	private Short qtdePermitido;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date dtInicio;
	private Date dtFim;
	private String indSituacao;
	private Double valor;
	private String numero;
	private Short qtdeSolicitado;

	public AelProjetoExame() {
	}

	public AelProjetoExame(AelProjetoExameId id, Date criadoEm,
			Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public AelProjetoExame(AelProjetoExameId id, Date criadoEm,
			Short qtdePermitido, Integer serMatricula, Short serVinCodigo,
			Date dtInicio, Date dtFim, String indSituacao, Double valor,
			String numero, Short qtdeSolicitado) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.qtdePermitido = qtdePermitido;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.indSituacao = indSituacao;
		this.valor = valor;
		this.numero = numero;
		this.qtdeSolicitado = qtdeSolicitado;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pjqSeq", column = @Column(name = "PJQ_SEQ", nullable = false)),
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false)) })
	public AelProjetoExameId getId() {
		return this.id;
	}

	public void setId(AelProjetoExameId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "QTDE_PERMITIDO")
	public Short getQtdePermitido() {
		return this.qtdePermitido;
	}

	public void setQtdePermitido(Short qtdePermitido) {
		this.qtdePermitido = qtdePermitido;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "VALOR", precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name = "NUMERO", length = 20)
	@Length(max = 20)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "QTDE_SOLICITADO")
	public Short getQtdeSolicitado() {
		return this.qtdeSolicitado;
	}

	public void setQtdeSolicitado(Short qtdeSolicitado) {
		this.qtdeSolicitado = qtdeSolicitado;
	}
	
	public enum Fields {

		EMA_EXA_SIGLA("id.emaExaSigla"),
		EMA_MAN_SEQ("id.emaManSeq");

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
		if (!(obj instanceof AelProjetoExame)) {
			return false;
		}
		AelProjetoExame other = (AelProjetoExame) obj;
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