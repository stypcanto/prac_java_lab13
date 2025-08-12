# Imagen base con Tomcat 10 (compatible con Jakarta Servlet 6.x)
FROM tomcat:10.1-jdk21

# Borrar apps por defecto (ROOT, docs, examples)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar el WAR generado por Maven
COPY target/Lab13-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war


# Exponer puerto 8080 para acceso HTTP
EXPOSE 8080

# Comando por defecto de Tomcat
CMD ["catalina.sh", "run"]
