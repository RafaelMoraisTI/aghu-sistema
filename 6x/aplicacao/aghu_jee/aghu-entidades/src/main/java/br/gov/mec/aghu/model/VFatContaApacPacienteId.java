package br.gov.mec.aghu.model;

// Generated Mar 21, 2011 1:21:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VFatContasApacPacientesId generated by hbm2java
 */
@Embeddable
public class VFatContaApacPacienteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4964673684959836962L;
	private Integer pacCodigo;
	private String pacNome;
	private Integer pacProntuario;
	private Long capAtmNumero;
	private Byte capSeqp;
	private Date capDtInicioValidade;
	private Date capDtFimValidade;
	private String capIndSituacao;
	private Date capCpeDtHrInicio;
	private String capCpeModulo;
	private Byte capCpeMes;
	private Short capCpeAno;
	private Integer capCidSeq;
	private Integer capCidSeqSecundario;
	private Byte atdIndTipoTratamento;
	private Integer atmPhiSeq;
	private Integer atdSeq;

	public VFatContaApacPacienteId() {
	}

	public VFatContaApacPacienteId(Integer pacCodigo, String pacNome,
			Long capAtmNumero, Byte capSeqp, Date capDtInicioValidade,
			String capIndSituacao, Date capCpeDtHrInicio, String capCpeModulo,
			Byte capCpeMes, Short capCpeAno, Integer capCidSeq, Integer atdSeq) {
		this.pacCodigo = pacCodigo;
		this.pacNome = pacNome;
		this.capAtmNumero = capAtmNumero;
		this.capSeqp = capSeqp;
		this.capDtInicioValidade = capDtInicioValidade;
		this.capIndSituacao = capIndSituacao;
		this.capCpeDtHrInicio = capCpeDtHrInicio;
		this.capCpeModulo = capCpeModulo;
		this.capCpeMes = capCpeMes;
		this.capCpeAno = capCpeAno;
		this.capCidSeq = capCidSeq;
		this.atdSeq = atdSeq;
	}

	public VFatContaApacPacienteId(Integer pacCodigo, String pacNome,
			Integer pacProntuario, Long capAtmNumero, Byte capSeqp,
			Date capDtInicioValidade, Date capDtFimValidade,
			String capIndSituacao, Date capCpeDtHrInicio, String capCpeModulo,
			Byte capCpeMes, Short capCpeAno, Integer capCidSeq,
			Integer capCidSeqSecundario, Byte atdIndTipoTratamento,
			Integer atmPhiSeq, Integer atdSeq) {
		this.pacCodigo = pacCodigo;
		this.pacNome = pacNome;
		this.pacProntuario = pacProntuario;
		this.capAtmNumero = capAtmNumero;
		this.capSeqp = capSeqp;
		this.capDtInicioValidade = capDtInicioValidade;
		this.capDtFimValidade = capDtFimValidade;
		this.capIndSituacao = capIndSituacao;
		this.capCpeDtHrInicio = capCpeDtHrInicio;
		this.capCpeModulo = capCpeModulo;
		this.capCpeMes = capCpeMes;
		this.capCpeAno = capCpeAno;
		this.capCidSeq = capCidSeq;
		this.capCidSeqSecundario = capCidSeqSecundario;
		this.atdIndTipoTratamento = atdIndTipoTratamento;
		this.atmPhiSeq = atmPhiSeq;
		this.atdSeq = atdSeq;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "PAC_NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getPacNome() {
		return this.pacNome;
	}

	public void setPacNome(String pacNome) {
		this.pacNome = pacNome;
	}

	@Column(name = "PAC_PRONTUARIO", precision = 8, scale = 0)
	public Integer getPacProntuario() {
		return this.pacProntuario;
	}

	public void setPacProntuario(Integer pacProntuario) {
		this.pacProntuario = pacProntuario;
	}

	@Column(name = "CAP_ATM_NUMERO", nullable = false, precision = 13, scale = 0)
	public Long getCapAtmNumero() {
		return this.capAtmNumero;
	}

	public void setCapAtmNumero(Long capAtmNumero) {
		this.capAtmNumero = capAtmNumero;
	}

	@Column(name = "CAP_SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getCapSeqp() {
		return this.capSeqp;
	}

	public void setCapSeqp(Byte capSeqp) {
		this.capSeqp = capSeqp;
	}

	@Column(name = "CAP_DT_INICIO_VALIDADE", nullable = false, length = 7)
	public Date getCapDtInicioValidade() {
		return this.capDtInicioValidade;
	}

	public void setCapDtInicioValidade(Date capDtInicioValidade) {
		this.capDtInicioValidade = capDtInicioValidade;
	}

	@Column(name = "CAP_DT_FIM_VALIDADE", length = 7)
	public Date getCapDtFimValidade() {
		return this.capDtFimValidade;
	}

	public void setCapDtFimValidade(Date capDtFimValidade) {
		this.capDtFimValidade = capDtFimValidade;
	}

	@Column(name = "CAP_IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getCapIndSituacao() {
		return this.capIndSituacao;
	}

	public void setCapIndSituacao(String capIndSituacao) {
		this.capIndSituacao = capIndSituacao;
	}

	@Column(name = "CAP_CPE_DT_HR_INICIO", nullable = false, length = 7)
	public Date getCapCpeDtHrInicio() {
		return this.capCpeDtHrInicio;
	}

	public void setCapCpeDtHrInicio(Date capCpeDtHrInicio) {
		this.capCpeDtHrInicio = capCpeDtHrInicio;
	}

	@Column(name = "CAP_CPE_MODULO", nullable = false, length = 4)
	@Length(max = 4)
	public String getCapCpeModulo() {
		return this.capCpeModulo;
	}

	public void setCapCpeModulo(String capCpeModulo) {
		this.capCpeModulo = capCpeModulo;
	}

	@Column(name = "CAP_CPE_MES", nullable = false, precision = 2, scale = 0)
	public Byte getCapCpeMes() {
		return this.capCpeMes;
	}

	public void setCapCpeMes(Byte capCpeMes) {
		this.capCpeMes = capCpeMes;
	}

	@Column(name = "CAP_CPE_ANO", nullable = false, precision = 4, scale = 0)
	public Short getCapCpeAno() {
		return this.capCpeAno;
	}

	public void setCapCpeAno(Short capCpeAno) {
		this.capCpeAno = capCpeAno;
	}

	@Column(name = "CAP_CID_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getCapCidSeq() {
		return this.capCidSeq;
	}

	public void setCapCidSeq(Integer capCidSeq) {
		this.capCidSeq = capCidSeq;
	}

	@Column(name = "CAP_CID_SEQ_SECUNDARIO", precision = 5, scale = 0)
	public Integer getCapCidSeqSecundario() {
		return this.capCidSeqSecundario;
	}

	public void setCapCidSeqSecundario(Integer capCidSeqSecundario) {
		this.capCidSeqSecundario = capCidSeqSecundario;
	}

	@Column(name = "ATD_IND_TIPO_TRATAMENTO", precision = 2, scale = 0)
	public Byte getAtdIndTipoTratamento() {
		return this.atdIndTipoTratamento;
	}

	public void setAtdIndTipoTratamento(Byte atdIndTipoTratamento) {
		this.atdIndTipoTratamento = atdIndTipoTratamento;
	}

	@Column(name = "ATM_PHI_SEQ", precision = 6, scale = 0)
	public Integer getAtmPhiSeq() {
		return this.atmPhiSeq;
	}

	public void setAtmPhiSeq(Integer atmPhiSeq) {
		this.atmPhiSeq = atmPhiSeq;
	}

	@Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPacNome());
		umHashCodeBuilder.append(this.getPacCodigo());
		umHashCodeBuilder.append(this.getAtdSeq());
		umHashCodeBuilder.append(this.getCapAtmNumero());
		umHashCodeBuilder.append(this.getCapSeqp());
		umHashCodeBuilder.append(this.getPacProntuario());
		umHashCodeBuilder.append(this.getCapCpeAno());
		umHashCodeBuilder.append(this.getCapDtFimValidade());
		umHashCodeBuilder.append(this.getCapIndSituacao());
		umHashCodeBuilder.append(this.getCapCpeDtHrInicio());
		umHashCodeBuilder.append(this.getCapCpeModulo());
		umHashCodeBuilder.append(this.getCapCidSeq());
		umHashCodeBuilder.append(this.getCapCidSeqSecundario());
		umHashCodeBuilder.append(this.getAtdIndTipoTratamento());
		umHashCodeBuilder.append(this.getAtmPhiSeq());
		umHashCodeBuilder.append(this.getCapDtInicioValidade());
		umHashCodeBuilder.append(this.getCapCpeMes());
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
		if (!(obj instanceof VFatContaApacPacienteId)) {
			return false;
		}
		VFatContaApacPacienteId other = (VFatContaApacPacienteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPacNome(), other.getPacNome());
		umEqualsBuilder.append(this.getPacCodigo(), other.getPacCodigo());
		umEqualsBuilder.append(this.getAtdSeq(), other.getAtdSeq());
		umEqualsBuilder.append(this.getCapAtmNumero(), other.getCapAtmNumero());
		umEqualsBuilder.append(this.getCapSeqp(), other.getCapSeqp());
		umEqualsBuilder.append(this.getPacProntuario(), other.getPacProntuario());
		umEqualsBuilder.append(this.getCapCpeAno(), other.getCapCpeAno());
		umEqualsBuilder.append(this.getCapDtFimValidade(), other.getCapDtFimValidade());
		umEqualsBuilder.append(this.getCapIndSituacao(), other.getCapIndSituacao());
		umEqualsBuilder.append(this.getCapCpeDtHrInicio(), other.getCapCpeDtHrInicio());
		umEqualsBuilder.append(this.getCapCpeModulo(), other.getCapCpeModulo());
		umEqualsBuilder.append(this.getCapCidSeq(), other.getCapCidSeq());
		umEqualsBuilder.append(this.getCapCidSeqSecundario(), other.getCapCidSeqSecundario());
		umEqualsBuilder.append(this.getAtdIndTipoTratamento(), other.getAtdIndTipoTratamento());
		umEqualsBuilder.append(this.getAtmPhiSeq(), other.getAtmPhiSeq());
		umEqualsBuilder.append(this.getCapDtInicioValidade(), other.getCapDtInicioValidade());
		umEqualsBuilder.append(this.getCapCpeMes(), other.getCapCpeMes());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
