pipeline {
    agent any

    stages {
        stage('Dev') {

            steps {

                sh './gradlew test'
                sh './gradlew build jacocoTestReport'
              jacoco()
              echo 'Building..'
            }


        }
        stage('Dedv') {
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