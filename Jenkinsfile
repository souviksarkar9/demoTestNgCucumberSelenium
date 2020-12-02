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
	    		junit '**/target/surefire-reports/TEST-*.xml'
	        	archiveArtifacts 'target/*.jar'
	    	}	        
	    }
    }
    
}
	
