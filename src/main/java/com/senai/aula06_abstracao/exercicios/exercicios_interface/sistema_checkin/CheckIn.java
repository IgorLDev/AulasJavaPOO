package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_checkin;

public interface CheckIn {
    double PESO_MAXIMO = 10; // CONSTANTE

    default String realizarCheckIn(int peso) {
        if (validarCheckIn(peso)) {
            return "Check-In realizado com Sucesso";
        } else {
            return "Check-In falhou, tente novamente";
        }
    }

    private boolean validarCheckIn(int peso){
        return (peso <= PESO_MAXIMO);
    }

    private void validarDocumentos() {
        System.out.println("""
                ----- Validação de Documentos Concluída com Sucesso ----
                | Nome do passageiro: usuario                          |
                | RG: rgUsuario                                        |
                | CPF: cpfUsuario                                      |
                | Número do voo: numeroVoo                             |
                --------------------------------------------------------
                """);
    }

    private void emitirCartaoEmbarque() {
        System.out.println("""
                ----- Emissão Concluída com Sucesso ---------
                | Nome do passageiro: usuario               |
                | Número do voo: numeroVoo                  | 
                | Portão de embarque: portaoEmbarque        |
                | Horário de embarque: horarioEmbarque      |
                | Assento: assento                          | 
                | De: localInicio                           |
                | Para: localDestino                        |
                ---------------------------------------------
                """);
    }

    static void mensagemPadrao() {
        System.out.println("Check-in seguro realizado pela FlySecure");
    }
}