#!/usr/bin/env groovy

node {
    stage('checkout') {
        checkout scm
    }
     stage('clean') {
        sh "chmod +x mvnw"
        sh "mvn clean"
     }

     stage('install')
     sh "mvn install"

}
