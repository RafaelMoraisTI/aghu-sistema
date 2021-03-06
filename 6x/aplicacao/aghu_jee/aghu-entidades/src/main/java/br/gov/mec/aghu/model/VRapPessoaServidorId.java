package br.gov.mec.aghu.model;

// Generated 28/03/2011 14:28:14 by Hibernate Tools 3.3.0.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VRapPessoaServidorId generated by hbm2java
 */

@Embeddable
public class VRapPessoaServidorId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4960849488349580938L;
	private Integer pesCodigo;
	private Short serVinCodigo;
	private Integer serMatricula;
	private String vinDescricao;
	private String nome;
	private Date dtNascimento;
	private Date dtFimVinculo;
	private String nomeUsual;
	private String sexo;
	private String ocaCarCodigo;
	private Integer ocaCodigo;
	private Integer cctCodigo;
	private Integer cctCodigoAtua;
	private String indSituacao;
	private Long foneCelular;
	private Long foneResidencial;
	private Long fonePagerBip;
	private Date dtInicioVinculo;
	private Integer turno;
	private Short ramNroRamal;
	private Long cpf;
	private Integer cctCodigoDesempenho;

	public VRapPessoaServidorId() {
	}

	public VRapPessoaServidorId(Integer pesCodigo, Short serVinCodigo,
			Integer serMatricula, String vinDescricao, String nome,
			Date dtNascimento, String sexo, Date dtInicioVinculo) {
		this.pesCodigo = pesCodigo;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
		this.vinDescricao = vinDescricao;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.dtInicioVinculo = dtInicioVinculo;
	}

	public VRapPessoaServidorId(Integer pesCodigo, Short serVinCodigo,
			Integer serMatricula, String vinDescricao, String nome,
			Date dtNascimento, Date dtFimVinculo, String nomeUsual,
			String sexo, String ocaCarCodigo, Integer ocaCodigo,
			Integer cctCodigo, Integer cctCodigoAtua, String indSituacao,
			Long foneCelular, Long foneResidencial, Long fonePagerBip,
			Date dtInicioVinculo, Integer turno, Short ramNroRamal, Long cpf,
			Integer cctCodigoDesempenho) {
		this.pesCodigo = pesCodigo;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
		this.vinDescricao = vinDescricao;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.dtFimVinculo = dtFimVinculo;
		this.nomeUsual = nomeUsual;
		this.sexo = sexo;
		this.ocaCarCodigo = ocaCarCodigo;
		this.ocaCodigo = ocaCodigo;
		this.cctCodigo = cctCodigo;
		this.cctCodigoAtua = cctCodigoAtua;
		this.indSituacao = indSituacao;
		this.foneCelular = foneCelular;
		this.foneResidencial = foneResidencial;
		this.fonePagerBip = fonePagerBip;
		this.dtInicioVinculo = dtInicioVinculo;
		this.turno = turno;
		this.ramNroRamal = ramNroRamal;
		this.cpf = cpf;
		this.cctCodigoDesempenho = cctCodigoDesempenho;
	}

	@Column(name = "PES_CODIGO", nullable = false, precision = 9, scale = 0)
	public Integer getPesCodigo() {
		return this.pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "VIN_DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getVinDescricao() {
		return this.vinDescricao;
	}

	public void setVinDescricao(String vinDescricao) {
		this.vinDescricao = vinDescricao;
	}

	@Column(name = "NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "DT_NASCIMENTO", nullable = false, length = 7)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "DT_FIM_VINCULO", length = 7)
	public Date getDtFimVinculo() {
		return this.dtFimVinculo;
	}

	public void setDtFimVinculo(Date dtFimVinculo) {
		this.dtFimVinculo = dtFimVinculo;
	}

	@Column(name = "NOME_USUAL", length = 15)
	@Length(max = 15)
	public String getNomeUsual() {
		return this.nomeUsual;
	}

	public void setNomeUsual(String nomeUsual) {
		this.nomeUsual = nomeUsual;
	}

	@Column(name = "SEXO", nullable = false, length = 1)
	@Length(max = 1)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "OCA_CAR_CODIGO", length = 10)
	@Length(max = 10)
	public String getOcaCarCodigo() {
		return this.ocaCarCodigo;
	}

	public void setOcaCarCodigo(String ocaCarCodigo) {
		this.ocaCarCodigo = ocaCarCodigo;
	}

	@Column(name = "OCA_CODIGO", precision = 5, scale = 0)
	public Integer getOcaCodigo() {
		return this.ocaCodigo;
	}

	public void setOcaCodigo(Integer ocaCodigo) {
		this.ocaCodigo = ocaCodigo;
	}

	@Column(name = "CCT_CODIGO")
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "CCT_CODIGO_ATUA", precision = 6, scale = 0)
	public Integer getCctCodigoAtua() {
		return this.cctCodigoAtua;
	}

	public void setCctCodigoAtua(Integer cctCodigoAtua) {
		this.cctCodigoAtua = cctCodigoAtua;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "FONE_CELULAR", precision = 10, scale = 0)
	public Long getFoneCelular() {
		return this.foneCelular;
	}

	public void setFoneCelular(Long foneCelular) {
		this.foneCelular = foneCelular;
	}

	@Column(name = "FONE_RESIDENCIAL", precision = 10, scale = 0)
	public Long getFoneResidencial() {
		return this.foneResidencial;
	}

	public void setFoneResidencial(Long foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	@Column(name = "FONE_PAGER_BIP", precision = 10, scale = 0)
	public Long getFonePagerBip() {
		return this.fonePagerBip;
	}

	public void setFonePagerBip(Long fonePagerBip) {
		this.fonePagerBip = fonePagerBip;
	}

	@Column(name = "DT_INICIO_VINCULO", nullable = false, length = 7)
	public Date getDtInicioVinculo() {
		return this.dtInicioVinculo;
	}

	public void setDtInicioVinculo(Date dtInicioVinculo) {
		this.dtInicioVinculo = dtInicioVinculo;
	}

	@Column(name = "TURNO", precision = 5, scale = 0)
	public Integer getTurno() {
		return this.turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	@Column(name = "RAM_NRO_RAMAL", precision = 4, scale = 0)
	public Short getRamNroRamal() {
		return this.ramNroRamal;
	}

	public void setRamNroRamal(Short ramNroRamal) {
		this.ramNroRamal = ramNroRamal;
	}

	@Column(name = "CPF", precision = 12, scale = 0)
	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Column(name = "CCT_CODIGO_DESEMPENHO")
	public Integer getCctCodigoDesempenho() {
		return this.cctCodigoDesempenho;
	}

	public void setCctCodigoDesempenho(Integer cctCodigoDesempenho) {
		this.cctCodigoDesempenho = cctCodigoDesempenho;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		if ((other == null)){
			return false;
		}
		if (!(other instanceof VRapPessoaServidorId)){
			return false;
		}
		VRapPessoaServidorId castOther = (VRapPessoaServidorId) other;

		return (this.getPesCodigo() == castOther.getPesCodigo())
				&& (this.getSerVinCodigo() == castOther.getSerVinCodigo())
				&& (this.getSerMatricula() == castOther.getSerMatricula())
				&& ((this.getVinDescricao() == castOther.getVinDescricao()) || (this
						.getVinDescricao() != null
						&& castOther.getVinDescricao() != null && this
						.getVinDescricao().equals(castOther.getVinDescricao())))
				&& ((this.getNome() == castOther.getNome()) || (this.getNome() != null
						&& castOther.getNome() != null && this.getNome()
						.equals(castOther.getNome())))
				&& ((this.getDtNascimento() == castOther.getDtNascimento()) || (this
						.getDtNascimento() != null
						&& castOther.getDtNascimento() != null && this
						.getDtNascimento().equals(castOther.getDtNascimento())))
				&& ((this.getDtFimVinculo() == castOther.getDtFimVinculo()) || (this
						.getDtFimVinculo() != null
						&& castOther.getDtFimVinculo() != null && this
						.getDtFimVinculo().equals(castOther.getDtFimVinculo())))
				&& ((this.getNomeUsual() == castOther.getNomeUsual()) || (this
						.getNomeUsual() != null
						&& castOther.getNomeUsual() != null && this
						.getNomeUsual().equals(castOther.getNomeUsual())))
				&& ((this.getSexo() == castOther.getSexo()) || (this.getSexo() != null
						&& castOther.getSexo() != null && this.getSexo()
						.equals(castOther.getSexo())))
				&& ((this.getOcaCarCodigo() == castOther.getOcaCarCodigo()) || (this
						.getOcaCarCodigo() != null
						&& castOther.getOcaCarCodigo() != null && this
						.getOcaCarCodigo().equals(castOther.getOcaCarCodigo())))
				&& ((this.getOcaCodigo() == castOther.getOcaCodigo()) || (this
						.getOcaCodigo() != null
						&& castOther.getOcaCodigo() != null && this
						.getOcaCodigo().equals(castOther.getOcaCodigo())))
				&& ((this.getCctCodigo() == castOther.getCctCodigo()) || (this
						.getCctCodigo() != null
						&& castOther.getCctCodigo() != null && this
						.getCctCodigo().equals(castOther.getCctCodigo())))
				&& ((this.getCctCodigoAtua() == castOther.getCctCodigoAtua()) || (this
						.getCctCodigoAtua() != null
						&& castOther.getCctCodigoAtua() != null && this
						.getCctCodigoAtua()
						.equals(castOther.getCctCodigoAtua())))
				&& ((this.getIndSituacao() == castOther.getIndSituacao()) || (this
						.getIndSituacao() != null
						&& castOther.getIndSituacao() != null && this
						.getIndSituacao().equals(castOther.getIndSituacao())))
				&& ((this.getFoneCelular() == castOther.getFoneCelular()) || (this
						.getFoneCelular() != null
						&& castOther.getFoneCelular() != null && this
						.getFoneCelular().equals(castOther.getFoneCelular())))
				&& ((this.getFoneResidencial() == castOther
						.getFoneResidencial()) || (this.getFoneResidencial() != null
						&& castOther.getFoneResidencial() != null && this
						.getFoneResidencial().equals(
								castOther.getFoneResidencial())))
				&& ((this.getFonePagerBip() == castOther.getFonePagerBip()) || (this
						.getFonePagerBip() != null
						&& castOther.getFonePagerBip() != null && this
						.getFonePagerBip().equals(castOther.getFonePagerBip())))
				&& ((this.getDtInicioVinculo() == castOther
						.getDtInicioVinculo()) || (this.getDtInicioVinculo() != null
						&& castOther.getDtInicioVinculo() != null && this
						.getDtInicioVinculo().equals(
								castOther.getDtInicioVinculo())))
				&& ((this.getTurno() == castOther.getTurno()) || (this
						.getTurno() != null && castOther.getTurno() != null && this
						.getTurno().equals(castOther.getTurno())))
				&& ((this.getRamNroRamal() == castOther.getRamNroRamal()) || (this
						.getRamNroRamal() != null
						&& castOther.getRamNroRamal() != null && this
						.getRamNroRamal().equals(castOther.getRamNroRamal())))
				&& ((this.getCpf() == castOther.getCpf()) || (this.getCpf() != null
						&& castOther.getCpf() != null && this.getCpf().equals(
						castOther.getCpf())))
				&& ((this.getCctCodigoDesempenho() == castOther
						.getCctCodigoDesempenho()) || (this
						.getCctCodigoDesempenho() != null
						&& castOther.getCctCodigoDesempenho() != null && this
						.getCctCodigoDesempenho().equals(
								castOther.getCctCodigoDesempenho())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPesCodigo();
		result = 37 * result + this.getSerVinCodigo();
		result = 37 * result + this.getSerMatricula();
		result = 37
				* result
				+ (getVinDescricao() == null ? 0 : this.getVinDescricao()
						.hashCode());
		result = 37 * result
				+ (getNome() == null ? 0 : this.getNome().hashCode());
		result = 37
				* result
				+ (getDtNascimento() == null ? 0 : this.getDtNascimento()
						.hashCode());
		result = 37
				* result
				+ (getDtFimVinculo() == null ? 0 : this.getDtFimVinculo()
						.hashCode());
		result = 37 * result
				+ (getNomeUsual() == null ? 0 : this.getNomeUsual().hashCode());
		result = 37 * result
				+ (getSexo() == null ? 0 : this.getSexo().hashCode());
		result = 37
				* result
				+ (getOcaCarCodigo() == null ? 0 : this.getOcaCarCodigo()
						.hashCode());
		result = 37 * result
				+ (getOcaCodigo() == null ? 0 : this.getOcaCodigo().hashCode());
		result = 37 * result
				+ (getCctCodigo() == null ? 0 : this.getCctCodigo().hashCode());
		result = 37
				* result
				+ (getCctCodigoAtua() == null ? 0 : this.getCctCodigoAtua()
						.hashCode());
		result = 37
				* result
				+ (getIndSituacao() == null ? 0 : this.getIndSituacao()
						.hashCode());
		result = 37
				* result
				+ (getFoneCelular() == null ? 0 : this.getFoneCelular()
						.hashCode());
		result = 37
				* result
				+ (getFoneResidencial() == null ? 0 : this.getFoneResidencial()
						.hashCode());
		result = 37
				* result
				+ (getFonePagerBip() == null ? 0 : this.getFonePagerBip()
						.hashCode());
		result = 37
				* result
				+ (getDtInicioVinculo() == null ? 0 : this.getDtInicioVinculo()
						.hashCode());
		result = 37 * result
				+ (getTurno() == null ? 0 : this.getTurno().hashCode());
		result = 37
				* result
				+ (getRamNroRamal() == null ? 0 : this.getRamNroRamal()
						.hashCode());
		result = 37 * result
				+ (getCpf() == null ? 0 : this.getCpf().hashCode());
		result = 37
				* result
				+ (getCctCodigoDesempenho() == null ? 0 : this
						.getCctCodigoDesempenho().hashCode());
		return result;
	}

}
