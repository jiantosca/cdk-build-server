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
        stage('sonar') {
            steps {
                // this guy fully qulifies plugin so we don't have to put in project https://www.youtube.com/watch?v=KsTMy0920go
                withSonarQubeEnv(installationName: 'sq1') {
                    sh './mvnw sonar:sonar'
                }
            }
        }        
    }
}