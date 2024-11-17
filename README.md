# Basic Kubernetes example:
### Stack:
1) Java (OpenJDK 22)
2) k3d + kubectl
3) Docker
### Content:
1) Simple Java application that prints a random string with a timestamp every 5 seconds.
2) Dockerfile used to containerize the app.
3) Kubernetes declarative YAML file to create a cluster with N (1) number of pod replicas.
### Steps to launch the cluster:
1) Build an executable jar by running: <br/>
```mvn clean compile assembly:single```
2) Create a docker image: <br/>
```docker build -t log-output .```
3) Create a kubernetes cluster: <br/>
```k3d cluster create```
4) Import a locally stored image to kubernetes: <br/>
```k3d image import log-output```
5) Create a Kubernetes deployment using the created image: <br/>
```kubectl apply -f manifests/deployment.yaml```
6) See the logs to make sure pods are up and running: <br/>
```kubectl logs -f <name of the pod>```
### Useful Kubernetes commands:
1) ```kubectl get pods/deployments```
2) ```kubectl edit deployment <deployment name>```
