pipeline
{ 
	agent any 
	
	stages {
    
 		stage ('test') {
			 steps { bat "mvn clean compile test" }
                } 
    
                stage ('Build application') { 
	         steps { 
		    bat "mvn -f pom.xml clean install -Dmaven.test.skip=true" 
                 }
                } 
    
                stage ('Pasamos a producción') {
	         steps { echo "Movemos al servidor y lo ponemos en producción" }
 	        }
    
        } 
} 
