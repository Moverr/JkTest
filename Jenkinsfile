pipeline {
    agent any

    stages {
        stage('Master') {

            steps {

            sh './gradlew test'
             sh './gradlew build jacocoTestReport'
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