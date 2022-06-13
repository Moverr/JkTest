pipeline {
    agent any

    stages {
        stage('Master') {

            steps {

            sh './gradlew test'



            }
            steps{
              sh './gradlew build jacocoTestReport'
                     }
                     steps{
                        jacoco()
                                             echo 'Building..'
                                             }

        }
        stage('Dev') {
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