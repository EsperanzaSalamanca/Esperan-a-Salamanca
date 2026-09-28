# t1-ejercicios — Tema 1: POO, Principios SOLID y Diseño

Esqueleto de los **26 ejercicios** del Tema 1 de *Programación Avanzada (22354)*, Grado en
Ingeniería Telemática, UIB-EPS. Los enunciados están en la
[página de ejercicios del tema](https://uib-22354-programacion-avanzada.github.io/website/es/ejercicios/tema1.html);
aquí tienes el código sobre el que trabajar.

Es un proyecto **Maven** para **Java 25** con pruebas en **JUnit 5**, preparado para **GitHub
Codespaces**. El esqueleto **compila desde el primer momento**, pero casi todas las pruebas
fallan: tu trabajo consiste en ponerlas en verde.

## Cómo empezar

1. Pulsa **Use this template** → **Create a new repository** y créalo en **tu cuenta personal**.
2. En tu copia, **Code** → **Codespaces** → **Create codespace on main**.
3. En el terminal:

```bash
java -version    # debe empezar por: openjdk version "25
mvn test         # verás muchos fallos: es lo esperado al empezar
```

A partir de ahí, resuelve los ejercicios en el orden que quieras y vuelve a ejecutar `mvn test`.
Cada `push` los ejecuta también en GitHub Actions, y la marca ✓ o ✗ junto al *commit* te dice
cómo vas.

> **Recuerda detener el Codespace** cuando termines (**Code → Codespaces → ⋯ → Stop codespace**):
> mientras está encendido consume tu cuota mensual gratuita.

## Cómo está organizado

```text
t1-ejercicios/
├── pom.xml                       ← proyecto Maven (Java 25, JUnit 5)
└── src/
    ├── main/java/es/uib/prgava/tema1/
    │   ├── poo/          ← ejemplos de POO del tema, ya escritos
    │   ├── genericos/    ← ejemplos de genéricos y streams del tema, ya escritos
    │   ├── monitor/      ← el monitor del tema, ya escrito; puedes modificarlo
    │   └── ejercicios/   ← tus clases
    └── test/java/es/uib/prgava/tema1/
        ├── monitor/      ← pruebas del monitor y de las clases que lo amplían
        └── ejercicios/   ← pruebas del resto
```

Las clases que **implementan o extienden un tipo del monitor** (`FallosEnVentana`,
`NotificadorSinRepetir`, `ServicioPing`, `SondaDeterminista`) viven en el paquete `monitor`, junto
a sus compañeras. Todas las demás, en `ejercicios`. Cada fichero ya está en su sitio.

Los paquetes `poo`, `genericos` y `monitor` son una copia exacta del código del tema, el mismo que
hay en [`t1-ejemplos`](https://github.com/UIB-22354-Programacion-Avanzada/t1-ejemplos). Puedes
leerlo, ejecutarlo y, cuando el enunciado lo pida, modificarlo.

## Cómo leer el esqueleto

Cada clase que tienes que escribir trae ya las **declaraciones**: las firmas de los métodos, la
documentación y las cláusulas `extends` e `implements` que hacen falta para que el proyecto
compile y las pruebas se puedan ejecutar desde el primer momento. Lo que falta son los **cuerpos**,
marcados con `// TODO 1.X.k` y un `throw new UnsupportedOperationException(...)`. **Borra ese
`throw`** al implementar el método; mientras esté, la prueba correspondiente falla con ese
mensaje, que además te dice a qué ejercicio pertenece.

Cuando un enunciado te diga «declara que la clase implementa tal interfaz», encontrarás la
declaración hecha: léela como parte del enunciado y fíjate en por qué está donde está.

Algunas clases **ya están escritas y son parte del enunciado**: son las que tienes que
diagnosticar, refactorizar o ampliar. Su código aparece también en el enunciado, para que puedas
leerlo sin salir de la página. No las borres.

| Clase ya escrita | Ejercicio | Qué hacer con ella |
|---|---|---|
| `Etiqueta`, `DemoEtiqueta` | 1.1.3 | tienen dos defectos: encuéntralos y corrígelos |
| `PanelDeEstadoHeredado` | 1.1.5 | no la corrijas; déjala como testigo del antes |
| `RegistroSensores` | 1.2.1 | sepárala en cuatro clases y déjala como fachada |
| `ListaSoloLecturaHeredada` | 1.2.3 | diagnostica la violación de Liskov; no la corrijas |
| `GestorDispositivos` y sus tres implementaciones | 1.2.4 | divide la interfaz por roles |
| `InformeDiarioAcoplado` | 1.2.5 | no la toques; escribe `InformeDiario` bien diseñada |
| `CopiasEjercicio` | 1.3.3 | corrige la firma de `copiarTodo` aplicando PECS |
| `DetectorDeCaidas` | 1.4.4 | refactorízala para poder probarla, y pruébala |

## Pruebas: qué hay y qué falta

En las secciones 1.1, 1.2 y 1.3 las pruebas **ya están escritas** y son tu criterio de corrección.
En la sección 1.4 **las pruebas son el entregable**: no hay nada escrito, y lo que se evalúa es
precisamente lo que escribas tú.

Cuatro detalles que conviene conocer de antemano:

- Los ejercicios 1.4.1 y 1.4.2 consisten en probar a fondo `FallosEnVentana` y `DireccionIpv4`.
  Para que no te quedes sin comprobación mientras tanto, la plantilla incluye unas pruebas
  mínimas de ambas en `FallosEnVentanaBasicoTest` y `DireccionIpv4BasicoTest`. No las repitas.
- Las dos últimas pruebas de `CopiasEjercicioTest` están **comentadas**, porque con la firma
  actual no compilan. Descoméntalas al corregirla (1.3.3): ahí lo que se comprueba, antes que
  ningún resultado, es que el código compile.
- Al final de `GestorDispositivosTest` hay un `// TODO` con una prueba que tienes que añadir tú,
  cuando hayas dividido la interfaz (1.2.4).
- Varios ejercicios piden **justificar una decisión en un comentario**. Eso no lo comprueba
  ninguna prueba, pero es lo que se pregunta en el Examen Parcial: no lo dejes en blanco.

## Órdenes útiles

```bash
mvn test                              # todas las pruebas
mvn -Dtest=HistorialTest test         # solo una clase
mvn -Dtest='Informes*' test           # todas las que empiecen por Informes
mvn -q compile                        # solo compilar
java -cp target/classes es.uib.prgava.tema1.ejercicios.DemoEtiqueta
java -cp target/classes es.uib.prgava.tema1.monitor.Principal
```

También puedes usar el icono de matraz (*Testing*) de la barra lateral de VS Code, que muestra las
pruebas en árbol y permite ejecutar una sola con un clic, y depurarlas poniendo puntos de ruptura.

## Codespaces y GitHub Actions

`.devcontainer/devcontainer.json` describe el contenedor en el que se abre el Codespace: JDK 25 de
Temurin, Maven y las extensiones de Java de VS Code. `.github/workflows/pruebas.yml` ejecuta
`mvn test` en cada `push`, de modo que junto a cada *commit* aparece una marca ✓ o ✗ en GitHub.
Ambos vienen ya configurados; no tienes que tocarlos.

## Integridad académica

El uso de asistentes de IA en estos ejercicios se rige por las **condiciones de uso de la IA** de
la [guía docente](https://uib-22354-programacion-avanzada.github.io/website/es/informaciones/guia-docente.html).
En resumen: puedes pedir explicaciones y revisión, pero entregar código que no sabes explicar,
justificar ni modificar se considera uso indebido. Estos ejercicios son la base de los Talleres y
del Examen Parcial, donde no hay asistente que valga.

## Licencia

El código de este repositorio se publica bajo licencia [MIT](LICENSE) — copyright © 2026
Alejandro Mesejo. Puedes usarlo, copiarlo y modificarlo libremente, dentro y fuera de la
asignatura, conservando el aviso de copyright.

Esa licencia cubre el **material de partida**: los esqueletos, las clases ya escritas y las
pruebas. Cuando crees tu copia con **Use this template**, el fichero `LICENSE` viaja con ella,
pero **las soluciones que escribas son tuyas** y puedes licenciarlas como quieras. Si haces
público tu repositorio y quieres dejarlo claro, añade tu propio nombre al aviso de copyright o
una nota al principio de este README.

Los enunciados, las explicaciones del tema y el resto del material docente están en el
[sitio web de la asignatura](https://uib-22354-programacion-avanzada.github.io/website/) y se
publican bajo licencia
[CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/deed.en).
