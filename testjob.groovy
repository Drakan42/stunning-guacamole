job('Test') {
    scm {
        git('git://github.com/Drakan42/Airport-demo.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        mavenInstallation('maven')
        maven('-e clean test')
    }
}
