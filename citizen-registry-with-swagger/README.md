# Citizen Registry (Spring Boot, Maven multi-module)

## Modules
- `domain`: οντότητες/κλάσεις πεδίου (shared μεταξύ service & client)
- `service`: RESTful υπηρεσία με Spring Boot, JPA/H2, validation, unit tests
- `client`: Spring Boot CLI client (WebClient) με μενού
- `integration-tests`: Rest-Assured integration tests (failsafe)

## Build & Run
```bash
mvn -q clean install
# Εκτέλεση υπηρεσίας
mvn -q -pl service spring-boot:run
# Σε άλλο τερματικό: εκτέλεση client
mvn -q -pl client spring-boot:run
# Εκτέλεση integration tests
mvn -q -pl integration-tests verify
```
Endpoints:
- `POST /citizens`
- `DELETE /citizens/{at}`
- `PATCH /citizens/{at}`
- `GET /citizens/{at}`
- `GET /citizens/search?firstName=...&lastName=...&gender=MALE&birthDate=DD-MM-YYYY&afm=...&address=...`


## Swagger / OpenAPI
Με την εκκίνηση του service:
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs
