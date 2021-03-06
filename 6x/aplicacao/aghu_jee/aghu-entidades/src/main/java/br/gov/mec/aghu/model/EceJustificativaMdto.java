package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * EceJustificativaMdto generated by hbm2java
 */
@Entity
@SequenceGenerator(name="eceEjmSq1", sequenceName="AGH.ECE_EJM_SQ1", allocationSize = 1)
@Table(name = "ECE_JUSTIFICATIVA_MDTOS", schema = "AGH")
public class EceJustificativaMdto extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2780613921519317289L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidoresByEceEjmRapFk2;
	private RapServidores rapServidoresByEceEjmRapFk1;
	private String descricao;
	private Date criadoEm;
	private DominioSituacao indSituacao;
	private Date alteradoEm;
	private Set<EceHorarioAdministrado> eceHorarioAdministradoes = new HashSet<EceHorarioAdministrado>(0);

	public EceJustificativaMdto() {
	}

	public EceJustificativaMdto(Short seq, RapServidores rapServidoresByEceEjmRapFk1, String descricao, Date criadoEm) {
		this.seq = seq;
		this.rapServidoresByEceEjmRapFk1 = rapServidoresByEceEjmRapFk1;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
	}

	public EceJustificativaMdto(Short seq, RapServidores rapServidoresByEceEjmRapFk2, RapServidores rapServidoresByEceEjmRapFk1,
			String descricao, Date criadoEm, DominioSituacao indSituacao, Date alteradoEm,
			Set<EceHorarioAdministrado> eceHorarioAdministradoes) {
		this.seq = seq;
		this.rapServidoresByEceEjmRapFk2 = rapServidoresByEceEjmRapFk2;
		this.rapServidoresByEceEjmRapFk1 = rapServidoresByEceEjmRapFk1;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.alteradoEm = alteradoEm;
		this.eceHorarioAdministradoes = eceHorarioAdministradoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "eceEjmSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByEceEjmRapFk2() {
		return this.rapServidoresByEceEjmRapFk2;
	}

	public void setRapServidoresByEceEjmRapFk2(RapServidores rapServidoresByEceEjmRapFk2) {
		this.rapServidoresByEceEjmRapFk2 = rapServidoresByEceEjmRapFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByEceEjmRapFk1() {
		return this.rapServidoresByEceEjmRapFk1;
	}

	public void setRapServidoresByEceEjmRapFk1(RapServidores rapServidoresByEceEjmRapFk1) {
		this.rapServidoresByEceEjmRapFk1 = rapServidoresByEceEjmRapFk1;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eceJustificativaMdto")
	public Set<EceHorarioAdministrado> getEceHorarioAdministradoes() {
		return this.eceHorarioAdministradoes;
	}

	public void setEceHorarioAdministradoes(Set<EceHorarioAdministrado> eceHorarioAdministradoes) {
		this.eceHorarioAdministradoes = eceHorarioAdministradoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_ECE_EJM_RAP_FK2("rapServidoresByEceEjmRapFk2"),
		RAP_SERVIDORES_BY_ECE_EJM_RAP_FK1("rapServidoresByEceEjmRapFk1"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		ALTERADO_EM("alteradoEm"),
		ECE_HORARIO_ADMINISTRADOES("eceHorarioAdministradoes");

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
		if (!(obj instanceof EceJustificativaMdto)) {
			return false;
		}
		EceJustificativaMdto other = (EceJustificativaMdto) obj;
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
