pipeline {
    agent any
    stages{
    	stage('Cleaning Stage') { 
    		bat "cd demo-git && mvn clean"
	    }
	    stage('Testing Stage') {
	        bat "cd demo-git && mvn test"
	    }
	    stage('Packaging Stage') {
	        bat "cd demo-git && mvn package"
	    }
	    stage('Results') {
	        junit '**/target/surefire-reports/TEST-*.xml'
	        archiveArtifacts 'target/*.jar'
	    }
    }
    
}
	
