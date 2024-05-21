# VetAPI_MS


## Development Stage

This project is in development stage. Further enhancements are planned.

## Technologies Used

- Java
- Spring Boot
- Spring Cloud Netflix Eureka
- Spring Data JPA
- Feign Client
- PostgreSQL (Or any other database option)

## Project Structure

The project is designed following the microservices architecture and consists of the following components:

1. **Animal Service**: Service responsible for managing operations related to animals.
2. **Eureka Server**: Eureka server responsible for service registration and discovery.
3. **Customer Service**: Service responsible for customer management and customer-animal relationships.

## Detailed Description of Services

### Animal Service

- **Controller**: `AnimalController` class manages animal operations and provides RESTful APIs.
- **Model**: `Animal` class represents the animal object.
- **Repository**: `AnimalRepository` class performs database operations related to animals.
- **Service**: `AnimalService` and `AnimalManager` classes manage animal operations and execute database operations.

### Eureka Server

- **Main Class**: `EurekaServerApplication` class starts the Eureka server and holds service registrations.

### Customer Service

- **Controller**: `CustomerController` class manages customer operations and provides RESTful APIs.
- **DTO**: `AddAnimalRequest` class is a data transfer object used for adding animals to customers.
- **Model**: `Customer` class represents the customer object.
- **Repository**: `CustomerRepository` class performs database operations related to customers.
- **Service**: `CustomerService` and `CustomerManager` classes manage customer operations and execute database operations.

## Communication Between Services

- **Customer Service - Animal Service Communication**: Achieved via `AnimalServiceClient`. The customer service communicates with the animal service and performs data exchange.

## Installation and Usage

1. Clone the project.
2. Start each service separately using the `mvn spring-boot:run` command.
3. Start the Eureka Server to enable communication between services.
4. Verify that the services are running and perform operations using the RESTful APIs.

