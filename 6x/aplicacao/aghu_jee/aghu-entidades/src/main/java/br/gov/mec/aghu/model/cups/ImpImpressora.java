package br.gov.mec.aghu.model.cups;

// Generated 15/09/2010 17:28:14 by Hibernate Tools 3.3.0.GA

import java.util.Set;

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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioTipoCups;
import br.gov.mec.aghu.dominio.DominioTipoImpressoraCups;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * ImpImpressora generated by hbm2java
 */
@Entity
@Table(name = "IMP_IMPRESSORA", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "FILA_IMPRESSORA"))
@SequenceGenerator(name = "impImpressoraSq1", sequenceName = "AGH.IMP_IMPRESSORA_SQ1", allocationSize = 1)
public class ImpImpressora extends BaseEntityId<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = -5809528920339880024L;
	
	private Integer id;
	private ImpImpressora impRedireciona;
	private String filaImpressora;
	private DominioTipoImpressoraCups tipoImpressora;
	private DominioTipoCups tipoCups;
	private ImpServidorCups impServidorCups;
	private String descricao;
	private String localizacao;
	private Integer version;

	public ImpImpressora() {
	}

	public ImpImpressora(Integer id, String filaImpressora, DominioTipoImpressoraCups tipoImpressora, DominioTipoCups tipoCups,
			String descricao, String localizacao ) {
		this.id = id;
		this.filaImpressora = filaImpressora;
		this.tipoImpressora = tipoImpressora;
		this.tipoCups = tipoCups;
		this.descricao = descricao;
		this.localizacao = localizacao;
	}

	public ImpImpressora(Integer id, ImpImpressora impRedireciona,
			String filaImpressora, DominioTipoImpressoraCups tipoImpressora, DominioTipoCups tipoCups, 
			ImpServidorCups impServidorCups, String descricao, 
			String localizacao, Set<ImpImpressora> impImpressoras, Set<ImpServidorCups> impServidorCupss ) {
		this.id = id;
		this.impRedireciona = impRedireciona;
		this.filaImpressora = filaImpressora;
		this.tipoImpressora = tipoImpressora;
		this.tipoCups = tipoCups;
		this.impServidorCups = impServidorCups;
		this.descricao = descricao;
		this.localizacao = localizacao;
		//this.impImpressoras = impImpressoras;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "impImpressoraSq1")
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_REDIRECIONA")
	public ImpImpressora getImpRedireciona() {
		return this.impRedireciona;
	}

	public void setImpRedireciona(ImpImpressora impRedireciona) {
		this.impRedireciona = impRedireciona;
	}

	@Column(name = "FILA_IMPRESSORA", unique = true, nullable = false, length = 30)
	@Length(max = 30)
	public String getFilaImpressora() {
		return this.filaImpressora;
	}
	
	public void setFilaImpressora(String filaImpressora) {
		this.filaImpressora = filaImpressora;
	}

	@Column(name = "TIPO_IMPRESSORA", nullable = false, length = 2)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioTipoImpressoraCups") }, type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType")
	public DominioTipoImpressoraCups getTipoImpressora() {
		return this.tipoImpressora;
	}

	public void setTipoImpressora(DominioTipoImpressoraCups tipoImpressora) {
		this.tipoImpressora = tipoImpressora;
	}

	@Column(name = "TIPO_CUPS", nullable = false, length = 3)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioTipoCups") }, type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType")
	public DominioTipoCups getTipoCups() {
		return tipoCups;
	}

	public void setTipoCups(DominioTipoCups tipoCups) {
		this.tipoCups = tipoCups;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( @JoinColumn(name = "ID_SERVIDOR_CUPS", nullable = false))
	public ImpServidorCups getImpServidorCups() {
		return this.impServidorCups;
	}

	public void setImpServidorCups(ImpServidorCups impServidorCups) {
		this.impServidorCups = impServidorCups;
	}
	
	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}
		
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "LOCALIZACAO", length = 500)
	@Length(max = 500)
	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String toString() {
		return new ToStringBuilder(this).append("id", this.getId()).toString();
	}
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "impImpressora")
//	public Set<ImpImpressora> getImpImpressoras() {
//		return this.impImpressoras;
//	}
//
//	public void setImpImpressoras(Set<ImpImpressora> impImpressoras) {
//		this.impImpressoras = impImpressoras;
//	}
	
	public enum Fields {
		ID ("id"), FILA("filaImpressora"), TIPO("tipoImpressora"), DESCRICAO("descricao"), REDIRECIONAMENTO("impRedireciona.id"), IMPRESSORA_REDIRECIONAMENTO("impRedireciona"),
		SERVIDOR_CUPS("impServidorCups");
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@Version
	@Column(name = "version", nullable = false)	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
