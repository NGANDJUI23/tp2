FROM openjdk:17
COPY target/*.jar gestion_des_etudiants-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/gestion_des_etudiants-0.0.1-SNAPSHOT.jar"]
EXPOSE 8011

# Exemple pour mysql
FROM mysql:8.1
ENV mysql_USER=root
ENV mysql_PASSWORD=
ENV mysql_DB=Etudiants

# Copier les scripts d'initialisation
# COPY ./init.sql /docker-entrypoint-initdb.d/
