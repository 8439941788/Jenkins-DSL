job('First-Maven-Project-via-DSL'){
    description("First maven job on ${new Date()}")
    scm {
        git("https://github.com/anshulc55/Jenkins_Upgradev3.git", master)
    }

    triggers{
        scm('* * * * *')
    }
    
    steps (
        maven('clean install', 'maven-samples/single-module/pom.xml')
    )
    publishers {
        archiveArtifacts '**/*.jar'
    }
}
