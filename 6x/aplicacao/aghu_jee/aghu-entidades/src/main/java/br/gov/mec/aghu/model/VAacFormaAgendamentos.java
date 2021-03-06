package br.gov.mec.aghu.model;

// Generated 17/11/2014 

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAacFormaAgendamentos generated by luiz.rosario
 */
@Entity
@Table(name = "V_AAC_FORMA_AGENDAMENTOS", schema = "AGH")
@Immutable
public class VAacFormaAgendamentos extends BaseEntityId<VAacFormaAgendamentosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -416717747907376933L;
	private VAacFormaAgendamentosId id;

	public VAacFormaAgendamentos() {
	}

	public VAacFormaAgendamentos(VAacFormaAgendamentosId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pgdSeq", column = @Column(name = "PGD_SEQ", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "tagSeq", column = @Column(name = "TAG_SEQ", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "caaSeq", column = @Column(name = "CAA_SEQ", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "pagador", column = @Column(name = "PAGADOR", nullable = false, length = 60)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", nullable = false, length = 60)),
			@AttributeOverride(name = "condicao", column = @Column(name = "CONDICAO", nullable = false, length = 60)),
			 })
	public VAacFormaAgendamentosId getId() {
		return this.id;
	}

	public void setId(VAacFormaAgendamentosId id) {
		this.id = id;
	}
	
	public enum Fields {
		PGD_SEQ	("id.pgdSeq"),
		TAG_SEQ	("id.tagSeq"),
		CAA_SEQ	("id.caaSeq"),
		PAGADOR("id.pagador"),
		TIPO("id.tipo"),
		CONDICAO("id.condicao");
		

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
		if (!(obj instanceof VAacFormaAgendamentos)) {
			return false;
		}
		VAacFormaAgendamentos other = (VAacFormaAgendamentos) obj;
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
