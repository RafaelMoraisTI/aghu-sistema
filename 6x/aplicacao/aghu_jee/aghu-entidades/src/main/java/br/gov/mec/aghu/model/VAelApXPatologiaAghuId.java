package br.gov.mec.aghu.model;


// Generated 10/04/2012 11:33:38 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoExamePatologia;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAelApXPatologiaId generated by hbm2java
 */
@Embeddable
public class VAelApXPatologiaAghuId implements EntityCompositeId {

	private static final long serialVersionUID = 4106719698114589212L;
	
	private Long lumSeq;
	private Long luxSeq;
	private Long lumNumeroAp;
	private Integer atvSeq;
	private Integer atdSeq;
	private String luxMateriais;
	private DominioSituacaoExamePatologia luxEtapasLaudo;
	private String luxSituacao;
	private Integer lu2Seq;
	private String lu2Nome;
	private Integer luxSerMatriculaRespLaudo;
	private Short luxSerVinCodigoRespLaudo;
	private Boolean luxIndImpresso;
	private Date dataExtrato;
	private String nomePac;
	private String  nomeMedicoSolic;
	private Integer matriculaMedicoSolic;
	private String  nomeResidente;
	private Integer matriculaResidente;
	private String  nomePatologista;
	private Integer matriculaPatologista;

	public VAelApXPatologiaAghuId() {
	}

	public VAelApXPatologiaAghuId(Long lumSeq, Long luxSeq, Long lumNumeroAp,
			String luxMateriais, String luxSituacao, Integer lu2Seq,
			Boolean luxIndImpresso) {
		this.lumSeq = lumSeq;
		this.luxSeq = luxSeq;
		this.lumNumeroAp = lumNumeroAp;
		this.luxMateriais = luxMateriais;
		this.luxSituacao = luxSituacao;
		this.lu2Seq = lu2Seq;
		this.luxIndImpresso = luxIndImpresso;
	}

	public VAelApXPatologiaAghuId(Long lumSeq, Long luxSeq, Long lumNumeroAp,
			Integer atvSeq, Integer atdSeq, String luxMateriais,
			DominioSituacaoExamePatologia luxEtapasLaudo, String luxSituacao, Integer lu2Seq,
			String lu2Nome, Integer luxSerMatriculaRespLaudo,
			Short luxSerVinCodigoRespLaudo, Boolean luxIndImpresso,
			Date dataExtrato, String nomePac, String nomeMedicoSolic,
			Integer matriculaMedicoSolic, String nomeResidente,
			Integer matriculaResidente, String nomePatologista,
			Integer matriculaPatologista) {
		
		super();
		this.lumSeq = lumSeq;
		this.luxSeq = luxSeq;
		this.lumNumeroAp = lumNumeroAp;
		this.atvSeq = atvSeq;
		this.atdSeq = atdSeq;
		this.luxMateriais = luxMateriais;
		this.luxEtapasLaudo = luxEtapasLaudo;
		this.luxSituacao = luxSituacao;
		this.lu2Seq = lu2Seq;
		this.lu2Nome = lu2Nome;
		this.luxSerMatriculaRespLaudo = luxSerMatriculaRespLaudo;
		this.luxSerVinCodigoRespLaudo = luxSerVinCodigoRespLaudo;
		this.luxIndImpresso = luxIndImpresso;
		this.dataExtrato = dataExtrato;
		this.nomePac = nomePac;
		this.nomeMedicoSolic = nomeMedicoSolic;
		this.matriculaMedicoSolic = matriculaMedicoSolic;
		this.nomeResidente = nomeResidente;
		this.matriculaResidente = matriculaResidente;
		this.nomePatologista = nomePatologista;
		this.matriculaPatologista = matriculaPatologista;
	}

	@Column(name = "LUM_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getLumSeq() {
		return this.lumSeq;
	}

	public void setLumSeq(Long lumSeq) {
		this.lumSeq = lumSeq;
	}

	@Column(name = "LUX_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getLuxSeq() {
		return this.luxSeq;
	}

	public void setLuxSeq(Long luxSeq) {
		this.luxSeq = luxSeq;
	}

	@Column(name = "LUM_NUMERO_AP", nullable = false, precision = 10, scale = 0)
	public Long getLumNumeroAp() {
		return this.lumNumeroAp;
	}

