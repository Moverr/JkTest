pipeline {
    agent any

    stages {
        stage('Master') {

            steps {

            sh './gradlew test'
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