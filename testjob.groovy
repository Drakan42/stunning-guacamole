pipelineJob('Test') {
  definition{
    cpsScm {
        scm {
            git('git://github.com/Drakan42/Airport-demo.git','docker')
        }
    }
  }
}
