# Memoria de Refactorización y Control de Versiones
**Proyecto:** Recuperación RA4 - Ejercicio 02  
**Autor:** Daniel Álamo
**Repositorio:** [Enlace a tu repo de GitHub]

## 1. Configuración del Repositorio (Tarea 1)

[cite_start]Para cumplir con los estándares de desarrollo profesional exigidos, se han realizado las siguientes configuraciones de seguridad y colaboración en GitHub:

### 1.1. Protección de la rama 'master'
Se ha renombrado la rama principal a `master` y se ha aplicado una regla de protección que impide realizar "pushes" directos. [cite_start]Todo cambio debe integrarse mediante una **Pull Request** que requiere resolución de conversaciones.

> **Evidencia de protección de ramas:**
> ![Configuración de Master]([PEGA AQUÍ EL ENLACE O SUBE TU CAPTURA 1.1 RULES])

### 1.2. Colaboradores
[cite_start]Se han añadido miembros al equipo como colaboradores para simular un entorno de trabajo real y permitir la revisión de código.

> **Evidencia de colaboradores:**
> ![Lista de Colaboradores]([PEGA AQUÍ TU CAPTURA 2 COLABORATORS])

---

## 2. Identificación de Patrones de Refactorización (Tarea 2)

Tras analizar el código fuente original `Ejercicio02.java`, se han identificado tres áreas críticas que afectan a la calidad del software (Clean Code). [cite_start]A continuación, se justifican los patrones aplicados:

### Patrón 1: Replace Magic Number with Symbolic Constant
* **Problema:** El código utiliza el valor literal `0.15` directamente en la lógica del cálculo del descuento. Esto se conoce como un "número mágico", ya que no explica qué representa ese valor.
* **Justificación:** Se sustituye por la constante `PORCENTAJE_DESCUENTO_VIP`. Esto mejora la **legibilidad** (el programador entiende qué es ese 15%) y la **mantenibilidad** (si el descuento cambia, solo se modifica en un lugar).

### Patrón 2: Extract Method (Extraer Método)
* **Problema:** El método `procesarCompra` realiza dos tareas lógicas distintas: calcular el subtotal inicial (`precio * cantidad`) y gestionar el flujo del descuento VIP. Esto viola el **Principio de Responsabilidad Única (SRP)**.
* **Justificación:** Se extrae el cálculo `precio * cantidad` al método `calcularSubtotal()`. Esto permite que el código sea más **modular**, facilita las pruebas unitarias y simplifica la comprensión del flujo principal.

### Patrón 3: Rename (Renombrar)
* **Problema:** Los nombres actuales de la clase (`Ejercicio02`) y de parámetros como `precio` son genéricos y no siguen las convenciones de nomenclatura semántica de Java.
* **Justificación:** Se renombra la clase a `ProcesadorPedidos` y las variables a nombres más descriptivos como `precioUnitario`. Un buen nombre elimina la necesidad de comentarios adicionales, haciendo que el código sea **autodocumentado**.

---

## 3. Implementación de Refactorizaciones (Tarea 3)

[cite_start]La implementación se ha llevado a cabo utilizando las herramientas automáticas de refactorización de **Eclipse** para minimizar errores humanos. [cite_start]Cada cambio se ha realizado en una rama de trabajo independiente (`feature/xx`).

> **Evidencia del uso del IDE (Menú Refactor):**
> [INSERTAR CAPTURA DE PANTALLA DE ECLIPSE USANDO 'EXTRACT METHOD' O 'RENAME']

---

## 4. Conclusión
[cite_start]La aplicación de estos patrones transforma un código rígido y difícil de leer en una solución flexible, escalable y profesional, cumpliendo con los objetivos de optimización y documentación del módulo de Entornos de Desarrollo.
