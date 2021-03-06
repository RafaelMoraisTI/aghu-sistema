package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MvaipBairroCepLogradouro generated by hbm2java
 */
@Entity
@Table(name = "MVAIP_BAIRROS_CEP_LOGRADOURO", schema = "AGH")
public class MvaipBairroCepLogradouro extends BaseEntityId<MvaipBairroCepLogradouroId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 690663202343456914L;
	private MvaipBairroCepLogradouroId id;

	public MvaipBairroCepLogradouro() {
	}

	public MvaipBairroCepLogradouro(MvaipBairroCepLogradouroId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "cloLgrCodigo", column = @Column(name = "CLO_LGR_CODIGO", nullable = false)),
			@AttributeOverride(name = "cloCep", column = @Column(name = "CLO_CEP", nullable = false)),
			@AttributeOverride(name = "baiCodigo", column = @Column(name = "BAI_CODIGO", nullable = false)) })
	public MvaipBairroCepLogradouroId getId() {
		return this.id;
	}

	public void setId(MvaipBairroCepLogradouroId id) {
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
		if (!(obj instanceof MvaipBairroCepLogradouro)) {
			return false;
		}
		MvaipBairroCepLogradouro other = (MvaipBairroCepLogradouro) obj;
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
