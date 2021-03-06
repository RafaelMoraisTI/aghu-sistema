package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AbsDoadorImpedidoExt generated by hbm2java
 */
@Entity
@SequenceGenerator(name="absDieSq1", sequenceName="AGH.ABS_DIE_SQ1", allocationSize = 1)
@Table(name = "ABS_DOADORES_IMPEDIDOS_EXT", schema = "AGH")
public class AbsDoadorImpedidoExt extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 641079270005696526L;
	private Integer seq;
	private Integer version;
	private AbsListaImpedido absListaImpedido;
	private String nome;
	private Date dtNascimento;
	private Date dtDoacao;
	private String mtvoImpedimento;

	public AbsDoadorImpedidoExt() {
	}

	public AbsDoadorImpedidoExt(Integer seq, AbsListaImpedido absListaImpedido, String nome) {
		this.seq = seq;
		this.absListaImpedido = absListaImpedido;
		this.nome = nome;
	}

	public AbsDoadorImpedidoExt(Integer seq, AbsListaImpedido absListaImpedido, String nome, Date dtNascimento, Date dtDoacao,
			String mtvoImpedimento) {
		this.seq = seq;
		this.absListaImpedido = absListaImpedido;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.dtDoacao = dtDoacao;
		this.mtvoImpedimento = mtvoImpedimento;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "absDieSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumn(name = "LIM_SEQ", nullable = false)
	public AbsListaImpedido getAbsListaImpedido() {
		return this.absListaImpedido;
	}

	public void setAbsListaImpedido(AbsListaImpedido absListaImpedido) {
		this.absListaImpedido = absListaImpedido;
	}

	@Column(name = "NOME", nullable = false, length = 45)
	@Length(max = 45)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NASCIMENTO", length = 29)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_DOACAO", length = 29)
	public Date getDtDoacao() {
		return this.dtDoacao;
	}

	public void setDtDoacao(Date dtDoacao) {
		this.dtDoacao = dtDoacao;
	}

	@Column(name = "MTVO_IMPEDIMENTO", length = 11)
	@Length(max = 11)
	public String getMtvoImpedimento() {
		return this.mtvoImpedimento;
	}

	public void setMtvoImpedimento(String mtvoImpedimento) {
		this.mtvoImpedimento = mtvoImpedimento;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		ABS_LISTA_IMPEDIDOS("absListaImpedido"),
		NOME("nome"),
		DT_NASCIMENTO("dtNascimento"),
		DT_DOACAO("dtDoacao"),
		MTVO_IMPEDIMENTO("mtvoImpedimento");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof AbsDoadorImpedidoExt)) {
			return false;
		}
		AbsDoadorImpedidoExt other = (AbsDoadorImpedidoExt) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
