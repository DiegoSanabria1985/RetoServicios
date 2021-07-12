#language: es

  Característica: Utilizar un servicio POST para crear usuario

    @regression
    Escenario: enviar información para crear usuario
      Cuando Diego envia información al end point "http://swagger.io/user"

    | id | 0 |
    |username  | DiegoS  |
    |firstName | Diego   |
    |lastName  | Sanabria|
    |email     | diego-sana@hotmail.com|
    |password  | 435362yvv             |
    |phone     | 3103970940            |
    |userStatus| 0                     |

      Entonces Se valida que el servicio es correcto retornando 301

