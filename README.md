## Micronaut native image demo 

- [Created with Launcher](https://micronaut.io/launch)
- Following [the official tutorial](https://www.graalvm.org/dev/reference-manual/native-image/guides/build-micronaut-app-into-native-executable/)

```
JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.2.0/Contents/Home ./mvnw -X package -Dpackaging=native-image
```
Go to http://localhost:8080/conferences/random