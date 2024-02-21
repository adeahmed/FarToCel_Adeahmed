pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'jdk'
    }

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling...'
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
        stage('Site') {
            steps {
                echo 'Generating site...'
                sh 'mvn site'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean install'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }}