import com.sujith.builds.Calculator

def call(Map pipelineParams){
   Calculator cal = new Calculator(this)



pipeline{
    agent {
        label ''
    }
    stages {

        stage ('calculate'){
            steps {
                script {
               echo "calling add method for reuasbility"
               println cal.add(10,23);
                }
            }
        }
       stage('Build'){
           steps {
            echo "*******building the application*********"
           }
       }

       stage ('Test'){
         steps {
            echo "***********application testing **************"
         }
       }

       stage ('devDeploy'){
        steps {
            echo "******deployong to dev env ******"
        }
       }

       stage ('testDeploy')
       {
        steps {
            echo "******deployong to test env ******"
        }
       }
    }
}
}