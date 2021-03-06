package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaIniciais generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mbcIniSq1", sequenceName="AGH.MBC_INI_SQ1", allocationSize = 1)
@Table(name = "MBC_FICHA_INICIAIS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "fic_seq"))
public class MbcFichaInicial extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4387632314919474407L;
	private Integer seq;
	private Integer version;
	private MbcFichaAnestesias mbcFichaAnestesias;
	private MbcViaAerea mbcViaAereas;
	private Short o2;
	private String regime;
	private Date criadoEm;
	private RapServidores servidor;

	public MbcFichaInicial() {
	}

	public MbcFichaInicial(Integer seq, MbcFichaAnestesias mbcFichaAnestesias,
			Date criadoEm, RapServidores servidor) {
		this.seq = seq;
		this.mbcFichaAnestesias = mbcFichaAnestesias;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public MbcFichaInicial(Integer seq, MbcFichaAnestesias mbcFichaAnestesias,
			MbcViaAerea mbcViaAereas, Short o2, String regime, Date criadoEm,
			RapServidores servidor) {
		this.seq = seq;
		this.mbcFichaAnestesias = mbcFichaAnestesias;
		this.mbcViaAereas = mbcViaAereas;
		this.o2 = o2;
		this.regime = regime;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcIniSq1")
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
	@JoinColumn(name = "FIC_SEQ", unique = true, nullable = false)
	public MbcFichaAnestesias getMbcFichaAnestesias() {
		return this.mbcFichaAnestesias;
	}

	public void setMbcFichaAnestesias(MbcFichaAnestesias mbcFichaAnestesias) {
		this.mbcFichaAnestesias = mbcFichaAnestesias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIA_SEQ")
	public MbcViaAerea getMbcViaAereas() {
		return this.mbcViaAereas;
	}

	public void setMbcViaAereas(MbcViaAerea mbcViaAereas) {
		this.mbcViaAereas = mbcViaAereas;
	}

	@Column(name = "O2")
	public Short getO2() {
		return this.o2;
	}

	public void setO2(Short o2) {
		this.o2 = o2;
	}

	@Column(name = "REGIME", length = 45)
	@Length(max = 45)
	public String getRegime() {
		return this.regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
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

		SEQ("seq"),
		MBC_VIA_AEREAS("mbcViaAereas"),
		O2("o2"),
		REGIME("regime"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("servidor.id.matricula"),
		SER_VIN_CODIGO("servidor.id.vinCodigo"),
		FICHA_ANESTESIA("mbcFichaAnestesias"),
		FICHA_ANESTESIA_SEQ("mbcFichaAnestesias.seq");

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
		if (!(obj instanceof MbcFichaInicial)) {
			return false;
		}
		MbcFichaInicial other = (MbcFichaInicial) obj;
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

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

}
