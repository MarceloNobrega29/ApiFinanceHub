package br.com.financehub.ApiFinanceHub.dto;

import lombok.Data;

@Data
public class AtualizarSenhaDTO {

    private String emailUsuario;
    private String cpfUsuario;
    private String novaSenha;
}
