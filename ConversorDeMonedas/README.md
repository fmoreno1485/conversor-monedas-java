# 💱 Conversor de Monedas en Java

Aplicación de consola desarrollada en Java que permite convertir montos entre distintas monedas en tiempo real, utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🚀 Tecnologías utilizadas

- Java 11+ (compatible con JDK 17 y JDK 21)
- API HTTP: `HttpClient`, `HttpRequest`, `HttpResponse`
- JSON Parsing: `Gson`
- Sistema de construcción: `Maven`
- IDE recomendado: IntelliJ IDEA 2025.2+

---

## 🖥️ Requisitos

- Java JDK 11 o superior instalado
- Maven instalado o integrado al IDE
- Conexión a internet
- Una clave gratuita de ExchangeRate API

---

## 📦 Instalación y ejecución

1. **Clona el repositorio** o crea un proyecto Maven desde IntelliJ IDEA.
2. **Agrega tu API KEY** en la clase `ApiExchangeRateService.java`, reemplazando `TU_API_KEY`.
3. **Ejecuta el proyecto:**
    - Abre `Principal.java`
    - Haz clic en "Run" o ejecuta desde la terminal con:  
      `mvn compile exec:java -Dexec.mainClass="app.Principal"`

---

## 🧭 Cómo usar

1. Ejecuta `Principal.java`
2. Selecciona una opción del menú:
    - Convertir moneda
    - Salir
3. Ingresa:
    - Código de moneda base (ej. USD)
    - Código de moneda destino (ej. EUR)
    - Monto
4. Recibe el valor convertido en consola.

---

## 🌐 API utilizada

- [ExchangeRate API](https://www.exchangerate-api.com/)
    - Proporciona tasas de conversión actualizadas
    - Necesitas una clave gratuita (free tier)

---

## 📁 Estructura del proyecto

src/
├── app/
│ └── Principal.java
├── modelo/
│ └── RespuestaApi.java
├── servicio/
│ └── ApiExchangeRateService.java

## 📌 Ejemplo de uso

Sea bienvenido/a al Conversor de Moneda

----- MENÚ PRINCIPAL -----

Convertir moneda

Salir
Seleccione una opción: 1
Ingrese la moneda base (por ejemplo, USD): USD
Ingrese la moneda destino (por ejemplo, EUR): EUR
Ingrese el monto a convertir: 100

100.00 USD = 92.50 EUR


---

## ✍️ Autor

- Fernando Moreno
- fermorenoib@gmail.com

---

## 📝 Licencia

Este proyecto es de uso educativo. Puedes modificarlo y distribuirlo libremente con fines no comerciales.

