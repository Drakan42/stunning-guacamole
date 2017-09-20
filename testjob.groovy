pipelineJob('Test') {
  definition{
    cpsScm {
        scm {
            git('https://github.com/Drakan42/Airport-demo.git','docker')
        }
    }
  }
}
