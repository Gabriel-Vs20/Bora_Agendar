package br.com.boraagendar.cliente.core.model

data class Nicho(
    val id: String,
    val nome: String,
    val template: TemplateFluxo,
    val corSemente: Long,
)
