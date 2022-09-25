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
                sh './mvnw sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_c65a85af333e857b6c1db5922c24f7897cbde7c1'
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