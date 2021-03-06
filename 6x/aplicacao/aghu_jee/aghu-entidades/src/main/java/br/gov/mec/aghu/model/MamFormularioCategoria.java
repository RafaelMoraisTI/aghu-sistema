package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * ================================================================================
 *   ####   #####    ####   ######  #####   ##  ##   ####    ####    ####    #### 
 *  ##  ##  ##  ##  ##      ##      ##  ##  ##  ##  ##  ##  ##  ##  ##  ##  ##  ##
 *  ##  ##  #####    ####   ####    #####   ##  ##  ######  ##      ######  ##  ##
 *  ##  ##  ##  ##      ##  ##      ##  ##   ####   ##  ##  ##  ##  ##  ##  ##  ##
 *   ####   #####    ####   ######  ##  ##    ##    ##  ##   ####   ##  ##   #### 
 * ================================================================================
 *
 * A partir de uma análise originada pela tarefa #19993
 * esta model foi escolhida para ser apenas de leitura
 * no AGHU e por isso foi anotada como Immutable.
 *
 * Entretanto, caso esta entidade seja necessária na construção
 * de uma estória que necessite escrever dados no banco, este
 * comentário e esta anotação pode ser retirada desta model.
 */
@Immutable

@Entity
@Table(name = "MAM_FORMULARIO_CATEGORIAS", schema = "AGH")
public class MamFormularioCategoria extends BaseEntityId<MamFormularioCategoriaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2690642756434516126L;
	private MamFormularioCategoriaId id;
	private Integer version;
	private MamFormularioPadrao mamFormularioPadrao;
	private RapServidores rapServidores;
	private CseCategoriaProfissional cseCategoriaProfissional;
	private String indSituacao;
	private Date criadoEm;

	public MamFormularioCategoria() {
	}

	public MamFormularioCategoria(MamFormularioCategoriaId id, MamFormularioPadrao mamFormularioPadrao,
			RapServidores rapServidores, CseCategoriaProfissional cseCategoriaProfissional, String indSituacao, Date criadoEm) {
		this.id = id;
		this.mamFormularioPadrao = mamFormularioPadrao;
		this.rapServidores = rapServidores;
		this.cseCategoriaProfissional = cseCategoriaProfissional;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "cagSeq", column = @Column(name = "CAG_SEQ", nullable = false)),
			@AttributeOverride(name = "fopSeq", column = @Column(name = "FOP_SEQ", nullable = false)) })
	public MamFormularioCategoriaId getId() {
		return this.id;
	}

	public void setId(MamFormularioCategoriaId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FOP_SEQ", nullable = false, insertable = false, updatable = false)
	public MamFormularioPadrao getMamFormularioPadrao() {
		return this.mamFormularioPadrao;
	}

	public void setMamFormularioPadrao(MamFormularioPadrao mamFormularioPadrao) {
		this.mamFormularioPadrao = mamFormularioPadrao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAG_SEQ", nullable = false, insertable = false, updatable = false)
	public CseCategoriaProfissional getCseCategoriaProfissional() {
		return this.cseCategoriaProfissional;
	}

	public void setCseCategoriaProfissional(CseCategoriaProfissional cseCategoriaProfissional) {
		this.cseCategoriaProfissional = cseCategoriaProfissional;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MAM_FORMULARIO_PADROES("mamFormularioPadrao"),
		RAP_SERVIDORES("rapServidores"),
		CSE_CATEGORIA_PROFISSIONAL("cseCategoriaProfissional"),
		IND_SITUACAO("indSituacao"),
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
		if (!(obj instanceof MamFormularioCategoria)) {
			return false;
		}
		MamFormularioCategoria other = (MamFormularioCategoria) obj;
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
