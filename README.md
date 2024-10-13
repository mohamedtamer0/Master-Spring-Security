# Master-Spring-Security

This project is designed to help you understand the Spring Security architecture, focusing on the key packages, interfaces, and classes that handle authentication and authorization in web applications. It also covers essential security topics such as CORS, CSRF, JWT, OAuth2, password management, method-level security, and managing users, roles, and authorities.

## Features
Authentication & Authorization: Manage and control access within your application.
Security Features: Includes CORS, CSRF protection, and JWT for stateless authentication.
OAuth2 Integration: Support for social login and other OAuth2-based authentications.
Method-Level Security: Secure specific methods using annotations like @Secured and @PreAuthorize.
User & Role Management: Comprehensive tools for managing users, roles, and authorities.

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven
- Git
- MySQL

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/mohamedtamer0/Master-Spring-Security.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd Master-Spring-Security
    ```

3. **Build the project using Maven:**

    ```bash
    mvn clean install
    ```
**To create a MySQL DB container :**

```bash
docker run -p 3306:3306 --name springsecurity -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=bankbackend -d mysql
```

4. **Configure your `application.properties` file to connect to your Oracle 11g database:**

    ```properties
    server.port=8081
    spring.application.name=${SPRING_APP_NAME:BankBackend}
    
    #spring.security.user.name=${SECURITY_USERNAME:mohamedtamer0}
    #spring.security.user.password=${SECURITY_PASSWORD:12345}
    logging.level.org.springframework.security=${SPRING_SECURITY_LOG_LEVEL:TRACE}
    
    spring.config.import = application_prod.properties
    spring.profiles.active = default
    
    spring.datasource.url=jdbc:mysql://${DATABASE_HOST:localhost}:${DATABASE_PORT:3306}/${DATABASE_NAME:bankbackend}
    spring.datasource.username=${DATABASE_USERNAME:root}
    spring.datasource.password=${DATABASE_PASSWORD:root}
    spring.jpa.show-sql=${JPA_SHOW_SQL:true}
    spring.jpa.properties.hibernate.format_sql=${HIBERNATE_FORMAT_SQL:true}
    
    server.servlet.session.timeout=${SESSION_TIMEOUT:20m}
    
    
    logging.pattern.console = ${LOGPATTERN_CONSOLE:%green(%d{HH:mm:ss.SSS}) %blue(%-5level) %red([%thread]) %yellow(%logger{15}) - %msg%n}
    ```

5. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

6. **Open your browser and go to `http://localhost:8081` to start using the application.**











##
# BankAppUi

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 16.2.3.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
