# Memoria de la Práctica: Refactorización y Control de Versiones (Recuperación)
**Alumno:** Daniel Álamo  
**Proyecto:** Calculadora de Pedidos (Refactorización del Ejercicio 02)  
**Repositorio:** [https://github.com/danielalamo23/Recuperacion_ED_Daniel](https://github.com/danielalamo23/Recuperacion_ED_Daniel)

---

## 1. Configuración del Repositorio en GitHub
Nada más empezar, lo primero fue montar el repositorio para que no fuera un caos. En clase nos han dicho que en las empresas no se puede subir código a lo loco, así que configuré todo para que fuera seguro desde el minuto uno.

### 1.1. Protección de la rama 'master'
Para no cargarme el código principal por un despiste, puse unas reglas de protección. Básicamente, bloqueé la rama `master` para que nadie pueda hacer cambios sin permiso.

> **¿Qué se ve en estas capturas?**
> Aquí podéis ver el panel de "Settings" de GitHub. Activé el check de "Require a pull request before merging". Esto me obligó a trabajar siempre con ramas y a revisar los cambios antes de aceptarlos. Es como una red de seguridad para no meter la pata y asegurar que lo que llega a la rama principal funciona de verdad.
> <img width="920" height="692" alt="Reglas de Protección" src="https://github.com/user-attachments/assets/5ad1ae5a-2cb8-4677-9b05-47971301bccd" />
> <img width="1887" height="463" alt="Configuración de Master" src="https://github.com/user-attachments/assets/1fb868ab-8fe0-4b87-95c2-51a59244d0fd" />

### 1.2. Añadir Colaboradores
También añadí a gente como colaboradores para que el proyecto fuera más realista. En esta captura se ve la lista de acceso. La idea es que en un entorno de trabajo real, mis compañeros podrían entrar aquí, ver mi código y darme el visto bueno (el "Approve") en las Pull Requests antes de hacer el merge.
<img width="1863" height="615" alt="Lista de Colaboradores" src="https://github.com/user-attachments/assets/f57c9250-88c9-4352-8946-4cf547e0b720" />

---

## 2. Refactorización del Código (Eclipse IDE)
El código de `Ejercicio02.java` que teníamos al principio era bastante "sucio" (lo que se llama Spaguetti Code). Funcionaba, pero si lo dejas así, en dos semanas no sabes ni qué hace cada línea. Usé las herramientas automáticas de Eclipse para dejarlo limpio y profesional.

### 2.1. Sustituir "Números Mágicos" (Extract Constant)
Había un `0.15` escrito a pelo en el código. Si el jefe me dice que ahora el descuento VIP es del 20%, tendría que ir buscando ese número por todo el programa con el riesgo de olvidarme alguno.
* **Qué hice:** Lo saqué a una constante de clase llamada `PORCENTAJE_DESCUENTO_VIP`.
* **Explicación de la captura:** Se ve la ventana de "Extract Constant" de Eclipse. Simplemente seleccioné el número, le di a refactorizar y le puse el nombre. El IDE se encargó de crear la variable arriba y sustituir el número en la lógica automáticamente.
<img width="597" height="346" alt="Extrayendo Constante" src="https://github.com/user-attachments/assets/24008a02-5209-475e-bf96-86b72819042b" />

### 2.2. Modularizar el cálculo (Extract Method)
El método principal hacía demasiadas cosas a la vez: calcular el precio base, mirar si era VIP y aplicar el descuento. Siguiendo el Principio de Responsabilidad Única, decidí separar las tareas.
* **Qué hice:** Creé un método nuevo llamado `calcularSubtotal` que solo se encarga de multiplicar precio por cantidad.
* **Explicación de la captura:** Aquí se ve el bloque de código seleccionado en azul. Al usar la herramienta de Eclipse, el programa me genera la estructura del método nuevo abajo y me pone la llamada en el sitio original. Así el código se lee como un libro.
<img width="587" height="702" alt="Extrayendo Método" src="https://github.com/user-attachments/assets/785ddc1e-7574-4dfc-a40f-dc514c82f2b1" />

### 2.3. Cambiar nombres para que se entiendan (Rename)
El nombre `Ejercicio02` no dice nada de lo que hace el programa. Es vital que las clases tengan nombres descriptivos.
* **Qué hice:** Renombré la clase a `CalculadoraPedido`.
* **Explicación de la captura:** Se ve el cuadro de diálogo de Rename. Al hacerlo desde aquí y no cambiando el nombre del archivo a mano, Eclipse se encarga de cambiar el nombre en la declaración de la clase y en todas las partes donde se use, evitando errores de compilación.
<img width="590" height="307" alt="Renombrando Clase" src="https://github.com/user-attachments/assets/412f9542-c85e-400f-ae17-01cd294a7543" />

---

## 3. Flujo de Trabajo: Historial detallado de Pull Requests (PR)
Para que todo el proceso fuera transparente, he ido registrando cada avance en GitHub mediante Pull Requests. Aquí explico qué estuve haciendo en cada una de las 8 etapas:

### PR #1: Preparación de la Memoria Técnica
En esta primera fase me centré en crear el archivo de la memoria y definir qué patrones de refactorización iba a aplicar (Tarea 2). Es la base del proyecto antes de tocar el código.
<img width="1661" height="777" alt="Captura6PullRequest1" src="https://github.com/user-attachments/assets/e2667dff-6954-42cb-9143-3c7d359e316d" />


### PR #2: Implementación de la Refactorización
Una vez que tenía claro qué cambiar, hice todas las mejoras en Eclipse y las subí. Aquí es donde el archivo `CalculadoraPedido.java` sustituye al antiguo `Ejercicio02.java`. Se nota un cambio brutal en la limpieza del código.
<img width="1625" height="760" alt="Captura6PullRequest2" src="https://github.com/user-attachments/assets/648019a6-456e-4d3c-a38a-13191d38062b" />


### PR #3: Documentación Javadoc en el código
En esta etapa me puse a comentar el código siguiendo el estándar de Javadoc. Metí las etiquetas `@param`, `@return` y `@author`. Lo hice en una rama aparte para no mezclar la programación pura con la documentación.
<img width="1632" height="677" alt="Captura6PullRequest3" src="https://github.com/user-attachments/assets/5a95873e-1166-47ee-ad6f-aa28825965e0" />


### PR #4: Exportación de la web de ayuda (/doc)
Tras terminar los comentarios, generé los archivos HTML con Eclipse. Esta PR es muy grande porque incluye todos los archivos de la web de documentación que pide la Tarea 4. Ahora cualquiera puede leer la ayuda técnica desde un navegador.
<img width="1628" height="687" alt="Captura6PullRequest4" src="https://github.com/user-attachments/assets/f7f0b65f-4cc6-4469-90ca-8c7b8454675d" />


### PR #5: Inserción de evidencias visuales
Para que la memoria no fuera solo texto aburrido, empecé a meter las capturas de pantalla de los procesos que había seguido en GitHub y Eclipse. En esta captura se ve cómo voy actualizando el archivo Markdown.
<img width="1610" height="673" alt="Captura6PullRequest5" src="https://github.com/user-attachments/assets/25dcd328-f9df-4576-8cde-e53ff854aeaa" />


### PR #6: Refuerzo de la justificación técnica
Aquí me dediqué a explicar con más detalle por qué elegí cada patrón (Extract Method, Constant, etc.). Quería que quedara claro que entiendo los beneficios de la refactorización para el mantenimiento del software.
<img width="1575" height="713" alt="Captura6PullRequest6" src="https://github.com/user-attachments/assets/b08ea4b1-4f01-4004-9cdc-1b05193e2dcd" />


### PR #7: Resolución de Conflictos (Gestión de Versiones)
Este paso fue clave. Al intentar fusionar varios cambios en el mismo archivo, GitHub detectó un conflicto. Tuve que abrir el editor de conflictos, limpiar los símbolos de Git (`<<<<<<<`, `=======`) y decidir con qué versión del texto me quedaba. Esta captura demuestra que sé resolver problemas reales de Git.
<img width="1651" height="808" alt="Captura6PullRequest7" src="https://github.com/user-attachments/assets/0fdb324b-a423-4c2a-a6a6-c6be9091c81c" />


### PR #8: Finalización y README de bienvenida
La última Pull Request sirvió para crear el `README.md`. Es la portada del repositorio donde resumo de qué va el proyecto y cómo está organizado. Es el cierre para que todo se vea profesional antes de la entrega final.
<img width="1618" height="677" alt="Captura6PullRequest8" src="https://github.com/user-attachments/assets/4c0f087e-a951-4e15-b566-589346724d28" />

---

## 4. Documentación Javadoc Final
He configurado Eclipse para generar automáticamente toda la web de ayuda técnica del proyecto.
* He documentado cada método explicando para qué sirve, qué datos recibe y qué devuelve.
* El resultado está en la carpeta `/doc`. Esto es fundamental en el mundo real para que otros desarrolladores puedan usar mis métodos sin perderse en el código fuente.

---

## 5. Conclusión
Con este trabajo he aprendido que ser desarrollador no es solo escribir código que funcione, sino saber gestionarlo. He pasado de tener un código sucio a uno profesional, documentado y con un historial de versiones en GitHub que permite ver cada paso que he dado. Me siento mucho más cómodo manejando ramas y resolviendo conflictos de lo que estaba al principio de curso.
