import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

def call(boolean coldition, body) {
    def config = [:]
    body.resolveStrategy = Closure.OWNER_FIRST
    body.delegate = config

    if(condition) {
        body()
    } else {
        echo 'Skipping stage'
        Utils.markStageSkippedForConditional(STAGE_NAME)
    }
}
