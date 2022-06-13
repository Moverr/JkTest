pipeline {
    agent any

    CODE_CHANGES = getGitCodeChanges()

    stages {
        stage('Master') {

            when{
                expressions{
                BRANCH_NAME ='dev' && CODE_CHANGES = true
                }
            }
            steps {

            sh './gradlew test'
            sh './gradlew build jacocoTestReport'
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