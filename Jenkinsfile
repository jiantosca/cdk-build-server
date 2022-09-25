//https://github.com/jstrachan/spring-boot-web-gradle/blob/master/Jenkinsfile - for more in depth sample.

pipeline {
    
    agent any
    
    options {
        timestamps()
    }

    stages {
        
        stage('env') {
            steps {
                sh 'printenv'                
            }
        }
        
        stage('clean') {
            steps {
                sh './mvnw clean'
            }
        }
        
        stage('spotless') {
            steps {
                sh './mvnw spotless:check'
            }
        }
        stage('sonar') {
            steps {
                sh 'echo "something here"'
                //sh './mvnw sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=the-generated-token'
            }
        }        
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }
        
        stage('package') {
            steps {
                sh './mvnw package'
            }
        }
    }
}