pipeline
{ 
	agent any 
	
	stages {
    
 		stage ('test') {
		  steps { bat "mvn clean compile test" } //Para Windows
		  steps { sh "mvn clean compile test" } //Para Linux	
                } 
    
                stage ('Build application') { 
	         steps { bat "mvn -f pom.xml clean install -Dmaven.test.skip=true" } //Para Windows
		 steps { sh "mvn -f pom.xml clean install -Dmaven.test.skip=true" } //Para Linux	
                } 
    
                stage ('Pasamos a producción') {
	          steps { echo "Movemos al servidor y lo ponemos en producción" }
 	        }
    
        } 
} 
