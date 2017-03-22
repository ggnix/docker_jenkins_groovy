<h3> docker_jenkins_groovy</h3>

This a containerized version of Jenkins with groovy init scripts running on startup.
Jenkins contains default job called "Example_job" which executes simple command "echo Hello World!" triggered by Seed job.
Administrator user will be added on startup. Seed job scheduled for execution when Jenkins is started.

<h2>Build</h2>
Build the container yourself by running the following command from the project directory containing the Dockerfile:

```
docker build -t jenkins_image .
```
<h2>Run</h2>

```
docker run -d -p 8080:8080 --name jenkins_image jenkins_container
```
<h2>Access Jenkins</h2>

```
http://localhost:8080
```
<h2>Ansible container deployment</h2>

Deploy container with the following command:
```
ansible-playbook deploy_image.yml -k
```
