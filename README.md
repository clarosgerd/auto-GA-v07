# auto-GA-v07
Paso 1: Agregue la Biblioteca PicoContainer al Proyecto Gradle

Esto es realmente simple, ya que hemos estado usando Gradle Project, todo lo que tenemos que hacer es agregar las dependencias Gradle Repository - Cucumber PicoContainer.

// https://mvnrepository.com/artifact/info.cukes/cucumber-picocontainer
grupo testCompile: 'info.cukes', nombre: 'cucumber-picocontainer', versión: '1.2.5'

Paso 2: crear una clase de contexto de prueba

Simplemente verificamos que información está usando elarchivo Steps y ponga esa información en esta clase. En nuestro caso, nuestro archivo de pasos solo utiliza la siguiente información porque ya tenemos DriveManager and FileManager

PageObjects: Proporcionado por PageObjectManager



Paso 3: divide el archivo Steps


Simplemente dividi el archivo de pasos como hice las separaciones entre los Objetos de página. Para cada página diferente tenemos una clase separada de PageObject. Por lo tanto, tiene sentido tener una clase de definición de paso separada para cada página también. Puede ser que su aplicación sea diferente y no estará de acuerdo con mi enfoque. En ese caso, a quién le importa  Divida sus pasos en consecuencia.

Cree tres nuevas clases en el paquete stepDefinitions con los siguientes nombres:

LoginStepdefs
CarStepDef
LogoutStepdefs


Paso 4: Escriba Constructor para las clases de Definición de paso para compartir InjectionContext

Escriba Constructor para las clases de Definición de paso para compartir InjectionContext
Comencemos con LoginStepdefs. El estado actual de la clase LoginStepdefs es sin Constructor:

Usar PicoContainer para compartir el estado entre los pasos en un escenario es fácil y no intrusivo. Todo lo que necesita es un constructor que requiera un objeto que PicoContainer pueda crear e inyectar. PicoContainer es invisible. Agregue una dependencia a cucumber-picocontainer y asegúrese de que los constructores para las clases de pasos requieren una instancia de la misma clase.


Paso 5: Ejecute la prueba de Cucumber

