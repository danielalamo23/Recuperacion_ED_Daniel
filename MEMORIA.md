# Memoria de Refactorización y Control de Versiones
**Proyecto:** Recuperación RA4 - Ejercicio 02  
**Autor:** Daniel Álamo  
**Repositorio:** https://github.com/danielalamo23/Recuperacion_ED_Daniel

## 1. Configuración del Repositorio (Tarea 1)

Para cumplir con los estándares de desarrollo profesional exigidos, se han realizado las siguientes configuraciones de seguridad y colaboración en GitHub:

### 1.1. Protección de la rama 'master'
Se ha renombrado la rama principal a `master` y se ha aplicado una regla de protección que impide realizar "pushes" directos. Todo cambio debe integrarse mediante una **Pull Request** que requiere resolución de conversaciones.

> **Evidencia de protección de ramas:**

> <img width="920" height="692" alt="Captura1Rules" src="https://github.com/user-attachments/assets/5ad1ae5a-2cb8-4677-9b05-47971301bccd" />
> <img width="1887" height="463" alt="Captura1 1Rules" src="https://github.com/user-attachments/assets/1fb868ab-8fe0-4b87-95c2-51a59244d0fd" />


### 1.2. Colaboradores
Se han añadido miembros al equipo como colaboradores para simular un entorno de trabajo real y permitir la revisión de código.

> **Evidencia de colaboradores:**
<img width="1863" height="615" alt="Captura2Colaborators" src="https://github.com/user-attachments/assets/f57c9250-88c9-4352-8946-4cf547e0b720" />


---

## 2. Identificación de Patrones de Refactorización (Tarea 2)

Tras analizar el código fuente original `Ejercicio02.java`, se han identificado tres áreas críticas que afectan a la calidad del software (Clean Code). A continuación, se justifican los patrones aplicados:

### Patrón 1: Replace Magic Number with Symbolic Constant
* **Problema:** El código utiliza el valor literal `0.15` directamente en la lógica del cálculo del descuento. Esto es un "número mágico".
* **Justificación:** Se sustituye por la constante `PORCENTAJE_DESCUENTO_VIP`. Esto mejora la **legibilidad** y la **mantenibilidad**.

### Patrón 2: Extract Method (Extraer Método)
* **Problema:** El método `procesarCompra` realiza dos tareas distintas: calcular el subtotal y gestionar el descuento. Esto viola el **Principio de Responsabilidad Única (SRP)**.
* **Justificación:** Se extrae el cálculo `precio * cantidad` al método `calcularSubtotal()`. Esto permite que el código sea más **modular**.

### Patrón 3: Rename (Renombrar)
* **Problema:** El nombre original de la clase (`Ejercicio02`) no era descriptivo.
* **Justificación:** Se renombra a `CalculadoraPedido` para que el código sea **autodocumentado**.

---

## 3. Implementación de Refactorizaciones (Tarea 3)

Se han aplicado tres patrones de refactorización utilizando las herramientas automáticas de **Eclipse IDE**. A continuación se muestran las evidencias del proceso:

### 3.1. Patrón: Extract Constant (Extracción de Constante)
Se ha extraído el valor literal `0.15` para crear la constante `PORCENTAJE_DESCUENTO_VIP`, evitando así el uso de "números mágicos" y mejorando el mantenimiento del código.

> **Evidencia del proceso en Eclipse:**
<img width="597" height="346" alt="Captura3Refactorizacion1_015" src="https://github.com/user-attachments/assets/24008a02-5209-475e-bf96-86b72819042b" />


---

### 3.2. Patrón: Extract Method (Extracción de Método)
Se ha seleccionado la lógica del cálculo del subtotal (`precio * cantidad`) para extraerla a un nuevo método privado llamado `calcularSubtotal`, mejorando la modularidad de la clase.

> **Evidencia del proceso en Eclipse:**
<img width="587" height="702" alt="Captura4Refactorizacion2Precio" src="https://github.com/user-attachments/assets/785ddc1e-7574-4dfc-a40f-dc514c82f2b1" />


---

### 3.3. Patrón: Rename (Cambio de Nombre)
Se ha modificado el nombre de la clase original `Ejercicio02` por `CalculadoraPedido`. El IDE se ha encargado de actualizar todas las referencias automáticamente.

> **Evidencia del proceso en Eclipse:**
<img width="590" height="307" alt="Captura5Refactorizacion3Nombre" src="https://github.com/user-attachments/assets/412f9542-c85e-400f-ae17-01cd294a7543" />



---

## 4. Generación de Documentación Técnica (Tarea 4)

Se ha procedido a documentar la clase `CalculadoraPedido` utilizando el estándar **Javadoc**. 

* **Proceso:** Se han añadido etiquetas `@param`, `@return` y `@author` en el código fuente.
* **Resultado:** Se ha exportado la documentación en formato HTML, la cual se encuentra alojada en la carpeta `/doc` de este repositorio para su consulta.

---

## 5. Conclusión
La aplicación de estos patrones transforma un código rígido y difícil de leer en una solución flexible, escalable y profesional, cumpliendo con los objetivos de optimización y documentación del módulo de Entornos de Desarrollo.
