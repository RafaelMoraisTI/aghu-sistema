package br.gov.mec.aghu.model;

// Generated 22/03/2011 15:20:50 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoConta;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * VFatContasHospPacientes generated by hbm2java
 */

@Entity
@Table(name = "V_FAT_CONTAS_HOSP_PACIENTES", schema = "AGH")
@Immutable
public class VFatContasHospPacientes extends BaseEntitySeq<Integer> implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1420022051614392437L;

	private Integer cthSeq;

	private Date cthDtIntAdministrativa;
	
	private Date cthDtAltaAdministrativa;
	
	private Short cthCspCnvCodigo;
	
	private Byte cthCspSeq;
	
	private Integer cthPhiSeq;
	
	private Integer cthPhiSeqRealizado;
	
	private Long cthNroAih;
	
	private Integer cthCthSeq;
	
	private DominioSituacaoConta cthIndSituacao;
	
	private Byte cthTahSeq;
	
	private Integer pacCodigo;
	
	private String pacNome;
	
	private Integer pacProntuario;
	
	private BigDecimal intSeq;
	
	private BigDecimal intEspSeq;
	
	private String intLtoId;
	
	private Integer dcsSeq;
	
	private AipPacientes paciente;

	private FatContasHospitalares contaHospitalar;

	private AinInternacao internacao;

	private FatAih aih;
	
	private FatTipoAih tipoAih;
	
	private FatProcedHospInternos procedimentoHospitalarInternoRealizado;

	public VFatContasHospPacientes() {
	}

	public VFatContasHospPacientes(Integer cthSeq, Date cthDtIntAdministrativa,
			Date cthDtAltaAdministrativa, Short cthCspCnvCodigo,
			Byte cthCspSeq, Integer cthPhiSeq, Integer cthPhiSeqRealizado,
			Long cthNroAih, Integer cthCthSeq, DominioSituacaoConta cthIndSituacao,
			Byte cthTahSeq, Integer pacCodigo, String pacNome,
			Integer pacProntuario, BigDecimal intSeq, BigDecimal intEspSeq,
			String intLtoId, Integer dcsSeq) {
		this.cthSeq = cthSeq;
		this.cthDtIntAdministrativa = cthDtIntAdministrativa;
		this.cthDtAltaAdministrativa = cthDtAltaAdministrativa;
		this.cthCspCnvCodigo = cthCspCnvCodigo;
		this.cthCspSeq = cthCspSeq;
		this.cthPhiSeq = cthPhiSeq;
		this.cthPhiSeqRealizado = cthPhiSeqRealizado;
		this.cthNroAih = cthNroAih;
		this.cthCthSeq = cthCthSeq;
		this.cthIndSituacao = cthIndSituacao;
		this.cthTahSeq = cthTahSeq;
		this.pacCodigo = pacCodigo;
		this.pacNome = pacNome;
		this.pacProntuario = pacProntuario;
		this.intSeq = intSeq;
		this.intEspSeq = intEspSeq;
		this.intLtoId = intLtoId;
		this.dcsSeq = dcsSeq;
	}

	@Column(name = "CTH_SEQ", precision = 8, scale = 0)
	@Id
	public Integer getCthSeq() {
		return this.cthSeq;
	}

	public void setCthSeq(Integer cthSeq) {
		this.cthSeq = cthSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTH_DT_INT_ADMINISTRATIVA", insertable = false, updatable = false)
	public Date getCthDtIntAdministrativa() {
		return this.cthDtIntAdministrativa;
	}

	public void setCthDtIntAdministrativa(Date cthDtIntAdministrativa) {
		this.cthDtIntAdministrativa = cthDtIntAdministrativa;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTH_DT_ALTA_ADMINISTRATIVA", insertable = false, updatable = false)
	public Date getCthDtAltaAdministrativa() {
		return this.cthDtAltaAdministrativa;
	}

	public void setCthDtAltaAdministrativa(Date cthDtAltaAdministrativa) {
		this.cthDtAltaAdministrativa = cthDtAltaAdministrativa;
	}

	@Column(name = "CTH_CSP_CNV_CODIGO", precision = 3, scale = 0, insertable = false, updatable = false)
	public Short getCthCspCnvCodigo() {
		return this.cthCspCnvCodigo;
	}

	public void setCthCspCnvCodigo(Short cthCspCnvCodigo) {
		this.cthCspCnvCodigo = cthCspCnvCodigo;
	}

	@Column(name = "CTH_CSP_SEQ", precision = 2, scale = 0, insertable = false, updatable = false)
	public Byte getCthCspSeq() {
		return this.cthCspSeq;
	}

	public void setCthCspSeq(Byte cthCspSeq) {
		this.cthCspSeq = cthCspSeq;
	}

	@Column(name = "CTH_PHI_SEQ", precision = 6, scale = 0, insertable = false, updatable = false)
	public Integer getCthPhiSeq() {
		return this.cthPhiSeq;
	}

	public void setCthPhiSeq(Integer cthPhiSeq) {
		this.cthPhiSeq = cthPhiSeq;
	}

	@Column(name = "CTH_PHI_SEQ_REALIZADO", precision = 6, scale = 0, insertable = false, updatable = false)
	public Integer getCthPhiSeqRealizado() {
		return this.cthPhiSeqRealizado;
	}

	public void setCthPhiSeqRealizado(Integer cthPhiSeqRealizado) {
		this.cthPhiSeqRealizado = cthPhiSeqRealizado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTH_PHI_SEQ_REALIZADO", insertable= false, updatable = false)
	public FatProcedHospInternos getProcedimentoHospitalarInternoRealizado() {
		return this.procedimentoHospitalarInternoRealizado;
	}
	
	public void setProcedimentoHospitalarInternoRealizado(
			FatProcedHospInternos procedimentoHospitalarInternoRealizado) {
		this.procedimentoHospitalarInternoRealizado = procedimentoHospitalarInternoRealizado;
	}

	@Column(name = "CTH_NRO_AIH", precision = 13, scale = 0, insertable = false, updatable = false)
	public Long getCthNroAih() {
		return this.cthNroAih;
	}

	public void setCthNroAih(Long cthNroAih) {
		this.cthNroAih = cthNroAih;
	}

	@Column(name = "CTH_CTH_SEQ", precision = 8, scale = 0, insertable = false, updatable = false)
	public Integer getCthCthSeq() {
		return this.cthCthSeq;
	}

	public void setCthCthSeq(Integer cthCthSeq) {
		this.cthCthSeq = cthCthSeq;
	}

	@Column(name = "CTH_IND_SITUACAO", insertable = false, updatable = false)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoConta getCthIndSituacao() {
		return this.cthIndSituacao;
	}

	public void setCthIndSituacao(DominioSituacaoConta cthIndSituacao) {
		this.cthIndSituacao = cthIndSituacao;
	}

	@Column(name = "CTH_TAH_SEQ", precision = 2, scale = 0, insertable = false, updatable = false)
	public Byte getCthTahSeq() {
		return this.cthTahSeq;
	}

	public void setCthTahSeq(Byte cthTahSeq) {
		this.cthTahSeq = cthTahSeq;
	}

	@Column(name = "PAC_CODIGO", precision = 8, scale = 0, insertable = false, updatable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "PAC_NOME", length = 50, insertable = false, updatable = false)
	@Length(max = 50)
	public String getPacNome() {
		return this.pacNome;
	}

	public void setPacNome(String pacNome) {
		this.pacNome = pacNome;
	}

	@Column(name = "PAC_PRONTUARIO", precision = 8, scale = 0, insertable = false, updatable = false)
	public Integer getPacProntuario() {
		return this.pacProntuario;
	}

	public void setPacProntuario(Integer pacProntuario) {
		this.pacProntuario = pacProntuario;
	}

	@Column(name = "INT_SEQ", precision = 22, scale = 0, insertable = false, updatable = false)
	public BigDecimal getIntSeq() {
		return this.intSeq;
	}

	public void setIntSeq(BigDecimal intSeq) {
		this.intSeq = intSeq;
	}

	@Column(name = "INT_ESP_SEQ", precision = 22, scale = 0, insertable = false, updatable = false)
	public BigDecimal getIntEspSeq() {
		return this.intEspSeq;
	}

	public void setIntEspSeq(BigDecimal intEspSeq) {
		this.intEspSeq = intEspSeq;
	}

	@Column(name = "INT_LTO_ID", length = 14, insertable = false, updatable = false)
	@Length(max = 14)
	public String getIntLtoId() {
		return this.intLtoId;
	}

	public void setIntLtoId(String intLtoId) {
		this.intLtoId = intLtoId;
	}

	@Column(name = "DCS_SEQ", precision = 8, scale = 0, insertable = false, updatable = false)
	public Integer getDcsSeq() {
		return this.dcsSeq;
	}

	public void setDcsSeq(Integer dcsSeq) {
		this.dcsSeq = dcsSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", referencedColumnName="CODIGO", insertable= false, updatable = false)
	public AipPacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTH_SEQ", insertable= false, updatable = false)
	public FatContasHospitalares getContaHospitalar() {
		return contaHospitalar;
	}

	public void setContaHospitalar(FatContasHospitalares contaHospitalar) {
		this.contaHospitalar = contaHospitalar;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INT_SEQ", insertable= false, updatable = false)
	public AinInternacao getInternacao() {
		return internacao;
	}

	public void setInternacao(AinInternacao internacao) {
		this.internacao = internacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTH_NRO_AIH", insertable= false, updatable = false)
	public FatAih getAih() {
		return aih;
	}

	public void setAih(FatAih aih) {
		this.aih = aih;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTH_TAH_SEQ", insertable= false, updatable = false)
	public FatTipoAih getTipoAih() {
		return tipoAih;
	}

	public void setTipoAih(FatTipoAih tipoAih) {
		this.tipoAih = tipoAih;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cthSeq == null) ? 0 : cthSeq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VFatContasHospPacientes other = (VFatContasHospPacientes) obj;
		if (cthSeq == null) {
			if (other.cthSeq != null){
				return false;
			}
		} else if (!cthSeq.equals(other.cthSeq)){
			return false;
		}
		return true;
	}

	public enum Fields {	
		
		CTH_SEQ("cthSeq"), 
		AIH("aih"),
		CTH_NRO_AIH("cthNroAih"), 
		PACIENTE("paciente"), 
		PAC_CODIGO("pacCodigo"), 
		PAC_PRONTUARIO("pacProntuario"), 
		CTH_IND_SITUACAO("cthIndSituacao"),
		CTH_TAH_SEQ("cthTahSeq"),
		CTH_CTH_SEQ("cthCthSeq"),
		CTH_CSP_CNV_CODIGO("cthCspCnvCodigo"),
		CTH_DT_INT_ADMINISTRATIVA("cthDtIntAdministrativa"),
		CTH_DT_ALTA_ADMINISTRATIVA("cthDtAltaAdministrativa"),
		DCS_SEQ("dcsSeq"),
		PAC_NOME("pacNome"),
		INT_LTO_ID("intLtoId"),
		INTERNACAO("internacao"),
		DTHR_INTERNACAO("internacao.dthrInternacao"),
		INT_SEQ("intSeq"),
		CONTA_HOSPITALAR("contaHospitalar")
		;
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
		
	}
	 
 @Transient public Integer getSeq(){ return this.getCthSeq();} 
 public void setSeq(Integer seq){ this.setCthSeq(seq);}
}
