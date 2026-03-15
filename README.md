# 🛒 Práctica: Carrito de Compras Refactorizado

Este proyecto consiste en la refactorización de un sistema de carrito básico en Java, aplicando principios de **Clean Code** y **SOLID**.

### 🛠️ Mejoras Realizadas:
* **Encapsulamiento:** Atributos de `Item` privados con validaciones de precio.
* **Desacoplamiento:** Separación de la lógica del `Main`, `Carrito` e `Item`.
* **Estructura de Datos:** Uso de `LinkedHashMap` para manejar **cantidades** y mejorar la eficiencia en búsquedas.
* **Excepciones:** Manejo de errores en precios y eliminación de elementos inexistentes.
* **DRY (Don't Repeat Yourself):** Centralización de constantes y uso de `toString()`.

### 📂 Estructura:
- `Item.java`: Modelo del producto.
- `CarritoDeCompras.java`: Lógica de negocio.
- `Main.java`: Punto de entrada del programa.
