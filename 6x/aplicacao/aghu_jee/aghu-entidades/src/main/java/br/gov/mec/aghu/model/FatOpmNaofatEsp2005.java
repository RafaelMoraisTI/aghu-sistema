package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatOpmNaofatEsp2005 generated by hbm2java
 */
@Entity
@Table(name = "FAT_OPM_NAOFAT_ESP_2005", schema = "AGH")
public class FatOpmNaofatEsp2005 extends BaseEntityId<FatOpmNaofatEsp2005Id> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8791012151061105046L;
	private FatOpmNaofatEsp2005Id id;

	public FatOpmNaofatEsp2005() {
	}

	public FatOpmNaofatEsp2005(FatOpmNaofatEsp2005Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "sigla", column = @Column(name = "SIGLA", length = 3)),
			@AttributeOverride(name = "especialidade", column = @Column(name = "ESPECIALIDADE", length = 45)),
			@AttributeOverride(name = "codTabela", column = @Column(name = "COD_TABELA", precision = 10, scale = 0)),
			@AttributeOverride(name = "descricao", column = @Column(name = "DESCRICAO", length = 100)),
			@AttributeOverride(name = "quantidade", column = @Column(name = "QUANTIDADE", precision = 22, scale = 0)),
			@AttributeOverride(name = "valorApres", column = @Column(name = "VALOR_APRES", precision = 22, scale = 0)) })
	public FatOpmNaofatEsp2005Id getId() {
		return this.id;
	}

	public void setId(FatOpmNaofatEsp2005Id id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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
		if (!(obj instanceof FatOpmNaofatEsp2005)) {
			return false;
		}
		FatOpmNaofatEsp2005 other = (FatOpmNaofatEsp2005) obj;
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