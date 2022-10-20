FROM openjdk:17
COPY target/Calc-1.0-SNAPSHOT.jar /usr/src/app/Calc.jar
CMD ["java","-jar", "/usr/src/app/Calc.jar"]
