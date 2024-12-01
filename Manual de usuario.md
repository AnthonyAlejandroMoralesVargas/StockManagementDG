# Manual de Usuario: Stock Management

## **Alcance del aplicativo**
1. Registrar información sobre acciones compradas.
2. Consultar precios actuales e históricos utilizando la API de Alpha Vantage.
3. Calcular ganancias, pérdidas y balances de tu inversión.
4. Visualizar la información en un panel de control amigable.
 
## **Requisitos del Sistema**

1. Sistema Operativo: Windows, macOS o Linux.
2. Java: Versión 22.
3. Conexión a Internet: Requerida para consultar la API de Alpha Vantage.
4. API Key: Clave API de Alpha Vantage (disponible en Alpha Vantage).

## **Interfaz Principal**

La interfaz de Stock Management se divide en varias secciones principales:

**Encabezado**
  - **Título:** "STOCK MANAGER".
**Formulario de Registro de Acciones**
**Campos**
  - Symbol: Desplegable para seleccionar el símbolo de la acción (ejemplo: AAPL para Apple).
  - Purchase Price: Campo de texto para ingresar el precio de compra por acción.
  - Quantity: Campo de texto para ingresar la cantidad de acciones adquiridas.
  - Purchase Date: Campo de texto para ingresar la fecha de compra en formato dd/mm/yyyy.
  - Botón Save: Procesa los datos ingresados en el formulario.
**Sección "My Stock"**
Una tabla que muestra la información de las acciones registradas, con las siguientes columnas:
  - Stock Name: Nombre o símbolo de la acción.
  - Quantity: Cantidad de acciones.
  - Purchase Date: Fecha de compra.
  - Purchase Price: Precio de compra por acción.
  - Current Date: Fecha actual.
  - Current Price: Precio actual de la acción.
  - Unit Gain: Ganancia por unidad.
  - Unit Percentage: Porcentaje de ganancia por unidad.
  - Total Balance: Saldo total actual.
  - Total Gain: Ganancia total.
  - Botón Refresh: Actualiza la tabla con las últimas acciones registradas.

## **Registrar una Acción**
Ingresa los datos en el formulario, de modo que:

Symbol: Símbolo de la acción (ejemplo: MSFT para Microsoft).
Purchase Price: Precio de compra (ejemplo: 150.25).
Quantity: Cantidad de acciones (ejemplo: 10).
Purchase Date: Fecha de compra (ejemplo: 01/01/2023).
Haz clic en el botón Save.

Revisa los resultados en la tabla.























