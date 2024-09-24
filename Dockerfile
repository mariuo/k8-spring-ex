#Use OpenJDK runtime
FROM openjdk:17-jdk-slim

#set the working directory to /app
WORKDIR /app

#Copy the current directory contents into the container at /app
COPY build/libs/k8s-mysql.jar /app

#Make the port available to outside.
EXPOSE 8080

#Run k8s-mysql.jar when the container launches
CMD [ "java", "-jar", "k8s-mysql.jar" ]