	public void setLumNumeroAp(Long lumNumeroAp) {
		this.lumNumeroAp = lumNumeroAp;
	}

	@Column(name = "ATV_SEQ", precision = 7, scale = 0)
	public Integer getAtvSeq() {
		return this.atvSeq;
	}

	public void setAtvSeq(Integer atvSeq) {
		this.atvSeq = atvSeq;
	}

	@Column(name = "ATD_SEQ", precision = 9, scale = 0)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "LUX_MATERIAIS", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getLuxMateriais() {
		return this.luxMateriais;
	}

	public void setLuxMateriais(String luxMateriais) {
		this.luxMateriais = luxMateriais;
	}

	@Column(name = "LUX_ETAPAS_LAUDO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoExamePatologia getLuxEtapasLaudo() {
		return this.luxEtapasLaudo;
	}

	public void setLuxEtapasLaudo(DominioSituacaoExamePatologia luxEtapasLaudo) {
		this.luxEtapasLaudo = luxEtapasLaudo;
	}

	@Column(name = "LUX_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getLuxSituacao() {
		return this.luxSituacao;
	}

	public void setLuxSituacao(String luxSituacao) {
		this.luxSituacao = luxSituacao;
	}

	@Column(name = "LU2_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getLu2Seq() {
		return this.lu2Seq;
	}

	public void setLu2Seq(Integer lu2Seq) {
		this.lu2Seq = lu2Seq;
	}

	@Column(name = "LU2_NOME", nullable = false, length = 500)
	public String getLu2Nome() {
		return lu2Nome;
	}

	public void setLu2Nome(String lu2Nome) {
		this.lu2Nome = lu2Nome;
	}
	
	@Column(name = "LUX_SER_MATRICULA_RESP_LAUDO", precision = 7, scale = 0)
	public Integer getLuxSerMatriculaRespLaudo() {
		return this.luxSerMatriculaRespLaudo;
	}

	public void setLuxSerMatriculaRespLaudo(Integer luxSerMatriculaRespLaudo) {
		this.luxSerMatriculaRespLaudo = luxSerMatriculaRespLaudo;
	}

	@Column(name = "LUX_SER_VIN_CODIGO_RESP_LAUDO", precision = 3, scale = 0)
	public Short getLuxSerVinCodigoRespLaudo() {
		return this.luxSerVinCodigoRespLaudo;
	}

