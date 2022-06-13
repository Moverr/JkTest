pipeline {
    agent any

    stages {
        stage('Master') {

            steps {
            try{
            sh './gradlew test'
            }
             jacoco()
                echo 'Building..'

            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}