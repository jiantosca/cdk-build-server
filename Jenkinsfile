//https://github.com/jstrachan/spring-boot-web-gradle/blob/master/Jenkinsfile - for more in depth sample.

pipeline {
    
    agent any
    
    options {
        timestamps()
    }

    stages {
        
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