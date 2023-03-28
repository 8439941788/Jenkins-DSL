pipeline {
    agent any
    stages {
        stage('First-Stage') {
            steps {
                echo 'Hi, this is kormla'
                echo 'Our first codepipeline using Jenkinsfile'
            }
        }

        stage('Build') {
            steps {
                echo 'Building my project'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying our code'
            }
        }
         stage('Post-Deploy') {
            steps {
                echo 'Code is deployed and now post deploy action'
            }
        }
    }
}
