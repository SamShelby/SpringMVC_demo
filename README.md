# Spring MVC Demo Project 

### Notes

Intellij project using Maven and Spring

### Prerequisites

Docker Deamon

### Run Docker Image

1. Clone the repo
   ```sh
   docker run --rm -p 8888:8080 samshelby/springdocker_mvcapp
   ```
### Download Project and Create Docker Image

1. Clone the repo
   ```sh
   git clone https://github.com/SamShelby/SpringMVC_demo.git
   ```
2. Docker Compose
   ```sh
   cd SpringMVC_demo
   docker-compose up
   ```
4. Test Model View Controller page
   ```sh
   http://localhost:8888/main/
   ```
   

