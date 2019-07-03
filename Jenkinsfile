pipeline {
    environment {
        registry = 'micheallei/pipeline_docker_test'
        registryCredential = 'dockerhub'
    }
    agent any
    tools {
        maven 'MyMaven'
    }
    stages {
        //stage('cloning code') {
        //    steps {
        //         git url :'https://github.com/HITliulei/Test.git'
        //    }
        //}
        stage("maven package"){
            steps{
                //  withMaven(maven:'Maven'){
                     sh "mvn clean package"
                // }
            }
        }
        stage('docker_images build'){
            steps{
                script{
                    docker.withServer('tcp://192.168.235.129:2375'){
                        dockerImage = docker.build(registry+':v1')
                    }
                    // dockerImage = docker.build(registry+':v1')
                }
            }
        }
        // stage('docker push'){
        //     steps{
        //         // script{
        //             sh'''
        //             docker login --username=micheallei --password=ll1119016521
        //             docker push micheallei/pipeline_docker_test:v1
        //             docker logout
        //             '''
        //         // }
        //     }
        // }
    }
}