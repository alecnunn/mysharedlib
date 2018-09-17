import java.util.UUID

def call(String cmd) {
    def uuid = UUID.randomUUID()
    def filename = "cmd-${uuid}"
    echo filename
    sh ("${cmd} > ${filename}")
    def result = readFile(filename).trim()
    sh "rm ${filename}"
    return result
}
