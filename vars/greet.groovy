def call(Map config) {
    node {
        echo "Hello ${config.name}"
        echo "${config.bye}!"
    }
}
