package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * McoGestacaoJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mcoGsoJnSeq", sequenceName="AGH.MCO_GSO_JN_SEQ", allocationSize = 1)
@Table(name = "MCO_GESTACOES_JN", schema = "AGH")
@Immutable
public class McoGestacaoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -2015973421197698951L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Short seqp;
	private Short gesta;
	private Short para;
	private Short cesarea;
	private Short aborto;
	private Date dtUltMenstruacao;
	private Date dtPrimEco;
	private Short igPrimEco;
	private Date dtInformadaIg;
	private Short igAtualSemanas;
	private Short igAtualDias;
	private Date dtProvavelParto;
	private Short numConsPrn;
	private Date dtPrimConsPrn;
	private String indMesmoPai;
	private String grupoSanguineoPai;
	private String fatorRhPai;
	private String obsExames;
	private String gemelar;
	private String vatCompleta;
	private String usoMedicamentos;
	private Date criadoEm;
	private Integer pacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Short igPrimEcoDias;
	private Date dthrSumarioAltaMae;
	private String gravidez;
	private Short ectopica;

	public McoGestacaoJn() {
	}

	public McoGestacaoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seqp, Integer pacCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seqp = seqp;
		this.pacCodigo = pacCodigo;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public McoGestacaoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seqp, Short gesta, Short para,
			Short cesarea, Short aborto, Date dtUltMenstruacao, Date dtPrimEco, Short igPrimEco, Date dtInformadaIg,
			Short igAtualSemanas, Short igAtualDias, Date dtProvavelParto, Short numConsPrn, Date dtPrimConsPrn, String indMesmoPai,
			String grupoSanguineoPai, String fatorRhPai, String obsExames, String gemelar, String vatCompleta, String usoMedicamentos,
			Date criadoEm, Integer pacCodigo, Integer serMatricula, Short serVinCodigo, Short igPrimEcoDias, Date dthrSumarioAltaMae,
			String gravidez, Short ectopica) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seqp = seqp;
		this.gesta = gesta;
		this.para = para;
		this.cesarea = cesarea;
		this.aborto = aborto;
		this.dtUltMenstruacao = dtUltMenstruacao;
		this.dtPrimEco = dtPrimEco;
		this.igPrimEco = igPrimEco;
		this.dtInformadaIg = dtInformadaIg;
		this.igAtualSemanas = igAtualSemanas;
		this.igAtualDias = igAtualDias;
		this.dtProvavelParto = dtProvavelParto;
		this.numConsPrn = numConsPrn;
		this.dtPrimConsPrn = dtPrimConsPrn;
		this.indMesmoPai = indMesmoPai;
		this.grupoSanguineoPai = grupoSanguineoPai;
		this.fatorRhPai = fatorRhPai;
		this.obsExames = obsExames;
		this.gemelar = gemelar;
		this.vatCompleta = vatCompleta;
		this.usoMedicamentos = usoMedicamentos;
		this.criadoEm = criadoEm;
		this.pacCodigo = pacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.igPrimEcoDias = igPrimEcoDias;
		this.dthrSumarioAltaMae = dthrSumarioAltaMae;
		this.gravidez = gravidez;
		this.ectopica = ectopica;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoGsoJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "GESTA")
	public Short getGesta() {
		return this.gesta;
	}

	public void setGesta(Short gesta) {
		this.gesta = gesta;
	}

	@Column(name = "PARA")
	public Short getPara() {
		return this.para;
	}

	public void setPara(Short para) {
		this.para = para;
	}

	@Column(name = "CESAREA")
	public Short getCesarea() {
		return this.cesarea;
	}

	public void setCesarea(Short cesarea) {
		this.cesarea = cesarea;
	}

	@Column(name = "ABORTO")
	public Short getAborto() {
		return this.aborto;
	}

	public void setAborto(Short aborto) {
		this.aborto = aborto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_MENSTRUACAO", length = 29)
	public Date getDtUltMenstruacao() {
		return this.dtUltMenstruacao;
	}

	public void setDtUltMenstruacao(Date dtUltMenstruacao) {
		this.dtUltMenstruacao = dtUltMenstruacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PRIM_ECO", length = 29)
	public Date getDtPrimEco() {
		return this.dtPrimEco;
	}

	public void setDtPrimEco(Date dtPrimEco) {
		this.dtPrimEco = dtPrimEco;
	}

	@Column(name = "IG_PRIM_ECO")
	public Short getIgPrimEco() {
		return this.igPrimEco;
	}

	public void setIgPrimEco(Short igPrimEco) {
		this.igPrimEco = igPrimEco;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INFORMADA_IG", length = 29)
	public Date getDtInformadaIg() {
		return this.dtInformadaIg;
	}

	public void setDtInformadaIg(Date dtInformadaIg) {
		this.dtInformadaIg = dtInformadaIg;
	}

	@Column(name = "IG_ATUAL_SEMANAS")
	public Short getIgAtualSemanas() {
		return this.igAtualSemanas;
	}

	public void setIgAtualSemanas(Short igAtualSemanas) {
		this.igAtualSemanas = igAtualSemanas;
	}

	@Column(name = "IG_ATUAL_DIAS")
	public Short getIgAtualDias() {
		return this.igAtualDias;
	}

	public void setIgAtualDias(Short igAtualDias) {
		this.igAtualDias = igAtualDias;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PROVAVEL_PARTO", length = 29)
	public Date getDtProvavelParto() {
		return this.dtProvavelParto;
	}

	public void setDtProvavelParto(Date dtProvavelParto) {
		this.dtProvavelParto = dtProvavelParto;
	}

	@Column(name = "NUM_CONS_PRN")
	public Short getNumConsPrn() {
		return this.numConsPrn;
	}

	public void setNumConsPrn(Short numConsPrn) {
		this.numConsPrn = numConsPrn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PRIM_CONS_PRN", length = 29)
	public Date getDtPrimConsPrn() {
		return this.dtPrimConsPrn;
	}

	public void setDtPrimConsPrn(Date dtPrimConsPrn) {
		this.dtPrimConsPrn = dtPrimConsPrn;
	}

	@Column(name = "IND_MESMO_PAI", length = 1)
	@Length(max = 1)
	public String getIndMesmoPai() {
		return this.indMesmoPai;
	}

	public void setIndMesmoPai(String indMesmoPai) {
		this.indMesmoPai = indMesmoPai;
	}

	@Column(name = "GRUPO_SANGUINEO_PAI", length = 2)
	@Length(max = 2)
	public String getGrupoSanguineoPai() {
		return this.grupoSanguineoPai;
	}

	public void setGrupoSanguineoPai(String grupoSanguineoPai) {
		this.grupoSanguineoPai = grupoSanguineoPai;
	}

	@Column(name = "FATOR_RH_PAI", length = 1)
	@Length(max = 1)
	public String getFatorRhPai() {
		return this.fatorRhPai;
	}

	public void setFatorRhPai(String fatorRhPai) {
		this.fatorRhPai = fatorRhPai;
	}

	@Column(name = "OBS_EXAMES", length = 2000)
	@Length(max = 2000)
	public String getObsExames() {
		return this.obsExames;
	}

	public void setObsExames(String obsExames) {
		this.obsExames = obsExames;
	}

	@Column(name = "GEMELAR", length = 1)
	@Length(max = 1)
	public String getGemelar() {
		return this.gemelar;
	}

	public void setGemelar(String gemelar) {
		this.gemelar = gemelar;
	}

	@Column(name = "VAT_COMPLETA", length = 1)
	@Length(max = 1)
	public String getVatCompleta() {
		return this.vatCompleta;
	}

	public void setVatCompleta(String vatCompleta) {
		this.vatCompleta = vatCompleta;
	}

	@Column(name = "USO_MEDICAMENTOS", length = 240)
	@Length(max = 240)
	public String getUsoMedicamentos() {
		return this.usoMedicamentos;
	}

	public void setUsoMedicamentos(String usoMedicamentos) {
		this.usoMedicamentos = usoMedicamentos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "PAC_CODIGO", nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IG_PRIM_ECO_DIAS")
	public Short getIgPrimEcoDias() {
		return this.igPrimEcoDias;
	}

	public void setIgPrimEcoDias(Short igPrimEcoDias) {
		this.igPrimEcoDias = igPrimEcoDias;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_SUMARIO_ALTA_MAE", length = 29)
	public Date getDthrSumarioAltaMae() {
		return this.dthrSumarioAltaMae;
	}

	public void setDthrSumarioAltaMae(Date dthrSumarioAltaMae) {
		this.dthrSumarioAltaMae = dthrSumarioAltaMae;
	}

	@Column(name = "GRAVIDEZ", length = 3)
	@Length(max = 3)
	public String getGravidez() {
		return this.gravidez;
	}

	public void setGravidez(String gravidez) {
		this.gravidez = gravidez;
	}

	@Column(name = "ECTOPICA")
	public Short getEctopica() {
		return this.ectopica;
	}

	public void setEctopica(Short ectopica) {
		this.ectopica = ectopica;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQP("seqp"),
		GESTA("gesta"),
		PARA("para"),
		CESAREA("cesarea"),
		ABORTO("aborto"),
		DT_ULT_MENSTRUACAO("dtUltMenstruacao"),
		DT_PRIM_ECO("dtPrimEco"),
		IG_PRIM_ECO("igPrimEco"),
		DT_INFORMADA_IG("dtInformadaIg"),
		IG_ATUAL_SEMANAS("igAtualSemanas"),
		IG_ATUAL_DIAS("igAtualDias"),
		DT_PROVAVEL_PARTO("dtProvavelParto"),
		NUM_CONS_PRN("numConsPrn"),
		DT_PRIM_CONS_PRN("dtPrimConsPrn"),
		IND_MESMO_PAI("indMesmoPai"),
		GRUPO_SANGUINEO_PAI("grupoSanguineoPai"),
		FATOR_RH_PAI("fatorRhPai"),
		OBS_EXAMES("obsExames"),
		GEMELAR("gemelar"),
		VAT_COMPLETA("vatCompleta"),
		USO_MEDICAMENTOS("usoMedicamentos"),
		CRIADO_EM("criadoEm"),
		PAC_CODIGO("pacCodigo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IG_PRIM_ECO_DIAS("igPrimEcoDias"),
		DTHR_SUMARIO_ALTA_MAE("dthrSumarioAltaMae"),
		GRAVIDEZ("gravidez"),
		ECTOPICA("ectopica");

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
