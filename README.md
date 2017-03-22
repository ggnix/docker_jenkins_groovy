<h2> docker_jenkins_groovy</h2>

This a containerized version of Jenkins with groovy init scripts running on startup.
Jenkins contains default job called "Example_job" which executes simple command "echo Hello World!" triggered by Seed job.
Administrator user will be added on startup. Seed job scheduled for execution when Jenkins is started.
<h2>Manual deployment</h2>
<h3>Build</h3>
Build the container yourself by running the following command from the project directory containing the Dockerfile:

```
docker build -t jenkins_image .
```
<h3>Run</h3>

```
docker run -d -p 8080:8080 --name jenkins_image jenkins_container
```
<h3>Access Jenkins</h3>

```
http://localhost:8080
```
<h2>Ansible container deployment</h2>

Deploy container with the following command:
```
ansible-playbook deploy_image.yml -k
```
