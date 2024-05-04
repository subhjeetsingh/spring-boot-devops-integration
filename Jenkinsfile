pipeline {
    agent any
    tools{
        maven 'maven_3.9.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/subhjeetsingh/spring-boot-devops-integration']])
                bat 'mvn clean install'
            }
        }
        stage('Create Docker Image'){
            steps{
                script{
                    bat 'docker build -t subhjeetsingh/spring-boot-devops-integration .'
                }
            }
        }
        stage('Push Docker Image to DockerHub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubcreds')]) {
                    bat 'docker login -u subhjeetsingh -p ${dockerhubcreds}'
                    }
                    bat 'docker push subhjeetsingh/spring-boot-devops-integration'
                }
            }
        }
    }
}
