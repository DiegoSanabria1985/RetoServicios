#language: es

Característica: Utilizar un servicio POST perdida de mascota

@regression1
Escenario registra la perdida de su mascota
Cuando Diego envia información al para el end point "http://swagger.io/store/order"

Entonces Se valida que el servicio es correcto cuando devuelve 301

  Y Se valida que el servicio es correcto