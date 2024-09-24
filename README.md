# k8-spring-ex

## prerequists

- minikube
- docker
- kubectl
- gradle
- java
- spring
- mysql
- helm

## Commands

- `minikube delete
  minikube start
  minikube status
  eval $(minikube docker-env)
  docker build -t k8s-mysql:v1 .
  helm template k8chart
  helm install mychart k8chart
  kubectl get all
  minikube image ls
  kubectl get svs
  minikube service mychart-mysql-service --url
  minikube service mychart-spring-app-service --url
  minikube tunnel
  kubectl get all

  GET EXTERNAL IP and tests

## test

`curl -X POST \
 'http://10.99.178.11:8080/addExchangeRate' \
 --header 'Accept: _/_' \
 --header 'Content-Type: application/json' \
 --data-raw '{
"sourceCurrency": "USD",
"targetCurrency": "CAD",
"amount": 3,
"lastUpdated": "2024-11-29"
}' `

## test2

curl -X GET \
 'http://10.99.178.11:8080/getAmount?sourceCurrency=USD&targetCurrency=AUD' \
 --header 'Accept: _/_' \

`
