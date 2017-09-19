job('Test') {
    scm {
        git('git://github.com/Drakan42/Airport-demo.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
      maven{
        mavenInstallation('Maven 3.1.1')
        goals('clean')
        goals('verify')
      }
    }
}
