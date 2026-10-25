package br.com.boraagendar.cliente.feature.home

import br.com.boraagendar.cliente.core.model.Nicho
import br.com.boraagendar.cliente.core.model.TemplateFluxo

internal val nichosFixos = listOf(
    Nicho(
        id = "salao",
        nome = "Salão de beleza",
        template = TemplateFluxo.SERVICO_COM_PROFISSIONAL,
        corSemente = 0xFFD81B60,
    ),
    Nicho(
        id = "petshop",
        nome = "Petshop",
        template = TemplateFluxo.SERVICO_SOBRE_ITEM_DO_CLIENTE,
        corSemente = 0xFFFB8C00,
    ),
    Nicho(
        id = "quadras",
        nome = "Quadras",
        template = TemplateFluxo.RESERVA_DE_ESPACO,
        corSemente = 0xFF43A047,
    ),
    Nicho(
        id = "escape-room",
        nome = "Escape room",
        template = TemplateFluxo.SESSAO_COM_CAPACIDADE,
        corSemente = 0xFF5E35B1,
    ),
)
