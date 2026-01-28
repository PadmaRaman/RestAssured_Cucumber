pipeline {
    agent any

    environment {
        AWS_DEFAULT_REGION = "us-east-1"
        S3_BUCKET = "restassured-cucumber-test-artifacts"
        REPORT_DIR = "target/cucumber_reports"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/PadmaRaman/RestAssured_Cucumber.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Upload Logs to S3') {
            steps {
                withCredentials([[$class: 'AmazonWebServicesCredentialsBinding',
                    credentialsId: 'aws-s3-creds']]) {
                    sh '''
                    aws s3 cp $REPORT_DIR s3://$S3_BUCKET/reports/build-$BUILD_NUMBER/ --recursive
                    '''
                }
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'reports/**/*.html', fingerprint: true
            archiveArtifacts artifacts: 'reports/**/*.json', fingerprint: true
        }
        failure {
            echo 'Build failed – logs uploaded for analysis'
        }
    }
}