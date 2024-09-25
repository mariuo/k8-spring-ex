# k8-spring-ex

## Required

- minikube
- docker
- kubectl
- gradle
- java
- spring
- mysql
- helm

```bash
# Commands

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
```

```bash

## Test request POST
curl -X POST \
 'http://10.99.178.11:8080/addExchangeRate' \
 --header 'Accept: _/_' \
 --header 'Content-Type: application/json' \
 --data-raw '{
"sourceCurrency": "USD",
"targetCurrency": "CAD",
"amount": 3,
"lastUpdated": "2024-11-29"
}'

## Test request GET

curl -X GET \
 'http://10.99.178.11:8080/getAmount?sourceCurrency=USD&targetCurrency=AUD' \
 --header 'Accept: _/_' \

`
```

# Author

Mario Camelo
https://www.linkedin.com/in/mariocamelogomes
