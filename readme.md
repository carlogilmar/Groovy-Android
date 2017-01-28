## Configurar el proyecto para Groovy

El proyecto contiene dos archivos build.gradle

En el build.gradle de **app** van las lineas:

> apply plugin: 'groovyx.android'

> compile "org.codehaus.groovy:groovy:2.4.7:grooid"

En el build.gradle de **MyApplication** va

> classpath 'org.codehaus.groovy:groovy-android-gradle-plugin:1.1.0'

Es importante cambiar la carpeta java por groovy, y el archivo main con extensión .groovy


