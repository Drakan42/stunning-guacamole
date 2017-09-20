pipelineJob('Test') {
  definition{
    cpsScm {
        scm {
            git('https://github.com/Drakan42/stunning-guacamole.git','docker')
        }
    }
  }
}
