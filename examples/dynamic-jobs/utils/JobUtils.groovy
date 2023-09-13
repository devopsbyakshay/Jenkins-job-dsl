package utils


class JobUtils {
    def job_config

    JobUtils(current_pipeline) {
        // parsing the yaml content
        parsed_job_config = new Yaml().load((current_pipeline as File).text)
        this.job_config = parsed_job_config
    }

    String get_job_name() {
        return this.job_config.job_name
    }

}