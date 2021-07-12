#language: es

Característica: Usar un servicio POST de perdida de mascota

  @regression
  Escenario: Registrar la perdida de una mascota

    Cuando Diego envia la información a la url "http://swagger.io/store/order"

  |id      | 13245 |
  |petId   | 2345 |
  |quantity| 2 |
  |shipDate| 2021-07-12T21:17:57.410Z|
  |status  |placed |
  |complete| true |


    Entonces Se valida el servico 301



