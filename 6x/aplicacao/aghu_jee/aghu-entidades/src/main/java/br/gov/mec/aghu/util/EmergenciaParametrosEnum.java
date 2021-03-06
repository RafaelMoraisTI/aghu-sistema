package br.gov.mec.aghu.util;

@SuppressWarnings("PMD.CyclomaticComplexity")
public enum EmergenciaParametrosEnum {

	ANO_CORRENTE, // ANO CORRENTE UPS_PLANEJAMENTOSADO COMO COMPLEMENTO DO NÚMERO DO DOCUMENTO DA LICITAÇÃO E DO EDITAL
	GRPO_MAT_ORT_PROT, // GRUPO ORTESES E PROTESES
	P_AACG_SEM_REGRA, //Parâmetro com o perfil de usuário do sistema que não tem regras atreladas ao marcar uma consulta.
	P_ACAO_ADMIN_AGH, // CÓDIGO DA AÇÃO "ADMINISTRAÇÃO DO AGH" A QUAL PERMITE ACESSO LIVRE.
	P_ACAO_LIBERAR_PRIM_CONSULTA, // Valor da AÇÃO de liberar primeira consulta
	P_POSSIVEL_ALTERAR_SENHA,
	P_MANTER_SENHA_CRIPTOGRAFADA,
	P_TEMPO_SESSAO_MINUTOS,
	P_EMAIL_ENVIO,
	P_URL_ACESSO_AGHUPERINATOLOGIA,
	P_AGHU_PARAMETRO_HU,
	P_TAM_ARQUIVO_UPLOAD, //TAMANHO MÁXIMO DE ARQUIVO ACEITO NO MODELO DE DOCUMENTO #29305
	P_AGHU_UNIDADE_PAI_EMERGENCIA,
	P_INTERV_CONSULTA_DIA,
	P_CONSISTE_ENC_X_GRV,
	P_PAGADOR_SUS,
	P_TAG_DEMANDA,
	P_COND_AT_EMERG,
	P_CONVENIO_SUS_PADRAO, 
	P_SUS_PLANO_AMBULATORIO,
	P_CAPAC_ATD_PAC_EME,
	P_TEMPO_INICIAR_CALC_CAPAC,
	P_TEMPO_ANTECIP_ATD_CONS,
	P_IDADE_TRG_PEDIATRICA,
	P_UNF_EME_PEDIATRICA,
	P_UNF_EME_ADULTO,
	P_UNID_FUNC_EMERGENCIA_OBSTETRICA,
	P_MTVO_CHECK_OUT_CONS,
	P_AGHU_GRAV_IMP_FORM_ENC_EXTERNO,
	P_SIT_OBSERVACAO,
	P_DESBLOQUEIA_EXCLUI,
	P_DIAS_NOTAS_ADICIONAIS,
	P_AGHU_CHECKOUT_EMERGENCIA,
	P_AGHU_INTEGRACAO_AGH_ORACLE_WEBFORMS,
	P_URL_BASE_AGH_ORACLE_WEBFORMS,
	P_CAMINHO_ATENDER_AGH_EMER,
	P_CAMINHO_ATENDER_AGH_EMER_OBST,
	P_CAMINHO_ATENDER_AGHU_EMER_OBST,
	P_SEQ_PROC_RG_CONS,
	P_SEQ_PROC_EVO_AMB,
	P_SEQ_PROC_MOE_EMG,
	P_SIT_CONSULTA,
	P_BANCO_AGHU_AGHWEB,
	P_AGHU_IMP_FORM_ENC_EXTERNO, 
	P_SIT_INTERNACAO,
	P_DIAS_CONSISTE_DATA,
	P_EXAME_VDRL,
	P_CONSELHO_PROFISSIONAL_MED_SOLIC,
	P_CBO_ANESTESIOLOGISTA,
	P_HABILITA_CERTIF,
	P_CARATER_INTERNACAO_AUTOMATICA,
	P_CONVENIO_INTERNACAO_AUTOMATICA,
	P_PLANO_INTERNACAO_AUTOMATICA,
	P_ORIGEM_INTERNACAO_AUTOMATICA,
	P_UNIDADE_OBSTETRICA_INTERNACAO_AUTOMATICA,
	P_UNIDADE_INT_OBS,
	P_UNIDADE_ALOJ_CJTO,	
	P_CCUSTO_NEONATOLOGIA,
	P_CCUSTO_PEDIATRIA,
	P_SITUACAO_AGENDADO,
	P_SITUACAO_LIBERADO,
	P_SITUACAO_EXECUTANDO,
	P_SITUACAO_NA_AREA_EXECUTORA,
	P_SITUACAO_EXECUTADO,
	P_TEMPERATURA_SALA_PARTO_MIN,
	P_TEMPERATURA_SALA_PARTO_MAX,
	P_TEMPO_CLAMPEAMENTO, P_SIT_PUERPERIO
	;
	
	// Parametros que contem caracteres especiais:
	@Override
	@SuppressWarnings("PMD.ExcessiveMethodLength")
	public String toString() {
			return this.name();
	}
	
}
