package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FatMotivoRejeicaoContas generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fatRjcSq1", sequenceName="AGH.FAT_RJC_SQ1", allocationSize = 1)
@Table(name = "FAT_MOTIVO_REJEICAO_CONTAS", schema = "AGH")
public class FatMotivoRejeicaoConta extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2169105488660145650L;
	
	private Short seq;
	private Short codigoSus;
	private String descricao;
	private DominioSituacao situacao;
	private Integer version;

	public FatMotivoRejeicaoConta() {
	}

	public FatMotivoRejeicaoConta(Short seq, Short codigoSus,
			String descricao, DominioSituacao situacao) {
		this.seq = seq;
		this.codigoSus = codigoSus;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fatRjcSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Column(name = "CODIGO_SUS", nullable = false, precision = 3, scale = 0)
	public Short getCodigoSus() {
		return this.codigoSus;
	}

	public void setCodigoSus(Short codigoSus) {
		this.codigoSus = codigoSus;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
        umHashCodeBuilder.append(this.getSeq());
        umHashCodeBuilder.append(this.getCodigoSus());
        umHashCodeBuilder.append(this.getDescricao());
        umHashCodeBuilder.append(this.getSituacao());
        umHashCodeBuilder.append(this.getVersion());
        return umHashCodeBuilder.toHashCode();
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
		FatMotivoRejeicaoConta other = (FatMotivoRejeicaoConta) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
        umEqualsBuilder.append(this.getSeq(), other.getSeq());
        umEqualsBuilder.append(this.getCodigoSus(), other.getCodigoSus());
        umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
        umEqualsBuilder.append(this.getSituacao(), other.getSituacao());
        umEqualsBuilder.append(this.getVersion(), other.getVersion());
        return umEqualsBuilder.isEquals();
	}

	public enum Fields {

		SEQ("seq"), 
		CODIGO_SUS("codigoSus"), 
		DESCRICAO("descricao"), 
		SITUACAO("situacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
		
	}

}
