pipeline {
    agent { label 'build-vm' }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/zerotoprodevops/mavenApplication-02.git'
            }
        }
        stage('Build Image') {
            steps {
                sh "docker build -t jyotimanab/mavenapp:${env.BUILD_NUMBER} ."
            }
        }
        stage('Scan') {
            steps {
                sh "TMPDIR=/tempdir trivy image --severity CRITICAL,HIGH --ignore-unfixed jyotimanab/mavenapp:${env.BUILD_NUMBER}"
            }
        }
    }
}
