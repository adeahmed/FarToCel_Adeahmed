pipeline {
    agent any

    environment {
        GITHUB_REPO = 'https://github.com/adeahmed/FarToCel_Adeahmed'
    }

    tools {
        maven 'maven'
        jdk 'jdk'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main’, url: "https://github.com/adeahmed/FarToCel_Adeahmed/"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                success {
                    junit '*/target/surefire-reports/TEST-.xml'

                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}