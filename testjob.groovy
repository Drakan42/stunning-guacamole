pipelineJob('Test') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        name('origin')
                        url('git://github.com/Drakan42/Airport-demo.git')
                        credentials('myGitHub')
                    }
                    branch('docker')
                }
            }
        }
    }
}