	public void setLuxSerVinCodigoRespLaudo(Short luxSerVinCodigoRespLaudo) {
		this.luxSerVinCodigoRespLaudo = luxSerVinCodigoRespLaudo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_EXTRATO", nullable = false)
	public Date getDataExtrato() {
		return dataExtrato;
	}

	public void setDataExtrato(Date dataExtrato) {
		this.dataExtrato = dataExtrato;
	}
	
	@Column(name = "NOME_PAC", nullable = false, length = 50)
	public String getNomePac() {
		return nomePac;
	}

	public void setNomePac(String nomePac) {
		this.nomePac = nomePac;
	}

	@Column(name = "NOME_MEDICO_SOLIC", nullable = false, length = 50)
	public String getNomeMedicoSolic() {
		return nomeMedicoSolic;
	}

	public void setNomeMedicoSolic(String nomeMedicoSolic) {
		this.nomeMedicoSolic = nomeMedicoSolic;
	}
	
	@Column(name = "MATRICULA_MEDICO_SOLIC", precision = 7, scale = 0)
	public Integer getMatriculaMedicoSolic() {
		return this.matriculaMedicoSolic;
	}

	public void setMatriculaMedicoSolic(Integer matriculaMedicoSolic) {
		this.matriculaMedicoSolic = matriculaMedicoSolic;
	}

	@Column(name = "NOME_RESIDENTE", nullable = false, length = 200)
	public String getNomeResidente() {
		return nomeResidente;
	}

	public void setNomeResidente(String nomeResidente) {
		this.nomeResidente = nomeResidente;
	}
	
	@Column(name = "MATRICULA_RESIDENTE", precision = 7, scale = 0)
	public Integer getMatriculaResidente() {
		return this.matriculaResidente;
	}

	public void setMatriculaResidente(Integer matriculaResidente) {
		this.matriculaResidente = matriculaResidente;
	}

	@Column(name = "NOME_PATOLOGISTA", nullable = false, length = 200)
	public String getNomePatologista() {
		return nomePatologista;
	}

	public void setNomePatologista(String nomePatologista) {
		this.nomePatologista = nomePatologista;
	}
	
	@Column(name = "MATRICULA_PATOLOGISTA", precision = 7, scale = 0)
	public Integer getMatriculaPatologista() {
		return this.matriculaPatologista;
	}

	public void setMatriculaPatologista(Integer matriculaPatologista) {
		this.matriculaPatologista = matriculaPatologista;
	} 

	@Column(name = "LUX_IND_IMPRESSO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getLuxIndImpresso() {
		return luxIndImpresso;
	}

	public void setLuxIndImpresso(Boolean luxIndImpresso) {
		this.luxIndImpresso = luxIndImpresso;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getAtvSeq());
		umHashCodeBuilder.append(this.getAtdSeq());
		umHashCodeBuilder.append(this.getLu2Seq());
		umHashCodeBuilder.append(this.getLuxSeq());
		umHashCodeBuilder.append(this.getNomePac());
		umHashCodeBuilder.append(this.getLumSeq());
		umHashCodeBuilder.append(this.getLumNumeroAp());
		umHashCodeBuilder.append(this.getLuxMateriais());
		umHashCodeBuilder.append(this.getLuxEtapasLaudo());
		umHashCodeBuilder.append(this.getLuxSituacao());
		umHashCodeBuilder.append(this.getLuxSerMatriculaRespLaudo());
		umHashCodeBuilder.append(this.getLuxSerVinCodigoRespLaudo());
		umHashCodeBuilder.append(this.getLuxIndImpresso());
		umHashCodeBuilder.append(this.getLu2Nome());
		umHashCodeBuilder.append(this.getDataExtrato());
		umHashCodeBuilder.append(this.getNomeMedicoSolic());
		umHashCodeBuilder.append(this.getMatriculaMedicoSolic());
		umHashCodeBuilder.append(this.getNomeResidente());
		umHashCodeBuilder.append(this.getMatriculaResidente());
		umHashCodeBuilder.append(this.getNomePatologista());
		umHashCodeBuilder.append(this.getMatriculaPatologista());
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
		if (!(obj instanceof VAelApXPatologiaAghuId)) {
			return false;
		}
		VAelApXPatologiaAghuId other = (VAelApXPatologiaAghuId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getAtvSeq(), other.getAtvSeq());
		umEqualsBuilder.append(this.getAtdSeq(), other.getAtdSeq());
		umEqualsBuilder.append(this.getLu2Seq(), other.getLu2Seq());
		umEqualsBuilder.append(this.getLuxSeq(), other.getLuxSeq());
		umEqualsBuilder.append(this.getNomePac(), other.getNomePac());
		umEqualsBuilder.append(this.getLumSeq(), other.getLumSeq());
		umEqualsBuilder.append(this.getLumNumeroAp(), other.getLumNumeroAp());
		umEqualsBuilder.append(this.getLuxMateriais(), other.getLuxMateriais());
		umEqualsBuilder.append(this.getLuxEtapasLaudo(), other.getLuxEtapasLaudo());
		umEqualsBuilder.append(this.getLuxSituacao(), other.getLuxSituacao());
		umEqualsBuilder.append(this.getLuxSerMatriculaRespLaudo(), other.getLuxSerMatriculaRespLaudo());
		umEqualsBuilder.append(this.getLuxSerVinCodigoRespLaudo(), other.getLuxSerVinCodigoRespLaudo());
		umEqualsBuilder.append(this.getLuxIndImpresso(), other.getLuxIndImpresso());
		umEqualsBuilder.append(this.getLu2Nome(), other.getLu2Nome());
		umEqualsBuilder.append(this.getDataExtrato(), other.getDataExtrato());
		umEqualsBuilder.append(this.getNomeMedicoSolic(), other.getNomeMedicoSolic());
		umEqualsBuilder.append(this.getMatriculaMedicoSolic(), other.getMatriculaMedicoSolic());
		umEqualsBuilder.append(this.getNomeResidente(), other.getNomeResidente());
		umEqualsBuilder.append(this.getMatriculaResidente(), other.getMatriculaResidente());
		umEqualsBuilder.append(this.getNomePatologista(), other.getNomePatologista());
		umEqualsBuilder.append(this.getMatriculaPatologista(), other.getMatriculaPatologista());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}