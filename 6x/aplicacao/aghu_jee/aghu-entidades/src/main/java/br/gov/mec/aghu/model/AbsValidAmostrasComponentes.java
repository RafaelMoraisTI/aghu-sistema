package br.gov.mec.aghu.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.mec.aghu.dominio.DominioTipoValidade;
import br.gov.mec.aghu.dominio.DominioUnidadeTempo;
import br.gov.mec.aghu.core.persistence.BaseEntityId;


/**
 * AbsValidAmostrasComponente generated by hbm2java
 */

@Entity
@Table(name="ABS_VALID_AMOSTRAS_COMPONENTES", schema = "AGH")
public class AbsValidAmostrasComponentes extends BaseEntityId<AbsValidAmostrasComponenteId> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4622331970603578294L;
	private AbsValidAmostrasComponenteId id;
	private Date criadoEm;
	private Integer idadeMesFinal;
	private Integer idadeMesInicial;
	private Integer nroMaximoSolicitacoes;
	private Integer validade;
	private DominioUnidadeTempo unidValidAmostra;
	private DominioTipoValidade tipoValidade;
	private Integer serMatricula;
	private Integer serVinCodigo;


	
	private AbsComponenteSanguineo componenteSanguineo;


    public AbsValidAmostrasComponentes() {
    }
    
	
	@EmbeddedId
	@AttributeOverrides({
	@AttributeOverride(name = "csaCodigo", column = @Column(name = "CSA_CODIGO", nullable = false)),
	@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AbsValidAmostrasComponenteId getId() {
		return this.id;
	}

	public void setId(AbsValidAmostrasComponenteId id) {
		this.id = id;
	}

	@Column(name="CRIADO_EM")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name="IDADE_MES_FINAL")
	public Integer getIdadeMesFinal() {
		return this.idadeMesFinal;
	}

	public void setIdadeMesFinal(Integer idadeMesFinal) {
		this.idadeMesFinal = idadeMesFinal;
	}

	@Column(name="IDADE_MES_INICIAL")
	public Integer getIdadeMesInicial() {
		return this.idadeMesInicial;
	}

	public void setIdadeMesInicial(Integer idadeMesInicial) {
		this.idadeMesInicial = idadeMesInicial;
	}

	@Column(name="NRO_MAXIMO_SOLICITACOES")
	public Integer getNroMaximoSolicitacoes() {
		return this.nroMaximoSolicitacoes;
	}

	public void setNroMaximoSolicitacoes(Integer nroMaximoSolicitacoes) {
		this.nroMaximoSolicitacoes = nroMaximoSolicitacoes;
	}

	@Column(name="SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name="SER_VIN_CODIGO")
	public Integer getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Integer serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}
	
	@Column(name="VALIDADE")
	public Integer getValidade() {
		return validade;
	}


	public void setValidade(Integer validade) {
		this.validade = validade;
	}

	@Column(name="TIPO_VALIDADE", length=1)
	@Enumerated(EnumType.STRING)
	public DominioTipoValidade getTipoValidade() {
		return tipoValidade;
	}

	public void setTipoValidade(DominioTipoValidade tipoValidade) {
		this.tipoValidade = tipoValidade;
	}
	
	@Column(name="UNID_VALID_AMOSTRA", length=1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeTempo getUnidValidAmostra() {
		return unidValidAmostra;
	}

	public void setUnidValidAmostra(DominioUnidadeTempo unidValidAmostra) {
		this.unidValidAmostra = unidValidAmostra;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSA_CODIGO", insertable = false, updatable = false)
	public AbsComponenteSanguineo getComponenteSanguineo() {
		return componenteSanguineo;
	}


	public void setComponenteSanguineo(AbsComponenteSanguineo componenteSanguineo) {
		this.componenteSanguineo = componenteSanguineo;
	}

	public enum Fields {
		ID("id"),
		CSA_CODIGO("id.csaCodigo"),
		SEQP("id.seqp"),
		CRIADO_EM("criadoEm"),
		IDADE_MES_FINAL("idadeMesFinal"),
		IDADE_MES_INICIAL("idadeMesInicial"),
		NRO_MAXIMO_SOLICITACOES("nroMaximoSolicitacoes"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		VALIDADE("validade"),
		TIPO_VALIDADE("tipoValidade"),
		UNID_VALID_AMOSTRA("unidValidAmostra"),
		COMPONENTE_SANGUINEO("componenteSanguineo")
		;

		private String fields;

		private Fields(final String fields) {
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
		if (!(obj instanceof AbsValidAmostrasComponentes)) {
			return false;
		}
		AbsValidAmostrasComponentes other = (AbsValidAmostrasComponentes) obj;
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