
# Android Recipes

Proyecto Master-Detail simple donde implementar todo lo relacionado con esta tecnología.
Necesitas un **APIKEY** de Chatgpt.

### Arquitectura
Este proyecto utiliza una Clean Architecture, busco separar la lógica en capas para mejorar la modularidad, flexibilidad y mantenibilidad.

Para la interfaz de usuario he combinado el patrón de diseño MVVM (Model-View-ViewModel).

| **Capa**              | **Función** |
| ---                   | ---       |
| **Data**             |    Gestión de datos.      |
| **Di**               |    Inyección de dependencias.    |
| **Domain**           |    Gestión de lógica de negocio.    |
| **Model**            |    Modelos de la aplicación.    |
| **Presentación**     |    Gestión de vistas.    |

## Librerías 
Librerias y herramientas que he utilizado en esta aplicación. 

- **Room:** Base de datos local.

- **Koin:** Inyector de dependencias.

- **Componente Navigation:** Gestión de navegación.

- **ViewBinding:** Acceso a vistas.

- **Live Data:** Gestión de datos.

- **Coroutines:** Asincronía.

- **Retrofit:** Gestión y comunicación con API.

- **OkHttp:** Servicios de red.

- **Gson:** Convertir datos json.

- [Animated Button Bar](https://github.com/Droppers/AnimatedBottomBar): Barra de navegación entre fragments.

## Chatgpt API 

#### Ejemplo

```http
  POST https://api.openai.com/v1/completions
```
#### Headers
| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| Content-Type | application/json |  
| Bearer `api_key` | `string` | **Required**. Your API key |

#### Data
| Parameter | Type     |
| :-------- | :------- | 
| `model` | `string` |  
| `prompt` | `string` | 
| `max_tokens` | `int` | 
| `temperature` | `int` | 


## Autor
El feedback es vital para aprender y mejorar.

Debatir y aportar ideas permite aprender y forjarse en el camino, puedes enviarme un mensaje a mí linkedIn.
- [Pablo Mediero](https://www.linkedin.com/in/pablo-mediero-mart%C3%ADn/)

