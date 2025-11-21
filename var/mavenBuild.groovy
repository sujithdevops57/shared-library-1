def call() {
    stage('Maven Build') {
        echo "Starting Maven Build..."
        sh '''
            mvn clean package -DskipTests
        '''
        echo "Maven Build Completed Successfully!"
    }
}
