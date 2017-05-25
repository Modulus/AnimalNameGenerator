pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('error') {
      steps {
        git(url: 'git@github.com:Modulus/AnimalNameGenerator.git', branch: 'master', poll: true)
      }
    }
  }
}