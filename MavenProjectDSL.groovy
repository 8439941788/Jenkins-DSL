job('First-Maven-Project-via-DSL'){
    description("First maven job on ${new Date()}")
    scm {
        git("https://github.com/8439941788/Jenkins-DSL.git")
    }

    triggers{
        scm('* * * * *')
    }
    
    steps {
        maven('clean install')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}
