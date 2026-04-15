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

La implementación se ha llevado a cabo utilizando las herramientas automáticas de refactorización de **Eclipse** para minimizar errores humanos. Cada cambio se ha realizado en una rama de trabajo independiente.

> **Evidencia del uso del IDE (Menú Refactor):**
<img width="1863" height="615" alt="Extract Constant" src="https://github.com/user-attachments/assets/937cbe2b-dfd4-465e-ac23-236041c2a59a" />

<img width="1863" height="615" alt="Extract Method" src="https://github.com/user-attachments/assets/39b0d612-d17a-4c45-8c43-09f239cad412" />

<img width="590" height="307" alt="Rename Class" src="https://github.com/user-attachments/assets/203c4dcd-8887-491e-b6f9-66a17680ec11" />

---

## 4. Generación de Documentación Técnica (Tarea 4)

Se ha procedido a documentar la clase `CalculadoraPedido` utilizando el estándar **Javadoc**. 

* **Proceso:** Se han añadido etiquetas `@param`, `@return` y `@author` en el código fuente.
* **Resultado:** Se ha exportado la documentación en formato HTML, la cual se encuentra alojada en la carpeta `/doc` de este repositorio para su consulta.

---

## 5. Conclusión
La aplicación de estos patrones transforma un código rígido y difícil de leer en una solución flexible, escalable y profesional, cumpliendo con los objetivos de optimización y documentación del módulo de Entornos de Desarrollo.
