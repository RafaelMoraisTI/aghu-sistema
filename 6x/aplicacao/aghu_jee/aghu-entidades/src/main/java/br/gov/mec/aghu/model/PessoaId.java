package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * PessoaId generated by hbm2java
 */
@Embeddable
public class PessoaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5509468773933657892L;
	private Long codPessoa;
	private String nomePessoa;
	private String tipoPessoa;
	private String nomeExtenso;

	public PessoaId() {
	}

	public PessoaId(Long codPessoa, String nomePessoa, String tipoPessoa, String nomeExtenso) {
		this.codPessoa = codPessoa;
		this.nomePessoa = nomePessoa;
		this.tipoPessoa = tipoPessoa;
		this.nomeExtenso = nomeExtenso;
	}

	@Column(name = "COD_PESSOA")
	public Long getCodPessoa() {
		return this.codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	@Column(name = "NOME_PESSOA", length = 50)
	@Length(max = 50)
	public String getNomePessoa() {
		return this.nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	@Column(name = "TIPO_PESSOA", length = 1)
	@Length(max = 1)
	public String getTipoPessoa() {
		return this.tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Column(name = "NOME_EXTENSO", length = 250)
	@Length(max = 250)
	public String getNomeExtenso() {
		return this.nomeExtenso;
	}

	public void setNomeExtenso(String nomeExtenso) {
		this.nomeExtenso = nomeExtenso;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCodPessoa());
		umHashCodeBuilder.append(this.getNomePessoa());
		umHashCodeBuilder.append(this.getTipoPessoa());
		umHashCodeBuilder.append(this.getNomeExtenso());
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
		if (!(obj instanceof PessoaId)) {
			return false;
		}
		PessoaId other = (PessoaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCodPessoa(), other.getCodPessoa());
		umEqualsBuilder.append(this.getNomePessoa(), other.getNomePessoa());
		umEqualsBuilder.append(this.getTipoPessoa(), other.getTipoPessoa());
		umEqualsBuilder.append(this.getNomeExtenso(), other.getNomeExtenso());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
