package br.gov.mec.aghu.model;

// Generated 19/03/2010 18:16:51 by Hibernate Tools 3.3.0.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AipProntuariosImpressos generated by hbm2java
 */
@Entity
@Table(name = "AIP_PRONTUARIOS_IMPRESSOS", schema = "AGH")
public class AipProntuariosImpressos extends BaseEntityId<AipProntuariosImpressosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7410925505788551877L;
	private AipProntuariosImpressosId id;
	private Boolean indImpresso;

	public AipProntuariosImpressos() {
	}

	public AipProntuariosImpressos(AipProntuariosImpressosId id,
			Boolean indImpresso) {
		this.id = id;
		this.indImpresso = indImpresso;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "dtReferencia", column = @Column(name = "DT_REFERENCIA", nullable = false, length = 7)) })
	public AipProntuariosImpressosId getId() {
		return this.id;
	}

	public void setId(AipProntuariosImpressosId id) {
		this.id = id;
	}

	@Column(name = "IND_IMPRESSO", nullable = false, length=1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndImpresso() {
		return this.indImpresso;
	}

	public void setIndImpresso(Boolean indImpresso) {
		this.indImpresso = indImpresso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AipProntuariosImpressos other = (AipProntuariosImpressos) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		
		DT_REFERENCIA("id.dtReferencia");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
		
	}

}