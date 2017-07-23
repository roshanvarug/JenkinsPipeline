job('DSL-Tutorial-1-Test') {
   scm {
       git('https://github.com/roshanvarug/JenkinsPipeline.git')
   }
   triggers {
       scm('H/15 * * * *')
   }
   steps {
       sh 'echo "Hello world"'
   }
}
