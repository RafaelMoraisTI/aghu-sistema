package br.gov.mec.aghu.model;

// Generated 02/02/2010 13:37:04 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapOcupacoesCargo generated by hbm2java
 * 
 * Contém as ocupações possíveis para um servidor do HCPA. Ex.; médico,
 * enfermeiro, engenheiro, analista, aux. administrativo
 */

@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "RAP_OCUPACOES_CARGO", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"CODIGO", "IND_SITUACAO" }))
public class RapOcupacaoCargo extends BaseEntityId<RapOcupacoesCargoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2437221885738861208L;
	/**
	 * Chave primária composta da base de dados.
	 */
	private RapOcupacoesCargoId id;
	/**
	 * Descrição da ocupação deste cargo.
	 */
	private String descricao;
	/**
	 * Indica se esta ocupação está ativo ou inativo.
	 */
	private DominioSituacao indSituacao;
	/**
	 * Indica a necessidade de informar CBO.
	 */
	private DominioSimNao indCbo;
	/**
	 * Indica a necessidade de informar CNS.
	 */
	private DominioSimNao indCns;

	private RapCargos cargo;

	private Integer codigo;

	private Integer version;
	
	private Set<SigGrupoOcupacaoCargos> sigGrupoOcupacaoCargo = new HashSet<SigGrupoOcupacaoCargos>(0);

	public RapOcupacaoCargo() {
	}

	public RapOcupacaoCargo(RapOcupacoesCargoId id) {
		this.id = id;
	}

	public RapOcupacaoCargo(RapOcupacoesCargoId id, String descricao,
			DominioSituacao indSituacao, DominioSimNao indCbo,
			DominioSimNao indCns) {
		this.id = id;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.indCbo = indCbo;
		this.indCns = indCns;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "carCodigo", column = @Column(name = "CAR_CODIGO", nullable = false, length = 10)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false, precision = 5, scale = 0)) })
	public RapOcupacoesCargoId getId() {
		return this.id;
	}

	public void setId(RapOcupacoesCargoId id) {
		this.id = id;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_CBO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCbo() {
		return this.indCbo;
	}

	public void setIndCbo(DominioSimNao indCbo) {
		this.indCbo = indCbo;
	}

	@Column(name = "IND_CNS", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCns() {
		return this.indCns;
	}

	public void setIndCns(DominioSimNao indCns) {
		this.indCns = indCns;
	}

	@ManyToOne()
	@JoinColumn(name = "CAR_CODIGO", nullable = false, insertable = false, updatable = false)
	public RapCargos getCargo() {
		return cargo;
	}

	public void setCargo(RapCargos cargo) {
		this.cargo = cargo;
	}

	@Column(name = "CODIGO", nullable = false, insertable = false, updatable = false)
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapOcupacaoCargo")
	public Set<SigGrupoOcupacaoCargos> getSigGrupoOcupacaoCargo() {
		return sigGrupoOcupacaoCargo;
	}

	public void setSigGrupoOcupacaoCargo(Set<SigGrupoOcupacaoCargos> sigGrupoOcupacaoCargo) {
		this.sigGrupoOcupacaoCargo = sigGrupoOcupacaoCargo;
	}


	public enum Fields {
		CARGO("cargo"), CODIGO("codigo"),ID_CODIGO("id.codigo"), SITUACAO("indSituacao"), ID_CARGO_CODIGO("id.cargoCodigo"),CARGO_CODIGO(
				"cargo.codigo"), DESCRICAO("descricao"), SIG_OCUPACAO_CARGO("sigGrupoOcupacaoCargo");

		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.id).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof RapOcupacaoCargo)) {
			return false;
		}
		RapOcupacaoCargo castOther = (RapOcupacaoCargo) other;
		return new EqualsBuilder().append(this.id, castOther.getId())
				.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", this.id).toString();
	}
}