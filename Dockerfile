FROM tomcat:latest
 
COPY ${WAR_FILE} /usr/local/tomcat/webapps/SpringMVCHibernate.war
 
EXPOSE 8084
 
CMD [ "catalina.sh" , "run" ]

stage('5. Dockerization')
    {
        bat 'docker image build -t springmvc .'
    }
