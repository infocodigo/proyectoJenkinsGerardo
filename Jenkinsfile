pipeline
{ 
	agent any stages {
    
 		stage ('test') {
			 steps { sh "mvn clean compile test" }
    } 
    
    stage ('Build application') { 
	    steps { 
		    sh "mvn -f pom.xml clean install -Dmaven.test.skip=true" 
      }
    } 
    
    stage ('Pasamos a producción') {
	    steps { echo "Movemos al servidor y lo ponemos en producción" }
 	  }
    
  } 
} 
