def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    /*
        we want the following
        - project type
        - project url
    */

    node {
        echo "Now using ${config.type} to clone ${config.url}"
    }
}
