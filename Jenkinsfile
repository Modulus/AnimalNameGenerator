pipeline {
  agent {
    node {
      label 'maven'
    }
    
  }
  stages {
    stage('') {
      steps {
        git(url: 'https://github.com/Modulus/AnimalNameGenerator.git', branch: 'master', poll: true)
      }
    }
  }
}