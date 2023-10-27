# Usa un'immagine di Maven come base
FROM maven:3.8.4-openjdk-11-slim AS tests

# Crea una directory di lavoro all'interno dell'immagine
WORKDIR /app

# Copia il file POM (pom.xml) per le dipendenze
COPY pom.xml Test/

# Esegui l'installazione delle dipendenze da Maven
RUN mvn clean install

# Copia l'intero progetto nell'immagine
COPY . .

# Comando per eseguire la build e i test
CMD ["mvn", "clean", "install"]
