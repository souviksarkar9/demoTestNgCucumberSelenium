pipeline {
    agent any
    stages{
    	stage('Cleaning Stage') {
    		steps{
	    		bat "cd demo-git && mvn clean"
	    	} 
    		
	    }
	    stage('Testing Stage') {
	    	steps{
	    		bat "cd demo-git && mvn test"
	    	}	        
	    }
	    stage('Packaging Stage') {
	    	steps{
	    		bat "cd demo-git && mvn package"
	    	}	        
	    }
	    stage('Results') {
	    	steps{
	    		input ("Do you want to capture results?")
	    		junit '**/target/surefire-reports/TEST-*.xml'
	        	archiveArtifacts 'demo-git/target/*.jar'
	    	}	        
	    }
    }
    
}
	
