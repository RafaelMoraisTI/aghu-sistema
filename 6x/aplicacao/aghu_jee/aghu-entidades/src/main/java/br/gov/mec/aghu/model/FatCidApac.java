package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatCidApacs generated by hbm2java
 */
@Entity
@Table(name = "FAT_CID_APACS", schema = "AGH")
public class FatCidApac extends BaseEntityId<FatCidApacId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3153224168693739758L;
	private FatCidApacId id;
	private String indPrioridade;

	public FatCidApac() {
	}

	public FatCidApac(FatCidApacId id, String indPrioridade) {
		this.id = id;
		this.indPrioridade = indPrioridade;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atmNumero", column = @Column(name = "ATM_NUMERO", nullable = false, precision = 13, scale = 0)),
			@AttributeOverride(name = "cidSeq", column = @Column(name = "CID_SEQ", nullable = false, precision = 5, scale = 0)) })
	public FatCidApacId getId() {
		return this.id;
	}

	public void setId(FatCidApacId id) {
		this.id = id;
	}

	@Column(name = "IND_PRIORIDADE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPrioridade() {
		return this.indPrioridade;
	}

	public void setIndPrioridade(String indPrioridade) {
		this.indPrioridade = indPrioridade;
	}

	public enum Fields {

		ID("id"),
		IND_PRIORIDADE("indPrioridade");

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
		if (!(obj instanceof FatCidApac)) {
			return false;
		}
		FatCidApac other = (FatCidApac) obj;
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