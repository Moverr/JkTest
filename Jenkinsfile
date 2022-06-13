pipeline {
    agent any

    stages {
        stage('Master') {

            when{
                expressions{
                BRANCH_NAME ='master' && CODE_CHANGES = true
                }
            }
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