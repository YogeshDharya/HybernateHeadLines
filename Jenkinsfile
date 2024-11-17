pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub-credentials') // Jenkins credential ID
        DOCKER_IMAGE = 'your_dockerhub_username/news-application'
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build Application') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE:latest .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-credentials') {
                        sh 'docker push $DOCKER_IMAGE:latest'
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Build and Push to Docker Hub Successful!'
        }
        failure {
            echo 'Pipeline Failed.'
        }
    }
}
