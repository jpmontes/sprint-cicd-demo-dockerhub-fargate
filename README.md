# Spring Boot CI/CD Demo

## 🚀 Descripción
Microservicio Spring Boot 3 con Java 21 que demuestra un flujo completo de **CI/CD con GitHub Actions** y despliegue en **AWS Fargate**.

Incluye:
- Build y tests automáticos con Maven.
- Dockerización de la aplicación.
- Publicación de la imagen en DockerHub.
- Despliegue automático en AWS ECS (Fargate) al hacer push en `main`.

## 📂 Estructura del proyecto
```
springboot-ci-cd-demo/
 ├── src/
 ├── pom.xml
 ├── Dockerfile
 ├── .github/workflows/cicd-dockerhub-fargate.yml
 └── README.md
``

## 🧩 Endpoints disponibles
| Endpoint | Método | Descripción |
|----------|--------|-------------|
| `/hello` | GET    | Devuelve un mensaje de prueba |

## ⚙️ Configuración de GitHub Actions
Workflow realiza:
1. Checkout del código.
2. Compilación con Maven.
3. Ejecución de tests.
4. Build de la imagen Docker y push a DockerHub.
5. Actualización del servicio en AWS ECS (Fargate).

### Secrets necesarios
- `DOCKER_USERNAME` → Usuario DockerHub
- `DOCKER_PASSWORD` → Token DockerHub
- `AWS_ACCESS_KEY_ID`
- `AWS_SECRET_ACCESS_KEY`
- `AWS_REGION` → Ej: `eu-west-1`

## 🐳 Construcción y ejecución local
```bash
docker build -t springboot-ci-cd-demo .
docker run -p 8080:8080 springboot-ci-cd-demo
```
Abrir en navegador:
```
http://localhost:8080/hello
``

## 📌 Despliegue en AWS Fargate
1. Crear cluster ECS Fargate.
2. Crear servicio ECS usando la imagen DockerHub.
3. Configurar red y security group (puerto 8080).
4. GitHub Actions redepliega automáticamente al hacer push en `main`.
