import hudson.model.*
import jenkins.model.*;
import javaposse.jobdsl.plugin.*;

Thread.start {
    sleep 10000
    def jenkins = Jenkins.getInstance()

    //Instantiate a new freestyle job
    def job = new FreeStyleProject(jenkins, "Seed")
    job.setAssignedLabel(null);

    job.setCustomWorkspace("/usr/share/jenkins/ref/init.groovy.d/job-dsl")
    def ExecuteDslScripts.ScriptLocation scriptlocationFileSys = new ExecuteDslScripts.ScriptLocation('false', "*.json", null);
    def ExecuteDslScripts executeDslScripts = new ExecuteDslScripts(scriptlocationFileSys, false, RemovedJobAction.IGNORE);

    job.buildersList.add(executeDslScripts)

    jenkins.add(job, job.getName());
    jenkins.reload()
// Add job to queue
    def jobRef = jenkins.getItem(job.getName());
    jenkins.getQueue().schedule(jobRef,10); }
